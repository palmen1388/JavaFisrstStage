public class Objects {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.setAge(18);
        Human human2 = new Human("Владислав", "Емельянов", "Андреевич", 25);
        System.out.println(human1);
        System.out.println(human2);
    }
}
