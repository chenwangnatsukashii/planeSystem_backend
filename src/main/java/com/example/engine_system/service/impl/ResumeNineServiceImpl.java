package com.example.engine_system.service.impl;

import com.example.engine_system.entity.Plane;
import com.example.engine_system.entity.ResumeEight;
import com.example.engine_system.entity.ResumeNine;
import com.example.engine_system.mapper.PlaneMapper;
import com.example.engine_system.mapper.ResumeNineMapper;
import com.example.engine_system.service.ResumeNineService;
import com.example.engine_system.untils.TimeOperation;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.ObjectUtils;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class ResumeNineServiceImpl implements ResumeNineService {

    @Resource
    private ResumeNineMapper resumeNineMapper;
    @Resource
    private PlaneMapper planeMapper;

    @Override
    public int addResumeNine(List<ResumeNine> resume) {
        resume.forEach(e -> {
            if (ObjectUtils.isEmpty(e.getId())) {
                Plane plane = planeMapper.selectByPrimaryKey(e.getPlaneId());
                plane.setEngineLeftTotalServiceLife(TimeOperation.addTime(plane.getEngineLeftTotalServiceLife(), e.getTotalTimeHour() + ":" + e.getTotalTimeMinute()));
                plane.setEngineLeftLastRepairTime(TimeOperation.addTime(plane.getEngineLeftLastRepairTime(), e.getTotalTimeHour() + ":" + e.getTotalTimeMinute()));
                planeMapper.updateByPrimaryKey(plane);
            }
        });
        return resumeNineMapper.addResumeNine(resume);
    }

    @Override
    public List<ResumeNine> getResumeNineById(Integer id) {
        return resumeNineMapper.getResumeNineById(id);
    }

    @Override
    public int deleteResumeNine(Integer id) {
        ResumeNine e = resumeNineMapper.selectByPrimaryKey(id);
        Plane plane = planeMapper.selectByPrimaryKey(e.getPlaneId());

        plane.setEngineLeftTotalServiceLife(TimeOperation.minusTime(plane.getEngineLeftTotalServiceLife(), e.getTotalTimeHour() + ":" + e.getTotalTimeMinute()));
        plane.setEngineLeftLastRepairTime(TimeOperation.minusTime(plane.getEngineLeftLastRepairTime(), e.getTotalTimeHour() + ":" + e.getTotalTimeMinute()));
        planeMapper.updateByPrimaryKey(plane);

        return resumeNineMapper.deleteByPrimaryKey(id);
    }
}
