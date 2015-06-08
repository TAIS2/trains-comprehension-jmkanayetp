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
    
    public void accommodate(Reservation r) {
        if (r.getFamily().getMembers().size() <= (wagons.get(0).getChairs() - wagons.get(0).getOccupiedChairs())) {
            ArrayList<Reservation> reservations = new ArrayList<Reservation>();
            if (wagons.get(0).getReservations() == null) {
                reservations.add(r);
            } else {
                for (Reservation res : wagons.get(0).getReservations()) { 
                    reservations.add(res);
                }
                reservations.add(r);
            }
            wagons.get(0).setReservations(reservations);
            wagons.get(0).setOccupiedChairs(wagons.get(0).getOccupiedChairs() + r.getFamily().getMembers().size());
            System.out.println("Family with reservation #" + r.getId() + " added to wagon #1.");
        } else {
            if (r.getFamily().getMembers().size() <= (wagons.get(1).getChairs() - wagons.get(1).getOccupiedChairs())) {
                ArrayList<Reservation> reservations = new ArrayList<Reservation>();
                if (wagons.get(1).getReservations() == null) {
                    reservations.add(r);
                } else {
                    for (Reservation res : wagons.get(1).getReservations()) {
                        reservations.add(res);
                    }
                    reservations.add(r);
                }
                wagons.get(1).setReservations(reservations);
                wagons.get(1).setOccupiedChairs(wagons.get(1).getOccupiedChairs() + r.getFamily().getMembers().size());
                System.out.println("Family with reservation #" + r.getId() + " added to wagon #2.");
            } else {
                if (r.getFamily().getMembers().size() <= (wagons.get(2).getChairs() - wagons.get(2).getOccupiedChairs())) {
                    ArrayList<Reservation> reservations = new ArrayList<Reservation>();
                    if (wagons.get(2).getReservations() == null) {
                        reservations.add(r);
                    } else {
                        for (Reservation res : wagons.get(2).getReservations()) {
                            reservations.add(res);
                        }
                        reservations.add(r);
                    }
                    wagons.get(2).setReservations(reservations);
                    wagons.get(2).setOccupiedChairs(wagons.get(2).getOccupiedChairs() + r.getFamily().getMembers().size());
                    System.out.println("Family with reservation #" + r.getId() + " added to wagon #3.");
                }
            }   
        }
    }
}