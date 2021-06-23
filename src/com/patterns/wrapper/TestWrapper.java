package com.patterns.wrapper;

public class TestWrapper {
    public static void main(String[] args) {
        Draw drawFigure = new DrawRectangle();
        drawFigure.drawFigure();

        Draw drawColoredFigure = new DrawRedRectangle(drawFigure);
        drawColoredFigure.drawFigure();
    }
}
