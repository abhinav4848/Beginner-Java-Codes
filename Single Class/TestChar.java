//Program to input a character & to print whether the char is alphabet, no., or any other character.
public class TestChar
    {
        public static void test(char ch)
        {
            if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z'))
                System.out.println("You Entered an Alphabet.");
            else if(ch>='0' && ch<='9')
                System.out.println("You Entered a digit.");
            else
                System.out.println("You Entered some damned symbol.");
        }
    }