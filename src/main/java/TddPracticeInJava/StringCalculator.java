
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
         String[] parts = inputString.split("[,[]//;\n\\W*]+");
  }

protected static int  addNumbers(String[] numbersArray){
      for (String part : parts) {
          int number = Integer.parseInt(part);
          totalSum=verifyNumber(number);
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

