package TddPracticeInJava;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator
{
  public static int add(String inputStr) {
     if (checkInputEmpty(inputStr) || inputStr.equals("0")) {
        return 0;
    }
    String[] delimiterAndNumbers = handleCustomDelimiter(inputStr);
    String delimiter = delimiterAndNumbers[0];
    String numbers = delimiterAndNumbers[1];
    
   return summationOfNumbers(splitValues(numbers, delimiter));
  }

 private static String[] handleCustomDelimiter(String inputStr) {
    Matcher matcher = Pattern.compile("//(.)\n(.*)").matcher(inputStr);
    if (matcher.matches()) {
        String delimiter = Pattern.quote(matcher.group(1));
        String numbers = matcher.group(2);
        return new String[]{delimiter, numbers};
    }
    return new String[]{",|\n", inputStr}; 
  }

  //Splitted number array being passed and sumOfTwo to get the result
  private static int summationOfNumbers(String[] numbers){
      int sumOfTwo = 0;
      for (String number : numbers) {
        sumOfTwo  += parseAndValidateNumber(number);
    }
    return sumOfTwo;
  }


  private static int parseAndValidateNumber(String number) {
      try {
          int num = Integer.parseInt(number.trim());
          if (num > 1000) {
              return 0;
          }
          return num;
      } catch (NumberFormatException e) {
          throw new IllegalArgumentException("Input string contains non-numeric characters.");
      }
  }

  //null check
  private static boolean checkInputEmpty(String inputStr){
    return inputStr == null || inputStr.isEmpty();
  }

   private static String[] splitValues(String inputStr, String delimiter){
     return inputStr.split(delimiter);
  }
}

