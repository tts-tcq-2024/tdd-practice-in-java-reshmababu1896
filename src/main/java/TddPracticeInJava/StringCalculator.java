
package TddPracticeInJava;

import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.List;

public class StringCalculator{
  public static int totalSum=0;

  public static int add(String str){
      int result=-1;
      if(isEmptyString(str) || str=="0"){
          return 0;
      }
      result=splitAndAdd(str);
      return result;
    }

  protected static int splitAndAdd(String str){
        String delimiter = ",";
        String numbersInput = str;
        if (numbersInput.startsWith("//")) {
            int delimiterEnd = numbersInput.indexOf("\n");
            delimiter = numbersInput.substring(2, delimiterEnd);
            numbersInput = numbersInput.substring(delimiterEnd + 1);
        }
        numbersInput = numbersInput.replace("\n", delimiter);

        String[] numbersArray = numbersInput.split(Pattern.quote(delimiter));
        totalSum=addNumbers(numbersArray); 
    return totalSum;
  }

protected static int  addNumbers(String[] numbersArray){
   
        for (String numberStr : numbersArray) {
            int num = Integer.parseInt(numberStr);
           totalSum=verifyNumber(num);
        }
  return totalSum;
  }
  
protected static int verifyNumber(int num){
    if (num >0  && num <= 1000) {
                totalSum += num;
       }
  return totalSum;
  }
  

  protected static boolean isEmptyString(String str){
    if (str == null || str=="" ) {
        return true; // The string is empty
    }
    return false;
  }
  
}

