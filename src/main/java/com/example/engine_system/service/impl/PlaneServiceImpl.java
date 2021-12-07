package com.example.engine_system.service.impl;

import com.example.engine_system.entity.Plane;
import com.example.engine_system.mapper.PlaneMapper;
import com.example.engine_system.service.PlaneService;
import com.example.engine_system.sysconst.PlaneType;
import com.example.engine_system.sysconst.WarningInfo;
import com.example.engine_system.untils.SomeOperation;
import com.example.engine_system.untils.TimeOperation;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
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

            List<String> warningInfo = new ArrayList<>();
            if (!SomeOperation.isEmpty(plane.getEngineLeftResidualLife())) {
                String[] split = plane.getEngineLeftResidualLife().contains(TimeOperation.semiAngleColon) ?
                        plane.getEngineLeftResidualLife().split(TimeOperation.semiAngleColon) :
                        plane.getEngineLeftResidualLife().split(TimeOperation.fullAngleColon);
                if (Integer.parseInt(split[0]) < WarningInfo.TEN) {
                    warningInfo.add(WarningInfo.LEFT + WarningInfo.ENGINE + WarningInfo.SYSM);
                }
            }
            if (!SomeOperation.isEmpty(plane.getEngineRightResidualLife())) {
                String[] split = plane.getEngineRightResidualLife().contains(TimeOperation.semiAngleColon) ?
                        plane.getEngineRightResidualLife().split(TimeOperation.semiAngleColon) :
                        plane.getEngineRightResidualLife().split(TimeOperation.fullAngleColon);
                if (Integer.parseInt(split[0]) < WarningInfo.TEN) {
                    warningInfo.add(WarningInfo.RIGHT + WarningInfo.ENGINE + WarningInfo.SYSM);
                }
            }
            if (!SomeOperation.isEmpty(plane.getEngineLeftSpStateResidualLife())) {
                String[] split = plane.getEngineLeftSpStateResidualLife().contains(TimeOperation.semiAngleColon) ?
                        plane.getEngineLeftSpStateResidualLife().split(TimeOperation.semiAngleColon) :
                        plane.getEngineLeftSpStateResidualLife().split(TimeOperation.fullAngleColon);
                if (Integer.parseInt(split[0]) < WarningInfo.TWO) {
                    warningInfo.add(WarningInfo.LEFT + WarningInfo.ENGINE + WarningInfo.SPS);
                }
            }
            if (!SomeOperation.isEmpty(plane.getEngineRightSpStateResidualLife())) {
                String[] split = plane.getEngineRightSpStateResidualLife().contains(TimeOperation.semiAngleColon) ?
                        plane.getEngineRightSpStateResidualLife().split(TimeOperation.semiAngleColon) :
                        plane.getEngineRightSpStateResidualLife().split(TimeOperation.fullAngleColon);
                if (Integer.parseInt(split[0]) < WarningInfo.TWO) {
                    warningInfo.add(WarningInfo.RIGHT + WarningInfo.ENGINE + WarningInfo.SPS);
                }
            }

            plane.setWarningInfo(warningInfo);
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
