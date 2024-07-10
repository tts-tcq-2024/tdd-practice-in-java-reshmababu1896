
package TddPracticeInJava;

public class StringCalculator{

  public static int add(String str){
    int result=-1;

    if(isEmptyString(str)|| str=="0"){
        return 0;
    }

    result=splitAndAddTheNumbers(str);
   
    return result;
  }

  protected static int splitAndAddTheNumbers(str){
        String delimiter = ",";
        String numbersInput = numbersStr;

        // Check for custom delimiter
        if (numbersInput.startsWith("//")) {
            int delimiterEnd = numbersInput.indexOf("\n");
            delimiter = numbersInput.substring(2, delimiterEnd);
            numbersInput = numbersInput.substring(delimiterEnd + 1);
        }

        // Replace new lines with delimiter
        numbersInput = numbersInput.replace("\n", delimiter);

        // Split string by delimiter
        String[] numbersArray = numbersInput.split(Pattern.quote(delimiter));
        List<Integer> negatives = new ArrayList<>();
        int totalSum = 0;

        // Sum numbers and handle negatives
        for (String numberStr : numbersArray) {
            int num = Integer.parseInt(numberStr);
            if (num < 0) {
                negatives.add(num);
            } else if (num <= 1000) {
                totalSum += num;
            }
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

