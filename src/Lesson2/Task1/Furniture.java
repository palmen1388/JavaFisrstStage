package Lesson2.Task1;

import java.util.Scanner;

/**
 * Класс описывающий мебель
 */

public class Furniture {
    String name;
    String color;
    String type;

    Furniture () {

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
    public void setName() {
        Scanner scanner = new Scanner(System.in);
        this.name = scanner.nextLine();
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
    public void setColor() {
        Scanner scanner = new Scanner(System.in);
        this.color = scanner.nextLine();
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
    public void setType() {
        Scanner scanner = new Scanner(System.in);
        this.type = scanner.nextLine();
        this.chekType();
    }

    /**
     * проверка правильности типа мебели
     */
    public void chekType(){
        if (this.type.equalsIgnoreCase("Стол")||
                this.type.equalsIgnoreCase("Стул")||
                this.type.equalsIgnoreCase("Кровать")||
                this.type.equalsIgnoreCase("Шкаф")) {
        }else {
            System.out.println("Тип может быть: кровать, шкаф, стол и стул.");
            this.setType();
        }
    }

    /**
     * создание мебели
     */
    public void createFurniture() {
        this.setName();
        this.setColor();
        this.setType();
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
