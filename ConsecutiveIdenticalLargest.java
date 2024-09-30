public class ConsecutiveIdenticalLargest {

    /*
    Input: A string with repeating characters
    Output: A number representing the largest consecutive block of repeating characters
    Process: A for loop that checks every character
             A counter that increases
             A max count to compare and append each time
             print max count
     */

    public static void main(String[] args) {
        String wordWithRepeatingChar = "accccddddd";
        int counter = 0;
        int maxCounter = 0;
        if(wordWithRepeatingChar.length() == 1){
            maxCounter = 1;
        }
        else{
            for (int i = 0; i < wordWithRepeatingChar.length()-1; i++) {
                    if (wordWithRepeatingChar.charAt(i) == wordWithRepeatingChar.charAt(i+1)) {
                        counter++;
                    }
                    else if (counter > maxCounter) {
                        maxCounter = counter;
                        if (maxCounter > counter) {
                            maxCounter = counter;
                        }
                    } else {
                        counter = 1;
                    }

            }
        }
        System.out.println(maxCounter);
    }

}
