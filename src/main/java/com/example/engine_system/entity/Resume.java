package com.example.engine_system.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
public class Resume implements Serializable {

    private static final long serialVersionUID = 6772770619006084740L;

    private Integer id;
    private Integer planeId;
    private String type;

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date engineDate;
    private Integer engineStartTimes;
    private String engineSGroundFlight;
    private String engineSpGroundFlight;
    private String engineSFlight;
    private String engineSpFlight;
    private String engineSStateWork;
    private String engineYsStateWork;
    private String engineSpStateWork;
    private String engineSAllStateWork;
    private String engineSpAllStateWork;
    private Integer engineSMainCycle;
    private Integer engineSpMainCycle;

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date receiverDate;
    private Integer receiverStartTimes;
    private String receiverSGroundFlight;
    private String receiverSpGroundFlight;
    private String receiverSFlight;
    private String receiverSpFlight;
    private String receiverSStateWork;
    private String receiverYsStateWork;
    private String receiverSpStateWork;
    private String receiverSAllStateWork;
    private String receiverSpAllStateWork;

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date sEngineDate;
    private Integer sEngineStartTimes;
    private Integer sEngineLastRepair;
    private Integer sEngineLastOilSealRepair;
    private Integer sEngineAllStart;
    private Integer sEngineAllOilSeal;

    public Resume(Integer id, Integer planeId, String type, Date engineDate, Integer engineStartTimes, String engineSGroundFlight, String engineSpGroundFlight, String engineSFlight, String engineSpFlight, String engineSStateWork, String engineYsStateWork, String engineSpStateWork, String engineSAllStateWork, String engineSpAllStateWork, Integer engineSMainCycle, Integer engineSpMainCycle, Date receiverDate, Integer receiverStartTimes, String receiverSGroundFlight, String receiverSpGroundFlight, String receiverSFlight, String receiverSpFlight, String receiverSStateWork, String receiverYsStateWork, String receiverSpStateWork, String receiverSAllStateWork, String receiverSpAllStateWork, Date sEngineDate, Integer sEngineStartTimes, Integer sEngineLastRepair, Integer sEngineLastOilSealRepair, Integer sEngineAllStart, Integer sEngineAllOilSeal) {
        this.id = id;
        this.planeId = planeId;
        this.type = type;
        this.engineDate = engineDate;
        this.engineStartTimes = engineStartTimes;
        this.engineSGroundFlight = engineSGroundFlight;
        this.engineSpGroundFlight = engineSpGroundFlight;
        this.engineSFlight = engineSFlight;
        this.engineSpFlight = engineSpFlight;
        this.engineSStateWork = engineSStateWork;
        this.engineYsStateWork = engineYsStateWork;
        this.engineSpStateWork = engineSpStateWork;
        this.engineSAllStateWork = engineSAllStateWork;
        this.engineSpAllStateWork = engineSpAllStateWork;
        this.engineSMainCycle = engineSMainCycle;
        this.engineSpMainCycle = engineSpMainCycle;
        this.receiverDate = receiverDate;
        this.receiverStartTimes = receiverStartTimes;
        this.receiverSGroundFlight = receiverSGroundFlight;
        this.receiverSpGroundFlight = receiverSpGroundFlight;
        this.receiverSFlight = receiverSFlight;
        this.receiverSpFlight = receiverSpFlight;
        this.receiverSStateWork = receiverSStateWork;
        this.receiverYsStateWork = receiverYsStateWork;
        this.receiverSpStateWork = receiverSpStateWork;
        this.receiverSAllStateWork = receiverSAllStateWork;
        this.receiverSpAllStateWork = receiverSpAllStateWork;
        this.sEngineDate = sEngineDate;
        this.sEngineStartTimes = sEngineStartTimes;
        this.sEngineLastRepair = sEngineLastRepair;
        this.sEngineLastOilSealRepair = sEngineLastOilSealRepair;
        this.sEngineAllStart = sEngineAllStart;
        this.sEngineAllOilSeal = sEngineAllOilSeal;
    }

}