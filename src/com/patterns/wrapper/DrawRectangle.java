package com.patterns.wrapper;

public class DrawRectangle implements Draw {

    @Override
    public String drawFigure() {
        String result = "Это треугольник";
        System.out.println(result);
        return result;
    }
}
