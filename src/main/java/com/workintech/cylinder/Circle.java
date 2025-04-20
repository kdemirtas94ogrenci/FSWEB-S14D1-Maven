package com.workintech.cylinder;


import java.util.Locale;

public class Circle {

        private  double radius;

        public Circle(double radius) {
            if (radius <0) {
                this.radius = 0;
            } else {
                this.radius = radius;
            }
        }

        public double getRadius() {

            return radius;
        }
        public double getArea() {

            return radius * radius * Math.PI;
        }
    public String getFormattedArea() {
        return String.format(Locale.US, "%.2f", getArea());
    }


    }


