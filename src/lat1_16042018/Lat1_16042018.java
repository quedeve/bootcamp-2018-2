/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lat1_16042018;

import java.awt.Point;


/**
 *
 * @author victo
 */
public class Lat1_16042018 {

    /**
     * @param args the command line arguments
     */
    public static double arraySum2(double[] numbers) {
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];

        }
        return sum;
    }

    public static double arraySum1(double[] numbers) {
        double sum = 0;
        for (double num : numbers) {
            sum = sum + num;
        }
        return sum;
    }

    public static double arraySum3(double[] numbers) {
        double sum = 0;
        int i = 0;
        while (i < numbers.length) {
            sum = sum + numbers[i];
            i++;
        }
        return sum;
    }

    public static void listEntries(String[] entries) {

    }

    public static void listNums1(int max) {

    }

    public static void listNums2(int max) {

    }

    public static void listNums3(int max) {

    }

    public static double arraySum4(double[] numbers) {
        double sum = 0;
        int i = 0;
        do {
            sum = sum + numbers[i];
            i++;
        } while (i < numbers.length);
        return sum;
    }

    public static void main(String[] args) {

        //Latihan 1 print out text
        System.out.println("Hello, world!");

        //+ operator Array Basics, Command Line Args
        //+ operator
        String kalimatPertama = "Hello, " + "World!";
        String kalimatKedua = "Number " + 5;
        System.out.println(kalimatPertama);
        System.out.println(kalimatKedua);
        //Array Basics : Accessing Elements + Looping
        int[] Nomer = {2, 4, 6, 8};
        for (int i = 0; i < Nomer.length; i++) {
            System.out.print(Nomer[i] + " ");

        }
        System.out.println("");
        String[] Nama = {"John", "Jane", "Juan"};
        for (int i = 0; i < Nama.length; i++) {
            System.out.print(Nama[i] + " ");

        }
        System.out.println("");
        int temporary = 0;
        while (temporary < Nomer.length) {
            System.out.print(Nomer[temporary] + " ");
            temporary++;
        }
        System.out.println("");
        //Summing Array Entries: Version 1
        double[] Numbers = {1.1, 2.2, 3.3};
        System.out.println("[v1] Sum of {1.1, 2.2 , 3.3} = " + arraySum1(Numbers));
        //Summing Array Entries: Version 2
        System.out.println("[v2] Sum of {1.1, 2.2 , 3.3} = " + arraySum2(Numbers));
        //Summing Array Entries: Version 3
        System.out.println("[v3] Sum of {1.1, 2.2 , 3.3} = " + arraySum3(Numbers));
        //Summing Array Entries: Version 4
        System.out.println("[v4] Sum of {1.1, 2.2 , 3.3} = " + arraySum4(Numbers));

        //Structure and formating
        String[] test = {"This", "is", "a", "test"};
        listEntries(test);

        //Conditionals
        boolean benar = true;
        boolean tidak = false;
        if (benar == true && tidak == true) {
            System.out.println("keduanya kondisi benar");
        } else if (benar == true || tidak == true) {
            System.out.println("salah satu dari keduanya kondisinya benar");
        } else {
            System.out.println("tidak ada kondisi yang benar");
        }
        //Switch Statements
        int month = 4;
        String monthString;
        switch (month) {
            case 1:
                monthString = "January";
                break;
            case 2:
                monthString = "February";
                break;
            case 3:
                monthString = "March";
                break;
            case 4:
                monthString = "April";
                break;
            case 5:
                monthString = "May";
                break;
            default:
                monthString = "Tidak valid";
                break;

        }
        //Boolean Operators & if statements
        temporary = 0;
        int temporary2 = 5;
        if (temporary >= temporary2) {
            System.out.println(temporary);
        } else if (temporary < temporary2) {
            System.out.println(temporary2);
        }

        //Strings
        //Compare Strings using operator ==
        if (Nama.length == 0) {
            System.out.println("Tidak ada siapapun");
        } else if (Nama[0] == "Johny") {
            System.out.println("Hi, " + Nama[0]);
        } else {
            System.out.println("Hi, Stranger");
        }
        //Compare Strings using method Equals
        if (Nama.length == 0) {
            System.out.println("Tidak ada siapapun");
        } else if (Nama[0].equals("Jhon")) {
            System.out.println("Hi, " + Nama[0]);
        } else {
            System.out.println("Hi, Stranger");
        }
        //String Method
        String word = "Hello, world";
        if (word.contains("l")) {
            System.out.println("kata tersebut mengandung huruf l");
        } else {
            System.out.println("kata tersebut tidak mengandung huruf l");
        }
        //Startwith/EndWith hanya mengembalikan type bool ( true / false ) 
        System.out.println(word.startsWith("world"));
        System.out.println(word.indexOf('l'));
        System.out.println(word.substring(2, 5));
        for (String kalimat : word.split(" ")) {
            System.out.println(kalimat);
        }
        System.out.println(word.replace('l', 'i'));
        System.out.println(word.replaceAll("l", "b"));
        System.out.println(word.toUpperCase());
        System.out.println(word.toLowerCase());
        //equalsIgnoreCase seperti equals hanya saja menghiraupkan besar dan kecil huruf
        System.out.println(word.equalsIgnoreCase("Hello, World"));
        //Trim menghilangkan WhiteSpace(spasi) pada awal kalimat.
        String testingTrim = "   Hello, world";
        System.out.println(testingTrim.trim());
        //isEmpty memeriksa string tersebut kosong atau ada isinya danmengembalikan type bool (true/false) 
        System.out.println(word.isEmpty());
        
        
        //Building Arrays: One-Step Process -> yang langsung di isi array-nya dinamakan one-Steps
        int[] var = {10, 100, 1000};
        String[] Names2 = Nama;
        Point[] point = {new Point(0, 0), new Point(1, 2), new Point(3, 4)};
        //Building Arrays: Two-Step Process-> tidak langsung di isi arrany-nya dinamakan two-Steps
        Scaner sc = new Scaner(System.in);

}
