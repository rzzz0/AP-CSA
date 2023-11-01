package main.java.com.example;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Employee brad = new Employee(16, null, 333 , "Brad", 80, 1234, "receptionist");
        System.out.println(brad.getSex());
        Hotel pitbull = new Hotel("APCSA");
        Room economyRoom = new Room(3, 420, false);
        Room deluxeRoom = new Room (2,500, false);
        Room theBestRoom = new Room (2, 340, false);
        ArrayList<Room> theBestList = new ArrayList<Room>();
        Employee hogan = new Employee(18, "male", 170, "Hogan", 60, 4321, "Manager");
        pitbull.hireEmployee(hogan);
        for (Employee employee : pitbull.getEmployees()){
            System.out.println(employee.getName());
            System.out.println(employee.getSex());
        }


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


