package com.example.engine_system.untils;

import com.example.engine_system.entity.Plane;
import com.example.engine_system.service.PlaneService;
import com.example.engine_system.sysconst.PlaneType;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class TimeTask {

    @Resource
    private PlaneService planeService;

    @Scheduled(cron = "0 10 0 1 * ?")//每月1号的0:10:00执行
    public void restCalendar() {
        List<Plane> allPlanes = planeService.getAllPlanes("", "", "", "");
        allPlanes.forEach(plane -> {
            if (plane.getPlaneType().equals(PlaneType.PLANE_TYPE_1.geteName())) {
                if (!SomeOperation.isEmpty(plane.getEngineLeftRemainingTime())) {
                    plane.setEngineLeftRemainingTime(this.reduceMonth(plane.getEngineLeftRemainingTime()));
                }
                if (!SomeOperation.isEmpty(plane.getReceiverLeftRemainingTime())) {
                    plane.setReceiverLeftRemainingTime(this.reduceMonth(plane.getReceiverLeftRemainingTime()));
                }
                if (!SomeOperation.isEmpty(plane.getStarterLeftRemainingTime())) {
                    plane.setStarterLeftRemainingTime(this.reduceMonth(plane.getStarterLeftRemainingTime()));
                }
                if (!SomeOperation.isEmpty(plane.getRegulatorLeftRemainingTime())) {
                    plane.setRegulatorLeftRemainingTime(this.reduceMonth(plane.getRegulatorLeftRemainingTime()));
                }

                if (!SomeOperation.isEmpty(plane.getEngineRightRemainingTime())) {
                    plane.setEngineRightRemainingTime(this.reduceMonth(plane.getEngineRightRemainingTime()));
                }
                if (!SomeOperation.isEmpty(plane.getReceiverRightRemainingTime())) {
                    plane.setReceiverRightRemainingTime(this.reduceMonth(plane.getReceiverRightRemainingTime()));
                }
                if (!SomeOperation.isEmpty(plane.getStarterRightRemainingTime())) {
                    plane.setStarterRightRemainingTime(this.reduceMonth(plane.getStarterRightRemainingTime()));
                }
                if (!SomeOperation.isEmpty(plane.getRegulatorRightRemainingTime())) {
                    plane.setRegulatorRightRemainingTime(this.reduceMonth(plane.getRegulatorRightRemainingTime()));
                }
            } else if (plane.getPlaneType().equals(PlaneType.PLANE_TYPE_2.geteName())) {
                if (!SomeOperation.isEmpty(plane.getRegulatorLeftRemainingTime())) {
                    plane.setRegulatorLeftRemainingTime(this.reduceMonth(plane.getRegulatorLeftRemainingTime()));
                }
                if (!SomeOperation.isEmpty(plane.getRegulatorRightRemainingTime())) {
                    plane.setRegulatorRightRemainingTime(this.reduceMonth(plane.getRegulatorRightRemainingTime()));
                }
            } else if (plane.getPlaneType().equals(PlaneType.PLANE_TYPE_4.geteName())) {
                if (!SomeOperation.isEmpty(plane.getEngineLeftRemainingTime())) {
                    plane.setEngineLeftRemainingTime(this.reduceMonth(plane.getEngineLeftRemainingTime()));
                }
            }
        });

        planeService.addPlane(allPlanes);
    }

    private String reduceMonth(String calendar) {
        Integer year = Integer.parseInt(String.valueOf(calendar.charAt(0)));
        int month = Integer.parseInt(String.valueOf(calendar.charAt(2)));
        if (month == 0) {
            year--;
        } else {
            month--;
        }
        return year + "年" + month + "个月";
    }
}
