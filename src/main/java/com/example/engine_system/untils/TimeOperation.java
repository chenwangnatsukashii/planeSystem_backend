package com.example.engine_system.untils;

/**
 * @author shushu
 * @date 2021/12/6
 * @apiNote the operation of the time
 */
public class TimeOperation {
    public static final String semiAngleColon = ":";
    public static final String fullAngleColon = "：";

    public static String addTime(String time1, String time2) {
        if (time1 == null || "".equals(time1)) {
            time1 = "00:00";
        }
        if (time2 == null || "".equals(time2)) {
            return time1;
        }
        String[] timeOneSplit = time1.contains(semiAngleColon) ? time1.split(semiAngleColon) : time1.split(fullAngleColon);
        String[] timeTwoSplit = time2.contains(semiAngleColon) ? time2.split(semiAngleColon) : time2.split(fullAngleColon);
        int totalMinute = (Integer.parseInt(timeOneSplit[0]) + Integer.parseInt(timeTwoSplit[0])) * 60 +
                Integer.parseInt(timeOneSplit[1]) + Integer.parseInt(timeTwoSplit[1]);

        String hour = String.valueOf((int) Math.floor((float) totalMinute / 60));
        String minute = String.valueOf(totalMinute % 60);
        return hour + ':' + (minute.length() == 1 ? "0" + minute : minute);
    }

    public static String addTimeHMS(String time1, String time2) {
        if (time1 == null || "".equals(time1)) {
            time1 = "00:00:00";
        }
        if (time2 == null || "".equals(time2)) {
            return time1;
        }
        String[] timeOneSplit = time1.contains(semiAngleColon) ? time1.split(semiAngleColon) : time1.split(fullAngleColon);
        String[] timeTwoSplit = time2.contains(semiAngleColon) ? time2.split(semiAngleColon) : time2.split(fullAngleColon);
        int totalSecond = (Integer.parseInt(timeOneSplit[0]) + Integer.parseInt(timeTwoSplit[0])) * 60 * 60 +
                (Integer.parseInt(timeOneSplit[1]) + Integer.parseInt(timeTwoSplit[1])) * 60 +
                Integer.parseInt(timeOneSplit[2]) + Integer.parseInt(timeTwoSplit[2]);

        String hour = String.valueOf((int) Math.floor((float) totalSecond / (60 * 60)));
        int residualSecond = totalSecond - Integer.parseInt(hour) * 60 * 60;
        String minute = String.valueOf((int) Math.floor((float) residualSecond / 60));
        String second = String.valueOf((int) Math.floor((float) residualSecond % 60));
        return hour + ':' + (minute.length() == 1 ? "0" + minute : minute) + ':' + (second.length() == 1 ? "0" + second : second);
    }

    public static String minusTime(String time1, String time2) {
        if (time1 == null || "".equals(time1)) {
            time1 = "00:00";
        }
        if (time2 == null || "".equals(time2)) {
            return time1;
        }
        String[] timeOneSplit = time1.contains(semiAngleColon) ? time1.split(semiAngleColon) : time1.split(fullAngleColon);
        String[] timeTwoSplit = time2.contains(semiAngleColon) ? time2.split(semiAngleColon) : time2.split(fullAngleColon);
        int totalMinute = (Integer.parseInt(timeOneSplit[0]) - Integer.parseInt(timeTwoSplit[0])) * 60 +
                Integer.parseInt(timeOneSplit[1]) - Integer.parseInt(timeTwoSplit[1]);

        String hour = String.valueOf((int) Math.floor((float) totalMinute / 60));
        String minute = String.valueOf(totalMinute % 60);
        return hour + ':' + (minute.length() == 1 ? "0" + minute : minute);
    }

    public static String minusTimeHMS(String time1, String time2) {
        if (time1 == null || "".equals(time1)) {
            time1 = "00:00:00";
        }
        if (time2 == null || "".equals(time2)) {
            return time1;
        }
        String[] timeOneSplit = time1.contains(semiAngleColon) ? time1.split(semiAngleColon) : time1.split(fullAngleColon);
        String[] timeTwoSplit = time2.contains(semiAngleColon) ? time2.split(semiAngleColon) : time2.split(fullAngleColon);
        int totalSecond = (Integer.parseInt(timeOneSplit[0]) - Integer.parseInt(timeTwoSplit[0])) * 60 * 60 +
                (Integer.parseInt(timeOneSplit[1]) - Integer.parseInt(timeTwoSplit[1])) * 60 +
                Integer.parseInt(timeOneSplit[2]) - Integer.parseInt(timeTwoSplit[2]);

        String hour = String.valueOf((int) Math.floor((float) totalSecond / (60 * 60)));
        int residualSecond = totalSecond - Integer.parseInt(hour) * 60 * 60;
        String minute = String.valueOf((int) Math.floor((float) residualSecond / 60));
        String second = String.valueOf((int) Math.floor((float) residualSecond % 60));
        return hour + ':' + (minute.length() == 1 ? "0" + minute : minute) + ':' + (second.length() == 1 ? "0" + second : second);
    }

    public static void main(String[] args) {
        System.out.println(TimeOperation.minusTimeHMS("12:45:49", "04:29:29"));
    }
}
