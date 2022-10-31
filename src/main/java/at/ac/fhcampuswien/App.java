package at.ac.fhcampuswien;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        System.out.println("Aufgabe 3: Array erweitern");
        int [] arrayA=new int[] {1, 2 , 3, 4};
        int [] arrayB= new int[]{7, 8, 9, 10};
        int [] extended=extendArray(arrayA, arrayB);
        System.out.println(Arrays.toString(extended));

        System.out.println("Aufgabe 2: monthMapper");
        System.out.println(monthMapper());

        }

        public static int[] extendArray (int [] arrayA, int[] arrayB){
        int [] extended=new int[arrayA.length+arrayB.length];

       int z=0;

        if (arrayA.length<arrayB.length) {
            for (int i = 0; i < arrayA.length; i++) {
                extended[i] = arrayA[i];
            }
            for (int j = arrayA.length; j < extended.length; j++) {
                extended[j] = arrayB[z];
                z++;
            }
        }else if (arrayA.length>arrayB.length){
            for (int i=0; i< arrayB.length; i++){
                extended[i]=arrayB[i];}
            for (int j=arrayB.length; j<extended.length; j++) {
                extended[j] = arrayA[z]; z++;}
            } else{
            for (int j=0; j<extended.length; j=j+2) {
                extended[j] = arrayB[j/2];
                extended[j+1] = arrayA[j/2];
            }
        }
        return extended;
    }
    public static String monthMapper() {
        Scanner scanner = new Scanner(System.in);
        String eingabe;
        int month;
        String Monat;

        System.out.println("Enter a number between 1-12 or \"r\" to pick a random month:");
        eingabe = scanner.nextLine();

        if (eingabe.equals("r")) {
            month = generateRandomMonth();
            eingabe=Integer.toString(month);
        }
        switch (eingabe) {
            case "1":
                Monat="January";
                break;
            case "2":
                Monat="February";
                break;
            case "3":
                Monat="March";
                break;
            case "4":
                Monat="April";
                break;
            case "5":
                Monat="Mai";
                break;
            case "6":
                Monat="June";
                break;
            case "7":
                Monat="July";
                break;
            case "8":
                Monat="August";
                break;
            case "9":
                Monat="September";
                break;
            case "10":
                Monat="October";
                break;
            case "11":
                Monat="November";
                break;
            case "12":
                Monat="December";
                break;
            default:
                Monat="Invalid month";
        }
        return Monat;
    }

    public static int generateRandomMonth() {
        Random random = new Random();
        return random.nextInt(11)+1;
    }
}
