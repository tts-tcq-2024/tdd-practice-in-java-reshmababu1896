
package TddPracticeInJava;

public class StringCalculator{

  public static int add(String str){

    if(isEmptyString(str)){
        return 0;
    }
   
    return -1;
  }

  protected static boolean isEmptyString(String str){
    if (str == null || str=="" || str=="0") {
        return true; // The string is empty
    }
    return false;
  }
  
}

