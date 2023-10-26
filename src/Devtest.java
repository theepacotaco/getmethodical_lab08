import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author wulft
 */
public class Devtest
{


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String SSN = "";

        SSN = getRegExString(in, "Enter your SSN", "\\d{3}-\\d{2}-\\d{4}");
    }
    public static String getRegExString(Scanner pipe, String prompt, String regExPattern)
    {
        String value = "";
        boolean gotAValue = false;

        do
        {
            // show the prompt
            System.out.print(prompt + ": ");
            // input the data
            value = pipe.nextLine();
            // test to see if it is correct
            if(value.matches(regExPattern))
            {
                // We have a match this String passes!
                gotAValue = true;
            }
            else
            {
                System.out.println("\nInvalid input: " + value);
            }

        }while(!gotAValue);

        return value;
    }

}
