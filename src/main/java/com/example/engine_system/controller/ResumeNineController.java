package com.example.engine_system.controller;


import com.example.engine_system.entity.ResumeNine;
import com.example.engine_system.service.ResumeNineService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping(value = "/plane")
public class ResumeNineController {

    @Resource
    private ResumeNineService resumeNineService;

    @PostMapping("/addResumeNine")
    public int addResumeNine(@RequestBody List<ResumeNine> resumeList) {
        return resumeNineService.addResumeNine(resumeList);
    }

    @GetMapping("/getResumeNineById/{id}")
    public List<ResumeNine> getResumeNineById(@PathVariable("id") Integer id) {
        return resumeNineService.getResumeNineById(id);
    }

    @DeleteMapping("/deleteResumeNine/{id}")
    public int deleteResumeNine(@PathVariable("id") Integer id) {
        return resumeNineService.deleteResumeNine(id);
    }
}
