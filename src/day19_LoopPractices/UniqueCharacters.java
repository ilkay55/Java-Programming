package day19_LoopPractices;

import java.util.concurrent.LinkedBlockingDeque;

public class UniqueCharacters {
    public static void main(String[] args) {
        String str = "aabccdeef";
        String result = ""; //bdf
        //String res = "";
        /*for (int m = 0; m < str.length() ; m++) {
            char c = str.charAt(m);
            if(str.indexOf(c)==str.lastIndexOf(c)){
           res =""+ c;
                System.out.print(res);
            }
            // alternatif yöntem ama charat ilerleyen dönemde bazı metotlarda kullanmak mümkün değil


        }*/
        //System.out.println();

        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j); //'A'
            int count = 0; // represents the frequency of the ch

            for (int i = 0; i < str.length(); i++) { //compares the character that outer loop picked, with each character of the string,
                char each = str.charAt(i); // each character of str
                if(ch == each){
                    count++;
                }
            }

/*
            if(count == 1){ // if the frequency of the character is 1, then the character is unique
                result += ch;
            }
 */
            if(count != 1){
                continue;
            }

            result += ch;

        }


        System.out.println(result);




    }

}
/*
2. Write a program that can find the unique characters from a string without using indexOf() and lastIndexOf() methods
    			Ex:
                        str = "aabccdeef";
                        output:
                                bdf
 */

