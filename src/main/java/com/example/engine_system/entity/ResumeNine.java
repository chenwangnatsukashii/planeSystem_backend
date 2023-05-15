package com.example.engine_system.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
public class ResumeNine implements Serializable {

    private static final long serialVersionUID = -2732055001081549592L;

    private Integer id;
    private Integer planeId;

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
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

}