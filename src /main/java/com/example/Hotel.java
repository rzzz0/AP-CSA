package main.java.com.example;

import java.util.ArrayList;

public class Hotel {
    private String name;
    private ArrayList<Room> room_list;
    private ArrayList<Employee> employees_list;

    public Hotel(String name) {
        this.name = name;
        this.room_list = new ArrayList<Room>();
        this.employees_list = new ArrayList<Employee>();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public ArrayList<Room> getRooms() {
        return this.room_list;
    }

    public void setRoom(ArrayList<Room> room) {
        this.room_list = room;
    }
    
    public ArrayList<Employee> getEmployees(){
        return this.employees_list;
    }
    
    public void hireEmployee(Employee employee){
        this.employees_list.add(employee);
    }
    
    public void fireEmployee(Employee employee){
        this.employees_list.remove(employee);
    }


    public boolean book(ArrayList<Guest> guest_list, double budget) {
        ArrayList<Room> available = new ArrayList<Room>();
        for (Room room : this.room_list) {
            if (room.getOccupied() == false) {
                available.add(room);
            }
        }
        for (int i = 0; i < available.size() - i - 1; i++) {
            for (int j = 0; j < available.size() - 1 - j; j++) {
                if (available.get(j).getPrice() > available.get(j + 1).getPrice()) {
                    Room temp = available.get(j);
                    available.set(j, available.get(j + 1));
                    available.set(j, temp);
                }
            }
        }
        

        ArrayList<Room> roomsForBooking = new ArrayList<Room>();
        int counter = 0;
        for (Room room : available) {
            if (counter >= guest_list.size()) {
                break;
            }
            roomsForBooking.add(room);
            counter = counter + room.getOccupancy();
        }
        if (counter <= guest_list.size()) {
            return false;
        }
        
        double totalRoomPrice = 0;
        for (Room room : roomsForBooking){
            totalRoomPrice = totalRoomPrice + room.getPrice();
        }
        if (budget < totalRoomPrice){
            return false;
        } 
         
        int guestInRoom = 0;
        for (Room room : roomsForBooking){
            room.setOccupied(true);
            for(int i = 0; i < room.getOccupancy(); i++){
                if (guest_list.contains(guest_list.get(guestInRoom + i))){
                    room.addGuest(guest_list.get(guestInRoom + i));
                    guestInRoom++;
                }
            }
        }
        return true;
        
    }

}