/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trains;

/**
 *
 * @author javergarav
 */
public class Reservation {

    private int idReservation;
    private String dateReservation;
    private double costReservation;
    private Family family;

    public int getIdReservation() {
        return idReservation;
    }

    public void setIdReservation(int idReservation) {
        this.idReservation = idReservation;
    }

    public String getDateReservation() {
        return dateReservation;
    }

    public void setDateReservation(String dateReservation) {
        this.dateReservation = dateReservation;
    }

    public double getCostReservation() {
        return costReservation;
    }

    public void setCostReservation(double costReservation) {
        this.costReservation = costReservation;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }
}