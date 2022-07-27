package lesson5;

public class Lesson5 {
    public static void main(String[] args) {

    Horse horse = new Horse("Зорька");
    horse.makeSound();
    horse.breath();
    horse.run();

    Tigr tigr = new Tigr("Борис", 20);
    tigr.hunt();
    tigr.breath();
    tigr.run();
    }
}

