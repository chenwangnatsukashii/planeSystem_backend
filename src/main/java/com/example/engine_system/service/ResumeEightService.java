package com.example.engine_system.service;

import com.example.engine_system.entity.ResumeEight;

import java.util.List;

public interface ResumeEightService {
    int addResumeEight(List<ResumeEight> resume);

    List<ResumeEight> getResumeEightById(Integer id);

    int deleteResumeEight(Integer id);
}
