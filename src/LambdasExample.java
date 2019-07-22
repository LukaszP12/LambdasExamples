import java.util.Comparator;

public class LambdasExample  {

    public static void main(String[] args){
        MyFunction myFunction = (text1, text2) -> {
           System.out.println(text1 + " " + text2);
           return text1 + " + " + text2;
        };

        String returnValue = myFunction.apply("Hello Function Body", "Test");
        System.out.println(returnValue);
    }

}