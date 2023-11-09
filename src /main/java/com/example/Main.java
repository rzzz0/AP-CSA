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
        Guest Aaron = new Guest(18, "female", 180, "Aaron", 60, 1234567, true);
        Guest Michael = new Guest(14, "male", 150, "Michael", 40, 453672, false);
        Guest Gina = new Guest(16, "female", 154, "Gina", 40, 976583, true);
        ArrayList<Guest> guests = new ArrayList<Guest>();
        guests.add(Aaron);
        guests.add(Michael);
        guests.add(Gina);
        //create an arraylist of type guest
        //add aaron to arraylist created above 
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
        
        System.out.println(pitbull.book(guests,340));
        for (Room room : pitbull.getRooms()){
            System.out.println(room.getPrice());
            System.out.println(room.getOccupancy());
            System.out.println(room.getOccupied());
        } 

        

    }

    
}


