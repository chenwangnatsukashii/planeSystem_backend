package com.example.engine_system.service.impl;

import com.example.engine_system.entity.Plane;
import com.example.engine_system.mapper.PlaneMapper;
import com.example.engine_system.service.PlaneService;
import com.example.engine_system.sysconst.PlaneType;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PlaneServiceImpl implements PlaneService {

    @Resource
    private PlaneMapper planeMapper;

    @Override
    public List<Plane> getAllPlanes(String workNumber, String planeType, String unitNumber, String planeNum) {
        List<Plane> allPlanes = planeMapper.getAllPlanes(workNumber, planeType, unitNumber, planeNum);
        allPlanes.forEach(plane -> {
            plane.setPlaneType(PlaneType.getName(plane.getPlaneType()));
        });
        return allPlanes;
    }

    @Override
    public Plane findPlaneById(Integer id) {
        return planeMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updatePlane(Plane plane) {
        return planeMapper.updateByPrimaryKey(plane);
    }
}
