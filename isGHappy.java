public class isGHappy {
     /*
    Input: A string that contains the letter g
    Output:  a boolean with true if each g has a consecutive g
    Process: use a for loop to check every letter
             if first letter is g, it checks for next one and return true if both are g
     */

    public static void main(String[] args) {
        String myWord = "xxggyyggxx";
        boolean happyChecker = false;
        for (int i = 0; i < myWord.length(); i++) {
            if (myWord.charAt(i) == 'g') {
                if (myWord.charAt(i - 1) == 'g') {
                    happyChecker = true;
                } else if (i < myWord.length() - 1 && myWord.charAt(i + 1) == 'g') {
                    happyChecker = true;
                } else {
                    happyChecker = false;
                }
            }
        }
        System.out.println(happyChecker);
    }
}

