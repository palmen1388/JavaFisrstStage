import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class HumanTest {
    public HumanTest() {
    }

    @Test
    public void getName() {
        Human human = new Human("Vlad", "Emelianov", "Andreevich", 25);
        Assert.assertEquals("Vlad", human.getName());
    }

    @Test
    public void setName() {
        Human human = new Human();
        human.setName("Vlad");
        Assert.assertEquals("Vlad", human.getName());
    }
    @Test
    public void getSurname() {
        Human human = new Human("Vlad", "Emelianov", "Andreevich", 25);
        Assert.assertEquals("Emelianov", human.getSurname());
    }
    @Test
    public void setSurname() {
        Human human = new Human();
        human.setSurname("Emelianov");
        Assert.assertEquals("Emelianov", human.getSurname());
    }
    @Test
    public void getMiddleName() {
        Human human = new Human("Vlad", "Emelianov", "Andreevich", 25);
        Assert.assertEquals("Andreevich", human.getMiddleName());
    }
    @Test
    public void setMiddleName() {
        Human human = new Human();
        human.setMiddleName("Andreevich");
        Assert.assertEquals("Andreevich", human.getMiddleName());
    }
    @Test
    public void getAge() {
        Human human = new Human("Vlad", "Emelianov", "Andreevich", 25);
        Assert.assertEquals(25L, (long)human.getAge());
    }
    @Test
    public void setAge() {
        Human human = new Human();
        human.setAge(25);
        Assert.assertEquals(25L, (long)human.getAge());
    }
}

}