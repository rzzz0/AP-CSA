package main.java.com.example;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Hotel pitbull = new Hotel("APCSA");
        Room economyRoom = new Room(3, 420, false);
        Room deluxeRoom = new Room (2,500, false);
        Room theBestRoom = new Room (2, 340, false);
        ArrayList<Room> theBestList = new ArrayList<Room>();

        pitbull.setRoom(theBestList);
        theBestList.add(economyRoom);
        theBestList.add(deluxeRoom);
        theBestList.add(theBestRoom);
    

        System.out.println(pitbull.getName());
        System.out.println(economyRoom.getPrice());
        
        System.out.println(pitbull.book(2,340));
        for (Room room : pitbull.getRooms()){
            System.out.println(room.getPrice());
            System.out.println(room.getOccupancy());
            System.out.println(room.getOccupied());
        } 
        

    }


}


