/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gazza Abjati
 */
class Roda {
    private int jumlahRoda;

    public Roda(int jumlahRoda) {
        this.jumlahRoda = jumlahRoda;
    }

    public int getJumlahRoda() {
        return jumlahRoda;
    }

    @Override
    public String toString() {
        return "Jumlah roda: " + jumlahRoda;
    }
}

