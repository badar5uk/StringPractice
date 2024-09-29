public class SumOfDigitsString {

    /*
    Input: A string that includes Alphanumeric values
    Output: The sum of the numbers that appear in the string
    Process: check if the string actually contains numbers
             convert the values that appear into an integer
             sum all the values and print the sum
             if string does not contain any numbers, return 0
     */

    public static void main(String[]args){
        String word = "Hello123";
        int sum =0;
        char[] wordToChar = word.toCharArray();
        for (char charArray:wordToChar){
            if(Character.isDigit(charArray) == true){
                sum = Integer.parseInt(String.valueOf(charArray)) + sum;
            }
        }
        System.out.println("The sum of the numbers in the String: "+ word + "\n"+"is equal to: " + sum);
    }
}
