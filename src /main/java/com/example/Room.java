package main.java.com.example;
import java.util.ArrayList;

public class Room {
    private int occupancy;
    private double price;
    private boolean occupied;
    private ArrayList<Guest> guest_list;
    
    public Room(int occupancy, double price, boolean occupied){
        this.occupancy = occupancy;
        this.price = price;
        this.occupied = false;
        this.guest_list = new ArrayList<Guest>();
    }

    public ArrayList<Guest> getGuests(){
        return this.guest_list;
    }
    
    public void setGuest_list(ArrayList<Guest> newGuest_list){
        this.guest_list = newGuest_list;
    }

    
    
    public void addGuest(Guest guest){
        this.guest_list.add(guest);
    }
    
    public void removeGuest(Guest guest){
        this.guest_list.remove(guest);
    }

    public int getOccupancy(){
        return this.occupancy;
    }

    public double getPrice(){
        return this.price;
    }

    public boolean getOccupied(){
        return this.occupied;
    }

    public void setOccupancy(int occupancy){
        this.occupancy = occupancy;
    }
    public void setPrice(double price){
        this.price = price;
    }
    
    public void setOccupied(boolean occupied){
        this.occupied = occupied;
    }
    
}
