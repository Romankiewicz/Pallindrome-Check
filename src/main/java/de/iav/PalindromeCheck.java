package de.iav;

public class PalindromeCheck {
    public static boolean isPalindrome(String stringToCheck) {

        if (stringToCheck == " ") {
            return true;
        }
        int stringLength = stringToCheck.length();
        for (int i = 0; i < stringLength; i++) {
            if ((Character.isLetter(stringToCheck.charAt(i)) == true)) {
                return true;
            }
        }
        char[] firstLetter;
        char[] lastLetter;

        firstLetter = new char[]{stringToCheck.charAt(0)};
        lastLetter = new char[]{stringToCheck.charAt(stringLength)};
        if(firstLetter == lastLetter) {
            return true;
        }
        return false;
    }
}
