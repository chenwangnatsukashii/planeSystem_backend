package com.example.engine_system.service.impl;

import com.example.engine_system.entity.ResumeEight;
import com.example.engine_system.mapper.ResumeEightMapper;
import com.example.engine_system.mapper.ResumeNineMapper;
import com.example.engine_system.service.ResumeEightService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ResumeEightServiceImpl implements ResumeEightService {

    @Resource
    private ResumeEightMapper resumeEightMapper;

    @Override
    public int addResumeEight(List<ResumeEight> resume) {
        return resumeEightMapper.addResumeEight(resume);
    }

    @Override
    public int updateResumeEight(List<ResumeEight> resume) {
        return resumeEightMapper.updateResumeEight(resume);
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
