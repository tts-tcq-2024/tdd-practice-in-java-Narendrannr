package TddPracticeInJava;

public class StringCalculator
{
  public static int add(String inputStr) {
    int sumOfTwo = -1;
     if (checkInputEmpty(inputStr) || inputStr.equals("0")) {
        return 0;
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

