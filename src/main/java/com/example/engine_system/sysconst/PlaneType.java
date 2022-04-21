package com.example.engine_system.sysconst;

public enum PlaneType {
    PLANE_TYPE_1("J11", "歼-11"), PLANE_TYPE_2("J11B", "歼-11B"),
    PLANE_TYPE_3("JJ9", "歼教-9"), PLANE_TYPE_4("J8", "教-8");

    private final String eName;
    private final String cName;

    public static String getName(String eName) {
        for (PlaneType c : PlaneType.values()) {
            if (c.geteName().equals(eName)) {
                return c.getcName();
            }
        }
        return "未知";
    }

    PlaneType(String eName, String cName) {
        this.eName = eName;
        this.cName = cName;
    }

    public String geteName() {
        return eName;
    }

    public String getcName() {
        return cName;
    }

}
