package com.example.engine_system.service.impl;

import com.example.engine_system.entity.Plane;
import com.example.engine_system.entity.Resume;
import com.example.engine_system.mapper.PlaneMapper;
import com.example.engine_system.mapper.ResumeMapper;
import com.example.engine_system.service.ResumeService;
import com.example.engine_system.untils.NumberOperation;
import com.example.engine_system.untils.TimeOperation;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.ObjectUtils;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class ResumeServiceImpl implements ResumeService {

    @Resource
    private ResumeMapper resumeMapper;
    @Resource
    private PlaneMapper planeMapper;

    @Override
    public int addResume(List<Resume> resume) {
        return resumeMapper.addResume(resume);
    }

    @Override
    public List<Resume> getResumeById(Integer id, String type) {
        String[] type_s = type.split("_");
        return resumeMapper.getResumeById(id, type_s[type_s.length - 1]);
    }

    @Override
    public int deleteResume(Integer id) {
        Resume e = resumeMapper.selectByPrimaryKey(id);
        Plane plane = planeMapper.selectByPrimaryKey(e.getPlaneId());

        if (e.getType().equals("left")) {
            // 对左发动机的数据更新
            plane.setEngineLeftTotalServiceLife(TimeOperation.minusTime(plane.getEngineLeftTotalServiceLife(), e.getEngineSpAllStateWork()));
            plane.setEngineLeftResidualLife(TimeOperation.addTime(plane.getEngineLeftResidualLife(), e.getEngineSpAllStateWork()));
            plane.setEngineLeftSpStateResidualLife(TimeOperation.addTimeHMS(plane.getEngineLeftSpStateResidualLife(), e.getEngineSpStateWork()));
            plane.setEngineLeftSStateResidualLife(TimeOperation.addTimeHMS(plane.getEngineLeftSStateResidualLife(), e.getEngineSStateWork()));
            plane.setEngineLeftStartingRemainingLife(NumberOperation.addNumber(plane.getEngineLeftStartingRemainingLife(), e.getEngineStartTimes()));
            plane.setEngineLeftSpMajorCycles(NumberOperation.minusNumber(plane.getEngineLeftSpMajorCycles(), e.getEngineSpMainCycle()));
            plane.setEngineLeftSMajorCycles(NumberOperation.minusNumber(plane.getEngineLeftSMajorCycles(), e.getEngineSMainCycle()));
            // 对左机匣的数据更新
            plane.setReceiverLeftTotalServiceLife(TimeOperation.minusTime(plane.getReceiverLeftTotalServiceLife(), e.getEngineSpAllStateWork()));
            plane.setReceiverLeftResidualLife(TimeOperation.addTime(plane.getEngineLeftResidualLife(), e.getEngineSpAllStateWork()));
            plane.setReceiverLeftSpStateResidualLife(TimeOperation.addTimeHMS(plane.getReceiverLeftSpStateResidualLife(), e.getEngineSpStateWork()));
            plane.setReceiverLeftStateResidualLife(TimeOperation.addTimeHMS(plane.getReceiverLeftStateResidualLife(), e.getEngineSStateWork()));
            plane.setReceiverLeftStartingRemainingLife(NumberOperation.addNumber(plane.getReceiverLeftStartingRemainingLife(), e.getEngineStartTimes()));
            // 对左起动机的数据更新
            plane.setStarterLeftTotalServiceLife(NumberOperation.minusNumber(plane.getStarterLeftTotalServiceLife(), e.getEngineStartTimes()));
            plane.setStarterLeftResidualLife(NumberOperation.addNumber(plane.getStarterLeftResidualLife(), e.getEngineStartTimes()));
            // 对左综合调节器的数据更新
            plane.setRegulatorLeftResidualLife(TimeOperation.addTime(plane.getRegulatorLeftResidualLife(), e.getEngineSpAllStateWork()));

        } else {
            // 对右发动机的数据更新
            plane.setEngineRightTotalServiceLife(TimeOperation.minusTime(plane.getEngineRightTotalServiceLife(), e.getEngineSpAllStateWork()));
            plane.setEngineRightResidualLife(TimeOperation.addTime(plane.getEngineRightResidualLife(), e.getEngineSpAllStateWork()));
            plane.setEngineRightSpStateResidualLife(TimeOperation.addTimeHMS(plane.getEngineRightSpStateResidualLife(), e.getEngineSpStateWork()));
            plane.setEngineRightSStateResidualLife(TimeOperation.addTimeHMS(plane.getEngineRightSStateResidualLife(), e.getEngineSStateWork()));
            plane.setEngineRightStartingRemainingLife(NumberOperation.addNumber(plane.getEngineRightStartingRemainingLife(), e.getEngineStartTimes()));
            plane.setEngineRightSpMajorCycles(NumberOperation.minusNumber(plane.getEngineLeftSpMajorCycles(), e.getEngineSpMainCycle()));
            plane.setEngineRightSMajorCycles(NumberOperation.minusNumber(plane.getEngineLeftSMajorCycles(), e.getEngineSMainCycle()));
            // 对右机匣的数据更新
            plane.setReceiverRightTotalServiceLife(TimeOperation.minusTime(plane.getReceiverRightTotalServiceLife(), e.getEngineSpAllStateWork()));
            plane.setReceiverRightResidualLife(TimeOperation.addTime(plane.getEngineRightResidualLife(), e.getEngineSpAllStateWork()));
            plane.setReceiverRightSpStateResidualLife(TimeOperation.addTimeHMS(plane.getReceiverRightSpStateResidualLife(), e.getEngineSpStateWork()));
            plane.setReceiverRightStateResidualLife(TimeOperation.addTimeHMS(plane.getReceiverRightStateResidualLife(), e.getEngineSStateWork()));
            plane.setReceiverRightStartingRemainingLife(NumberOperation.addNumber(plane.getReceiverRightStartingRemainingLife(), e.getEngineStartTimes()));
            // 对右起动机的数据更新
            plane.setStarterRightTotalServiceLife(NumberOperation.minusNumber(plane.getStarterRightTotalServiceLife(), e.getEngineStartTimes()));
            plane.setStarterRightResidualLife(NumberOperation.addNumber(plane.getStarterRightResidualLife(), e.getEngineStartTimes()));
            // 对左综合调节器的数据更新
            plane.setRegulatorRightResidualLife(TimeOperation.addTime(plane.getRegulatorRightResidualLife(), e.getEngineSpAllStateWork()));
        }
        planeMapper.updateByPrimaryKey(plane);

        return resumeMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int addResumeEngine(List<Resume> resumeList) {
        resumeList.forEach(e -> {
            e.setReceiverDate(e.getEngineDate());
            e.setReceiverStartTimes(e.getEngineStartTimes());
            e.setReceiverSGroundFlight(e.getEngineSGroundFlight());
            e.setReceiverSpGroundFlight(e.getEngineSpGroundFlight());
            e.setReceiverSFlight(e.getEngineSFlight());
            e.setReceiverSpFlight(e.getEngineSpFlight());
            e.setReceiverSStateWork(e.getEngineSStateWork());
            e.setReceiverYsStateWork(e.getEngineYsStateWork());
            e.setReceiverSpStateWork(e.getEngineSpStateWork());
            e.setReceiverSAllStateWork(e.getEngineSAllStateWork());
            e.setReceiverSpAllStateWork(e.getEngineSpAllStateWork());

            e.setSEngineDate(e.getEngineDate());
            e.setSEngineStartTimes(e.getEngineStartTimes());
            if (ObjectUtils.isEmpty(e.getId())) {
                Plane plane = planeMapper.selectByPrimaryKey(e.getPlaneId());
                if (e.getType().equals("left")) {
                    // 对左发动机的数据更新
                    plane.setEngineLeftTotalServiceLife(TimeOperation.addTime(plane.getEngineLeftTotalServiceLife(), e.getEngineSpAllStateWork()));
                    plane.setEngineLeftResidualLife(TimeOperation.minusTime(plane.getEngineLeftResidualLife(), e.getEngineSpAllStateWork()));
                    plane.setEngineLeftSpStateResidualLife(TimeOperation.minusTimeHMS(plane.getEngineLeftSpStateResidualLife(), e.getEngineSpStateWork()));
                    plane.setEngineLeftSStateResidualLife(TimeOperation.minusTimeHMS(plane.getEngineLeftSStateResidualLife(), e.getEngineSStateWork()));
                    plane.setEngineLeftStartingRemainingLife(NumberOperation.minusNumber(plane.getEngineLeftStartingRemainingLife(), e.getEngineStartTimes()));
                    plane.setEngineLeftSpMajorCycles(NumberOperation.addNumber(plane.getEngineLeftSpMajorCycles(), e.getEngineSpMainCycle()));
                    plane.setEngineLeftSMajorCycles(NumberOperation.addNumber(plane.getEngineLeftSMajorCycles(), e.getEngineSMainCycle()));
                    // 对左机匣的数据更新
                    plane.setReceiverLeftTotalServiceLife(TimeOperation.addTime(plane.getReceiverLeftTotalServiceLife(), e.getEngineSpAllStateWork()));
                    plane.setReceiverLeftResidualLife(TimeOperation.minusTime(plane.getEngineLeftResidualLife(), e.getEngineSpAllStateWork()));
                    plane.setReceiverLeftSpStateResidualLife(TimeOperation.minusTimeHMS(plane.getReceiverLeftSpStateResidualLife(), e.getEngineSpStateWork()));
                    plane.setReceiverLeftStateResidualLife(TimeOperation.minusTimeHMS(plane.getReceiverLeftStateResidualLife(), e.getEngineSStateWork()));
                    plane.setReceiverLeftStartingRemainingLife(NumberOperation.minusNumber(plane.getReceiverLeftStartingRemainingLife(), e.getEngineStartTimes()));
                    // 对左起动机的数据更新
                    plane.setStarterLeftTotalServiceLife(NumberOperation.addNumber(plane.getStarterLeftTotalServiceLife(), e.getEngineStartTimes()));
                    plane.setStarterLeftResidualLife(NumberOperation.minusNumber(plane.getStarterLeftResidualLife(), e.getEngineStartTimes()));
                    // 对左综合调节器的数据更新
                    plane.setRegulatorLeftResidualLife(TimeOperation.minusTime(plane.getRegulatorLeftResidualLife(), e.getEngineSpAllStateWork()));

                } else {
                    // 对右发动机的数据更新
                    plane.setEngineRightTotalServiceLife(TimeOperation.addTime(plane.getEngineRightTotalServiceLife(), e.getEngineSpAllStateWork()));
                    plane.setEngineRightResidualLife(TimeOperation.minusTime(plane.getEngineRightResidualLife(), e.getEngineSpAllStateWork()));
                    plane.setEngineRightSpStateResidualLife(TimeOperation.minusTimeHMS(plane.getEngineRightSpStateResidualLife(), e.getEngineSpStateWork()));
                    plane.setEngineRightSStateResidualLife(TimeOperation.minusTimeHMS(plane.getEngineRightSStateResidualLife(), e.getEngineSStateWork()));
                    plane.setEngineRightStartingRemainingLife(NumberOperation.minusNumber(plane.getEngineRightStartingRemainingLife(), e.getEngineStartTimes()));
                    plane.setEngineRightSpMajorCycles(NumberOperation.addNumber(plane.getEngineLeftSpMajorCycles(), e.getEngineSpMainCycle()));
                    plane.setEngineRightSMajorCycles(NumberOperation.addNumber(plane.getEngineLeftSMajorCycles(), e.getEngineSMainCycle()));
                    // 对右机匣的数据更新
                    plane.setReceiverRightTotalServiceLife(TimeOperation.addTime(plane.getReceiverRightTotalServiceLife(), e.getEngineSpAllStateWork()));
                    plane.setReceiverRightResidualLife(TimeOperation.minusTime(plane.getEngineRightResidualLife(), e.getEngineSpAllStateWork()));
                    plane.setReceiverRightSpStateResidualLife(TimeOperation.minusTimeHMS(plane.getReceiverRightSpStateResidualLife(), e.getEngineSpStateWork()));
                    plane.setReceiverRightStateResidualLife(TimeOperation.minusTimeHMS(plane.getReceiverRightStateResidualLife(), e.getEngineSStateWork()));
                    plane.setReceiverRightStartingRemainingLife(NumberOperation.minusNumber(plane.getReceiverRightStartingRemainingLife(), e.getEngineStartTimes()));
                    // 对右起动机的数据更新
                    plane.setStarterRightTotalServiceLife(NumberOperation.addNumber(plane.getStarterRightTotalServiceLife(), e.getEngineStartTimes()));
                    plane.setStarterRightResidualLife(NumberOperation.minusNumber(plane.getStarterRightResidualLife(), e.getEngineStartTimes()));
                    // 对左综合调节器的数据更新
                    plane.setRegulatorRightResidualLife(TimeOperation.minusTime(plane.getRegulatorRightResidualLife(), e.getEngineSpAllStateWork()));
                }

                planeMapper.updateByPrimaryKey(plane);
            }
        });
        return resumeMapper.addResume(resumeList);
    }

    @Override
    public int addResumeEngineB(List<Resume> resumeList) {
        resumeList.forEach(e -> {
            e.setReceiverDate(e.getEngineDate());
            e.setReceiverStartTimes(e.getEngineStartTimes());

            if (ObjectUtils.isEmpty(e.getId())) {
                Plane plane = planeMapper.selectByPrimaryKey(e.getPlaneId());
                if (e.getType().equals("left")) {
                    // 对左发动机的数据更新
                    plane.setEngineLeftTotalWorkHours(TimeOperation.addTime(plane.getEngineLeftTotalWorkHours(), e.getEngineSpAllStateWork()));
                    plane.setEngineLeftLastRepairTime(TimeOperation.addTime(plane.getEngineLeftLastRepairTime(), e.getEngineSpAllStateWork()));
                    plane.setEngineLeftOperationalHours(TimeOperation.minusTime(plane.getEngineLeftOperationalHours(), e.getEngineSAllStateWork()));
                    plane.setEngineLeftMidUpHours(TimeOperation.minusTime(plane.getEngineLeftMidUpHours(), e.getEngineSpStateWork()));
                    plane.setEngineLeftMidUpRestHours(TimeOperation.minusTime(plane.getEngineLeftMidUpRestHours(), e.getEngineSStateWork()));
                    plane.setEngineLeftResidualLife(TimeOperation.minusTime(plane.getEngineLeftResidualLife(), e.getEngineSpAllStateWork()));

                    // 对左机匣的数据更新
                    plane.setReceiverLeftTotalHours(TimeOperation.addTime(plane.getReceiverLeftTotalHours(), e.getEngineSpAllStateWork()));
                    plane.setReceiverLeftLastRepairTime(TimeOperation.addTime(plane.getReceiverLeftLastRepairTime(), e.getEngineSpAllStateWork()));
                    plane.setReceiverLeftRemainingTime(TimeOperation.minusTime(plane.getReceiverLeftRemainingTime(), e.getEngineSpAllStateWork()));

                    // 对左起动机的数据更新
                    plane.setStarterLeftTotalServiceLife(NumberOperation.addNumber(plane.getStarterLeftTotalServiceLife(), e.getEngineStartTimes()));
                    plane.setStarterLeftResidualLife(NumberOperation.minusNumber(plane.getStarterLeftResidualLife(), e.getEngineStartTimes()));

                    // 对左综合调节器的数据更新
                    plane.setRegulatorLeftResidualLife(TimeOperation.minusTime(plane.getRegulatorLeftResidualLife(), e.getEngineSpAllStateWork()));
                } else {
                    // 对右发动机的数据更新
                    plane.setEngineRightTotalWorkHours(TimeOperation.addTime(plane.getEngineRightTotalWorkHours(), e.getEngineSpAllStateWork()));
                    plane.setEngineRightLastRepairTime(TimeOperation.addTime(plane.getEngineRightLastRepairTime(), e.getEngineSpAllStateWork()));
                    plane.setEngineRightOperationalHours(TimeOperation.minusTime(plane.getEngineRightOperationalHours(), e.getEngineSAllStateWork()));
                    plane.setEngineRightMidUpHours(TimeOperation.minusTime(plane.getEngineRightMidUpHours(), e.getEngineSpStateWork()));
                    plane.setEngineRightMidUpRestHours(TimeOperation.minusTime(plane.getEngineRightMidUpRestHours(), e.getEngineSStateWork()));
                    plane.setEngineRightResidualLife(TimeOperation.minusTime(plane.getEngineRightResidualLife(), e.getEngineSpAllStateWork()));

                    // 对右机匣的数据更新
                    plane.setReceiverRightTotalHours(TimeOperation.addTime(plane.getReceiverRightTotalHours(), e.getEngineSpAllStateWork()));
                    plane.setReceiverRightLastRepairTime(TimeOperation.addTime(plane.getReceiverRightLastRepairTime(), e.getEngineSpAllStateWork()));
                    plane.setReceiverRightRemainingTime(TimeOperation.minusTime(plane.getReceiverRightRemainingTime(), e.getEngineSpAllStateWork()));

                    // 对右起动机的数据更新
                    plane.setStarterRightTotalServiceLife(NumberOperation.addNumber(plane.getStarterRightTotalServiceLife(), e.getEngineStartTimes()));
                    plane.setStarterRightResidualLife(NumberOperation.minusNumber(plane.getStarterRightResidualLife(), e.getEngineStartTimes()));

                    // 对右综合调节器的数据更新
                    plane.setRegulatorRightResidualLife(TimeOperation.minusTime(plane.getRegulatorRightResidualLife(), e.getEngineSpAllStateWork()));
                }

                planeMapper.updateByPrimaryKey(plane);
            }
        });
        return resumeMapper.addResume(resumeList);
    }


}
