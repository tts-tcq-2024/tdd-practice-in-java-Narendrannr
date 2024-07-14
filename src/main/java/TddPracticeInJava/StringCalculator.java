package TddPracticeInJava;

public class StringCalculator
{
  public static int add(String inputStr) {
    int sumOfTwo = -1;
     if (checkInputEmpty(inputStr) || inputStr.equals("0")) {
        return 0;
    }
    String[] numbers = inputStr.split(",");
    sumOfTwo = sumationOfNumbers(numbers, sumOfTwo);
    return sumOfTwo;
  }

  //Splitted number array being passed and sumOfTwo to get the result
  private sumationOfNumbers(String[] numbers, int sumOfTwo){
      for (String number : numbers) {
        sumOfTwo += Integer.parseInt(number.trim());
    }
    return sumOfTwo;
  }

  //null check
  private static boolean checkInputEmpty(String inputStr){
    return inputStr == null || inputStr.isEmpty();
  }
}

