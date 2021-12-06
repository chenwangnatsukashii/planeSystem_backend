package com.example.engine_system.service.impl;

import com.example.engine_system.entity.Plane;
import com.example.engine_system.entity.ResumeEight;
import com.example.engine_system.mapper.PlaneMapper;
import com.example.engine_system.mapper.ResumeEightMapper;
import com.example.engine_system.service.ResumeEightService;
import com.example.engine_system.untils.NumberOperation;
import com.example.engine_system.untils.TimeOperation;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ResumeEightServiceImpl implements ResumeEightService {

    @Resource
    private ResumeEightMapper resumeEightMapper;
    @Resource
    private PlaneMapper planeMapper;

    @Override
    public int addResumeEight(List<ResumeEight> resume) {
        resume.forEach(e->{
            if (ObjectUtils.isEmpty(e.getId())) {
                Plane plane = planeMapper.selectByPrimaryKey(e.getPlaneId());
                plane.setEngineLeftTotalServiceLife(TimeOperation.addTime(plane.getEngineLeftTotalServiceLife(), e.getTotalTotal()));
                plane.setEngineRemainingTime(TimeOperation.addTime(plane.getEngineRemainingTime(), e.getTotalTotal()));
                plane.setEngineLeftResidualLife(TimeOperation.minusTime(plane.getEngineLeftResidualLife(), e.getTotalTotal()));
                plane.setAirGeneratorRepairTimes(NumberOperation.addNumber(plane.getAirGeneratorRepairTimes(),e.getTotalStartTimes()));
                planeMapper.updateByPrimaryKey(plane);
            }
        });
        return resumeEightMapper.addResumeEight(resume);
    }

    @Override
    public List<ResumeEight> getResumeEightById(Integer id) {
        return resumeEightMapper.getResumeEightById(id);
    }

    @Override
    public int deleteResumeEight(Integer id) {
        return resumeEightMapper.deleteByPrimaryKey(id);
    }
}
