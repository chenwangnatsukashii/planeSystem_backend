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

//            剩余寿命少于10小时
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

//            Б＋УБ状态加力剩余寿命少于2小时
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

//            Б状态加力剩余寿命少于2小时
            if (!SomeOperation.isEmpty(plane.getEngineLeftSStateResidualLife())) {
                String[] split = plane.getEngineLeftSStateResidualLife().contains(TimeOperation.semiAngleColon) ?
                        plane.getEngineLeftSStateResidualLife().split(TimeOperation.semiAngleColon) :
                        plane.getEngineLeftSStateResidualLife().split(TimeOperation.fullAngleColon);
                if (Integer.parseInt(split[0]) < WarningInfo.TWO) {
                    warningInfo.add(WarningInfo.LEFT + WarningInfo.ENGINE + WarningInfo.S);
                }
            }
            if (!SomeOperation.isEmpty(plane.getEngineRightSStateResidualLife())) {
                String[] split = plane.getEngineRightSStateResidualLife().contains(TimeOperation.semiAngleColon) ?
                        plane.getEngineRightSStateResidualLife().split(TimeOperation.semiAngleColon) :
                        plane.getEngineRightSStateResidualLife().split(TimeOperation.fullAngleColon);
                if (Integer.parseInt(split[0]) < WarningInfo.TWO) {
                    warningInfo.add(WarningInfo.RIGHT + WarningInfo.ENGINE + WarningInfo.S);
                }
            }

//            起动剩余寿命50次
            if (!SomeOperation.isEmpty(plane.getEngineLeftStartingRemainingLife())) {
                if (plane.getEngineLeftStartingRemainingLife() <= WarningInfo.FIFTY) {
                    warningInfo.add(WarningInfo.LEFT + WarningInfo.ENGINE + WarningInfo.QDSY);
                }
            }
            if (!SomeOperation.isEmpty(plane.getEngineRightStartingRemainingLife())) {
                if (plane.getEngineRightStartingRemainingLife() <= WarningInfo.FIFTY) {
                    warningInfo.add(WarningInfo.RIGHT + WarningInfo.ENGINE + WarningInfo.QDSY);
                }
            }

//            Б＋УБ主循环次数不大于500次，若该项已累计到450次
            if (!SomeOperation.isEmpty(plane.getEngineLeftSpMajorCycles())) {
                if (plane.getEngineLeftSpMajorCycles() >= WarningInfo.FHF) {
                    warningInfo.add(WarningInfo.LEFT + WarningInfo.ENGINE + WarningInfo.SPSZX);
                }
            }
            if (!SomeOperation.isEmpty(plane.getEngineRightSpMajorCycles())) {
                if (plane.getEngineRightSpMajorCycles() >= WarningInfo.FHF) {
                    warningInfo.add(WarningInfo.RIGHT + WarningInfo.ENGINE + WarningInfo.SPSZX);
                }
            }

//            Б主循环次数不大于150次，若该项已累计到100次
            if (!SomeOperation.isEmpty(plane.getEngineLeftSMajorCycles())) {
                if (plane.getEngineLeftSMajorCycles() >= WarningInfo.HUNDRED) {
                    warningInfo.add(WarningInfo.LEFT + WarningInfo.ENGINE + WarningInfo.SPZX);
                }
            }
            if (!SomeOperation.isEmpty(plane.getEngineRightSMajorCycles())) {
                if (plane.getEngineRightSMajorCycles() >= WarningInfo.HUNDRED) {
                    warningInfo.add(WarningInfo.RIGHT + WarningInfo.ENGINE + WarningInfo.SPZX);
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
