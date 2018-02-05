package week_3;

import input.InputUtils;

/**
 *
 *
 *

 Write a program that can help decide if a particular programming project
 is best solved using a Waterfall or Agile methodology.

 Your program should ask the user:

 •	How many programmers will be on the team   [ More than 30 programmers -> Waterfall ]
 •	If there needs to be firm deadlines and a fixed schedule  [ Yes - > Waterfall ]
 •	If the programmers have experience in requirements, analysis and testing as well as coding [ Yes - > Agile ]
 •	If there are stringent quality control requirements   [ Yes -> Waterfall ]
 •	If early integration is desirable   [ Yes -> Agile ]
 •	If the customer will be requiring working models early in the process  [ Yes -> Agile ]
 
 There's a yesNoInput method in the InputUtils library that returns boolean values from user input.
 
 
 Write a method called agileOrWaterfall,
 which takes this data as integer and boolean arguments.
 **The arguments should be provided in the order given above**.
 `agileOrWaterfall` will return a String, a suggestion on whether Agile, or Waterfall, or either, may be is best.
 
 Notice that there are three global constants AGILE, WATERFALL and EITHER.
 Your agileOrWaterfall method should return one of these Strings.
 
 Use your agileOrWaterfall method in your program to suggest which methodology to use.

 Your main method should do the task of asking questions and printing the result.
 Your agileOrWaterfall method should be given the relevant data, and do the processing,
 deciding, and returning the result.

 */
public class Question_3_Agile_Or_Waterfall {

    public String AGILE = "Agile";
    public String WATERFALL = "Waterfall";
    public String EITHER = "Either";


    public static void main(String[] args) {
        new Question_3_Agile_Or_Waterfall().methodology();
    }

    public void methodology() {

        int numberOfProgrammers = InputUtils.intInput("How many programmers do you need?");
        boolean setSchedule = InputUtils.yesNoInput("Will you need a set schedule?");
        boolean experiance = InputUtils.yesNoInput("Do the programmers have experiance in requirements, analysis, and testing?");
        boolean qualityControl = InputUtils.yesNoInput("Do you have quality control requirements?");
        boolean earlyIntegration = InputUtils.yesNoInput("Do you need early integration?");
        boolean earlyModels = InputUtils.yesNoInput("Do you need early models of the project");

        String suggestion =  agileOrWaterfall(numberOfProgrammers, setSchedule, experiance, qualityControl, earlyIntegration, earlyModels);

        // TODO Use the suggestion agileOrWaterfall returns to print a message for the user.

    }

    public String agileOrWaterfall(int numOfProg, boolean setSchedule, boolean experiance, boolean qualityControl, boolean earlyIntegration, boolean earlyModels){
        String suggestion = "";

        double agilePoints = 0;
        double waterfallPoints = 0;
// Look into ways to make this less clunky? I want to test all properties individually to amass a point system, but there's probably less lines involved
        if (numOfProg > 30){
            waterfallPoints +=1;
        } else{
            agilePoints +=1;
        }if (setSchedule == true){
            waterfallPoints +=1;
        } else{
            agilePoints +=1;
        }if (experiance == true){
            agilePoints +=1;
        } else{
            waterfallPoints +=1;
        }if (qualityControl == true){
            waterfallPoints +=1;
        } else{
            agilePoints +=1;
        }if (earlyIntegration == true){
            agilePoints +=1;
        } else{
            waterfallPoints +=1;
        }if (earlyModels == true){
            agilePoints +=1;
        } else{
            waterfallPoints +=1;
        }if (waterfallPoints > agilePoints){
            suggestion = WATERFALL; //returns suggestion based on points system
        }else if (agilePoints > waterfallPoints){
            suggestion = AGILE;
        } else {
            suggestion = EITHER;
        }
        return suggestion;
    }


}
