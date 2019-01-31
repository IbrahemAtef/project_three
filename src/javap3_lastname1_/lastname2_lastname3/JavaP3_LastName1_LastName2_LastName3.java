package javap3_lastname1_.lastname2_lastname3;

import java.util.Scanner;

public class JavaP3_LastName1_LastName2_LastName3 {

    public static void main(String[] args) {

        System.out.println("==================SECURITY SERVICES==================\n");
        servicesMenu();
    }

    public static void servicesMenu() {
        Scanner s = new Scanner(System.in);
        System.out.println("Services Menu");
        System.out.println("1 - Ciphering Text");
        System.out.println("2 - Deciphering Text");
        System.out.println("3 - Records");
        System.out.println("0 - EXIT\n");
        System.out.print("Please enter the number of the service needed: ");
        int n = s.nextInt();
        switch (n) {
            case 1:
                System.out.println();
                System.out.println("**************************************************");
                cipheringTchniquesMenu();
                break;
            case 2:
                System.out.println();
                System.out.println("**************************************************");
                decipheringTchniquesMenu();
                break;
            case 3:
                System.out.println();
                System.out.println("==================SERVICES COMPLETED==================");
                records();
                break;
            case 0:
                System.out.println("-----------------End of Services-----------------\n");
                System.exit(0);
            default:
                System.out.println("Invalid Input!");
                System.out.println("--------------------------------------------------");
        }
    }

    public static void cipheringTchniquesMenu() {
        Scanner s = new Scanner(System.in);
        System.out.println("Techniques Menu");
        System.out.println("1 - ATBASH");
        System.out.println("2 - HEX");
        System.out.println("3 - VIGENERE");
        System.out.println("0 - Return to Main Menu\n");
        System.out.print("Please enter the number of the service needed: ");
        int n = s.nextInt();
        System.out.println();
        switch (n) {
            case 1:
                System.out.println("**************************************************");
                atabashCiphering();
                break;
            case 2:
                System.out.println("**************************************************");
                Dec2Hex();
                break;
            case 3:
                System.out.println("**************************************************");
//                VIGENERE();
                break;
            case 0:
                servicesMenu();
                break;
            default:
                System.out.println("**************************************************");
                System.out.println("Invalid Input!\n");
                System.out.println("**************************************************\n");
                servicesMenu();
                break;
        }
    }

    public static void decipheringTchniquesMenu() {
        Scanner s = new Scanner(System.in);
        System.out.println("Techniques Menu");
        System.out.println("1 - ATBASH");
        System.out.println("2 - HEX");
        System.out.println("3 - VIGENERE");
        System.out.println("0 - Return to Main Menu\n");
        System.out.print("Please enter the number of the service needed: ");
        int n = s.nextInt();
        System.out.println();
        switch (n) {
            case 1:
                System.out.println("**************************************************");
                atabashDeciphering();
                break;
            case 2:
                System.out.println("**************************************************");
//                HEX();
                break;
            case 3:
                System.out.println("**************************************************");
//                VIGENERE();
                break;
            case 0:
                servicesMenu();
                break;
            default:
                System.out.println("**************************************************");
                System.out.println("Invalid Input!\n");
                System.out.println("**************************************************\n");
                servicesMenu();
                break;
        }
    }

    public static void records() {

    }

    public static void atabashCiphering() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the text to be ciphered: ");
        String line = s.nextLine();
        char[] x = arrayOfAlphabetLetters();
        String cipheredText = "";
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            if (Character.isLetter(c)) {
                for (int j = 0; j < x.length; j++) {
                    if (c == x[j]) {
                        int rank = j;
                        int ch = (rank * -1 + 26) - 1;
                        cipheredText += x[ch];
                    }
                }
            } else {
                cipheredText += " ";
            }
        }
        System.out.println(line + " has been ciphered using ATBASH to: " + cipheredText + "\n");
        System.out.println("**************************************************");
    }

    public static void atabashDeciphering() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the text to be deciphered: ");
        String line = s.nextLine();
        char[] x = arrayOfAlphabetLetters();
        String decipheredText = "";
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            if (Character.isLetter(c)) {
                for (int j = 0; j < x.length; j++) {
                    if (c == x[j]) {
                        int rank = j;
                        int ch = (rank * -1 + 26) - 1;
                        decipheredText += x[ch];
                    }
                }
            } else {
                decipheredText += " ";
            }
        }
        System.out.println(line + "has been deciphered using ATBASH to: " + decipheredText + "\n");
        System.out.println("**************************************************");
    }

    public static char[] arrayOfAlphabetLetters() {
        char x[] = new char[26];
        char z = 'A';
        for (int i = 0; i < x.length; i++) {
            x[i] = z;
            z++;
        }
        return x;
    }

    public static void Dec2Hex() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the text to be ciphered: ");
        String line = s.nextLine();
        String cipheredText = "";
        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);
            int number_ch = ch + 0;
            while (number_ch != 0) {
                int hexValue = number_ch % 16;
                char hexDigit = (0 <= hexValue && hexValue <= 9)
                        ? (char) (hexValue + '0') : (char) (hexValue - 10 + 'A');

                cipheredText = hexDigit + cipheredText + " ";
                number_ch = number_ch / 16;
            }
        }
        System.out.println(line + " has been ciphered using HEX to: " + cipheredText + "\n");
        System.out.println("**************************************************");
    }

}
