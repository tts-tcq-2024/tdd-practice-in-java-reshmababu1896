
package TddPracticeInJava;

import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.List;

public class StringCalculator{
   public static int totalSum = 0;

    public static int add(String str) {
        int result = -1;
        if (isEmptyString(str) || str == "0") {
            return 0;
        }
        result = splitAndAdd(str);
        return result;
    }

    protected static int splitAndAdd(String str) {
//        String result = str.replaceAll("[\\-\\+\\.\\^\\\n\\;\\//:,]", ",");
//        String result = str.replaceAll("[^a-zA-Z0-9]", "");
        String[] numbersArray =splitValues(str);
        return addNumbers(numbersArray);
    }

   protected static String[] splitValues(String str){
        String result;
        if(str.contains(",")){
            result= str.replaceAll("[\\-\\+\\.\\^\\\n\\;\\//:,]", ",");
           return result.split(",");
        }else if(str.contains(";")){
            result= str.replaceAll("[\\-\\+\\.\\^\\\n\\;\\//:,]", ";");
            return result.split(";");
        }
        return null;
    }

    protected static int addNumbers(char[] numbersArray) {
        for (char num : numbersArray) {
            try {
                totalSum=0;
                int number = Integer.parseInt(String.valueOf(num));
                totalSum = verifyNumber(number);
            } catch (NumberFormatException e) {
                continue;
            }
        }
        return totalSum;
    }

    protected static int verifyNumber(int num) {
        if (num > 0 && num <= 1000) {
            totalSum += num;
        }
        return totalSum;
    }


    protected static boolean isEmptyString(String str) {
        if (str == null || str == "") {
            return true; // The string is empty
        }
        return false;
    }
  
}

