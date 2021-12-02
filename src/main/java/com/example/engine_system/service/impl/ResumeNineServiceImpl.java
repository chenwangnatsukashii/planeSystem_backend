package com.example.engine_system.service.impl;

import com.example.engine_system.entity.Resume;
import com.example.engine_system.entity.ResumeNine;
import com.example.engine_system.mapper.ResumeNineMapper;
import com.example.engine_system.service.ResumeNineService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ResumeNineServiceImpl implements ResumeNineService {

    @Resource
    private ResumeNineMapper resumeNineMapper;


    @Override
    public int addResumeNine(List<ResumeNine> resume) {
        return resumeNineMapper.addResumeNine(resume);
    }

    @Override
    public int updateResumeNine(List<ResumeNine> resume) {
        return resumeNineMapper.updateResumeNine(resume);
    }

    @Override
    public List<ResumeNine> getResumeNineById(Integer id) {
        return resumeNineMapper.getResumeNineById(id);
    }

    @Override
    public int deleteResumeNine(Integer id) {
        return resumeNineMapper.deleteByPrimaryKey(id);
    }
}
