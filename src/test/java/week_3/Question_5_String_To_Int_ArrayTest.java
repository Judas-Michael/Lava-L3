package week_3;

import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.ParseException;

import static org.junit.Assert.*;
import static test_utils.MethodUtil.findMethod;

public class Question_5_String_To_Int_ArrayTest {
    
    @Test
    public void testStringToIntArray() {
        
        testForInput("7", new int[]{7});
        testForInput("12345", new int[]{1, 2, 3, 4, 5});
        testForInput("467468463453", new int[]{4,6,7,4,6,8,4,6,3,4,5,3});
        
        // Some or all non-numeric characters
        testForInput("!@#$%^&#%%$", null);
        testForInput("pizza", null);
        testForInput("098765g6543", null);
        testForInput("a1234567", null);
        
        // Empty String
        testForInput("", null);
        
        // Null String
        testForInput(null, null);
        
    }
    
    
    private void testForInput(String input, int[] expectedOut) {
        
        Method method = findMethod("week_3.Question_5_String_To_Int_Array", "stringToIntArray", new Class[]{String.class});
        
        Question_5_String_To_Int_Array q5 = new Question_5_String_To_Int_Array();
        
        try {
            int[] arr = (int[]) method.invoke(q5, input);
            assertArrayEquals("Your stringToIntArray method, called with the String  should return the array [1, 2, 3, 4, 5]", expectedOut, arr);
            
        } catch (InvocationTargetException ie) {
            String message = "When called with the String " + input + " your method threw a " + ie.getTargetException().getClass().toString() + ", " + ie.getTargetException().getMessage();
            fail(message);
            
        } catch (Exception e) {
            fail(e.getMessage());
        }
        
    }
    
    
}