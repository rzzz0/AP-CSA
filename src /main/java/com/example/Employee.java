package main.java.com.example;

public class Employee extends Person {
    private String position;
    private int id;
    public Employee(int age, String sex, double height, String name, double weight, int id, String position){
        super(age, sex, height, name, weight);
        this.id = id;
        this.position = position;

    }
    public int getId(){
        return this.id;
    }
    public String getPosition(){
        return this.position;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setPosition(String position){
        this.position = position;
    }
}
