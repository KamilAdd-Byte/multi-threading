package com.multithreading.color;

import java.awt.*;

public class RgbStringColor {

    private String name;
    private Color color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

  public static int setStringToInt(String number){
        return Integer.parseInt(number);

  }

    public static void main(String[] args) {
        int i = RgbStringColor.setStringToInt("6");
        System.out.println(i+5);
    }
}
