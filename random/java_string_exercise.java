import java.util.*;/* import java.util.Scanner; ,import java.util.Calendar; */
import java.io.*;
class java_string_exercise
{
    public static void main( String []args )
    {
        String str,str2;
        int index;
        Scanner sc = new Scanner(System.in);
        java_string_exercise jse = new java_string_exercise();
        System.out.print("Enter the string : ");
        str = sc.nextLine();
        
        System.out.println("what would you like to do ?");
        System.out.println("1 get character at the given index \n2 get character unicode point at the given index \n3 Compare two strings Lexicographically \n4 Concatenate String \n5 Check for specified sequence of char \n6 create new String with given character array \n7 Check if the string ends with given string \n8 Check if given string is exactly same \n9 print current date and time ");
        System.out.print("Your #No. of choice :");
        int ch = sc.nextInt();
        switch(ch)
        {
            case 1 : 
                System.out.print("Enter the Index: ");
                index = sc.nextInt();
                str  = jse.get_character_at_the_given_index(str,index);
                System.out.println(str);
            break;
            case 2 : 
                System.out.print("Enter the Index: ");
                index = sc.nextInt();
                str  = jse.get_character_unicode_point_at_the_given_index(str,index);
                System.out.println(str);
            break;
            case 3 : 
                System.out.print("Enter the second string: ");
                sc.nextLine();
                str2 = sc.nextLine();
                str  = jse.compare_two_strings_lexicographically(str,str2);
                System.out.println(str);
            break;
            case 4 : 
                System.out.print("Enter the second string: ");
                sc.nextLine();
                str2 = sc.nextLine();
                str  = jse.concatenate_string(str,str2);
                System.out.println(str);
            break;
            case 5 : 
                System.out.print("Enter Special sequance to check: ");
                sc.nextLine();
                str2 = sc.nextLine();
                if(jse.test_for_specified_sequence_of_char(str,str2))
                System.out.println("The given string Comprise of given charset.");
                else
                System.out.println("The given string dose not Comprise of given charset.");               
            break;
            case 6 : 
                System.out.print("Enter 10 space separated characters: ");
                sc.nextLine();
                str2 = sc.nextLine();
                char[] char_arr = str2.toCharArray();
                System.out.print("Enter offset : ");
                
                int offset = sc.nextInt();
                System.out.print("Enter Count : ");
                sc.nextLine();
                int count = sc.nextInt();
                str = jse.create_string_with_given_character_array(char_arr, offset, count);
                System.out.println(str);              
            break;
            case 7 : 
                System.out.print("Enter second string: ");
                sc.nextLine();
                str2 = sc.nextLine();
                if(jse.check_if_string_ends_with_another_string(str,str2))
                System.out.println("The given string ends with given string.");
                else
                System.out.println("The given string dose not ends with given string.");               
            break;
            case 8 : 
                System.out.print("Enter second string: ");
                sc.nextLine();
                str2 = sc.nextLine();
                System.out.println(jse.check_if_two_String_are_same(str,str2) ? "The given string is same as given string." : "The given string is not same as given string.");           
            break;
            case 9 : 
                System.out.println(jse.check_if_two_String_are_same(str,str2) ? "The given string is same as given string." : "The given string is not same as given string.");           
            break;
            default : System.out.println("Na ho paega");
                break;
        }
    }
    public String get_character_at_the_given_index(String str,int index)/* #1 */
    {
        return "The character at position "+ index + " is " + str.charAt(index);
    }
    public String get_character_unicode_point_at_the_given_index(String str,int index)/* #2 */
    {
        return "The unicode point of character " + str.charAt(index) + " unicode point at position " + index + " is " + str.codePointAt(index);
        /*
            can also use string.codePointBefore(index) to get the character (Unicode code point) before the specified index 
            or 
            use str.codePointCount(1, 10) to count a number of Unicode code points in the specified text range of a String 
        */
    }
    public String compare_two_strings_lexicographically(String str,String str2)/* #3 */ 
    {
        int check = str.compareTo(str2);/*can also use string1.compareToIgnoreCase(string2) it ignore cases */
        String status = check == 0 ? " is equal to " : check < 0 ? " is less than " : check > 0 ? " is greater than " : "Mala nai mahit kai te";
        return str + status + str2;    
    }
    public String concatenate_string(String str,String str2)/* #4 */
    {
        return str+str2;
    }
    public boolean test_for_specified_sequence_of_char( String str,String str2)/* #5 */
    {
        if(str.contains(str2))/* can also use contentEquals to check character sequence or can also be used to compare StringBuffer object with String*/
        return true;
        else
        return false;
    }
    public String create_string_with_given_character_array(char char_arr[], int offset, int count)/* #6 */
    {
        String str = String.copyValueOf(char_arr, offset, count);
        /* for(char a : char_arr) System.out.println(a);
            System.exit(0); */
        return "output is :"+str;
    }
    public boolean check_if_string_ends_with_another_string(String str,String str2)/* #7 */ 
    {
        if(str.endsWith(str2))
        return true;
        else return false;
    }
    public boolean check_if_two_String_are_same(String str,String str2)/* #8 */
    {
        return str.equals(str2) ?  true :  false;/* Can also use str.equalsIgnoreCase(str2) to ignore case while comparing strings */
    }
    public date print_current_date_and_time()
    {
        Calander c = Calendar.getInstance();

    }
}