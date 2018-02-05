package week_3;

import com.sun.deploy.util.StringUtils;
import input.InputUtils;

/**
 *
 Write a method called stringToIntArray which takes a number represented as a
 String as an argument, for example "12345" or "4321432143214321" ;
 and returns the digits of that number in an array.
 
 Your method should create an int[] array with one digit of your number per
 element, and return this array.
 
 If any of the characters in the string are not numbers, return null.
 
 
 So, if the user enters
 
 "12345"
 
 then your method should return this array :
 
 { 1, 2, 3, 4, 5 }
 
 
 if the user enters
 
 "abc"
 
 then your method should return null.
 
 
 if the user enters
 
 "123b456"
 
 then your method should return null, because of the 'b' character.
 
 If the user enters an empty string, your method should return null.
 
 If the method is called with a null String, your method should return null.
 
 You'll need to look up some Java library methods. You may need some methods from
 some or all of these library classes: String, Character, Integer.
 
 COMMENT YOUR CODE. As well as the tests, I'm also going to read your comments
 to verify that you understand the code you've written.
 
 */



public class Question_5_String_To_Int_Array {

    public static void main(String[] args) {
        new Question_5_String_To_Int_Array().stringsToArrays();
    }

    private void stringsToArrays() {

        boolean isInt = false; //creates boolean to determine stuff later
        String getString = " "; //creates empty string so that it can be altered and returned from while loop

        while (isInt == false) { //continues loop until string is not null

            getString = InputUtils.stringInput("Please enter a string: ");

            try {
                Integer.parseInt(getString);

                isInt = true; //returns true when this is able to happen
            } catch (NumberFormatException ex) { //exception catcher
                System.out.println("That is invalid. Use integers only please.");
                isInt = false;
            }
        } int[] newIntArray = stringToIntArray(getString);
        for(int i = 0;i < newIntArray.length;i++){

            System.out.println(newIntArray[i]);}

    }


    public int[] stringToIntArray(String string){

        //char[] newCharArray = string.toCharArray(); //makes the string into a character array

        String[] newCharArray = string.split(""); //makes string into string array divided individually

        int[] results = new int[newCharArray.length]; //create a new int array the same length as the character array

        for(int i = 0;i < newCharArray.length;i++){

            try {
                Integer.parseInt(string);}
            catch (NumberFormatException ex) { //exception catcher
                System.out.println("That is invalid. Use integers only please.");
                return null;
            }
                results[i] = Integer.parseInt(newCharArray[i]);}

        return results;
    }


    // If the String is null, return null. Hint: test if the string is null before trying to call any other methods on it.
    // A statement like
    //    return null;
    // Returns a null value.
    
}
