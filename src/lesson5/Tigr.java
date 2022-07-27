package lesson5;

public class Tigr extends Animal{  //теперь все не private методы из родительского класса Animal
                                    // доступны и для дочернего класса Tigr
    private int countClaws;

    public Tigr(String name, int countClaws) {
        super(name); // вызывается конструктор родительского класса и туда передается параметр name
        this.countClaws = countClaws;
    }

    public void hunt(){
        System.out.println("Тигр с именем " + this.name + " охотится");
    }

    @Override               // меняем функциональность родительского метода
    public void run() {
          System.out.println("Тигр крадется");
    }

}
