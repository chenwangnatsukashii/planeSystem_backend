package com.example.engine_system.untils;

/**
 * @author shushu
 * @date 2021/12/6
 * @apiNote
 */
public class NumberOperation {
    public static Integer addNumber(Integer number1, Integer number2) {
        return (number1 == null ? 0 : number1) + (number2 == null ? 0 : number2);
    }

    public static Integer minusNumber(Integer number1, Integer number2) {
        return (number1 == null ? 0 : number1) - (number2 == null ? 0 : number2);
    }
}
