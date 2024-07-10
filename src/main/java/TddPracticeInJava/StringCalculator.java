
package TddPracticeInJava;

public class StringCalculator{

  public static int add(String str){

    if(isEmptyString(str)|| str=="0"){
        return 0;
    }

    
   
    return -1;
  }

  protected static int splitAndAddTheNumbers(str){
  }

  protected static boolean isEmptyString(String str){
    if (str == null || str=="" ) {
        return true; // The string is empty
    }
    return false;
  }
  
}

