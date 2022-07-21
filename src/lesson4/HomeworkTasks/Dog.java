package lesson4.HomeworkTasks;

public class Dog {
    private String name;
    private int age;

    public Dog(String dogName, int dogAge){
        this.name = dogName;
        this.age = dogAge;
    }

    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public void setName(String dogName){
        this.name = dogName;
    }
    public void setAge(int dogAge){
        this.age = dogAge;
    }
}

