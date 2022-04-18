package com.example.engine_system.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
public class ResumeEight implements Serializable {

    private static final long serialVersionUID = -644972534331302258L;

    private Integer id;
    private Integer planeId;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
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

}