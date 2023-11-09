package main.java.com.example;

public class Guest extends Person{
    private int id;
    private boolean breakfast;
    public Guest(int age, String sex, double height, String name, double weight, int id, boolean breakfast){
        super(age, sex, height, name, weight);
        this.id = id;
        this.breakfast = breakfast;
    }
    public int getId(){
        return this.id;
    }
    public boolean getBreakfast(){
        return breakfast;
    }
    
}
