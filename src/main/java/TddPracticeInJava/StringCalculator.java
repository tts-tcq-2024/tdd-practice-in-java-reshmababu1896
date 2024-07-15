
package TddPracticeInJava;

import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.List;

public class StringCalculator{
   public static int totalSum = 0;
   public static  List<Integer> negatives;

    public static int add(String str) {
       negatives = new ArrayList<>();
        int result = -1;
        if (isEmptyString(str) || str == "0") {
            return 0;
        }
        result = splitAndAdd(str);
        return result;
    }

    protected static int splitAndAdd(String str) {
        String[] numbersArray =splitValues(str);
        return addNumbers(numbersArray);
    }

   protected static String[] splitValues(String str){
        String[] result=null;
        if(str.contains(",")){
            result= str.replaceAll("[\\+\\.\\^\\\n\\;\\//:,]", ",").split(",");

        }else if(str.contains(";")){
            result= str.replaceAll("[\\+\\.\\^\\\n\\;\\//:,]", ";").split(";");

        }
        return result;
    }


    protected static int addNumbers(String[] numbersArray) {
           totalSum=0;
       for (String num : numbersArray) {
            try {
                int number = Integer.parseInt(String.valueOf(num));
                totalSum = verifyNumber(number);
            } catch (NumberFormatException e) {
                continue;
            }
        }
       verifyNegatives();
        return totalSum;
    }
   protected static void verifyNegatives(){
      if(!negatives.isEmpty()){
          throw new IllegalArgumentException("Negatives not allowed");
       }
   }

    protected static int verifyNumber(int num) {
       if(num<0){
          negatives.add(num);
       }else if(num<=1000){
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

