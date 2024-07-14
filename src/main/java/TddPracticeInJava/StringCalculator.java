package TddPracticeInJava;

public class StringCalculator
{
  public static int add(String inputStr) {
     if (checkInputEmpty(inputStr) || inputStr.equals("0")) {
        return 0;
    }
    String[] numbers = splitValues(inputStr);
    return summationOfNumbers(numbers);
  }

  //Splitted number array being passed and sumOfTwo to get the result
  private static int summationOfNumbers(String[] numbers){
      int sumOfTwo = 0;
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
         return splitInput.split(",");
      }else if(inputStr.contains(";")){
          splitInput= inputStr.replaceAll("[\\+\\.\\^\\\n\\;\\//:,]", ";");
          return splitInput.split(";");
      }
      return null;
  }
}

