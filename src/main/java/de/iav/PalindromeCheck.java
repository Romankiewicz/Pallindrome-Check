package de.iav;

public class PalindromeCheck {
    public static boolean isPalindrome(String stringToCheck) {
        if (stringToCheck.matches(" ")) {
            return true;
        }else if (stringToCheck.matches("")){
            return true;
        }else {
            return false;
        }
    }
}
