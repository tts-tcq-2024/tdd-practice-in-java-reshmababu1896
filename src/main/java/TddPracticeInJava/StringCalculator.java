
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
         String[] numbersArray = str.split("[,[]//;\n\\W*]+");
    return addNumbers(numbersArray);
  }

protected static int  addNumbers(String[] numbersArray){
      for (String num : numbersArray) {
          int number = Integer.parseInt(num);
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

