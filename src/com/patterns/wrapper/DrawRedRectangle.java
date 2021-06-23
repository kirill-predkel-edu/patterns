package com.patterns.wrapper;

public class DrawRedRectangle extends DrawRectangle {
    private Draw draw;
    public DrawRedRectangle(Draw draw) {
        this.draw = draw;
    }

    @Override
    public String drawFigure() {
        String result = draw.drawFigure() + " красного цвета";
        System.out.println(result);
        return result;
    }
}