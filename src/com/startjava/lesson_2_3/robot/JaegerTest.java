package com.startjava.lesson_2_3.robot;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger();
        jaegerOne.setModelName("Romeo Blue");
        jaegerOne.setMark("Mark-1");
        jaegerOne.setOrigin("United States of America");
        jaegerOne.setHeight(77.72f);
        jaegerOne.setWeight(7.775f);
        jaegerOne.setSpeed(2);
        jaegerOne.setStrength(7);
        jaegerOne.setAmor(6);

        System.out.println(jaegerOne);
        jaegerOne.drift();
        jaegerOne.move();

        Jaeger jaegerTwo = new Jaeger("Horizon Brave", "Mark-1", "China",
                72.54f, 7.89f, 8, 4, 6);

        System.out.println(jaegerTwo);
        jaegerTwo.drift();
        jaegerTwo.move();
    }
}