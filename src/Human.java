/**
 * Класс описывающий человека
 */
public class Human {
    String name;
    String surname;
    String middleName;
    int age;

    Human () {

    }

    Human(String name, String surname, String middleName, int age) {
        this.name = name;
        this.surname = surname;
        this.middleName =middleName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString () {
        return "Human{" + "name='" + name + '\'' +
                " ,surname='" + surname + '\'' +
                " ,middle name='" + middleName + '\'' +
                " ,age='" + age + '\'' + '}';
    }
}
