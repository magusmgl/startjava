package com.startjava.lesson_2_3.robot;

public class Jaeger {
    private String modelName;
    private String mark;
    private String origin;
    private float height;
    private float weight;
    private int speed;
    private int strength;
    private int amor;

    public Jaeger() {
    }

    public Jaeger(String modelName, String mark, String origin, float height,
            float weight, int speed, int strength, int amor) {
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
        this.strength = strength;
        this.amor = amor;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        if (modelName == "") {
            System.out.println("Пустая строка"); 
        } else {
            this.modelName = modelName;
        }
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        if (mark == "") {
            System.out.println("Пустая строка"); 
        } else {
            this.mark = mark;
        }
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        if (origin == "") {
            System.out.println("Пустая строка"); 
        } else {
            this.origin = origin;
        }
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getAmor() {
        return amor;
    }

    public void setAmor(int amor) {
        this.amor = amor;
    }

    public boolean drift() {
        System.out.println(modelName + " вошел в дрифт");
        return true;
    }

    public void move() {
        System.out.println(modelName + " прошел 5 шагов"); 
    }

    public String scanKaiju() {
        return "nothing";
    }

    public void useVortexCannon() {
    }

    @Override
    public String toString() {
        return String.format("Название модели %s, марка робота %s, страна производства %s." +
                " Характеристики: высота - %f, вес - %f, скорость - %d, сила - %d, защита - %d.",
                modelName, mark, origin, height, weight, speed, strength, amor);
    }
}