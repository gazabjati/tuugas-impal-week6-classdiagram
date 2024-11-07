/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gazza Abjati
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek Fuel, Mesin, Roda, dan Setir untuk AutoCarRPL
        Fuel bahanBakarMobil = new Fuel("Pertamax Turbo", 50); // 50 liter bahan bakar
        Mesin mesinMobil = new Mesin("V8");
        Roda rodaMobil = new Roda(4);
        Setir setirMobil = new Setir("Elektrik");

        // Membuat objek AutoCarRPL dengan kecepatan 80 km/jam
        AutoCarRPL autoCar = new AutoCarRPL(bahanBakarMobil, 80, mesinMobil, rodaMobil);
        autoCar.setSetir(setirMobil);

        // Menjalankan metode pada AutoCarRPL
        autoCar.start();
        autoCar.drive();  // Mengonsumsi 2 liter karena kecepatan > 60
        autoCar.drive();  // Mengemudi lagi untuk menunjukkan konsumsi bahan bakar

        // Membuat objek Fuel dan Mesin karburator untuk Mio dengan kecepatan 50 km/jam
        Fuel bahanBakarMio = new Fuel("Pertamax Turbo", 50); // 50 liter bahan bakar
        Mesin mesinMio = new Mesin("Karburator");
        Mio mio = new Mio(bahanBakarMio, 50, mesinMio);  // Kecepatan 50 km/jam

        // Menjalankan metode pada Mio
        mio.start();
        mio.drive();  // Mengonsumsi 1 liter karena kecepatan <= 60
        mio.stop();
        
        // Menjalankan AutoCarRPL lagi
        autoCar.drive();  // Mengonsumsi 2 liter karena kecepatan > 60
    }
}

