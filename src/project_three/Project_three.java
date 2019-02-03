package project_three;

import java.util.Scanner;

public class Project_three {

    public static void main(String[] args) {

        System.out.println("==================SECURITY SERVICES==================\n");
        String[] records = new String[6];
        servicesMenu(records);
    }

    public static void servicesMenu(String[] records) {
        Scanner s = new Scanner(System.in);
        System.out.println("Services Menu");
        System.out.println("1 - Ciphering Text");
        System.out.println("2 - Deciphering Text");
        System.out.println("3 - Records");
        System.out.println("0 - EXIT\n");
        System.out.print("Please enter the number of the service needed: ");
        int nunberOfServiceMenu = s.nextInt();
        switch (nunberOfServiceMenu) {
            case 1:
                System.out.println();
                System.out.println("**************************************************");
                tchniquesMenu(nunberOfServiceMenu, records);
                break;
            case 2:
                System.out.println();
                System.out.println("**************************************************");
                tchniquesMenu(nunberOfServiceMenu, records);
                break;
            case 3:
                System.out.println();
                System.out.println("==================SERVICES COMPLETED==================");
                records(records);
                servicesMenu(records);
                break;
            case 0:
                System.out.println("-----------------End of Services-----------------\n");
                System.exit(0);
            default:
                System.out.println("Invalid Input!");
                System.out.println("--------------------------------------------------\n");
                servicesMenu(records);
        }
    }

    public static void tchniquesMenu(int nunberOfServiceMenu, String[] records) {
        Scanner s = new Scanner(System.in);
        System.out.println("Techniques Menu");
        System.out.println("1 - ATBASH");
        System.out.println("2 - HEX");
        System.out.println("3 - VIGENERE");
        System.out.println("0 - Return to Main Menu\n");
        System.out.print("Please enter the number of the service needed: ");
        int nunberOfTchniquesMenu = s.nextInt();
        System.out.println();
        switch (nunberOfTchniquesMenu) {
            case 1:
                System.out.println("**************************************************");
                ATABASH(nunberOfServiceMenu, records);
                servicesMenu(records);
                break;
            case 2:
                System.out.println("**************************************************");
                if (nunberOfServiceMenu == 1) {
                    cipheringHex(records);
                    servicesMenu(records);
                } else {
                    decipheringHex(records);
                    servicesMenu(records);
                }
                break;
            case 3:
                System.out.println("**************************************************");
                VIGENERE(nunberOfServiceMenu,records);
                servicesMenu(records);
                break;
            case 0:
                servicesMenu(records);
                break;
            default:
                System.out.println("**************************************************");
                System.out.println("Invalid Input!\n");
                System.out.println("**************************************************\n");
                servicesMenu(records);
                break;
        }
    }

    public static void records(String[] records) {
        for (int i = 0; i < records.length; i++) {
            if (records[i] != null) {
                System.out.print(i+1 + ". " + records[i] + " ");
            }
            System.out.println();
        }
        System.out.println("======================================================");
    }

    public static int indexOfEmptyPlace(String[] x) {
        int index = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] == null) {
                index = i;
                break;
            }
        }
        return index;
    }

    public static void ATABASH(int n, String[] records) {
        Scanner s = new Scanner(System.in);
        int index = indexOfEmptyPlace(records);
        records[index] = "";
        if (n == 1) {
            System.out.print("Enter the text to be ciphered: ");
        } else {
            System.out.print("Enter the text to be deciphered: ");
        }
        String line = s.nextLine();
        char[] x = arrayOfAlphabetLetters();
        String cipheredText = "";
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            if (Character.isLetter(c)) {
                int rank = rankOfLetter(c);
                int ch = (rank * -1) + 26;
                cipheredText += x[ch];
            } else {
                cipheredText += " ";
            }
        }
        if (n == 1) {
            System.out.println(line + " has been ciphered using ATBASH to: " + cipheredText + "\n");
            records[index] += line + " has been ciphered using ATBASH to: " + cipheredText;

            System.out.println("**************************************************");
        } else {
            System.out.println(line + " has been deciphered using ATBASH to: " + cipheredText + "\n");
            records[index] += line + " has been deciphered using ATBASH to: " + cipheredText;
            System.out.println("**************************************************");
        }
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

    public static void cipheringHex(String[] records) {
        Scanner s = new Scanner(System.in);
        int index = indexOfEmptyPlace(records);
        records[index] = "";
        System.out.print("Enter the text to be ciphered: ");
        String line = s.nextLine();
        String cipheredText = "";
        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);
            int numOfChar = ch;
            cipheredText += dec2Hex(numOfChar) + " ";
        }
        System.out.println(line + " has been ciphered using HEX to: " + cipheredText + "\n");
        records[index] += line + " has been ciphered using HEX to: " + cipheredText;
        System.out.println("**************************************************");
    }

    public static String dec2Hex(int number) {
        if (number < 16) {
            return getHexFormat(number);
        } else {
            return dec2Hex(number / 16) + getHexFormat(number % 16);
        }
    }

    public static String getHexFormat(int number) {
        if (number > 9 && number < 16) {
            return (char) (number - 10 + 'a') + "";
        } else if (number >= 0) {
            return number + "";
        } else {
            return "Invalid";
        }
    }

    public static void decipheringHex(String[] records) {
        Scanner s = new Scanner(System.in);
        int index = indexOfEmptyPlace(records);
        records[index] = "";
        System.out.print("Enter the text to be deciphered: ");
        String line = s.nextLine();
        String cipheredText = "";
        Scanner s1 = new Scanner(line);
        while (s1.hasNext()) {
            int decNumber = 0;
            String letter = s1.next();
            for (int i = 0; i < letter.length(); i++) {
                switch (i) {
                    case 0:
                        if (Character.isDigit(letter.charAt(0))) {
                            int n = Integer.parseInt(letter.charAt(0) + "");
                            n = n * 16;
                            decNumber += n;
                        } else {
                            int n = getDecFormat(letter.charAt(0));
                            n = n * 16;
                            decNumber += n;
                        }
                        break;
                    case 1:
                        if (Character.isDigit(letter.charAt(1))) {
                            int n = Integer.parseInt(letter.charAt(1) + "");
                            decNumber += n;
                        } else {
                            int n = getDecFormat(letter.charAt(1));
                            decNumber += n;
                        }
                        break;
                }
            }
            cipheredText += (char) decNumber + "";
            decNumber = 0;
        }
        System.out.println(line + " has been deciphered using HEX to: " + cipheredText + "\n");
        records[index] += line + " has been deciphered using HEX to: " + cipheredText;
        System.out.println("**************************************************");
    }

    public static int getDecFormat(char letter) {
        return (int) (letter - 'a' + 10);
    }

    public static void VIGENERE(int n, String [] records) {
        Scanner s = new Scanner(System.in);
        int index = indexOfEmptyPlace(records);
        records[index] = "";
        if (n == 1) {
            System.out.print("Enter the text to be ciphered: ");
        } else {
            System.out.print("Enter the text to be deciphered: ");
        }
        String line = s.nextLine();
        String keyWord = lineOfKeyWord(line, "SECRET");
        String cipheredText = "";
        for (int i = 0; i < line.length(); i++) {
            char c1 = line.charAt(i);
            if (Character.isLetter(c1)) {
                char c2 = keyWord.charAt(i);
                int rank_c1 = rankOfLetter(c1);
                int rank_c2 = rankOfLetter(c2);
                if (n == 1) {
                    int rank_c3 = (rank_c1 + rank_c2) % 26;
                    char c3 = letterOfRank(rank_c3 - 1);
                    cipheredText += c3;
                } else {
                    int rank_c3 = rank_c1 - rank_c2;
                    if (rank_c3 < 0) {
                        rank_c3 += 26;
                    }
                    char c3 = letterOfRank(rank_c3 + 1);
                    cipheredText += c3;
                }
            } else {
                cipheredText += " ";
            }
        }
        if (n == 1) {
            System.out.println(line + " has been ciphered using VIGENERE to: " + cipheredText + "\n");
            records[index] += line + " has been ciphered using VIGENERE to: " + cipheredText;

            System.out.println("**************************************************");
        } else {
            System.out.println(line + " has been deciphered using VIGENERE to: " + cipheredText + "\n");
            records[index] += line + " has been deciphered using VIGENERE to: " + cipheredText;
            System.out.println("**************************************************");
        }
    }

    public static int rankOfLetter(char ch) {
        char[] x = arrayOfAlphabetLetters();
        int rank = 0;
        for (int i = 0; i < x.length; i++) {
            if (ch == x[i]) {
                rank = i + 1;
            }
        }
        return rank;
    }

    public static char letterOfRank(int rank) {
        char[] x = arrayOfAlphabetLetters();
        char ch = 'a';
        for (int i = 0; i < x.length; i++) {
            if (rank == i + 1) {
                ch = x[i];
            }
        }
        return ch;
    }

    public static String lineOfKeyWord(String line, String keyWord) {
        String result = "";
        String newLine = line.replace(" ", "");
        String newKey = keyWord;
        while (newLine.length() > newKey.length()) {
            newKey += keyWord;
        }
        Scanner s = new Scanner(line);
        while (s.hasNext()) {
            String word = s.next();
            int index = word.length();
            result = result + newKey.substring(0, index) + " ";
            newKey = newKey.substring(index);
        }
        return result;
    }
}
