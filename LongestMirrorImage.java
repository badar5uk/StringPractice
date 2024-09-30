

public class LongestMirrorImage {
    /*
    Input: A string that contains mirrored letters
    Output: the mirrored string
    Process: takes the string and convert it into character array
     */
    public static String mirrorEnds(String str) {
        String tempstring = "";
        String storedString = "";
        String finalString = "";

        for(int i = 0; i < str.length() ; i++){
            tempstring += str.substring(i , i+1);
            storedString = "";
            for(int j = tempstring.length()-1 ; j >= 0 ; j--){
                storedString += tempstring.substring(j, j+1);
                if (storedString.equals(str.substring(str.length() - i-1, str.length()))) {
                    finalString = tempstring;
                }
            }
        }return finalString;
    }
    public static void main(String[] args) {
        System.out.println(mirrorEnds("abXYZba"));
    }
}