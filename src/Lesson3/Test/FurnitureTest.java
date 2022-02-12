package Lesson3.Test;

import Lesson3.Task1.Furniture;
import org.junit.Test;

import static org.junit.Assert.*;

public class FurnitureTest {

    @Test
    public void setName() {
        Furniture furn = new Furniture();
        furn.setName("Номер один");
        assertEquals("Номер один" , furn.getName());
    }

    @Test
    public void setColor() {
        Furniture furn = new Furniture();
        furn.setColor("Оранжевый");
        assertEquals("Оранжевый" , furn.getColor());
    }

    @Test
    public void setType() {
        Furniture furn = new Furniture();
        furn.setType("Стол");
        assertEquals("Стол" , furn.getType());
    }
}