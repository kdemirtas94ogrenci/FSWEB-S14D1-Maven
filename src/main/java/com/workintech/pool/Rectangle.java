package com.workintech.pool;

public class Rectangle {
    private int width;
    private int length;


    public Rectangle(int width, int length) {
        this.length = length;
        this.width = width;

        if (length <0) {
            this.length = 0;
        }
        if (width< 0) {
            this.width = 0;
        }
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }
    public double getArea(){
        return length * width ;
    }

}
