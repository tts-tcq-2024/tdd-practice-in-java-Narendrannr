package TddPracticeInJava;

public class StringCalculator
{
  public static int add(String inputStr) {
    if (inputStr == null || inputStr == "") {
        return 0;
    }
     if (inputStr.equals("0")) {
        return 0;
    }
    return -1;
  }
}

