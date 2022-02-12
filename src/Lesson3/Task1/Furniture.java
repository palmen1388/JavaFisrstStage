package Lesson3.Task1;

import java.util.Scanner;

/**
 * Класс описывающий мебель
 */

public class Furniture {
    private String name;
    private String color;
    private String type;

    public Furniture() {

    }

    /**
     *
     * @return название мебели
     */
    public String getName() {
        return name;
    }

    /**
     * Присвоение названия
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return цвет
     */
    public String getColor() {
        return color;
    }
    /**
     * Присвоение цвета
     */
    public void setColor(String color) {
        this.color = color;
    }
    /**
     *
     * @return тип
     */
    public String getType() {
        return type;
    }
    /**
     * Присвоение типа
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * создание мебели
     */
    public void createFurniture() {
        this.setName(name);
        this.setColor(color);
        this.setType(type);
    }

    /**
     *
     * переопределение метода toString
     */
    @Override
    public String toString(){
        return "Furniture: name = "+ name +
                ", color = " + color +
                ", type = " + type;
    }

}
