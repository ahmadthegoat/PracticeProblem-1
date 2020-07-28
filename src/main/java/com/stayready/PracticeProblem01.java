package com.stayready;

public class PracticeProblem01 {
    public Boolean ispalindrome(String word){
        StringBuilder reversal = new StringBuilder(word).reverse();
        String reversedstring = reversal.toString();
        if(reversedstring.equals(word)){
            return true;
        }
        else{
            return false;
        }
    }
    public String subpalindrome(String word){
        Boolean stop = ispalindrome(word);
        if(stop.equals(false)){
            return "NOT A PALINDROME!";
        }
        else{
            String [] splitstring = word.split("");

        String result = " ";
        for(String letter: splitstring){
            result += letter+ " ";
        }
        Boolean ispalindrome = ispalindrome(result);
        return result + " is a palindrome: "+ ispalindrome;
    }}

    public String subpalindrome1(String word){
        Boolean stop = ispalindrome(word);
        if(stop.equals(false)){
            return "NOT A PALINDROME!";
        }
        else{String [] splitstring = word.split("");
        StringBuilder middlestring = new StringBuilder();
        String result1 = "";
        result1 += splitstring[0] + " " + word.substring(1,word.length()-1) +" " + splitstring[splitstring.length-1];
        Boolean ispalindrome = ispalindrome(result1);
        return result1 + " is a palindrome: "+ ispalindrome;
    }}
    public String subpalindrome2(String word){
        Boolean stop = ispalindrome(word);
        if(stop.equals(false)){
            return "NOT A PALINDROME!";
        }
        else{String [] splitstring = word.split("");
        StringBuilder middlestring = new StringBuilder();
        String result1 = "";
        result1 += splitstring[0] + " " +  splitstring[1] + " "+ word.substring(2,word.length()-2) +" "+ splitstring[splitstring.length-2]+ " " + splitstring[splitstring.length-1];
        Boolean ispalindrome = ispalindrome(result1);
        return result1 + " is a palindrome: "+ ispalindrome;
    }}
}
