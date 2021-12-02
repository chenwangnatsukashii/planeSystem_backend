package com.example.engine_system.entity;

import java.util.Date;

public class Resume {
    private Integer id;

    private Integer planeId;

    private String type;

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

    public Resume() {
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Date getEngineDate() {
        return engineDate;
    }

    public void setEngineDate(Date engineDate) {
        this.engineDate = engineDate;
    }

    public Integer getEngineStartTimes() {
        return engineStartTimes;
    }

    public void setEngineStartTimes(Integer engineStartTimes) {
        this.engineStartTimes = engineStartTimes;
    }

    public String getEngineSGroundFlight() {
        return engineSGroundFlight;
    }

    public void setEngineSGroundFlight(String engineSGroundFlight) {
        this.engineSGroundFlight = engineSGroundFlight == null ? null : engineSGroundFlight.trim();
    }

    public String getEngineSpGroundFlight() {
        return engineSpGroundFlight;
    }

    public void setEngineSpGroundFlight(String engineSpGroundFlight) {
        this.engineSpGroundFlight = engineSpGroundFlight == null ? null : engineSpGroundFlight.trim();
    }

    public String getEngineSFlight() {
        return engineSFlight;
    }

    public void setEngineSFlight(String engineSFlight) {
        this.engineSFlight = engineSFlight == null ? null : engineSFlight.trim();
    }

    public String getEngineSpFlight() {
        return engineSpFlight;
    }

    public void setEngineSpFlight(String engineSpFlight) {
        this.engineSpFlight = engineSpFlight == null ? null : engineSpFlight.trim();
    }

    public String getEngineSStateWork() {
        return engineSStateWork;
    }

    public void setEngineSStateWork(String engineSStateWork) {
        this.engineSStateWork = engineSStateWork == null ? null : engineSStateWork.trim();
    }

    public String getEngineYsStateWork() {
        return engineYsStateWork;
    }

    public void setEngineYsStateWork(String engineYsStateWork) {
        this.engineYsStateWork = engineYsStateWork == null ? null : engineYsStateWork.trim();
    }

    public String getEngineSpStateWork() {
        return engineSpStateWork;
    }

    public void setEngineSpStateWork(String engineSpStateWork) {
        this.engineSpStateWork = engineSpStateWork == null ? null : engineSpStateWork.trim();
    }

    public String getEngineSAllStateWork() {
        return engineSAllStateWork;
    }

    public void setEngineSAllStateWork(String engineSAllStateWork) {
        this.engineSAllStateWork = engineSAllStateWork == null ? null : engineSAllStateWork.trim();
    }

    public String getEngineSpAllStateWork() {
        return engineSpAllStateWork;
    }

    public void setEngineSpAllStateWork(String engineSpAllStateWork) {
        this.engineSpAllStateWork = engineSpAllStateWork == null ? null : engineSpAllStateWork.trim();
    }

    public Integer getEngineSMainCycle() {
        return engineSMainCycle;
    }

    public void setEngineSMainCycle(Integer engineSMainCycle) {
        this.engineSMainCycle = engineSMainCycle;
    }

    public Integer getEngineSpMainCycle() {
        return engineSpMainCycle;
    }

    public void setEngineSpMainCycle(Integer engineSpMainCycle) {
        this.engineSpMainCycle = engineSpMainCycle;
    }

    public Date getReceiverDate() {
        return receiverDate;
    }

    public void setReceiverDate(Date receiverDate) {
        this.receiverDate = receiverDate;
    }

    public Integer getReceiverStartTimes() {
        return receiverStartTimes;
    }

    public void setReceiverStartTimes(Integer receiverStartTimes) {
        this.receiverStartTimes = receiverStartTimes;
    }

    public String getReceiverSGroundFlight() {
        return receiverSGroundFlight;
    }

    public void setReceiverSGroundFlight(String receiverSGroundFlight) {
        this.receiverSGroundFlight = receiverSGroundFlight == null ? null : receiverSGroundFlight.trim();
    }

    public String getReceiverSpGroundFlight() {
        return receiverSpGroundFlight;
    }

    public void setReceiverSpGroundFlight(String receiverSpGroundFlight) {
        this.receiverSpGroundFlight = receiverSpGroundFlight == null ? null : receiverSpGroundFlight.trim();
    }

    public String getReceiverSFlight() {
        return receiverSFlight;
    }

    public void setReceiverSFlight(String receiverSFlight) {
        this.receiverSFlight = receiverSFlight == null ? null : receiverSFlight.trim();
    }

    public String getReceiverSpFlight() {
        return receiverSpFlight;
    }

    public void setReceiverSpFlight(String receiverSpFlight) {
        this.receiverSpFlight = receiverSpFlight == null ? null : receiverSpFlight.trim();
    }

    public String getReceiverSStateWork() {
        return receiverSStateWork;
    }

    public void setReceiverSStateWork(String receiverSStateWork) {
        this.receiverSStateWork = receiverSStateWork == null ? null : receiverSStateWork.trim();
    }

    public String getReceiverYsStateWork() {
        return receiverYsStateWork;
    }

    public void setReceiverYsStateWork(String receiverYsStateWork) {
        this.receiverYsStateWork = receiverYsStateWork == null ? null : receiverYsStateWork.trim();
    }

    public String getReceiverSpStateWork() {
        return receiverSpStateWork;
    }

    public void setReceiverSpStateWork(String receiverSpStateWork) {
        this.receiverSpStateWork = receiverSpStateWork == null ? null : receiverSpStateWork.trim();
    }

    public String getReceiverSAllStateWork() {
        return receiverSAllStateWork;
    }

    public void setReceiverSAllStateWork(String receiverSAllStateWork) {
        this.receiverSAllStateWork = receiverSAllStateWork == null ? null : receiverSAllStateWork.trim();
    }

    public String getReceiverSpAllStateWork() {
        return receiverSpAllStateWork;
    }

    public void setReceiverSpAllStateWork(String receiverSpAllStateWork) {
        this.receiverSpAllStateWork = receiverSpAllStateWork == null ? null : receiverSpAllStateWork.trim();
    }

    public Date getsEngineDate() {
        return sEngineDate;
    }

    public void setsEngineDate(Date sEngineDate) {
        this.sEngineDate = sEngineDate;
    }

    public Integer getsEngineStartTimes() {
        return sEngineStartTimes;
    }

    public void setsEngineStartTimes(Integer sEngineStartTimes) {
        this.sEngineStartTimes = sEngineStartTimes;
    }

    public Integer getsEngineLastRepair() {
        return sEngineLastRepair;
    }

    public void setsEngineLastRepair(Integer sEngineLastRepair) {
        this.sEngineLastRepair = sEngineLastRepair;
    }

    public Integer getsEngineLastOilSealRepair() {
        return sEngineLastOilSealRepair;
    }

    public void setsEngineLastOilSealRepair(Integer sEngineLastOilSealRepair) {
        this.sEngineLastOilSealRepair = sEngineLastOilSealRepair;
    }

    public Integer getsEngineAllStart() {
        return sEngineAllStart;
    }

    public void setsEngineAllStart(Integer sEngineAllStart) {
        this.sEngineAllStart = sEngineAllStart;
    }

    public Integer getsEngineAllOilSeal() {
        return sEngineAllOilSeal;
    }

    public void setsEngineAllOilSeal(Integer sEngineAllOilSeal) {
        this.sEngineAllOilSeal = sEngineAllOilSeal;
    }
}