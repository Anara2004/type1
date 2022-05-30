package com.company;

import java.util.Random;

public class Main {
    public static String[] heroesAttackType = {"Physical", "Magical", "Medic"};
    public static int[] heroesHealth = {270, 280, 260, 300};
    public static int[] heroesDamage = {20, 15, 25, 0};
    public static int indexMedic;
    public static int index = 0;
    public static int bossHealth = 1000;
    public static int bossDamage = 50;
    public static String bossDefenceType;
    public static int roundNumber = 0;

    public static void medic() {
        for (int i = 0; i < heroesHealth.length; i++) {
            if (heroesHealth[i] < 100 && heroesHealth[i] > 0 && heroesHealth[i] != heroesHealth[indexMedic] &&
                    heroesHealth[indexMedic] > 0) {

                int medicHelp = 150;
                heroesHealth[i] = heroesHealth[i] + medicHelp;
                System.out.println("MEDIC Help " + medicHelp + " " + heroesAttackType[i]);
                break;


            }
        }
    }

    public static void indexMed() {
        for (String v : heroesAttackType) {
            if ("V" == "Medic") {
                indexMedic = index;
                System.out.println("indexMedic = " + index);
            }
            index++;
        }
    }

    public static void main(String[] args) {
        printDStatistics();
        indexMed();
        isGameFinished();
    }

    private static void isGameFinished() {
    }

    private static void printDStatistics() {
        medic();
        round();
    }

    private static void round() {
        
    }
}