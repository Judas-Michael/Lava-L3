package week_3;

import junit.framework.TestCase;

import java.lang.reflect.Method;
import static test_utils.MethodUtil.*;

public class Question_1_MPGTest extends TestCase {

    public void testMPGCalculations() {

        // So this method doesn't exist when this test is being
        // written.
        //
        // Use reflection to find and call the new
        // mpg method that the student has written.

        Method mpg = findMethod("week_3.Question_1_MPG", "mpg", new Class[]{double.class, double.class});

        try {

            // Create a new object for our class
            Question_1_MPG q2 = new Question_1_MPG();

            // Call the discovered mgp method with some example arguments

            Object result = mpg.invoke(q2, 10, 4);

            // Returns the correct type?
            assertTrue("Make sure you return a double number from mpg method", result instanceof Double);

            // Convert the value to a double
            double resultDouble = (double) result;
            // Check if it is the expected values
            assertEquals(resultDouble, 2.5);

            // Check again, with some other example values
            result = mpg.invoke(q2, 300, 4.1);
            resultDouble = (double) result;
            assertEquals(resultDouble, 73.170731, 0.01);


        } catch (Exception e) {
            // Catch for method.invoke. Will fail if the wrong number of method arguments are given, or are not the correct types
            fail("Check that the mpg method takes two double arguments, the miles and gas used, in that order.");
        }

    }

    
}