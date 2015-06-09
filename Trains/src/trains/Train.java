/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trains;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author javergarav
 */
public class Train {
    
    private int id;
    private List<Wagon> wagons;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Wagon> getWagons() {
        return wagons;
    }

    public void setWagons(List<Wagon> wagons) {
        this.wagons = wagons;
    }
    
    public void accommodate(Reservation reservation) {
        if (reservation.getFamily().getPersons().size() <= (wagons.get(0).getTotalChairsWagon()- wagons.get(0).getOccupiedChairsWagon())) {
            ArrayList<Reservation> reservations = new ArrayList<>();
            if (wagons.get(0).getReservations() == null) {
                reservations.add(reservation);
            } else {
                for (Reservation res : wagons.get(0).getReservations()) { 
                    reservations.add(res);
                }
                reservations.add(reservation);
            }
            wagons.get(0).setReservations(reservations);
            wagons.get(0).setOccupiedChairsWagon(wagons.get(0).getOccupiedChairsWagon()+ reservation.getFamily().getPersons().size());
            System.out.println("Family with reservation #" + reservation.getIdReservation()+ " added to wagon #1.");
        } else {
            if (reservation.getFamily().getPersons().size() <= (wagons.get(1).getTotalChairsWagon()- wagons.get(1).getOccupiedChairsWagon())) {
                ArrayList<Reservation> reservations = new ArrayList<>();
                if (wagons.get(1).getReservations() == null) {
                    reservations.add(reservation);
                } else {
                    for (Reservation res : wagons.get(1).getReservations()) {
                        reservations.add(res);
                    }
                    reservations.add(reservation);
                }
                wagons.get(1).setReservations(reservations);
                wagons.get(1).setOccupiedChairsWagon(wagons.get(1).getOccupiedChairsWagon()+ reservation.getFamily().getPersons().size());
                System.out.println("Family with reservation #" + reservation.getIdReservation()+ " added to wagon #2.");
            } else {
                if (reservation.getFamily().getPersons().size() <= (wagons.get(2).getTotalChairsWagon() - wagons.get(2).getOccupiedChairsWagon())) {
                    ArrayList<Reservation> reservations = new ArrayList<>();
                    if (wagons.get(2).getReservations() == null) {
                        reservations.add(reservation);
                    } else {
                        for (Reservation res : wagons.get(2).getReservations()) {
                            reservations.add(res);
                        }
                        reservations.add(reservation);
                    }
                    wagons.get(2).setReservations(reservations);
                    wagons.get(2).setOccupiedChairsWagon(wagons.get(2).getOccupiedChairsWagon()+ reservation.getFamily().getPersons().size());
                    System.out.println("Family with reservation #" + reservation.getIdReservation()+ " added to wagon #3.");
                }
            }   
        }
    }
}