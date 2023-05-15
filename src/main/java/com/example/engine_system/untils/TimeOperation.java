package com.example.engine_system.untils;


import static com.example.engine_system.untils.SomeOperation.isEmpty;

/**
 * @author shushu
 * @date 2021/12/6
 * @apiNote the operation of the time
 */
public class TimeOperation {
    public static final String semiAngleColon = ":";
    public static final String fullAngleColon = "：";

    private static int toMin(String time) {
        if (isEmpty(time)) {
            return 0;
        }

        time = time.replaceAll("：", ":");
        String[] timeSplit = time.split(":");

        int one = 1;
        if (time.charAt(0) == '-') {
            one = -1;
        }
        return one * (timeSplit.length == 2 ? Math.abs(Integer.parseInt(timeSplit[0])) * 60 + Integer.parseInt(timeSplit[1])
                : Math.abs(Integer.parseInt(timeSplit[0])) * 60 * 60 + Integer.parseInt(timeSplit[1]) * 60 + Integer.parseInt(timeSplit[2]));
    }

    private static String toMax(int time, String mode) {
        if (mode.equals("hhmm")) {
            String hour = String.valueOf((int) Math.floor(time / 60));
            int minute = time % 60;
            return hour + ':' + (minute < 10 ? '0' + minute : minute);
        } else {
            int hour = (int) (Math.floor(time / (60 * 60)));
            int residualSecond = time - hour * 60 * 60;
            String minute = String.valueOf((int) Math.floor(residualSecond / 60));
            String second = String.valueOf((int) Math.floor(residualSecond % 60));
            return String.valueOf(hour) + ':' + (minute.length() == 1 ? '0' + minute : minute) + ':' + (second.length() == 1 ? '0' + second : second);
        }

    }

    public static String addTime(String time1, String time2) {
        if (time1 == null || "".equals(time1)) {
            time1 = "00:00";
        }
        if (time2 == null || "".equals(time2)) {
            return time1;
        }

        return toMax(toMin(time1) + toMin(time2), "hhmm");
    }

    public static String addTimeHMS(String time1, String time2) {
        if (time1 == null || "".equals(time1)) {
            time1 = "00:00:00";
        }
        if (time2 == null || "".equals(time2)) {
            return time1;
        }
        int a = toMin(time1);
        int b = toMin(time2);

        return toMax(toMin(time1) + toMin(time2), "hhmmss");
    }

    public static String minusTime(String time1, String time2) {
        if (time1 == null || "".equals(time1)) {
            time1 = "00:00";
        }
        if (time2 == null || "".equals(time2)) {
            return time1;
        }

        int result = toMin(time1) - toMin(time2);
        if (result < 0) {
            return "-" + toMax(toMin(time2) - toMin(time1), "hhmm");
        }

        return toMax(toMin(time1) - toMin(time2), "hhmm");
    }

    public static String minusTimeHMS(String time1, String time2) {
        if (time1 == null || "".equals(time1)) {
            time1 = "00:00:00";
        }
        if (time2 == null || "".equals(time2)) {
            return time1;
        }

        int result = toMin(time1) - toMin(time2);
        if (result < 0) {
            return "-" + toMax(toMin(time2) - toMin(time1), "hhmmss");
        }

        return toMax(toMin(time1) - toMin(time2), "hhmmss");
    }

    public static void main(String[] args) {
        System.out.println(addTimeHMS("-9:23:21", "09:23:21"));
    }
}
