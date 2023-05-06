package de.iav;

public class PalindromeCheck {
    public static boolean isPalindrome(String stringToCheck) {
/*        if (stringToCheck.matches(" ")) {
            return true;
        }else if (stringToCheck.matches("")){
            return true;
        }else {
            return false;
        }
    }*/
        if (stringToCheck == " ") {
            return true;
        }
        int stringLength = stringToCheck.length();
        for (int i = 0; i < stringLength; i++) {
            if ((Character.isLetter(stringToCheck.charAt(i)) == true)) {
                return true;
            }
        }
        return false;
    }
}
