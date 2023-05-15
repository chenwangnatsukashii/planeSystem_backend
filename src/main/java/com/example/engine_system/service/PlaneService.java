package com.example.engine_system.service;

import com.example.engine_system.entity.Plane;

import java.util.List;

public interface PlaneService {
    List<Plane> getAllPlanes(String workNumber, String planeType, String unitNumber, String planeNum);

    Plane findPlaneById(Integer id);

    int updatePlane(Plane plane);

    void addPlane(List<Plane> planes);

    int addPlane(Plane plane);

    int deleteAnyPlane(Integer id);
}
