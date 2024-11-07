/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gazza Abjati
 */
class AutoCarRPL implements Transportasi {
    private Fuel bahanBakar;
    private int kecepatan;
    private Mesin mesin;
    private Roda roda;
    private Setir setir;

    public AutoCarRPL(Fuel bahanBakar, int kecepatan, Mesin mesin, Roda roda) {
        this.bahanBakar = bahanBakar;
        this.kecepatan = kecepatan;
        this.mesin = mesin;
        this.roda = roda;
    }

    public void setSetir(Setir setir) {
        this.setir = setir;
    }

    @Override
    public void start() {
        System.out.println("AutoCarRPL started with fuel " + bahanBakar);
        mesin.nyalakanMesin();
    }

    @Override
    public void drive() {
        System.out.println("AutoCarRPL is driving at speed: " + kecepatan + " km/h with fuel type: " + bahanBakar.getJenisBahanBakar());
        if (kecepatan > 60) {
            bahanBakar.consumeFuel(2);
        } else {
            bahanBakar.consumeFuel(1);
        }
    }

    @Override
    public void stop() {
        System.out.println("AutoCarRPL stopped.");
        mesin.matikanMesin();
    }

    @Override
    public String toString() {
        return "AutoCarRPL {" +
                "\n  bahan bakar=" + bahanBakar +
                ",\n  kecepatan=" + kecepatan +
                ",\n  mesin=" + mesin +
                ",\n  roda=" + roda +
                ",\n  setir=" + (setir != null ? setir : "tidak ada") +
                "\n}";
    }
}

