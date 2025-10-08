package org.ejercicio2;

public class IdCalculation {
    // Array with letters corresponding to DNI numbers
    private static final char[] LETTERS = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

    // Method that calculates the DNI letter based on the number
    public static char calculateLetter(int numberId) {
        if (numberId < 0 && numberId > 99999999) {
            throw new IllegalArgumentException("The number of ID cannot be negative or superior to 8 digit");
        }
            int index = numberId % 23; // remainder after dividing by 23
            return LETTERS[index];    // return the corresponding letter
        }
    }


