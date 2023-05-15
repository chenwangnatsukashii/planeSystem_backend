package com.example.engine_system.service.impl;

import com.example.engine_system.entity.Plane;
import com.example.engine_system.mapper.PlaneMapper;
import com.example.engine_system.service.PlaneService;
import com.example.engine_system.sysconst.PlaneType;
import com.example.engine_system.sysconst.WarningInfo;
import com.example.engine_system.untils.SomeOperation;
import com.example.engine_system.untils.TimeOperation;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class PlaneServiceImpl implements PlaneService {

    @Resource
    private PlaneMapper planeMapper;

    @Override
    public List<Plane> getAllPlanes(String workNumber, String planeType, String unitNumber, String planeNum) {
        List<Plane> allPlanes = planeMapper.getAllPlanes(workNumber, planeType, unitNumber, planeNum);
        allPlanes.forEach(plane -> {
            plane.setPlaneType(PlaneType.getName(plane.getPlaneType()));

            List<String> warningInfo = new ArrayList<>();

            if (plane.getPlaneType().equals(PlaneType.PLANE_TYPE_1.getcName())) {
//            歼11
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

//            起动机
//            剩余日历寿命少于6个月
                if (!SomeOperation.isEmpty(plane.getStarterLeftRemainingTime())) {
                    if ("0".equals(String.valueOf(plane.getStarterLeftRemainingTime().charAt(0))) &&
                            (Integer.parseInt(String.valueOf(plane.getStarterLeftRemainingTime().charAt(2))) < WarningInfo.SIX)) {
                        warningInfo.add(WarningInfo.LEFT + WarningInfo.STARTER + WarningInfo.SYRL);
                    }
                }
                if (!SomeOperation.isEmpty(plane.getStarterRightRemainingTime())) {
                    if ("0".equals(String.valueOf(plane.getStarterRightRemainingTime().charAt(0))) &&
                            (Integer.parseInt(String.valueOf(plane.getStarterRightRemainingTime().charAt(2))) < WarningInfo.SIX)) {
                        warningInfo.add(WarningInfo.RIGHT + WarningInfo.STARTER + WarningInfo.SYRL);
                    }
                }

//            起动剩余寿命50次
                if (!SomeOperation.isEmpty(plane.getStarterLeftResidualLife())) {
                    if (plane.getStarterLeftResidualLife() < WarningInfo.FIFTY) {
                        warningInfo.add(WarningInfo.LEFT + WarningInfo.STARTER + WarningInfo.QDSY);
                    }
                }
                if (!SomeOperation.isEmpty(plane.getStarterRightResidualLife())) {
                    if (plane.getStarterRightResidualLife() < WarningInfo.FIFTY) {
                        warningInfo.add(WarningInfo.RIGHT + WarningInfo.STARTER + WarningInfo.QDSY);
                    }
                }

//            综合调节器
//            剩余日历寿命少于6个月
                if (!SomeOperation.isEmpty(plane.getRegulatorLeftRemainingTime())) {
                    if ("0".equals(String.valueOf(plane.getRegulatorLeftRemainingTime().charAt(0))) &&
                            (Integer.parseInt(String.valueOf(plane.getRegulatorLeftRemainingTime().charAt(2))) < WarningInfo.SIX)) {
                        warningInfo.add(WarningInfo.LEFT + WarningInfo.REGULATOR + WarningInfo.SYRL);
                    }
                }
                if (!SomeOperation.isEmpty(plane.getRegulatorRightRemainingTime())) {
                    if ("0".equals(String.valueOf(plane.getRegulatorRightRemainingTime().charAt(0))) &&
                            (Integer.parseInt(String.valueOf(plane.getRegulatorRightRemainingTime().charAt(2))) < WarningInfo.SIX)) {
                        warningInfo.add(WarningInfo.RIGHT + WarningInfo.REGULATOR + WarningInfo.SYRL);
                    }
                }

//            剩余寿命少于10小时
                if (!SomeOperation.isEmpty(plane.getRegulatorLeftResidualLife())) {
                    String[] split = plane.getRegulatorLeftResidualLife().contains(TimeOperation.semiAngleColon) ?
                            plane.getRegulatorLeftResidualLife().split(TimeOperation.semiAngleColon) :
                            plane.getRegulatorLeftResidualLife().split(TimeOperation.fullAngleColon);
                    if (Integer.parseInt(split[0]) < WarningInfo.TEN) {
                        warningInfo.add(WarningInfo.LEFT + WarningInfo.REGULATOR + WarningInfo.SYSM);
                    }
                }
                if (!SomeOperation.isEmpty(plane.getRegulatorRightResidualLife())) {
                    String[] split = plane.getRegulatorRightResidualLife().contains(TimeOperation.semiAngleColon) ?
                            plane.getRegulatorRightResidualLife().split(TimeOperation.semiAngleColon) :
                            plane.getRegulatorRightResidualLife().split(TimeOperation.fullAngleColon);
                    if (Integer.parseInt(split[0]) < WarningInfo.TEN) {
                        warningInfo.add(WarningInfo.RIGHT + WarningInfo.REGULATOR + WarningInfo.SYSM);
                    }
                }
            } else if (plane.getPlaneType().equals(PlaneType.PLANE_TYPE_2.getcName())) {
//            歼11b
//            作战状态剩余寿命少于10小时
                if (!SomeOperation.isEmpty(plane.getEngineLeftOperationalHours())) {
                    String[] split = plane.getEngineLeftOperationalHours().contains(TimeOperation.semiAngleColon) ?
                            plane.getEngineLeftOperationalHours().split(TimeOperation.semiAngleColon) :
                            plane.getEngineLeftOperationalHours().split(TimeOperation.fullAngleColon);
                    if (Integer.parseInt(split[0]) < WarningInfo.TEN) {
                        warningInfo.add(WarningInfo.LEFT + WarningInfo.ENGINE + WarningInfo.ZZZT);
                    }
                }
                if (!SomeOperation.isEmpty(plane.getEngineRightOperationalHours())) {
                    String[] split = plane.getEngineRightOperationalHours().contains(TimeOperation.semiAngleColon) ?
                            plane.getEngineRightOperationalHours().split(TimeOperation.semiAngleColon) :
                            plane.getEngineRightOperationalHours().split(TimeOperation.fullAngleColon);
                    if (Integer.parseInt(split[0]) < WarningInfo.TEN) {
                        warningInfo.add(WarningInfo.RIGHT + WarningInfo.ENGINE + WarningInfo.ZZZT);
                    }
                }

//            中间以上状态剩余寿命少于2小时
                if (!SomeOperation.isEmpty(plane.getEngineLeftMidUpHours())) {
                    String[] split = plane.getEngineLeftMidUpHours().contains(TimeOperation.semiAngleColon) ?
                            plane.getEngineLeftMidUpHours().split(TimeOperation.semiAngleColon) :
                            plane.getEngineLeftMidUpHours().split(TimeOperation.fullAngleColon);
                    if (Integer.parseInt(split[0]) < WarningInfo.TWO) {
                        warningInfo.add(WarningInfo.LEFT + WarningInfo.ENGINE + WarningInfo.ZJYS);
                    }
                }
                if (!SomeOperation.isEmpty(plane.getEngineRightMidUpHours())) {
                    String[] split = plane.getEngineRightMidUpHours().contains(TimeOperation.semiAngleColon) ?
                            plane.getEngineRightMidUpHours().split(TimeOperation.semiAngleColon) :
                            plane.getEngineRightMidUpHours().split(TimeOperation.fullAngleColon);
                    if (Integer.parseInt(split[0]) < WarningInfo.TWO) {
                        warningInfo.add(WarningInfo.RIGHT + WarningInfo.ENGINE + WarningInfo.ZJYS);
                    }
                }

//            作战中间以上状态剩余寿命少于2小时
                if (!SomeOperation.isEmpty(plane.getEngineLeftMidUpRestHours())) {
                    String[] split = plane.getEngineLeftMidUpRestHours().contains(TimeOperation.semiAngleColon) ?
                            plane.getEngineLeftMidUpRestHours().split(TimeOperation.semiAngleColon) :
                            plane.getEngineLeftMidUpRestHours().split(TimeOperation.fullAngleColon);
                    if (Integer.parseInt(split[0]) < WarningInfo.TWO) {
                        warningInfo.add(WarningInfo.LEFT + WarningInfo.ENGINE + WarningInfo.ZZZJ);
                    }
                }
                if (!SomeOperation.isEmpty(plane.getEngineRightMidUpRestHours())) {
                    String[] split = plane.getEngineRightMidUpRestHours().contains(TimeOperation.semiAngleColon) ?
                            plane.getEngineRightMidUpRestHours().split(TimeOperation.semiAngleColon) :
                            plane.getEngineRightMidUpRestHours().split(TimeOperation.fullAngleColon);
                    if (Integer.parseInt(split[0]) < WarningInfo.TWO) {
                        warningInfo.add(WarningInfo.RIGHT + WarningInfo.ENGINE + WarningInfo.ZZZJ);
                    }
                }

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

//                外置机匣
//                剩余工作时间少于10小时
                if (!SomeOperation.isEmpty(plane.getReceiverLeftRemainingTime())) {
                    String[] split = plane.getReceiverLeftRemainingTime().contains(TimeOperation.semiAngleColon) ?
                            plane.getReceiverLeftRemainingTime().split(TimeOperation.semiAngleColon) :
                            plane.getReceiverLeftRemainingTime().split(TimeOperation.fullAngleColon);
                    if (Integer.parseInt(split[0]) < WarningInfo.TEN) {
                        warningInfo.add(WarningInfo.LEFT + WarningInfo.RECEIVER + WarningInfo.SYGZ);
                    }
                }
                if (!SomeOperation.isEmpty(plane.getReceiverRightRemainingTime())) {
                    String[] split = plane.getReceiverRightRemainingTime().contains(TimeOperation.semiAngleColon) ?
                            plane.getReceiverRightRemainingTime().split(TimeOperation.semiAngleColon) :
                            plane.getReceiverRightRemainingTime().split(TimeOperation.fullAngleColon);
                    if (Integer.parseInt(split[0]) < WarningInfo.TEN) {
                        warningInfo.add(WarningInfo.RIGHT + WarningInfo.RECEIVER + WarningInfo.SYGZ);
                    }
                }

//            起动剩余寿命50次
                if (!SomeOperation.isEmpty(plane.getStarterLeftResidualLife())) {
                    if (plane.getStarterLeftResidualLife() < WarningInfo.FIFTY) {
                        warningInfo.add(WarningInfo.LEFT + WarningInfo.STARTER + WarningInfo.QDSY);
                    }
                }
                if (!SomeOperation.isEmpty(plane.getStarterRightResidualLife())) {
                    if (plane.getStarterRightResidualLife() < WarningInfo.FIFTY) {
                        warningInfo.add(WarningInfo.RIGHT + WarningInfo.STARTER + WarningInfo.QDSY);
                    }
                }

//                剩余寿命少于10小时
                if (!SomeOperation.isEmpty(plane.getRegulatorLeftResidualLife())) {
                    String[] split = plane.getRegulatorLeftResidualLife().contains(TimeOperation.semiAngleColon) ?
                            plane.getRegulatorLeftResidualLife().split(TimeOperation.semiAngleColon) :
                            plane.getRegulatorLeftResidualLife().split(TimeOperation.fullAngleColon);
                    if (Integer.parseInt(split[0]) < WarningInfo.TEN) {
                        warningInfo.add(WarningInfo.LEFT + WarningInfo.REGULATOR + WarningInfo.SYSM);
                    }
                }
                if (!SomeOperation.isEmpty(plane.getRegulatorRightResidualLife())) {
                    String[] split = plane.getRegulatorRightResidualLife().contains(TimeOperation.semiAngleColon) ?
                            plane.getRegulatorRightResidualLife().split(TimeOperation.semiAngleColon) :
                            plane.getRegulatorRightResidualLife().split(TimeOperation.fullAngleColon);
                    if (Integer.parseInt(split[0]) < WarningInfo.TEN) {
                        warningInfo.add(WarningInfo.RIGHT + WarningInfo.REGULATOR + WarningInfo.SYSM);
                    }
                }

            } else if (plane.getPlaneType().equals(PlaneType.PLANE_TYPE_3.getcName())) {

//                已使用总寿命超过290小时
                if (!SomeOperation.isEmpty(plane.getEngineLeftTotalServiceLife())) {
                    String[] split = plane.getEngineLeftTotalServiceLife().contains(TimeOperation.semiAngleColon) ?
                            plane.getEngineLeftTotalServiceLife().split(TimeOperation.semiAngleColon) :
                            plane.getEngineLeftTotalServiceLife().split(TimeOperation.fullAngleColon);
                    if (Integer.parseInt(split[0]) > WarningInfo.THN) {
                        warningInfo.add(WarningInfo.REGULATOR + WarningInfo.YSYZ);
                    }
                }

            } else if (plane.getPlaneType().equals(PlaneType.PLANE_TYPE_4.getcName())) {
//                剩余日历寿命少于6个月
                if (!SomeOperation.isEmpty(plane.getEngineLeftRemainingTime())) {
                    if ("0".equals(String.valueOf(plane.getEngineLeftRemainingTime().charAt(0))) &&
                            (Integer.parseInt(String.valueOf(plane.getRegulatorLeftRemainingTime().charAt(2))) < WarningInfo.SIX)) {
                        warningInfo.add(WarningInfo.ENGINE + WarningInfo.SYRL);
                    }
                }

//                剩余寿命少于10小时
                if (!SomeOperation.isEmpty(plane.getEngineLeftResidualLife())) {
                    String[] split = plane.getEngineLeftResidualLife().contains(TimeOperation.semiAngleColon) ?
                            plane.getEngineLeftResidualLife().split(TimeOperation.semiAngleColon) :
                            plane.getEngineLeftResidualLife().split(TimeOperation.fullAngleColon);
                    if (Integer.parseInt(split[0]) < WarningInfo.TEN) {
                        warningInfo.add(WarningInfo.REGULATOR + WarningInfo.SYSM);
                    }
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

    @Override
    public void addPlane(List<Plane> planes) {
        planeMapper.addPlane(planes);
    }

    @Override
    public int addPlane(Plane plane) {
        return planeMapper.insert(plane);
    }

    @Override
    public int deleteAnyPlane(Integer id) {
        return planeMapper.deleteByPrimaryKey(id);
    }
}
