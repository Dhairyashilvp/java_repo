import java.util.*;
class palindrome
{
    public static void main(String args[])
    {
        String inputString;
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Input a string : ");
        inputString = sc.nextLine();
        palindrome p = new palindrome();
        p.palindrome_with_reverse(inputString);
        p.panindrome_without_reverse(inputString);
    }
    public void palindrome_with_reverse(String word)
    {
        String oppword = "";
        System.out.println("***********MySpace Java program palindrome with reverse************");
        Scanner sc = new Scanner(System.in);
        word = sc.nextLine();
        int n = word.length();
        for(int i = n - 1; i>=0 ; i--)
        {
            oppword = oppword + word.charAt(i);
        }
        if(word.equals(oppword))
        {
            System.out.println("palindrome word will be : " + oppword );
        }
        else
        {
            System.out.println("Not a palindrome So sad :(");
        }
    }
    public void panindrome_without_reverse(String inputString)
    {
        int length  = inputString.length();
        int i, begin, end, middle;
        System.out.println("***********MySpace Java program palindrome without reverse************");

        begin  = 0;
        end    = length - 1;
        middle = (begin + end)/2;
    
        for (i = begin; i <= middle; i++) 
        {
            if (inputString.charAt(begin) == inputString.charAt(end)) 
            {
                begin++;
                end--;
            }
            else 
            {
                break;
            }
        }
        if (i == middle + 1) 
        {
            System.out.println("palindrome word will be : " + inputString);
        }
        else 
        {
            System.out.println("Not a palindrome");
        }  
    }
}