package trains;

import java.util.AbstractList;
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
        //Create List of families
        List<List<Person>> familiesList = new ArrayList<>();
        //Create families
        for (int i = 0; i < 5; i++) {
            List<Person> membersFamily = new ArrayList<>();
            familiesList.add(membersFamily);
        }
        //Create persons
        for (int i = 0; i < 100; i++) {
            Person person = new Person();
            person.setId(i);
            person.setFullName("Full name" + i);
            familiesList.get(i % 5).add(person);
        }
        //Create List of families
        List<Family> families = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            //Set persons (members)
            Family family = new Family();
            family.setIdFamily(i);
            family.setPersons(familiesList.get(i));
            families.add(family);
        }
        //List of wagons
        List<Wagon> wagons = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Wagon wagon = new Wagon();
            wagon.setIdWagon(i);
            wagon.setTotalChairsWagon(i*10);
            wagon.setOccupiedChairsWagon(0);
            wagons.add(wagon);
        }
                 
        //Create the train        
        Train train = new Train();
        train.setWagons(wagons);
        //List of reservations
        List<Reservation> reservations = new ArrayList<>();
        // Reservations     
        for (int i = 0; i < 5; i++) {
            Reservation reservation = new Reservation();
            reservation.setIdReservation(i);
            reservation.setCostReservation(300000);
            reservation.setDateReservation("25-06-2015");
            reservation.setFamily(families.get(i));
            reservations.add(reservation);
        }
        
    }
}