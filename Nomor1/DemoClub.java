package com.syahril.Tugas2.Nomor1;

public class DemoClub {
    public static void main(String[] args) {

        // Objek Club
        Club club1 = new Club();
        Club club2 = new Club("Chelsea F.C."); // .
        Club club3 = new Club("Chelsea F.C.", "Club sepak bola Inggris yang bermarkas di Fulham, London. Kini berkompetisi di Liga Utama Inggris");
        Club club4 = new Club("Chelsea F.C.", 1905, "Stamford Bridge");
        Club club5 = new Club("MChelsea F.C.", 1905, "Stamford Bridge", 1, "Club sepak bola Inggris yang bermarkas di Fulham, London. Kini berkompetisi di Liga Utama Inggris");

        // Memanggil Method dari class Club
        club1.getTeam();
        System.out.println();
        club2.getTeam();
        System.out.println();
        club3.getTeam();
        System.out.println();
        club4.getTeam();
        System.out.println();
        club5.getTeam();
    }
}
