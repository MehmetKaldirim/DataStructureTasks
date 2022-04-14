import java.util.*;
 
public class Main
{
    // This function returns
    // value of a Roman symbol
       int roman (char roman) {
       
       switch (roman) {
            case 'I' : return 1;

            case 'V' : return 5;

            case 'X' : return 10;

            case 'L' : return 50;

            case 'C' : return 100;

            case 'D' : return 500;

            case 'M' : return 100;

            default: return -1;
        }
        
    }    

    int romanConverter(String s){
        int result = 0;
        for(int i = 0; i <s.length; i++){
            num1 = s.length
        }
    }

    int romanToDecimal(String s)
    {

        int result = 0;
 
        for (int i = 0; i < s.length(); i++)
        {
    
            int s1 = roman(s.charAt(i));
 

            if (i + 1 < s.length())
            {
                int s2 = roman(s.charAt(i + 1));
 

                if (s1 >= s2)
                {

                    result = result + s1;
                }
                else
                {

                    result = result + s2 - s1;
                    i++;
                }
            }
            else
            {
                result = result + s1;
            }
        }
 
        return result;
    }
 

    public static void main(String args[])
    {
        Main ob = new Main();

        String str = "XLIV";
        System.out.println(
        "Integer form of Roman Numeral" +
        " is " + ob.romanToDecimal(str));
    }
}
