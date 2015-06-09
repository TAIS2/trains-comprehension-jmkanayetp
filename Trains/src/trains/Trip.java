package trains;

import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jmkanayetp
 */
public class Trip {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        // People to travel        
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();
        Person person5 = new Person();
        Person person6 = new Person();
        //Initialize values
        person1.setId(1);
        person2.setId(2);
        person3.setId(3);
        person4.setId(4);
        person5.setId(5);
        person6.setId(6);        
        person1.setFullName("Full name1");
        person2.setFullName("Full name2");
        person3.setFullName("Full name3");
        person4.setFullName("Full name4");
        person5.setFullName("Full name5");
        person6.setFullName("Full name6");        
        //Create first person's list into the first family        
        List<Person> membersFamily1 = new ArrayList<>();
        //Add persons
        membersFamily1.add(person1);
        membersFamily1.add(person2);
        membersFamily1.add(person3);
        membersFamily1.add(person4);
        membersFamily1.add(person5);
        membersFamily1.add(person6);
        //Set persons (members)
        Family family1 = new Family();     
        family1.setIdFamily(1);
        family1.setPersons(membersFamily1);        
        //Create Wagons        
        Wagon wagon1 = new Wagon();
        Wagon wagon2 = new Wagon();
        Wagon wagon3 = new Wagon();
        //Set attributes
        wagon1.setIdWagon(1);
        wagon1.setTotalChairsWagon(20);
        wagon1.setOccupiedChairsWagon(0);
        
        wagon2.setIdWagon(2);
        wagon2.setTotalChairsWagon(20);
        wagon2.setOccupiedChairsWagon(0);
        
        wagon3.setIdWagon(3);
        wagon3.setTotalChairsWagon(20);
        wagon3.setOccupiedChairsWagon(0);
        
        //Create the train        
        List<Wagon> wagons = new ArrayList<>();      
        Train train = new Train();    
        train.setWagons(wagons);        
        // Reservation        
        Reservation reservation = new Reservation();        
        reservation.setIdReservation(1);
        reservation.setCostReservation(300000);
        reservation.setDateReservation("25-06-2015");
        reservation.setFamily(family1);
        
        System.out.println(family1.getPersons().get(0).getFullName()
                           + " is a member of the family " + family1.getIdFamily()
                           + " with the reservation " + reservation.getIdReservation()
                           + " and date " + reservation.getDateReservation());
        
    }
    
}