package com.stayready;

import org.junit.Test;

import static org.junit.Assert.*;

public class PracticeProblem01Test {
    @Test
public void subpalindrometest1(){
        String given = "racecar";
        PracticeProblem01 practiceProblem01 = new PracticeProblem01();
        String result = practiceProblem01.subpalindrome(given);
        String expected = " r a c e c a r  is a palindrome: " + true;
        assertEquals(result,expected);
    }
    @Test
    public void subpalindrometest2(){
        String given = "racecar";
        PracticeProblem01 practiceProblem01 = new PracticeProblem01();
        String result = practiceProblem01.subpalindrome1(given);
        String expected = "r aceca r is a palindrome: " + true;
        assertEquals(result,expected);
    }

    @Test
    public void subpalindrometest3(){
        String given = "racecar";
        PracticeProblem01 practiceProblem01 = new PracticeProblem01();
        String result = practiceProblem01.subpalindrome2(given);
        String expected = "r a cec a r is a palindrome: " + true;
        assertEquals(result,expected);
    }
    @Test
public void ispalindrometestTrue(){
        String given = "racecar";
        PracticeProblem01 practiceProblem01 = new PracticeProblem01();
        Boolean result = practiceProblem01.ispalindrome(given);
        assertTrue(result);
}
@Test
public void ispalindrometestFalse(){
    String given = "notpalindrome";
    PracticeProblem01 practiceProblem01 = new PracticeProblem01();
        Boolean result = practiceProblem01.ispalindrome(given);
        assertFalse(result);
    }
}
