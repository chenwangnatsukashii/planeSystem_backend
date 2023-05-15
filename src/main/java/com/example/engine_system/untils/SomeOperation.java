package com.example.engine_system.untils;

/**
 * @author shushu
 * @date 2021/12/6
 * @apiNote
 */
public class SomeOperation {

    public static boolean isEmpty(String s) {
        return s == null || "".equals(s.trim());
    }

    public static boolean isEmpty(Integer s) {
        return s == null;
    }
}
