package com.example.engine_system.entity;

import java.util.Date;

public class ResumeNine {
    private Integer id;
    private Integer planeId;
    private Date nineDate;
    private Integer groundAllHour;
    private Integer groundAllMinute;
    private Integer groundBigHour;
    private Integer groundBigMinute;
    private Integer groundAddHour;
    private Integer groundAddMinute;
    private Integer airAllHour;
    private Integer airAllMinute;
    private Integer airBigHour;
    private Integer airBigMinute;
    private Integer airAddHour;
    private Integer airAddMinute;
    private Integer totalTimeHour;
    private Integer totalTimeMinute;
    private Integer startTime;

    public ResumeNine(Integer id, Integer planeId, Date nineDate, Integer groundAllHour, Integer groundAllMinute, Integer groundBigHour, Integer groundBigMinute, Integer groundAddHour, Integer groundAddMinute, Integer airAllHour, Integer airAllMinute, Integer airBigHour, Integer airBigMinute, Integer airAddHour, Integer airAddMinute, Integer totalTimeHour, Integer totalTimeMinute, Integer startTime) {
        this.id = id;
        this.planeId = planeId;
        this.nineDate = nineDate;
        this.groundAllHour = groundAllHour;
        this.groundAllMinute = groundAllMinute;
        this.groundBigHour = groundBigHour;
        this.groundBigMinute = groundBigMinute;
        this.groundAddHour = groundAddHour;
        this.groundAddMinute = groundAddMinute;
        this.airAllHour = airAllHour;
        this.airAllMinute = airAllMinute;
        this.airBigHour = airBigHour;
        this.airBigMinute = airBigMinute;
        this.airAddHour = airAddHour;
        this.airAddMinute = airAddMinute;
        this.totalTimeHour = totalTimeHour;
        this.totalTimeMinute = totalTimeMinute;
        this.startTime = startTime;
    }

    public ResumeNine() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPlaneId() {
        return planeId;
    }

    public void setPlaneId(Integer planeId) {
        this.planeId = planeId;
    }

    public Date getNineDate() {
        return nineDate;
    }

    public void setNineDate(Date nineDate) {
        this.nineDate = nineDate;
    }

    public Integer getGroundAllHour() {
        return groundAllHour;
    }

    public void setGroundAllHour(Integer groundAllHour) {
        this.groundAllHour = groundAllHour;
    }

    public Integer getGroundAllMinute() {
        return groundAllMinute;
    }

    public void setGroundAllMinute(Integer groundAllMinute) {
        this.groundAllMinute = groundAllMinute;
    }

    public Integer getGroundBigHour() {
        return groundBigHour;
    }

    public void setGroundBigHour(Integer groundBigHour) {
        this.groundBigHour = groundBigHour;
    }

    public Integer getGroundBigMinute() {
        return groundBigMinute;
    }

    public void setGroundBigMinute(Integer groundBigMinute) {
        this.groundBigMinute = groundBigMinute;
    }

    public Integer getGroundAddHour() {
        return groundAddHour;
    }

    public void setGroundAddHour(Integer groundAddHour) {
        this.groundAddHour = groundAddHour;
    }

    public Integer getGroundAddMinute() {
        return groundAddMinute;
    }

    public void setGroundAddMinute(Integer groundAddMinute) {
        this.groundAddMinute = groundAddMinute;
    }

    public Integer getAirAllHour() {
        return airAllHour;
    }

    public void setAirAllHour(Integer airAllHour) {
        this.airAllHour = airAllHour;
    }

    public Integer getAirAllMinute() {
        return airAllMinute;
    }

    public void setAirAllMinute(Integer airAllMinute) {
        this.airAllMinute = airAllMinute;
    }

    public Integer getAirBigHour() {
        return airBigHour;
    }

    public void setAirBigHour(Integer airBigHour) {
        this.airBigHour = airBigHour;
    }

    public Integer getAirBigMinute() {
        return airBigMinute;
    }

    public void setAirBigMinute(Integer airBigMinute) {
        this.airBigMinute = airBigMinute;
    }

    public Integer getAirAddHour() {
        return airAddHour;
    }

    public void setAirAddHour(Integer airAddHour) {
        this.airAddHour = airAddHour;
    }

    public Integer getAirAddMinute() {
        return airAddMinute;
    }

    public void setAirAddMinute(Integer airAddMinute) {
        this.airAddMinute = airAddMinute;
    }

    public Integer getTotalTimeHour() {
        return totalTimeHour;
    }

    public void setTotalTimeHour(Integer totalTimeHour) {
        this.totalTimeHour = totalTimeHour;
    }

    public Integer getTotalTimeMinute() {
        return totalTimeMinute;
    }

    public void setTotalTimeMinute(Integer totalTimeMinute) {
        this.totalTimeMinute = totalTimeMinute;
    }

    public Integer getStartTime() {
        return startTime;
    }

    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }
}