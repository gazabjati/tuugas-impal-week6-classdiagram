/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gazza Abjati
 */
class Mio implements Transportasi {
    private Fuel bahanBakar;
    private int kecepatan;
    private Mesin mesin;

    public Mio(Fuel bahanBakar, int kecepatan, Mesin mesin) {
        this.bahanBakar = bahanBakar;
        this.kecepatan = kecepatan;
        this.mesin = mesin;
    }

    @Override
    public void start() {
        System.out.println("Mio started with fuel " + bahanBakar + " and engine type: " + mesin.getTipeMesin());
        mesin.nyalakanMesin();
    }

    @Override
    public void drive() {
        System.out.println("Mio is driving at speed: " + kecepatan + " km/h with fuel type: " + bahanBakar.getJenisBahanBakar());
        if (kecepatan > 60) {
            bahanBakar.consumeFuel(2);
        } else {
            bahanBakar.consumeFuel(1);
        }
    }

    @Override
    public void stop() {
        System.out.println("Mio stopped.");
        mesin.matikanMesin();
    }

    @Override
    public String toString() {
        return "Mio {" +
                "\n  bahan bakar=" + bahanBakar +
                ",\n  kecepatan=" + kecepatan +
                ",\n  mesin=" + mesin +
                "\n}";
    }
}

