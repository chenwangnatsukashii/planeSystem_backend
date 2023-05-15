package com.example.engine_system.service;

import com.example.engine_system.entity.ResumeNine;

import java.util.List;

public interface ResumeNineService {
    int addResumeNine(List<ResumeNine> resume);

    List<ResumeNine> getResumeNineById(Integer id);

    int deleteResumeNine(Integer id);
}
