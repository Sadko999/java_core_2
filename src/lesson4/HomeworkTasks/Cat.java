package lesson4.HomeworkTasks;

public class Cat {
    private String name;
    private int weight;

    public Cat(String catName, int catWeight){
        this.name = catName;
        this.weight = catWeight;
    }

    public String getName(){
        return this.name;
    }
    public int getWeight(){
        return this.weight;
    }
    public void setName(String catName){
        this.name = catName;
    }
    public void setWeight(int catWeight){
        this.weight = catWeight;
    }
}
