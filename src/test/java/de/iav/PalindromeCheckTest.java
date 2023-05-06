package de.iav;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeCheckTest {
    @Test
    void checkPalindrome_whenStringIsWhiteSpace_thenReturnTrue(){
        //given
        String stringToCheck = " ";
        //when
        boolean isPalindrome = PalindromeCheck.isPalindrome(stringToCheck);
        //then
        assertTrue(isPalindrome);
    }

    @Test
    void checkPalindrome_whenStringIsNull_thenReturnTrue(){
        //given
        String stringToCheck = "";
        //when
        boolean isPalindrome = PalindromeCheck.isPalindrome(stringToCheck);
        //then
        assertTrue(isPalindrome);
    }

    @Test
    void checkPalindrome_whenStringIsAsingleLetter_thenReturnTrue() {
        //given
        String stringToCheck = "a";
        //when
        boolean isPalindrome = PalindromeCheck.isPalindrome(stringToCheck);
        //then
        assertTrue(isPalindrome);
    }

}