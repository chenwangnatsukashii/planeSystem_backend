package com.example.engine_system.entity;

import java.util.Date;

public class ResumeEight {
    private Integer id;

    private Integer planeId;

    private Date eightDate;

    private Integer todayStartTimes;

    private String groundFly;

    private String groundRated;

    private String groundTotal;

    private String airFly;

    private String airRated;

    private String airTotal;

    private String groundAirFly;

    private String groundAirRated;

    private String groundAirTotal;

    private String totalFly;

    private String totalRated;

    private String totalTotal;

    private Integer totalStartTimes;

    public ResumeEight(Integer id, Integer planeId, Date eightDate, Integer todayStartTimes, String groundFly, String groundRated, String groundTotal, String airFly, String airRated, String airTotal, String groundAirFly, String groundAirRated, String groundAirTotal, String totalFly, String totalRated, String totalTotal, Integer totalStartTimes) {
        this.id = id;
        this.planeId = planeId;
        this.eightDate = eightDate;
        this.todayStartTimes = todayStartTimes;
        this.groundFly = groundFly;
        this.groundRated = groundRated;
        this.groundTotal = groundTotal;
        this.airFly = airFly;
        this.airRated = airRated;
        this.airTotal = airTotal;
        this.groundAirFly = groundAirFly;
        this.groundAirRated = groundAirRated;
        this.groundAirTotal = groundAirTotal;
        this.totalFly = totalFly;
        this.totalRated = totalRated;
        this.totalTotal = totalTotal;
        this.totalStartTimes = totalStartTimes;
    }

    public ResumeEight() {
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

    public Date getEightDate() {
        return eightDate;
    }

    public void setEightDate(Date eightDate) {
        this.eightDate = eightDate;
    }

    public Integer getTodayStartTimes() {
        return todayStartTimes;
    }

    public void setTodayStartTimes(Integer todayStartTimes) {
        this.todayStartTimes = todayStartTimes;
    }

    public String getGroundFly() {
        return groundFly;
    }

    public void setGroundFly(String groundFly) {
        this.groundFly = groundFly == null ? null : groundFly.trim();
    }

    public String getGroundRated() {
        return groundRated;
    }

    public void setGroundRated(String groundRated) {
        this.groundRated = groundRated == null ? null : groundRated.trim();
    }

    public String getGroundTotal() {
        return groundTotal;
    }

    public void setGroundTotal(String groundTotal) {
        this.groundTotal = groundTotal == null ? null : groundTotal.trim();
    }

    public String getAirFly() {
        return airFly;
    }

    public void setAirFly(String airFly) {
        this.airFly = airFly == null ? null : airFly.trim();
    }

    public String getAirRated() {
        return airRated;
    }

    public void setAirRated(String airRated) {
        this.airRated = airRated == null ? null : airRated.trim();
    }

    public String getAirTotal() {
        return airTotal;
    }

    public void setAirTotal(String airTotal) {
        this.airTotal = airTotal == null ? null : airTotal.trim();
    }

    public String getGroundAirFly() {
        return groundAirFly;
    }

    public void setGroundAirFly(String groundAirFly) {
        this.groundAirFly = groundAirFly == null ? null : groundAirFly.trim();
    }

    public String getGroundAirRated() {
        return groundAirRated;
    }

    public void setGroundAirRated(String groundAirRated) {
        this.groundAirRated = groundAirRated == null ? null : groundAirRated.trim();
    }

    public String getGroundAirTotal() {
        return groundAirTotal;
    }

    public void setGroundAirTotal(String groundAirTotal) {
        this.groundAirTotal = groundAirTotal == null ? null : groundAirTotal.trim();
    }

    public String getTotalFly() {
        return totalFly;
    }

    public void setTotalFly(String totalFly) {
        this.totalFly = totalFly == null ? null : totalFly.trim();
    }

    public String getTotalRated() {
        return totalRated;
    }

    public void setTotalRated(String totalRated) {
        this.totalRated = totalRated == null ? null : totalRated.trim();
    }

    public String getTotalTotal() {
        return totalTotal;
    }

    public void setTotalTotal(String totalTotal) {
        this.totalTotal = totalTotal == null ? null : totalTotal.trim();
    }

    public Integer getTotalStartTimes() {
        return totalStartTimes;
    }

    public void setTotalStartTimes(Integer totalStartTimes) {
        this.totalStartTimes = totalStartTimes;
    }
}