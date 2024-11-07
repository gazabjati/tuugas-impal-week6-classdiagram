/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gazza Abjati
 */
class Fuel {
    private String jenisBahanBakar;
    private int volumeBahanBakar; // dalam liter

    public Fuel(String jenisBahanBakar, int volumeBahanBakar) {
        this.jenisBahanBakar = jenisBahanBakar;
        this.volumeBahanBakar = volumeBahanBakar;
    }

    public String getJenisBahanBakar() {
        return jenisBahanBakar;
    }

    public int getVolumeBahanBakar() {
        return volumeBahanBakar;
    }

    public void consumeFuel(int amount) {
        if (volumeBahanBakar >= amount) {
            volumeBahanBakar -= amount;
            System.out.println("Consuming " + amount + " liters of " + jenisBahanBakar + ". Remaining fuel: " + volumeBahanBakar + " liters.");
        } else {
            System.out.println("Not enough fuel to consume.");
        }
    }

    @Override
    public String toString() {
        return jenisBahanBakar;
    }
}

