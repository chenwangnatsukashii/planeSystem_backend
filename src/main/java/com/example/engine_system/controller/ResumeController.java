package com.example.engine_system.controller;


import com.example.engine_system.entity.Resume;
import com.example.engine_system.service.ResumeService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping(value = "/plane")
public class ResumeController {

    @Resource
    private ResumeService resumeService;

    @PostMapping("/addResume")
    public int addResume(@RequestBody List<Resume> resumeList) {
        return resumeService.addResume(resumeList);
    }

    @PostMapping("/addResumeEngine")
    public int addResumeEngine(@RequestBody List<Resume> resumeList) {
        return resumeService.addResumeEngine(resumeList);
    }

    @PostMapping("/addResumeEngineB")
    public int addResumeEngineB(@RequestBody List<Resume> resumeList) {
        return resumeService.addResumeEngineB(resumeList);
    }

    @GetMapping("/getResumeById/{id}/{type}")
    public List<Resume> getResumeById(@PathVariable("id") Integer id, @PathVariable("type") String type) {
        return resumeService.getResumeById(id, type);
    }

    @DeleteMapping("/deleteResume/{id}")
    public int deleteResume(@PathVariable("id") Integer id) {
        return resumeService.deleteResume(id);
    }
}
