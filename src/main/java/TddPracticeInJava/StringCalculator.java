package TddPracticeInJava;

public class StringCalculator
{
  public static int add(String inputStr) {
    int sumOfTwo = -1;
     if (checkInputEmpty(inputStr) || inputStr.equals("0")) {
        return 0;
    }
    String[] numbers = inputStr.split(",");
    for (String number : numbers) {
        sumOfTwo += Integer.parseInt(number.trim());
    }
    return sumOfTwo;
  }

  private static boolean checkInputEmpty(String inputStr){
    if (inputStr == null || inputStr == "") {
        return true;
    }
    return false;
  }
}

