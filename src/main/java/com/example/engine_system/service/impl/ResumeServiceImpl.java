package com.example.engine_system.service.impl;

import com.example.engine_system.entity.Resume;
import com.example.engine_system.mapper.ResumeMapper;
import com.example.engine_system.service.ResumeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ResumeServiceImpl implements ResumeService {

    @Resource
    private ResumeMapper resumeMapper;

    @Override
    public int addResume(List<Resume> resume) {
        return resumeMapper.addResume(resume);
    }

    @Override
    public int updateResume(List<Resume> resume) {
        return resumeMapper.updateList(resume);
    }

    @Override
    public List<Resume> getResumeById(Integer id, String type) {
        String[] type_s = type.split("_");
        return resumeMapper.getResumeById(id, type_s[type_s.length - 1]);
    }

    @Override
    public int deleteResume(Integer id) {
        return resumeMapper.deleteByPrimaryKey(id);
    }
}
