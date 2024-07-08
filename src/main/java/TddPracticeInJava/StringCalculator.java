
package TddPracticeInJava;

public class StringCalculator{

  public static int add(String str){

    if(isEmptyString(str)){
        return 0;
    }
   
    return -1;
  }

  protected static boolean isEmptyString(Stirng str){
    if (str == null || str=="") {
        return true; // The string is empty
    }
    return false;
  }
  
}

