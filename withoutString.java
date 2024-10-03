import java.util.Scanner;

public class withoutString {
    /*
    Input: A user String input and another substring input
    Output; the original string with al instances of the substring removed
    Process: - Take a string and substring using scanner object
             - use .replace method to remove the string from the original
             - assign new string that would contain edited string
     */

    public static void main(String[] args) {
        Scanner baseScanner = new Scanner(System.in);
        System.out.println("Please enter a String");
        String baseUSerInp = baseScanner.nextLine();
        System.out.println("Please enter a substring to be removed fro the original string");
        Scanner removeScanner = new Scanner(System.in);
        String removeUserInp = removeScanner.nextLine();

        String resultWithRemovedSubstring = baseUSerInp.replaceAll("(?i)"+removeUserInp,"");
        System.out.println("Your string is "+baseUSerInp +" and your removed string is "+ resultWithRemovedSubstring);
        }
}

