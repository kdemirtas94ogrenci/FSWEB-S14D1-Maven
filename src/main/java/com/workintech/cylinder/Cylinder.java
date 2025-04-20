package com.workintech.cylinder;


import java.util.Locale;

public class Cylinder extends Circle {

        private double height;

        public Cylinder(double radius, double height) {
            super(radius);

            if (height <0){
                this.height = 0;
            } else{
                this.height = height;
            }

        }

        public double getHeight() {
            return height;
        }

        public double getVolume() {
            return getArea()* height;
        }
        public String getFormattedVolume() {
            return String.format(Locale.US, "%.2f", getVolume());
        }

    }





