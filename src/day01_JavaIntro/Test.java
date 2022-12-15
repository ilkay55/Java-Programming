package day01_JavaIntro;


import day24_CustomMethods_Return.ReturnMethodIntro;
import day24_CustomMethods_Return.ReturnMethodPractice4;

public class Test {

    public static void main(String[] args) {

        String str = "Wooden Spoon";

        ReturnMethodPractice4.removeDuplicates(str);
        System.out.println(str);

        String name= "Java Programming";

        String reversedName= ReturnMethodIntro.reverse(name);
        System.out.println(reversedName);
    }
}