package com.example.engine_system.controller;


import com.example.engine_system.entity.Plane;
import com.example.engine_system.mapper.PlaneMapper;
import com.example.engine_system.service.PlaneService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping(value = "/plane")
public class PlaneController {

    @Resource
    private PlaneMapper planeMapper;

    @Resource
    private PlaneService planeService;

    /**
     * 根据id获取飞机的基本信息
     *
     * @param id 飞机的唯一ID
     * @return 返回飞机信息实体
     */
    @GetMapping("/findPlaneById/{id}")
    public Plane findPlaneById(@PathVariable("id") Integer id) {
        return planeService.findPlaneById(id);
    }

    @PostMapping("/addPlane")
    public int addPlane(@ModelAttribute("plane") Plane plane) {
        return planeMapper.insert(plane);
    }

    @GetMapping("/getAllPlanes")
    public List<Plane> getAllPlanes(String workNumber, String planeType, String unitNumber, String planeNum) {
        return planeService.getAllPlanes(workNumber, planeType, unitNumber, planeNum);
    }

    @PutMapping("/updatePlane")
    public int updatePlane(@ModelAttribute("plane") Plane plane) {
        return planeService.updatePlane(plane);
    }
}
