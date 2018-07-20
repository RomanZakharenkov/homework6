package com.itacademy.zakharenkov.task1;

public class Rectangle {

    private Point topLeft;
    private Point bottomRight;

    public Rectangle(Point topLeft, Point bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public double calculateSquareRectangle() {
        return Math.abs((topLeft.getX() - bottomRight.getX()) * (topLeft.getY() - bottomRight.getY()));
    }

    public double calculateDiagonal() {
        return topLeft.distance(bottomRight);
    }
}
