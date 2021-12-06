package com.example.engine_system.service;

import com.example.engine_system.entity.Resume;

import java.util.List;

public interface ResumeService {
    int addResume(List<Resume> resume);

    List<Resume> getResumeById(Integer id, String type);

    int deleteResume(Integer id);

    int addResumeEngine(List<Resume> resumeList);

    int addResumeEngineB(List<Resume> resumeList);
}
