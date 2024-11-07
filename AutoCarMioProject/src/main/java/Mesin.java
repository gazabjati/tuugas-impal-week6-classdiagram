/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gazza Abjati
 */
class Mesin {
    private final String tipeMesin;

    public Mesin(String tipeMesin) {
        this.tipeMesin = tipeMesin;
    }

    public String getTipeMesin() {
        return tipeMesin;
    }

    public void nyalakanMesin() {
        System.out.println("Mesin tipe " + tipeMesin + " dinyalakan");
    }

    public void matikanMesin() {
        System.out.println("Mesin dimatikan");
    }

    @Override
    public String toString() {
        return "Tipe mesin: " + tipeMesin;
    }
}

