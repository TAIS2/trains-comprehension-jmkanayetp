/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trains;

import java.util.List;

/**
 *
 * @author javergarav
 */
public class Wagon {

    private int idWagon;
    private int totalChairsWagon;
    private int occupiedChairsWagon;
    private List<Reservation> reservations;

    public int getIdWagon() {
        return idWagon;
    }

    public void setIdWagon(int idWagon) {
        this.idWagon = idWagon;
    }

    public int getTotalChairsWagon() {
        return totalChairsWagon;
    }

    public void setTotalChairsWagon(int totalChairsWagon) {
        this.totalChairsWagon = totalChairsWagon;
    }

    public int getOccupiedChairsWagon() {
        return occupiedChairsWagon;
    }

    public void setOccupiedChairsWagon(int occupiedChairsWagon) {
        this.occupiedChairsWagon = occupiedChairsWagon;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }
}