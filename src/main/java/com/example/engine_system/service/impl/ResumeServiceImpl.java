package com.example.engine_system.service.impl;

import com.example.engine_system.entity.Resume;
import com.example.engine_system.mapper.ResumeMapper;
import com.example.engine_system.service.ResumeService;
import com.example.engine_system.sysconst.PlaneType;
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
    public List<Resume> getResumeById(Integer id, String type) {
        String[] type_s = type.split("_");
        return resumeMapper.getResumeById(id, type_s[type_s.length - 1]);
    }

    @Override
    public int deleteResume(Integer id) {
        return resumeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int addResumeEngine(List<Resume> resumeList) {
        resumeList.forEach(e->{
            e.setReceiverStartTimes(e.getEngineStartTimes());
            e.setReceiverSGroundFlight(e.getEngineSGroundFlight());
            e.setReceiverSpGroundFlight(e.getEngineSpGroundFlight());
            e.setReceiverSFlight(e.getEngineSFlight());
            e.setReceiverSpFlight(e.getEngineSpFlight());
            e.setReceiverSStateWork(e.getEngineSStateWork());
            e.setReceiverYsStateWork(e.getEngineYsStateWork());
            e.setReceiverSpStateWork(e.getEngineSpStateWork());
            e.setReceiverSAllStateWork(e.getEngineSAllStateWork());
            e.setReceiverSpAllStateWork(e.getEngineSpAllStateWork());
        });
        return resumeMapper.addResume(resumeList);
    }
}
