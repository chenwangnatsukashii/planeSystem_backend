package com.example.engine_system.entity;

import java.util.Date;
import java.util.List;

public class Plane {
    private Integer id;
    private String workNumber;
    private String planeType;
    private String unitNumber;
    private String planeNum;
    private String planeNoseNum;
    private String factory;
    private String atUnitNum;
    private Date manufacturingDate;
    private String verticalTailNum;
    private Date intoFactoryDate;
    private String sendUnit;
    private String insititute;
    private String garrison;
    private String beginningTime;
    private String lastRefurbishmentTime;
    private Date repairDate;
    private Integer flightHours;
    private String specifiedLife;
    private String residualLife;
    private String totalLife;
    private String thisUsedLife;
    private Integer totalUpDown;
    private Integer lastUpDown;
    private Integer repairNum;
    private String calendarLimitTime;
    private Integer remainingCalendarYear;
    private Integer remainingCalendarMonth;
    private Integer usedCalendarYear;
    private Integer usedCalendarMonth;
    private String engineModel;
    private String engineRemainingTime;
    private String engineLeftNum;
    private String engineRightNum;
    private String engineLeftTotalWorkHours;
    private String engineRightTotalWorkHours;
    private String engineLeftLastRepairTime;
    private String engineRightLastRepairTime;
    private Date engineLeftExpirationDate;
    private Date engineRightExpirationDate;
    private String engineLeftOperationalHours;
    private String engineRightOperationalHours;
    private String engineLeftMidUpHours;
    private String engineRightMidUpHours;
    private String engineLeftMidUpRestHours;
    private String engineRightMidUpRestHours;
    private String engineLeftRemainingTime;
    private String engineRightRemainingTime;
    private String engineLeftTotalServiceLife;
    private String engineRightTotalServiceLife;
    private String engineLeftSpecifiedLife;
    private String engineRightSpecifiedLife;
    private String engineLeftResidualLife;
    private String engineRightResidualLife;
    private String engineLeftSpStateResidualLife;
    private String engineRightSpStateResidualLife;
    private String engineLeftSStateResidualLife;
    private String engineRightSStateResidualLife;
    private Integer engineLeftStartingRemainingLife;
    private Integer engineRightStartingRemainingLife;
    private Integer engineLeftSpMajorCycles;
    private Integer engineRightSpMajorCycles;
    private Integer engineLeftSMajorCycles;
    private Integer engineRightSMajorCycles;
    private Integer engineLeftRepairedTimes;
    private Integer engineRightRepairedTimes;
    private String engineLeftOverhaulFactory;
    private String engineRightOverhaulFactory;
    private String engineLeftRepairMakeFactory;
    private String engineRightRepairMakeFactory;
    private Date engineLeftLastDeliveryDate;
    private Date engineRightLastDeliveryDate;
    private Date engineLeftManufacturingData;
    private Date engineRightManufacturingData;
    private Date engineLeftNine;
    private Date engineRightNine;
    private String engineLeftOilNum;
    private String engineRightOilNum;
    private Date engineLeftOilSealDate;
    private Date engineRightOilSealDate;
    private Date engineLeftOilSealDeadline;
    private Date engineRightOilSealDeadline;
    private String engineLeftFlawDetection;
    private String engineRightFlawDetection;
    private String engineLeftNextInspection;
    private String engineRightNextInspection;
    private String receiverLeftNum;
    private String receiverRightNum;
    private String receiverLeftTotalHours;
    private String receiverRightTotalHours;
    private String receiverLeftLastRepairTime;
    private String receiverRightLastRepairTime;
    private String receiverLeftRemainingTime;
    private String receiverRightRemainingTime;
    private String receiverLeftTotalServiceLife;
    private String receiverRightTotalServiceLife;
    private String receiverLeftResidualLife;
    private String receiverRightResidualLife;
    private String receiverLeftSpStateResidualLife;
    private String receiverRightSpStateResidualLife;
    private String receiverLeftStateResidualLife;
    private String receiverRightStateResidualLife;
    private Integer receiverLeftStartingRemainingLife;
    private Integer receiverRightStartingRemainingLife;
    private Date receiverLeftExpirationDate;
    private Date receiverRightExpirationDate;
    private String receiverLeftManufacturingFactory;
    private String receiverRightManufacturingFactory;
    private Date receiverLeftManufacturingDate;
    private Date receiverRightManufacturingDate;
    private String receiverLeftSpecifiedLife;
    private String receiverRightSpecifiedLife;
    private Integer receiverLeftRepairedTimes;
    private Integer receiverRightRepairedTimes;
    private String receiverLeftOverhaulFactory;
    private String receiverRightOverhaulFactory;
    private Date receiverLeftLastDeliveryDate;
    private Date receiverRightLastDeliveryDate;
    private Date receiverLeftManufactureDate;
    private Date receiverRightManufactureDate;
    private String starterLeftNum;
    private String starterRightNum;
    private Integer starterLeftSpecifiedLife;
    private Integer starterRightSpecifiedLife;
    private Integer starterLeftResidualLife;
    private Integer starterRightResidualLife;
    private Integer starterLeftRenovations;
    private Integer starterRightRenovations;
    private String starterLeftRemainingTime;
    private String starterRightRemainingTime;
    private Integer starterLeftTotalServiceLife;
    private Integer starterRightTotalServiceLife;
    private Date starterLeftExpirationDate;
    private Date starterRightExpirationDate;
    private Integer starterLeftRepairedTimes;
    private Integer starterRightRepairedTimes;
    private String starterLeftManufacturingFactory;
    private String starterRightManufacturingFactory;
    private String starterLeftOverhaulFactory;
    private String starterRightOverhaulFactory;
    private Date starterLeftLastDeliveryDate;
    private Date starterRightLastDeliveryDate;
    private Date starterLeftManufactureDate;
    private Date starterRightManufactureDate;
    private String regulatorLeftNum;
    private String regulatorRightNum;
    private String regulatorLeftModel;
    private String regulatorRightModel;
    private String regulatorLeftRemainingTime;
    private String regulatorRightRemainingTime;
    private String regulatorLeftResidualLife;
    private String regulatorRightResidualLife;
    private String airGeneratorModel;
    private String airGeneratorNum;
    private Integer airGeneratorStartTimes;
    private String airGeneratorRepairedTimes;
    private Integer airGeneratorSpecifiedStartingTimes;
    private String airGeneratorOverhaulFactory;
    private Date airGeneratorManufactureDate;
    private Integer airGeneratorRemainingTimes;
    private Integer airGeneratorRepairTimes;
    private List<String> warningInfo;

    public List<String> getWarningInfo() {
        return warningInfo;
    }

    public void setWarningInfo(List<String> warningInfo) {
        this.warningInfo = warningInfo;
    }

    public Plane(Integer id, String workNumber, String planeType, String unitNumber, String planeNum, String planeNoseNum, String factory, String atUnitNum, Date manufacturingDate, String verticalTailNum, Date intoFactoryDate, String sendUnit, String insititute, String garrison, String beginningTime, String lastRefurbishmentTime, Date repairDate, Integer flightHours, String specifiedLife, String residualLife, String totalLife, String thisUsedLife, Integer totalUpDown, Integer lastUpDown, Integer repairNum, String calendarLimitTime, Integer remainingCalendarYear, Integer remainingCalendarMonth, Integer usedCalendarYear, Integer usedCalendarMonth, String engineModel, String engineRemainingTime, String engineLeftNum, String engineRightNum, String engineLeftTotalWorkHours, String engineRightTotalWorkHours, String engineLeftLastRepairTime, String engineRightLastRepairTime, Date engineLeftExpirationDate, Date engineRightExpirationDate, String engineLeftOperationalHours, String engineRightOperationalHours, String engineLeftMidUpHours, String engineRightMidUpHours, String engineLeftMidUpRestHours, String engineRightMidUpRestHours, String engineLeftRemainingTime, String engineRightRemainingTime, String engineLeftTotalServiceLife, String engineRightTotalServiceLife, String engineLeftSpecifiedLife, String engineRightSpecifiedLife, String engineLeftResidualLife, String engineRightResidualLife, String engineLeftSpStateResidualLife, String engineRightSpStateResidualLife, String engineLeftSStateResidualLife, String engineRightSStateResidualLife, Integer engineLeftStartingRemainingLife, Integer engineRightStartingRemainingLife, Integer engineLeftSpMajorCycles, Integer engineRightSpMajorCycles, Integer engineLeftSMajorCycles, Integer engineRightSMajorCycles, Integer engineLeftRepairedTimes, Integer engineRightRepairedTimes, String engineLeftOverhaulFactory, String engineRightOverhaulFactory, String engineLeftRepairMakeFactory, String engineRightRepairMakeFactory, Date engineLeftLastDeliveryDate, Date engineRightLastDeliveryDate, Date engineLeftManufacturingData, Date engineRightManufacturingData, Date engineLeftNine, Date engineRightNine, String engineLeftOilNum, String engineRightOilNum, Date engineLeftOilSealDate, Date engineRightOilSealDate, Date engineLeftOilSealDeadline, Date engineRightOilSealDeadline, String engineLeftFlawDetection, String engineRightFlawDetection, String engineLeftNextInspection, String engineRightNextInspection, String receiverLeftNum, String receiverRightNum, String receiverLeftTotalHours, String receiverRightTotalHours, String receiverLeftLastRepairTime, String receiverRightLastRepairTime, String receiverLeftRemainingTime, String receiverRightRemainingTime, String receiverLeftTotalServiceLife, String receiverRightTotalServiceLife, String receiverLeftResidualLife, String receiverRightResidualLife, String receiverLeftSpStateResidualLife, String receiverRightSpStateResidualLife, String receiverLeftStateResidualLife, String receiverRightStateResidualLife, Integer receiverLeftStartingRemainingLife, Integer receiverRightStartingRemainingLife, Date receiverLeftExpirationDate, Date receiverRightExpirationDate, String receiverLeftManufacturingFactory, String receiverRightManufacturingFactory, Date receiverLeftManufacturingDate, Date receiverRightManufacturingDate, String receiverLeftSpecifiedLife, String receiverRightSpecifiedLife, Integer receiverLeftRepairedTimes, Integer receiverRightRepairedTimes, String receiverLeftOverhaulFactory, String receiverRightOverhaulFactory, Date receiverLeftLastDeliveryDate, Date receiverRightLastDeliveryDate, Date receiverLeftManufactureDate, Date receiverRightManufactureDate, String starterLeftNum, String starterRightNum, Integer starterLeftSpecifiedLife, Integer starterRightSpecifiedLife, Integer starterLeftResidualLife, Integer starterRightResidualLife, Integer starterLeftRenovations, Integer starterRightRenovations, String starterLeftRemainingTime, String starterRightRemainingTime, Integer starterLeftTotalServiceLife, Integer starterRightTotalServiceLife, Date starterLeftExpirationDate, Date starterRightExpirationDate, Integer starterLeftRepairedTimes, Integer starterRightRepairedTimes, String starterLeftManufacturingFactory, String starterRightManufacturingFactory, String starterLeftOverhaulFactory, String starterRightOverhaulFactory, Date starterLeftLastDeliveryDate, Date starterRightLastDeliveryDate, Date starterLeftManufactureDate, Date starterRightManufactureDate, String regulatorLeftNum, String regulatorRightNum, String regulatorLeftModel, String regulatorRightModel, String regulatorLeftRemainingTime, String regulatorRightRemainingTime, String regulatorLeftResidualLife, String regulatorRightResidualLife, String airGeneratorModel, String airGeneratorNum, Integer airGeneratorStartTimes, String airGeneratorRepairedTimes, Integer airGeneratorSpecifiedStartingTimes, String airGeneratorOverhaulFactory, Date airGeneratorManufactureDate, Integer airGeneratorRemainingTimes, Integer airGeneratorRepairTimes) {
        this.id = id;
        this.workNumber = workNumber;
        this.planeType = planeType;
        this.unitNumber = unitNumber;
        this.planeNum = planeNum;
        this.planeNoseNum = planeNoseNum;
        this.factory = factory;
        this.atUnitNum = atUnitNum;
        this.manufacturingDate = manufacturingDate;
        this.verticalTailNum = verticalTailNum;
        this.intoFactoryDate = intoFactoryDate;
        this.sendUnit = sendUnit;
        this.insititute = insititute;
        this.garrison = garrison;
        this.beginningTime = beginningTime;
        this.lastRefurbishmentTime = lastRefurbishmentTime;
        this.repairDate = repairDate;
        this.flightHours = flightHours;
        this.specifiedLife = specifiedLife;
        this.residualLife = residualLife;
        this.totalLife = totalLife;
        this.thisUsedLife = thisUsedLife;
        this.totalUpDown = totalUpDown;
        this.lastUpDown = lastUpDown;
        this.repairNum = repairNum;
        this.calendarLimitTime = calendarLimitTime;
        this.remainingCalendarYear = remainingCalendarYear;
        this.remainingCalendarMonth = remainingCalendarMonth;
        this.usedCalendarYear = usedCalendarYear;
        this.usedCalendarMonth = usedCalendarMonth;
        this.engineModel = engineModel;
        this.engineRemainingTime = engineRemainingTime;
        this.engineLeftNum = engineLeftNum;
        this.engineRightNum = engineRightNum;
        this.engineLeftTotalWorkHours = engineLeftTotalWorkHours;
        this.engineRightTotalWorkHours = engineRightTotalWorkHours;
        this.engineLeftLastRepairTime = engineLeftLastRepairTime;
        this.engineRightLastRepairTime = engineRightLastRepairTime;
        this.engineLeftExpirationDate = engineLeftExpirationDate;
        this.engineRightExpirationDate = engineRightExpirationDate;
        this.engineLeftOperationalHours = engineLeftOperationalHours;
        this.engineRightOperationalHours = engineRightOperationalHours;
        this.engineLeftMidUpHours = engineLeftMidUpHours;
        this.engineRightMidUpHours = engineRightMidUpHours;
        this.engineLeftMidUpRestHours = engineLeftMidUpRestHours;
        this.engineRightMidUpRestHours = engineRightMidUpRestHours;
        this.engineLeftRemainingTime = engineLeftRemainingTime;
        this.engineRightRemainingTime = engineRightRemainingTime;
        this.engineLeftTotalServiceLife = engineLeftTotalServiceLife;
        this.engineRightTotalServiceLife = engineRightTotalServiceLife;
        this.engineLeftSpecifiedLife = engineLeftSpecifiedLife;
        this.engineRightSpecifiedLife = engineRightSpecifiedLife;
        this.engineLeftResidualLife = engineLeftResidualLife;
        this.engineRightResidualLife = engineRightResidualLife;
        this.engineLeftSpStateResidualLife = engineLeftSpStateResidualLife;
        this.engineRightSpStateResidualLife = engineRightSpStateResidualLife;
        this.engineLeftSStateResidualLife = engineLeftSStateResidualLife;
        this.engineRightSStateResidualLife = engineRightSStateResidualLife;
        this.engineLeftStartingRemainingLife = engineLeftStartingRemainingLife;
        this.engineRightStartingRemainingLife = engineRightStartingRemainingLife;
        this.engineLeftSpMajorCycles = engineLeftSpMajorCycles;
        this.engineRightSpMajorCycles = engineRightSpMajorCycles;
        this.engineLeftSMajorCycles = engineLeftSMajorCycles;
        this.engineRightSMajorCycles = engineRightSMajorCycles;
        this.engineLeftRepairedTimes = engineLeftRepairedTimes;
        this.engineRightRepairedTimes = engineRightRepairedTimes;
        this.engineLeftOverhaulFactory = engineLeftOverhaulFactory;
        this.engineRightOverhaulFactory = engineRightOverhaulFactory;
        this.engineLeftRepairMakeFactory = engineLeftRepairMakeFactory;
        this.engineRightRepairMakeFactory = engineRightRepairMakeFactory;
        this.engineLeftLastDeliveryDate = engineLeftLastDeliveryDate;
        this.engineRightLastDeliveryDate = engineRightLastDeliveryDate;
        this.engineLeftManufacturingData = engineLeftManufacturingData;
        this.engineRightManufacturingData = engineRightManufacturingData;
        this.engineLeftNine = engineLeftNine;
        this.engineRightNine = engineRightNine;
        this.engineLeftOilNum = engineLeftOilNum;
        this.engineRightOilNum = engineRightOilNum;
        this.engineLeftOilSealDate = engineLeftOilSealDate;
        this.engineRightOilSealDate = engineRightOilSealDate;
        this.engineLeftOilSealDeadline = engineLeftOilSealDeadline;
        this.engineRightOilSealDeadline = engineRightOilSealDeadline;
        this.engineLeftFlawDetection = engineLeftFlawDetection;
        this.engineRightFlawDetection = engineRightFlawDetection;
        this.engineLeftNextInspection = engineLeftNextInspection;
        this.engineRightNextInspection = engineRightNextInspection;
        this.receiverLeftNum = receiverLeftNum;
        this.receiverRightNum = receiverRightNum;
        this.receiverLeftTotalHours = receiverLeftTotalHours;
        this.receiverRightTotalHours = receiverRightTotalHours;
        this.receiverLeftLastRepairTime = receiverLeftLastRepairTime;
        this.receiverRightLastRepairTime = receiverRightLastRepairTime;
        this.receiverLeftRemainingTime = receiverLeftRemainingTime;
        this.receiverRightRemainingTime = receiverRightRemainingTime;
        this.receiverLeftTotalServiceLife = receiverLeftTotalServiceLife;
        this.receiverRightTotalServiceLife = receiverRightTotalServiceLife;
        this.receiverLeftResidualLife = receiverLeftResidualLife;
        this.receiverRightResidualLife = receiverRightResidualLife;
        this.receiverLeftSpStateResidualLife = receiverLeftSpStateResidualLife;
        this.receiverRightSpStateResidualLife = receiverRightSpStateResidualLife;
        this.receiverLeftStateResidualLife = receiverLeftStateResidualLife;
        this.receiverRightStateResidualLife = receiverRightStateResidualLife;
        this.receiverLeftStartingRemainingLife = receiverLeftStartingRemainingLife;
        this.receiverRightStartingRemainingLife = receiverRightStartingRemainingLife;
        this.receiverLeftExpirationDate = receiverLeftExpirationDate;
        this.receiverRightExpirationDate = receiverRightExpirationDate;
        this.receiverLeftManufacturingFactory = receiverLeftManufacturingFactory;
        this.receiverRightManufacturingFactory = receiverRightManufacturingFactory;
        this.receiverLeftManufacturingDate = receiverLeftManufacturingDate;
        this.receiverRightManufacturingDate = receiverRightManufacturingDate;
        this.receiverLeftSpecifiedLife = receiverLeftSpecifiedLife;
        this.receiverRightSpecifiedLife = receiverRightSpecifiedLife;
        this.receiverLeftRepairedTimes = receiverLeftRepairedTimes;
        this.receiverRightRepairedTimes = receiverRightRepairedTimes;
        this.receiverLeftOverhaulFactory = receiverLeftOverhaulFactory;
        this.receiverRightOverhaulFactory = receiverRightOverhaulFactory;
        this.receiverLeftLastDeliveryDate = receiverLeftLastDeliveryDate;
        this.receiverRightLastDeliveryDate = receiverRightLastDeliveryDate;
        this.receiverLeftManufactureDate = receiverLeftManufactureDate;
        this.receiverRightManufactureDate = receiverRightManufactureDate;
        this.starterLeftNum = starterLeftNum;
        this.starterRightNum = starterRightNum;
        this.starterLeftSpecifiedLife = starterLeftSpecifiedLife;
        this.starterRightSpecifiedLife = starterRightSpecifiedLife;
        this.starterLeftResidualLife = starterLeftResidualLife;
        this.starterRightResidualLife = starterRightResidualLife;
        this.starterLeftRenovations = starterLeftRenovations;
        this.starterRightRenovations = starterRightRenovations;
        this.starterLeftRemainingTime = starterLeftRemainingTime;
        this.starterRightRemainingTime = starterRightRemainingTime;
        this.starterLeftTotalServiceLife = starterLeftTotalServiceLife;
        this.starterRightTotalServiceLife = starterRightTotalServiceLife;
        this.starterLeftExpirationDate = starterLeftExpirationDate;
        this.starterRightExpirationDate = starterRightExpirationDate;
        this.starterLeftRepairedTimes = starterLeftRepairedTimes;
        this.starterRightRepairedTimes = starterRightRepairedTimes;
        this.starterLeftManufacturingFactory = starterLeftManufacturingFactory;
        this.starterRightManufacturingFactory = starterRightManufacturingFactory;
        this.starterLeftOverhaulFactory = starterLeftOverhaulFactory;
        this.starterRightOverhaulFactory = starterRightOverhaulFactory;
        this.starterLeftLastDeliveryDate = starterLeftLastDeliveryDate;
        this.starterRightLastDeliveryDate = starterRightLastDeliveryDate;
        this.starterLeftManufactureDate = starterLeftManufactureDate;
        this.starterRightManufactureDate = starterRightManufactureDate;
        this.regulatorLeftNum = regulatorLeftNum;
        this.regulatorRightNum = regulatorRightNum;
        this.regulatorLeftModel = regulatorLeftModel;
        this.regulatorRightModel = regulatorRightModel;
        this.regulatorLeftRemainingTime = regulatorLeftRemainingTime;
        this.regulatorRightRemainingTime = regulatorRightRemainingTime;
        this.regulatorLeftResidualLife = regulatorLeftResidualLife;
        this.regulatorRightResidualLife = regulatorRightResidualLife;
        this.airGeneratorModel = airGeneratorModel;
        this.airGeneratorNum = airGeneratorNum;
        this.airGeneratorStartTimes = airGeneratorStartTimes;
        this.airGeneratorRepairedTimes = airGeneratorRepairedTimes;
        this.airGeneratorSpecifiedStartingTimes = airGeneratorSpecifiedStartingTimes;
        this.airGeneratorOverhaulFactory = airGeneratorOverhaulFactory;
        this.airGeneratorManufactureDate = airGeneratorManufactureDate;
        this.airGeneratorRemainingTimes = airGeneratorRemainingTimes;
        this.airGeneratorRepairTimes = airGeneratorRepairTimes;
    }

    public Plane() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWorkNumber() {
        return workNumber;
    }

    public void setWorkNumber(String workNumber) {
        this.workNumber = workNumber == null ? null : workNumber.trim();
    }

    public String getPlaneType() {
        return planeType;
    }

    public void setPlaneType(String planeType) {
        this.planeType = planeType == null ? null : planeType.trim();
    }

    public String getUnitNumber() {
        return unitNumber;
    }

    public void setUnitNumber(String unitNumber) {
        this.unitNumber = unitNumber == null ? null : unitNumber.trim();
    }

    public String getPlaneNum() {
        return planeNum;
    }

    public void setPlaneNum(String planeNum) {
        this.planeNum = planeNum == null ? null : planeNum.trim();
    }

    public String getPlaneNoseNum() {
        return planeNoseNum;
    }

    public void setPlaneNoseNum(String planeNoseNum) {
        this.planeNoseNum = planeNoseNum == null ? null : planeNoseNum.trim();
    }

    public String getFactory() {
        return factory;
    }

    public void setFactory(String factory) {
        this.factory = factory == null ? null : factory.trim();
    }

    public String getAtUnitNum() {
        return atUnitNum;
    }

    public void setAtUnitNum(String atUnitNum) {
        this.atUnitNum = atUnitNum == null ? null : atUnitNum.trim();
    }

    public Date getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(Date manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    public String getVerticalTailNum() {
        return verticalTailNum;
    }

    public void setVerticalTailNum(String verticalTailNum) {
        this.verticalTailNum = verticalTailNum == null ? null : verticalTailNum.trim();
    }

    public Date getIntoFactoryDate() {
        return intoFactoryDate;
    }

    public void setIntoFactoryDate(Date intoFactoryDate) {
        this.intoFactoryDate = intoFactoryDate;
    }

    public String getSendUnit() {
        return sendUnit;
    }

    public void setSendUnit(String sendUnit) {
        this.sendUnit = sendUnit == null ? null : sendUnit.trim();
    }

    public String getInsititute() {
        return insititute;
    }

    public void setInsititute(String insititute) {
        this.insititute = insititute == null ? null : insititute.trim();
    }

    public String getGarrison() {
        return garrison;
    }

    public void setGarrison(String garrison) {
        this.garrison = garrison == null ? null : garrison.trim();
    }

    public String getBeginningTime() {
        return beginningTime;
    }

    public void setBeginningTime(String beginningTime) {
        this.beginningTime = beginningTime == null ? null : beginningTime.trim();
    }

    public String getLastRefurbishmentTime() {
        return lastRefurbishmentTime;
    }

    public void setLastRefurbishmentTime(String lastRefurbishmentTime) {
        this.lastRefurbishmentTime = lastRefurbishmentTime == null ? null : lastRefurbishmentTime.trim();
    }

    public Date getRepairDate() {
        return repairDate;
    }

    public void setRepairDate(Date repairDate) {
        this.repairDate = repairDate;
    }

    public Integer getFlightHours() {
        return flightHours;
    }

    public void setFlightHours(Integer flightHours) {
        this.flightHours = flightHours;
    }

    public String getSpecifiedLife() {
        return specifiedLife;
    }

    public void setSpecifiedLife(String specifiedLife) {
        this.specifiedLife = specifiedLife == null ? null : specifiedLife.trim();
    }

    public String getResidualLife() {
        return residualLife;
    }

    public void setResidualLife(String residualLife) {
        this.residualLife = residualLife == null ? null : residualLife.trim();
    }

    public String getTotalLife() {
        return totalLife;
    }

    public void setTotalLife(String totalLife) {
        this.totalLife = totalLife == null ? null : totalLife.trim();
    }

    public String getThisUsedLife() {
        return thisUsedLife;
    }

    public void setThisUsedLife(String thisUsedLife) {
        this.thisUsedLife = thisUsedLife == null ? null : thisUsedLife.trim();
    }

    public Integer getTotalUpDown() {
        return totalUpDown;
    }

    public void setTotalUpDown(Integer totalUpDown) {
        this.totalUpDown = totalUpDown;
    }

    public Integer getLastUpDown() {
        return lastUpDown;
    }

    public void setLastUpDown(Integer lastUpDown) {
        this.lastUpDown = lastUpDown;
    }

    public Integer getRepairNum() {
        return repairNum;
    }

    public void setRepairNum(Integer repairNum) {
        this.repairNum = repairNum;
    }

    public String getCalendarLimitTime() {
        return calendarLimitTime;
    }

    public void setCalendarLimitTime(String calendarLimitTime) {
        this.calendarLimitTime = calendarLimitTime == null ? null : calendarLimitTime.trim();
    }

    public Integer getRemainingCalendarYear() {
        return remainingCalendarYear;
    }

    public void setRemainingCalendarYear(Integer remainingCalendarYear) {
        this.remainingCalendarYear = remainingCalendarYear;
    }

    public Integer getRemainingCalendarMonth() {
        return remainingCalendarMonth;
    }

    public void setRemainingCalendarMonth(Integer remainingCalendarMonth) {
        this.remainingCalendarMonth = remainingCalendarMonth;
    }

    public Integer getUsedCalendarYear() {
        return usedCalendarYear;
    }

    public void setUsedCalendarYear(Integer usedCalendarYear) {
        this.usedCalendarYear = usedCalendarYear;
    }

    public Integer getUsedCalendarMonth() {
        return usedCalendarMonth;
    }

    public void setUsedCalendarMonth(Integer usedCalendarMonth) {
        this.usedCalendarMonth = usedCalendarMonth;
    }

    public String getEngineModel() {
        return engineModel;
    }

    public void setEngineModel(String engineModel) {
        this.engineModel = engineModel == null ? null : engineModel.trim();
    }

    public String getEngineRemainingTime() {
        return engineRemainingTime;
    }

    public void setEngineRemainingTime(String engineRemainingTime) {
        this.engineRemainingTime = engineRemainingTime == null ? null : engineRemainingTime.trim();
    }

    public String getEngineLeftNum() {
        return engineLeftNum;
    }

    public void setEngineLeftNum(String engineLeftNum) {
        this.engineLeftNum = engineLeftNum == null ? null : engineLeftNum.trim();
    }

    public String getEngineRightNum() {
        return engineRightNum;
    }

    public void setEngineRightNum(String engineRightNum) {
        this.engineRightNum = engineRightNum == null ? null : engineRightNum.trim();
    }

    public String getEngineLeftTotalWorkHours() {
        return engineLeftTotalWorkHours;
    }

    public void setEngineLeftTotalWorkHours(String engineLeftTotalWorkHours) {
        this.engineLeftTotalWorkHours = engineLeftTotalWorkHours == null ? null : engineLeftTotalWorkHours.trim();
    }

    public String getEngineRightTotalWorkHours() {
        return engineRightTotalWorkHours;
    }

    public void setEngineRightTotalWorkHours(String engineRightTotalWorkHours) {
        this.engineRightTotalWorkHours = engineRightTotalWorkHours == null ? null : engineRightTotalWorkHours.trim();
    }

    public String getEngineLeftLastRepairTime() {
        return engineLeftLastRepairTime;
    }

    public void setEngineLeftLastRepairTime(String engineLeftLastRepairTime) {
        this.engineLeftLastRepairTime = engineLeftLastRepairTime == null ? null : engineLeftLastRepairTime.trim();
    }

    public String getEngineRightLastRepairTime() {
        return engineRightLastRepairTime;
    }

    public void setEngineRightLastRepairTime(String engineRightLastRepairTime) {
        this.engineRightLastRepairTime = engineRightLastRepairTime == null ? null : engineRightLastRepairTime.trim();
    }

    public Date getEngineLeftExpirationDate() {
        return engineLeftExpirationDate;
    }

    public void setEngineLeftExpirationDate(Date engineLeftExpirationDate) {
        this.engineLeftExpirationDate = engineLeftExpirationDate;
    }

    public Date getEngineRightExpirationDate() {
        return engineRightExpirationDate;
    }

    public void setEngineRightExpirationDate(Date engineRightExpirationDate) {
        this.engineRightExpirationDate = engineRightExpirationDate;
    }

    public String getEngineLeftOperationalHours() {
        return engineLeftOperationalHours;
    }

    public void setEngineLeftOperationalHours(String engineLeftOperationalHours) {
        this.engineLeftOperationalHours = engineLeftOperationalHours == null ? null : engineLeftOperationalHours.trim();
    }

    public String getEngineRightOperationalHours() {
        return engineRightOperationalHours;
    }

    public void setEngineRightOperationalHours(String engineRightOperationalHours) {
        this.engineRightOperationalHours = engineRightOperationalHours == null ? null : engineRightOperationalHours.trim();
    }

    public String getEngineLeftMidUpHours() {
        return engineLeftMidUpHours;
    }

    public void setEngineLeftMidUpHours(String engineLeftMidUpHours) {
        this.engineLeftMidUpHours = engineLeftMidUpHours == null ? null : engineLeftMidUpHours.trim();
    }

    public String getEngineRightMidUpHours() {
        return engineRightMidUpHours;
    }

    public void setEngineRightMidUpHours(String engineRightMidUpHours) {
        this.engineRightMidUpHours = engineRightMidUpHours == null ? null : engineRightMidUpHours.trim();
    }

    public String getEngineLeftMidUpRestHours() {
        return engineLeftMidUpRestHours;
    }

    public void setEngineLeftMidUpRestHours(String engineLeftMidUpRestHours) {
        this.engineLeftMidUpRestHours = engineLeftMidUpRestHours == null ? null : engineLeftMidUpRestHours.trim();
    }

    public String getEngineRightMidUpRestHours() {
        return engineRightMidUpRestHours;
    }

    public void setEngineRightMidUpRestHours(String engineRightMidUpRestHours) {
        this.engineRightMidUpRestHours = engineRightMidUpRestHours == null ? null : engineRightMidUpRestHours.trim();
    }

    public String getEngineLeftRemainingTime() {
        return engineLeftRemainingTime;
    }

    public void setEngineLeftRemainingTime(String engineLeftRemainingTime) {
        this.engineLeftRemainingTime = engineLeftRemainingTime == null ? null : engineLeftRemainingTime.trim();
    }

    public String getEngineRightRemainingTime() {
        return engineRightRemainingTime;
    }

    public void setEngineRightRemainingTime(String engineRightRemainingTime) {
        this.engineRightRemainingTime = engineRightRemainingTime == null ? null : engineRightRemainingTime.trim();
    }

    public String getEngineRightTotalServiceLife() {
        return engineRightTotalServiceLife;
    }

    public void setEngineRightTotalServiceLife(String engineRightTotalServiceLife) {
        this.engineRightTotalServiceLife = engineRightTotalServiceLife == null ? null : engineRightTotalServiceLife.trim();
    }

    public String getEngineLeftTotalServiceLife() {
        return engineLeftTotalServiceLife;
    }

    public void setEngineLeftTotalServiceLife(String engineLeftTotalServiceLife) {
        this.engineLeftTotalServiceLife = engineLeftTotalServiceLife == null ? null : engineLeftTotalServiceLife.trim();
    }

    public String getEngineLeftSpecifiedLife() {
        return engineLeftSpecifiedLife;
    }

    public void setEngineLeftSpecifiedLife(String engineLeftSpecifiedLife) {
        this.engineLeftSpecifiedLife = engineLeftSpecifiedLife == null ? null : engineLeftSpecifiedLife.trim();
    }

    public String getEngineRightSpecifiedLife() {
        return engineRightSpecifiedLife;
    }

    public void setEngineRightSpecifiedLife(String engineRightSpecifiedLife) {
        this.engineRightSpecifiedLife = engineRightSpecifiedLife == null ? null : engineRightSpecifiedLife.trim();
    }

    public String getEngineLeftResidualLife() {
        return engineLeftResidualLife;
    }

    public void setEngineLeftResidualLife(String engineLeftResidualLife) {
        this.engineLeftResidualLife = engineLeftResidualLife == null ? null : engineLeftResidualLife.trim();
    }

    public String getEngineRightResidualLife() {
        return engineRightResidualLife;
    }

    public void setEngineRightResidualLife(String engineRightResidualLife) {
        this.engineRightResidualLife = engineRightResidualLife == null ? null : engineRightResidualLife.trim();
    }

    public String getEngineLeftSpStateResidualLife() {
        return engineLeftSpStateResidualLife;
    }

    public void setEngineLeftSpStateResidualLife(String engineLeftSpStateResidualLife) {
        this.engineLeftSpStateResidualLife = engineLeftSpStateResidualLife == null ? null : engineLeftSpStateResidualLife.trim();
    }

    public String getEngineRightSpStateResidualLife() {
        return engineRightSpStateResidualLife;
    }

    public void setEngineRightSpStateResidualLife(String engineRightSpStateResidualLife) {
        this.engineRightSpStateResidualLife = engineRightSpStateResidualLife == null ? null : engineRightSpStateResidualLife.trim();
    }

    public String getEngineLeftSStateResidualLife() {
        return engineLeftSStateResidualLife;
    }

    public void setEngineLeftSStateResidualLife(String engineLeftSStateResidualLife) {
        this.engineLeftSStateResidualLife = engineLeftSStateResidualLife == null ? null : engineLeftSStateResidualLife.trim();
    }

    public String getEngineRightSStateResidualLife() {
        return engineRightSStateResidualLife;
    }

    public void setEngineRightSStateResidualLife(String engineRightSStateResidualLife) {
        this.engineRightSStateResidualLife = engineRightSStateResidualLife == null ? null : engineRightSStateResidualLife.trim();
    }

    public Integer getEngineLeftStartingRemainingLife() {
        return engineLeftStartingRemainingLife;
    }

    public void setEngineLeftStartingRemainingLife(Integer engineLeftStartingRemainingLife) {
        this.engineLeftStartingRemainingLife = engineLeftStartingRemainingLife;
    }

    public Integer getEngineRightStartingRemainingLife() {
        return engineRightStartingRemainingLife;
    }

    public void setEngineRightStartingRemainingLife(Integer engineRightStartingRemainingLife) {
        this.engineRightStartingRemainingLife = engineRightStartingRemainingLife;
    }

    public Integer getEngineLeftSpMajorCycles() {
        return engineLeftSpMajorCycles;
    }

    public void setEngineLeftSpMajorCycles(Integer engineLeftSpMajorCycles) {
        this.engineLeftSpMajorCycles = engineLeftSpMajorCycles;
    }

    public Integer getEngineRightSpMajorCycles() {
        return engineRightSpMajorCycles;
    }

    public void setEngineRightSpMajorCycles(Integer engineRightSpMajorCycles) {
        this.engineRightSpMajorCycles = engineRightSpMajorCycles;
    }

    public Integer getEngineLeftSMajorCycles() {
        return engineLeftSMajorCycles;
    }

    public void setEngineLeftSMajorCycles(Integer engineLeftSMajorCycles) {
        this.engineLeftSMajorCycles = engineLeftSMajorCycles;
    }

    public Integer getEngineRightSMajorCycles() {
        return engineRightSMajorCycles;
    }

    public void setEngineRightSMajorCycles(Integer engineRightSMajorCycles) {
        this.engineRightSMajorCycles = engineRightSMajorCycles;
    }

    public Integer getEngineLeftRepairedTimes() {
        return engineLeftRepairedTimes;
    }

    public void setEngineLeftRepairedTimes(Integer engineLeftRepairedTimes) {
        this.engineLeftRepairedTimes = engineLeftRepairedTimes;
    }

    public Integer getEngineRightRepairedTimes() {
        return engineRightRepairedTimes;
    }

    public void setEngineRightRepairedTimes(Integer engineRightRepairedTimes) {
        this.engineRightRepairedTimes = engineRightRepairedTimes;
    }

    public String getEngineLeftOverhaulFactory() {
        return engineLeftOverhaulFactory;
    }

    public void setEngineLeftOverhaulFactory(String engineLeftOverhaulFactory) {
        this.engineLeftOverhaulFactory = engineLeftOverhaulFactory == null ? null : engineLeftOverhaulFactory.trim();
    }

    public String getEngineRightOverhaulFactory() {
        return engineRightOverhaulFactory;
    }

    public void setEngineRightOverhaulFactory(String engineRightOverhaulFactory) {
        this.engineRightOverhaulFactory = engineRightOverhaulFactory == null ? null : engineRightOverhaulFactory.trim();
    }

    public String getEngineLeftRepairMakeFactory() {
        return engineLeftRepairMakeFactory;
    }

    public void setEngineLeftRepairMakeFactory(String engineLeftRepairMakeFactory) {
        this.engineLeftRepairMakeFactory = engineLeftRepairMakeFactory == null ? null : engineLeftRepairMakeFactory.trim();
    }

    public String getEngineRightRepairMakeFactory() {
        return engineRightRepairMakeFactory;
    }

    public void setEngineRightRepairMakeFactory(String engineRightRepairMakeFactory) {
        this.engineRightRepairMakeFactory = engineRightRepairMakeFactory == null ? null : engineRightRepairMakeFactory.trim();
    }

    public Date getEngineLeftLastDeliveryDate() {
        return engineLeftLastDeliveryDate;
    }

    public void setEngineLeftLastDeliveryDate(Date engineLeftLastDeliveryDate) {
        this.engineLeftLastDeliveryDate = engineLeftLastDeliveryDate;
    }

    public Date getEngineRightLastDeliveryDate() {
        return engineRightLastDeliveryDate;
    }

    public void setEngineRightLastDeliveryDate(Date engineRightLastDeliveryDate) {
        this.engineRightLastDeliveryDate = engineRightLastDeliveryDate;
    }

    public Date getEngineLeftManufacturingData() {
        return engineLeftManufacturingData;
    }

    public void setEngineLeftManufacturingData(Date engineLeftManufacturingData) {
        this.engineLeftManufacturingData = engineLeftManufacturingData;
    }

    public Date getEngineRightManufacturingData() {
        return engineRightManufacturingData;
    }

    public void setEngineRightManufacturingData(Date engineRightManufacturingData) {
        this.engineRightManufacturingData = engineRightManufacturingData;
    }

    public Date getEngineLeftNine() {
        return engineLeftNine;
    }

    public void setEngineLeftNine(Date engineLeftNine) {
        this.engineLeftNine = engineLeftNine;
    }

    public Date getEngineRightNine() {
        return engineRightNine;
    }

    public void setEngineRightNine(Date engineRightNine) {
        this.engineRightNine = engineRightNine;
    }

    public String getEngineLeftOilNum() {
        return engineLeftOilNum;
    }

    public void setEngineLeftOilNum(String engineLeftOilNum) {
        this.engineLeftOilNum = engineLeftOilNum == null ? null : engineLeftOilNum.trim();
    }

    public String getEngineRightOilNum() {
        return engineRightOilNum;
    }

    public void setEngineRightOilNum(String engineRightOilNum) {
        this.engineRightOilNum = engineRightOilNum == null ? null : engineRightOilNum.trim();
    }

    public Date getEngineLeftOilSealDate() {
        return engineLeftOilSealDate;
    }

    public void setEngineLeftOilSealDate(Date engineLeftOilSealDate) {
        this.engineLeftOilSealDate = engineLeftOilSealDate;
    }

    public Date getEngineRightOilSealDate() {
        return engineRightOilSealDate;
    }

    public void setEngineRightOilSealDate(Date engineRightOilSealDate) {
        this.engineRightOilSealDate = engineRightOilSealDate;
    }

    public Date getEngineLeftOilSealDeadline() {
        return engineLeftOilSealDeadline;
    }

    public void setEngineLeftOilSealDeadline(Date engineLeftOilSealDeadline) {
        this.engineLeftOilSealDeadline = engineLeftOilSealDeadline;
    }

    public Date getEngineRightOilSealDeadline() {
        return engineRightOilSealDeadline;
    }

    public void setEngineRightOilSealDeadline(Date engineRightOilSealDeadline) {
        this.engineRightOilSealDeadline = engineRightOilSealDeadline;
    }

    public String getEngineLeftFlawDetection() {
        return engineLeftFlawDetection;
    }

    public void setEngineLeftFlawDetection(String engineLeftFlawDetection) {
        this.engineLeftFlawDetection = engineLeftFlawDetection == null ? null : engineLeftFlawDetection.trim();
    }

    public String getEngineRightFlawDetection() {
        return engineRightFlawDetection;
    }

    public void setEngineRightFlawDetection(String engineRightFlawDetection) {
        this.engineRightFlawDetection = engineRightFlawDetection == null ? null : engineRightFlawDetection.trim();
    }

    public String getEngineLeftNextInspection() {
        return engineLeftNextInspection;
    }

    public void setEngineLeftNextInspection(String engineLeftNextInspection) {
        this.engineLeftNextInspection = engineLeftNextInspection == null ? null : engineLeftNextInspection.trim();
    }

    public String getEngineRightNextInspection() {
        return engineRightNextInspection;
    }

    public void setEngineRightNextInspection(String engineRightNextInspection) {
        this.engineRightNextInspection = engineRightNextInspection == null ? null : engineRightNextInspection.trim();
    }

    public String getReceiverLeftNum() {
        return receiverLeftNum;
    }

    public void setReceiverLeftNum(String receiverLeftNum) {
        this.receiverLeftNum = receiverLeftNum == null ? null : receiverLeftNum.trim();
    }

    public String getReceiverRightNum() {
        return receiverRightNum;
    }

    public void setReceiverRightNum(String receiverRightNum) {
        this.receiverRightNum = receiverRightNum == null ? null : receiverRightNum.trim();
    }

    public String getReceiverLeftTotalHours() {
        return receiverLeftTotalHours;
    }

    public void setReceiverLeftTotalHours(String receiverLeftTotalHours) {
        this.receiverLeftTotalHours = receiverLeftTotalHours == null ? null : receiverLeftTotalHours.trim();
    }

    public String getReceiverRightTotalHours() {
        return receiverRightTotalHours;
    }

    public void setReceiverRightTotalHours(String receiverRightTotalHours) {
        this.receiverRightTotalHours = receiverRightTotalHours == null ? null : receiverRightTotalHours.trim();
    }

    public String getReceiverLeftLastRepairTime() {
        return receiverLeftLastRepairTime;
    }

    public void setReceiverLeftLastRepairTime(String receiverLeftLastRepairTime) {
        this.receiverLeftLastRepairTime = receiverLeftLastRepairTime == null ? null : receiverLeftLastRepairTime.trim();
    }

    public String getReceiverRightLastRepairTime() {
        return receiverRightLastRepairTime;
    }

    public void setReceiverRightLastRepairTime(String receiverRightLastRepairTime) {
        this.receiverRightLastRepairTime = receiverRightLastRepairTime == null ? null : receiverRightLastRepairTime.trim();
    }

    public String getReceiverLeftRemainingTime() {
        return receiverLeftRemainingTime;
    }

    public void setReceiverLeftRemainingTime(String receiverLeftRemainingTime) {
        this.receiverLeftRemainingTime = receiverLeftRemainingTime == null ? null : receiverLeftRemainingTime.trim();
    }

    public String getReceiverRightRemainingTime() {
        return receiverRightRemainingTime;
    }

    public void setReceiverRightRemainingTime(String receiverRightRemainingTime) {
        this.receiverRightRemainingTime = receiverRightRemainingTime == null ? null : receiverRightRemainingTime.trim();
    }

    public String getReceiverLeftTotalServiceLife() {
        return receiverLeftTotalServiceLife;
    }

    public void setReceiverLeftTotalServiceLife(String receiverLeftTotalServiceLife) {
        this.receiverLeftTotalServiceLife = receiverLeftTotalServiceLife == null ? null : receiverLeftTotalServiceLife.trim();
    }

    public String getReceiverRightTotalServiceLife() {
        return receiverRightTotalServiceLife;
    }

    public void setReceiverRightTotalServiceLife(String receiverRightTotalServiceLife) {
        this.receiverRightTotalServiceLife = receiverRightTotalServiceLife == null ? null : receiverRightTotalServiceLife.trim();
    }

    public String getReceiverLeftResidualLife() {
        return receiverLeftResidualLife;
    }

    public void setReceiverLeftResidualLife(String receiverLeftResidualLife) {
        this.receiverLeftResidualLife = receiverLeftResidualLife == null ? null : receiverLeftResidualLife.trim();
    }

    public String getReceiverRightResidualLife() {
        return receiverRightResidualLife;
    }

    public void setReceiverRightResidualLife(String receiverRightResidualLife) {
        this.receiverRightResidualLife = receiverRightResidualLife == null ? null : receiverRightResidualLife.trim();
    }

    public String getReceiverLeftSpStateResidualLife() {
        return receiverLeftSpStateResidualLife;
    }

    public void setReceiverLeftSpStateResidualLife(String receiverLeftSpStateResidualLife) {
        this.receiverLeftSpStateResidualLife = receiverLeftSpStateResidualLife == null ? null : receiverLeftSpStateResidualLife.trim();
    }

    public String getReceiverRightSpStateResidualLife() {
        return receiverRightSpStateResidualLife;
    }

    public void setReceiverRightSpStateResidualLife(String receiverRightSpStateResidualLife) {
        this.receiverRightSpStateResidualLife = receiverRightSpStateResidualLife == null ? null : receiverRightSpStateResidualLife.trim();
    }

    public String getReceiverLeftStateResidualLife() {
        return receiverLeftStateResidualLife;
    }

    public void setReceiverLeftStateResidualLife(String receiverLeftStateResidualLife) {
        this.receiverLeftStateResidualLife = receiverLeftStateResidualLife == null ? null : receiverLeftStateResidualLife.trim();
    }

    public String getReceiverRightStateResidualLife() {
        return receiverRightStateResidualLife;
    }

    public void setReceiverRightStateResidualLife(String receiverRightStateResidualLife) {
        this.receiverRightStateResidualLife = receiverRightStateResidualLife == null ? null : receiverRightStateResidualLife.trim();
    }

    public Integer getReceiverLeftStartingRemainingLife() {
        return receiverLeftStartingRemainingLife;
    }

    public void setReceiverLeftStartingRemainingLife(Integer receiverLeftStartingRemainingLife) {
        this.receiverLeftStartingRemainingLife = receiverLeftStartingRemainingLife;
    }

    public Integer getReceiverRightStartingRemainingLife() {
        return receiverRightStartingRemainingLife;
    }

    public void setReceiverRightStartingRemainingLife(Integer receiverRightStartingRemainingLife) {
        this.receiverRightStartingRemainingLife = receiverRightStartingRemainingLife;
    }

    public Date getReceiverLeftExpirationDate() {
        return receiverLeftExpirationDate;
    }

    public void setReceiverLeftExpirationDate(Date receiverLeftExpirationDate) {
        this.receiverLeftExpirationDate = receiverLeftExpirationDate;
    }

    public Date getReceiverRightExpirationDate() {
        return receiverRightExpirationDate;
    }

    public void setReceiverRightExpirationDate(Date receiverRightExpirationDate) {
        this.receiverRightExpirationDate = receiverRightExpirationDate;
    }

    public String getReceiverLeftManufacturingFactory() {
        return receiverLeftManufacturingFactory;
    }

    public void setReceiverLeftManufacturingFactory(String receiverLeftManufacturingFactory) {
        this.receiverLeftManufacturingFactory = receiverLeftManufacturingFactory == null ? null : receiverLeftManufacturingFactory.trim();
    }

    public String getReceiverRightManufacturingFactory() {
        return receiverRightManufacturingFactory;
    }

    public void setReceiverRightManufacturingFactory(String receiverRightManufacturingFactory) {
        this.receiverRightManufacturingFactory = receiverRightManufacturingFactory == null ? null : receiverRightManufacturingFactory.trim();
    }

    public Date getReceiverLeftManufacturingDate() {
        return receiverLeftManufacturingDate;
    }

    public void setReceiverLeftManufacturingDate(Date receiverLeftManufacturingDate) {
        this.receiverLeftManufacturingDate = receiverLeftManufacturingDate;
    }

    public Date getReceiverRightManufacturingDate() {
        return receiverRightManufacturingDate;
    }

    public void setReceiverRightManufacturingDate(Date receiverRightManufacturingDate) {
        this.receiverRightManufacturingDate = receiverRightManufacturingDate;
    }

    public String getReceiverLeftSpecifiedLife() {
        return receiverLeftSpecifiedLife;
    }

    public void setReceiverLeftSpecifiedLife(String receiverLeftSpecifiedLife) {
        this.receiverLeftSpecifiedLife = receiverLeftSpecifiedLife == null ? null : receiverLeftSpecifiedLife.trim();
    }

    public String getReceiverRightSpecifiedLife() {
        return receiverRightSpecifiedLife;
    }

    public void setReceiverRightSpecifiedLife(String receiverRightSpecifiedLife) {
        this.receiverRightSpecifiedLife = receiverRightSpecifiedLife == null ? null : receiverRightSpecifiedLife.trim();
    }

    public Integer getReceiverLeftRepairedTimes() {
        return receiverLeftRepairedTimes;
    }

    public void setReceiverLeftRepairedTimes(Integer receiverLeftRepairedTimes) {
        this.receiverLeftRepairedTimes = receiverLeftRepairedTimes;
    }

    public Integer getReceiverRightRepairedTimes() {
        return receiverRightRepairedTimes;
    }

    public void setReceiverRightRepairedTimes(Integer receiverRightRepairedTimes) {
        this.receiverRightRepairedTimes = receiverRightRepairedTimes;
    }

    public String getReceiverLeftOverhaulFactory() {
        return receiverLeftOverhaulFactory;
    }

    public void setReceiverLeftOverhaulFactory(String receiverLeftOverhaulFactory) {
        this.receiverLeftOverhaulFactory = receiverLeftOverhaulFactory == null ? null : receiverLeftOverhaulFactory.trim();
    }

    public String getReceiverRightOverhaulFactory() {
        return receiverRightOverhaulFactory;
    }

    public void setReceiverRightOverhaulFactory(String receiverRightOverhaulFactory) {
        this.receiverRightOverhaulFactory = receiverRightOverhaulFactory == null ? null : receiverRightOverhaulFactory.trim();
    }

    public Date getReceiverLeftLastDeliveryDate() {
        return receiverLeftLastDeliveryDate;
    }

    public void setReceiverLeftLastDeliveryDate(Date receiverLeftLastDeliveryDate) {
        this.receiverLeftLastDeliveryDate = receiverLeftLastDeliveryDate;
    }

    public Date getReceiverRightLastDeliveryDate() {
        return receiverRightLastDeliveryDate;
    }

    public void setReceiverRightLastDeliveryDate(Date receiverRightLastDeliveryDate) {
        this.receiverRightLastDeliveryDate = receiverRightLastDeliveryDate;
    }

    public Date getReceiverLeftManufactureDate() {
        return receiverLeftManufactureDate;
    }

    public void setReceiverLeftManufactureDate(Date receiverLeftManufactureDate) {
        this.receiverLeftManufactureDate = receiverLeftManufactureDate;
    }

    public Date getReceiverRightManufactureDate() {
        return receiverRightManufactureDate;
    }

    public void setReceiverRightManufactureDate(Date receiverRightManufactureDate) {
        this.receiverRightManufactureDate = receiverRightManufactureDate;
    }

    public String getStarterLeftNum() {
        return starterLeftNum;
    }

    public void setStarterLeftNum(String starterLeftNum) {
        this.starterLeftNum = starterLeftNum == null ? null : starterLeftNum.trim();
    }

    public String getStarterRightNum() {
        return starterRightNum;
    }

    public void setStarterRightNum(String starterRightNum) {
        this.starterRightNum = starterRightNum == null ? null : starterRightNum.trim();
    }

    public Integer getStarterLeftSpecifiedLife() {
        return starterLeftSpecifiedLife;
    }

    public void setStarterLeftSpecifiedLife(Integer starterLeftSpecifiedLife) {
        this.starterLeftSpecifiedLife = starterLeftSpecifiedLife;
    }

    public Integer getStarterRightSpecifiedLife() {
        return starterRightSpecifiedLife;
    }

    public void setStarterRightSpecifiedLife(Integer starterRightSpecifiedLife) {
        this.starterRightSpecifiedLife = starterRightSpecifiedLife;
    }

    public Integer getStarterLeftResidualLife() {
        return starterLeftResidualLife;
    }

    public void setStarterLeftResidualLife(Integer starterLeftResidualLife) {
        this.starterLeftResidualLife = starterLeftResidualLife;
    }

    public Integer getStarterRightResidualLife() {
        return starterRightResidualLife;
    }

    public void setStarterRightResidualLife(Integer starterRightResidualLife) {
        this.starterRightResidualLife = starterRightResidualLife;
    }

    public Integer getStarterLeftRenovations() {
        return starterLeftRenovations;
    }

    public void setStarterLeftRenovations(Integer starterLeftRenovations) {
        this.starterLeftRenovations = starterLeftRenovations;
    }

    public Integer getStarterRightRenovations() {
        return starterRightRenovations;
    }

    public void setStarterRightRenovations(Integer starterRightRenovations) {
        this.starterRightRenovations = starterRightRenovations;
    }

    public String getStarterLeftRemainingTime() {
        return starterLeftRemainingTime;
    }

    public void setStarterLeftRemainingTime(String starterLeftRemainingTime) {
        this.starterLeftRemainingTime = starterLeftRemainingTime == null ? null : starterLeftRemainingTime.trim();
    }

    public String getStarterRightRemainingTime() {
        return starterRightRemainingTime;
    }

    public void setStarterRightRemainingTime(String starterRightRemainingTime) {
        this.starterRightRemainingTime = starterRightRemainingTime == null ? null : starterRightRemainingTime.trim();
    }

    public Integer getStarterLeftTotalServiceLife() {
        return starterLeftTotalServiceLife;
    }

    public void setStarterLeftTotalServiceLife(Integer starterLeftTotalServiceLife) {
        this.starterLeftTotalServiceLife = starterLeftTotalServiceLife;
    }

    public Integer getStarterRightTotalServiceLife() {
        return starterRightTotalServiceLife;
    }

    public void setStarterRightTotalServiceLife(Integer starterRightTotalServiceLife) {
        this.starterRightTotalServiceLife = starterRightTotalServiceLife;
    }

    public Date getStarterLeftExpirationDate() {
        return starterLeftExpirationDate;
    }

    public void setStarterLeftExpirationDate(Date starterLeftExpirationDate) {
        this.starterLeftExpirationDate = starterLeftExpirationDate;
    }

    public Date getStarterRightExpirationDate() {
        return starterRightExpirationDate;
    }

    public void setStarterRightExpirationDate(Date starterRightExpirationDate) {
        this.starterRightExpirationDate = starterRightExpirationDate;
    }

    public Integer getStarterLeftRepairedTimes() {
        return starterLeftRepairedTimes;
    }

    public void setStarterLeftRepairedTimes(Integer starterLeftRepairedTimes) {
        this.starterLeftRepairedTimes = starterLeftRepairedTimes;
    }

    public Integer getStarterRightRepairedTimes() {
        return starterRightRepairedTimes;
    }

    public void setStarterRightRepairedTimes(Integer starterRightRepairedTimes) {
        this.starterRightRepairedTimes = starterRightRepairedTimes;
    }

    public String getStarterLeftManufacturingFactory() {
        return starterLeftManufacturingFactory;
    }

    public void setStarterLeftManufacturingFactory(String starterLeftManufacturingFactory) {
        this.starterLeftManufacturingFactory = starterLeftManufacturingFactory == null ? null : starterLeftManufacturingFactory.trim();
    }

    public String getStarterRightManufacturingFactory() {
        return starterRightManufacturingFactory;
    }

    public void setStarterRightManufacturingFactory(String starterRightManufacturingFactory) {
        this.starterRightManufacturingFactory = starterRightManufacturingFactory == null ? null : starterRightManufacturingFactory.trim();
    }

    public String getStarterLeftOverhaulFactory() {
        return starterLeftOverhaulFactory;
    }

    public void setStarterLeftOverhaulFactory(String starterLeftOverhaulFactory) {
        this.starterLeftOverhaulFactory = starterLeftOverhaulFactory == null ? null : starterLeftOverhaulFactory.trim();
    }

    public String getStarterRightOverhaulFactory() {
        return starterRightOverhaulFactory;
    }

    public void setStarterRightOverhaulFactory(String starterRightOverhaulFactory) {
        this.starterRightOverhaulFactory = starterRightOverhaulFactory == null ? null : starterRightOverhaulFactory.trim();
    }

    public Date getStarterLeftLastDeliveryDate() {
        return starterLeftLastDeliveryDate;
    }

    public void setStarterLeftLastDeliveryDate(Date starterLeftLastDeliveryDate) {
        this.starterLeftLastDeliveryDate = starterLeftLastDeliveryDate;
    }

    public Date getStarterRightLastDeliveryDate() {
        return starterRightLastDeliveryDate;
    }

    public void setStarterRightLastDeliveryDate(Date starterRightLastDeliveryDate) {
        this.starterRightLastDeliveryDate = starterRightLastDeliveryDate;
    }

    public Date getStarterLeftManufactureDate() {
        return starterLeftManufactureDate;
    }

    public void setStarterLeftManufactureDate(Date starterLeftManufactureDate) {
        this.starterLeftManufactureDate = starterLeftManufactureDate;
    }

    public Date getStarterRightManufactureDate() {
        return starterRightManufactureDate;
    }

    public void setStarterRightManufactureDate(Date starterRightManufactureDate) {
        this.starterRightManufactureDate = starterRightManufactureDate;
    }

    public String getRegulatorLeftNum() {
        return regulatorLeftNum;
    }

    public void setRegulatorLeftNum(String regulatorLeftNum) {
        this.regulatorLeftNum = regulatorLeftNum == null ? null : regulatorLeftNum.trim();
    }

    public String getRegulatorRightNum() {
        return regulatorRightNum;
    }

    public void setRegulatorRightNum(String regulatorRightNum) {
        this.regulatorRightNum = regulatorRightNum == null ? null : regulatorRightNum.trim();
    }

    public String getRegulatorLeftModel() {
        return regulatorLeftModel;
    }

    public void setRegulatorLeftModel(String regulatorLeftModel) {
        this.regulatorLeftModel = regulatorLeftModel == null ? null : regulatorLeftModel.trim();
    }

    public String getRegulatorRightModel() {
        return regulatorRightModel;
    }

    public void setRegulatorRightModel(String regulatorRightModel) {
        this.regulatorRightModel = regulatorRightModel == null ? null : regulatorRightModel.trim();
    }

    public String getRegulatorLeftRemainingTime() {
        return regulatorLeftRemainingTime;
    }

    public void setRegulatorLeftRemainingTime(String regulatorLeftRemainingTime) {
        this.regulatorLeftRemainingTime = regulatorLeftRemainingTime == null ? null : regulatorLeftRemainingTime.trim();
    }

    public String getRegulatorRightRemainingTime() {
        return regulatorRightRemainingTime;
    }

    public void setRegulatorRightRemainingTime(String regulatorRightRemainingTime) {
        this.regulatorRightRemainingTime = regulatorRightRemainingTime == null ? null : regulatorRightRemainingTime.trim();
    }

    public String getRegulatorLeftResidualLife() {
        return regulatorLeftResidualLife;
    }

    public void setRegulatorLeftResidualLife(String regulatorLeftResidualLife) {
        this.regulatorLeftResidualLife = regulatorLeftResidualLife == null ? null : regulatorLeftResidualLife.trim();
    }

    public String getRegulatorRightResidualLife() {
        return regulatorRightResidualLife;
    }

    public void setRegulatorRightResidualLife(String regulatorRightResidualLife) {
        this.regulatorRightResidualLife = regulatorRightResidualLife == null ? null : regulatorRightResidualLife.trim();
    }

    public String getAirGeneratorModel() {
        return airGeneratorModel;
    }

    public void setAirGeneratorModel(String airGeneratorModel) {
        this.airGeneratorModel = airGeneratorModel == null ? null : airGeneratorModel.trim();
    }

    public String getAirGeneratorNum() {
        return airGeneratorNum;
    }

    public void setAirGeneratorNum(String airGeneratorNum) {
        this.airGeneratorNum = airGeneratorNum == null ? null : airGeneratorNum.trim();
    }

    public Integer getAirGeneratorStartTimes() {
        return airGeneratorStartTimes;
    }

    public void setAirGeneratorStartTimes(Integer airGeneratorStartTimes) {
        this.airGeneratorStartTimes = airGeneratorStartTimes;
    }

    public String getAirGeneratorRepairedTimes() {
        return airGeneratorRepairedTimes;
    }

    public void setAirGeneratorRepairedTimes(String airGeneratorRepairedTimes) {
        this.airGeneratorRepairedTimes = airGeneratorRepairedTimes == null ? null : airGeneratorRepairedTimes.trim();
    }

    public Integer getAirGeneratorSpecifiedStartingTimes() {
        return airGeneratorSpecifiedStartingTimes;
    }

    public void setAirGeneratorSpecifiedStartingTimes(Integer airGeneratorSpecifiedStartingTimes) {
        this.airGeneratorSpecifiedStartingTimes = airGeneratorSpecifiedStartingTimes;
    }

    public String getAirGeneratorOverhaulFactory() {
        return airGeneratorOverhaulFactory;
    }

    public void setAirGeneratorOverhaulFactory(String airGeneratorOverhaulFactory) {
        this.airGeneratorOverhaulFactory = airGeneratorOverhaulFactory == null ? null : airGeneratorOverhaulFactory.trim();
    }

    public Date getAirGeneratorManufactureDate() {
        return airGeneratorManufactureDate;
    }

    public void setAirGeneratorManufactureDate(Date airGeneratorManufactureDate) {
        this.airGeneratorManufactureDate = airGeneratorManufactureDate;
    }

    public Integer getAirGeneratorRemainingTimes() {
        return airGeneratorRemainingTimes;
    }

    public void setAirGeneratorRemainingTimes(Integer airGeneratorRemainingTimes) {
        this.airGeneratorRemainingTimes = airGeneratorRemainingTimes;
    }

    public Integer getAirGeneratorRepairTimes() {
        return airGeneratorRepairTimes;
    }

    public void setAirGeneratorRepairTimes(Integer airGeneratorRepairTimes) {
        this.airGeneratorRepairTimes = airGeneratorRepairTimes;
    }
}