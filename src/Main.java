import db.DB;

public class Main {

    public static void main(String[] args) {
        DB db = new DB(); // Класс из другого пакета

        final int count = 10;
//        count++;

        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();
        Person.getCount();

//        Person.count = 5;
//        System.out.println(Person.count);

//        info("Hello world");
    }

    public static void info() {
        System.out.println("Hello");
    }

    public static void info(String word) {
        System.out.println(word + "!");
    }
}