package TddPracticeInJava;

public class StringCalculator
{
  public static int add(String inputStr) {
    int sumOfTwo = 0;
     if (checkInputEmpty(inputStr) || inputStr.equals("0")) {
        return 0;
    }
    String[] numbers = splitValues(inputStr);
    sumOfTwo = summationOfNumbers(numbers, sumOfTwo);
    return sumOfTwo;
  }

  //Splitted number array being passed and sumOfTwo to get the result
  private static int summationOfNumbers(String[] numbers, int sumOfTwo){
      for (String number : numbers) {
       try {
              sumOfTwo += Integer.parseInt(number.trim());
          } catch (NumberFormatException e) {
              throw new IllegalArgumentException("Input string contains non-numeric characters.");
          }
    }
    return sumOfTwo;
  }

  //null check
  private static boolean checkInputEmpty(String inputStr){
    return inputStr == null || inputStr.isEmpty();
  }

   private static String[] splitValues(String inputStr){
      String splitInput;
      if(inputStr.contains(",")){
          splitInput= inputStr.replaceAll("[\\+\\.\\^\\\n\\;\\//:,]", ",");
         return result.split(",");
      }else if(inputStr.contains(";")){
          splitInput= inputStr.replaceAll("[\\+\\.\\^\\\n\\;\\//:,]", ";");
          return splitInput.split(";");
      }
      return null;
  }
}

