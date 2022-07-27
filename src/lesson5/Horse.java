package lesson5;

public class Horse extends Animal{  //теперь все не private методы из класса Animal доступны и для класса Horse

    public Horse(String name) {
        super(name);
    }

    @Override                   // меняем функциональность родительского метода
    public void run() {
        System.out.println("Лошадь бежит галопом");
    }

    public void makeSound(){
        System.out.println("Лошадь ржёт");
    }
}
