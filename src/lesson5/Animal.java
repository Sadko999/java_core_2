package lesson5;

public abstract class Animal { //абстрактный класс. нельзя создать экземпляр Animal
    public String name;

    public Animal(String name) {
        this.name = name;
    }
    public void breath() {
        System.out.println("Животное дышит");
    }
    public abstract void run();  // у absrtract не может быть реализации
}