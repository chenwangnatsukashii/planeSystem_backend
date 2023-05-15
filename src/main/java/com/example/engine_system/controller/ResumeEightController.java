package com.example.engine_system.controller;


import com.example.engine_system.entity.ResumeEight;
import com.example.engine_system.service.ResumeEightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping(value = "/plane")
public class ResumeEightController {

    @Resource
    private ResumeEightService ResumeEightService;

    @PostMapping("/addResumeEight")
    public int addResumeEight(@RequestBody List<ResumeEight> resumeList) {
        return ResumeEightService.addResumeEight(resumeList);
    }

    @GetMapping("/getResumeEightById/{id}")
    public List<ResumeEight> getResumeEightById(@PathVariable("id") Integer id) {
        return ResumeEightService.getResumeEightById(id);
    }

    @DeleteMapping("/deleteResumeEight/{id}")
    public int deleteResumeEight(@PathVariable("id") Integer id) {
        return ResumeEightService.deleteResumeEight(id);
    }
}
