public
class permutation {
    // Function to print all the permutations of str
    static void printPermutn(String str, String ans) {
        // System.out.print(str.length()+ " ");
        // If string is empty
        if (str.length() == 0) {
            // System.out.print(ans + " ");
            return;
        }
        for (int i = 0; i < str.length(); i++) {

            // ith character of str
            char ch = str.charAt(i);

            // Rest of the string after excluding the ith character
           
            String r = str.substring(0, i) + str.substring(i + 1);
             System.out.print(str.substring(0, i) +str.substring(i + 1)+r+ " ");
            // Recurvise call
            printPermutn(r, ans + ch);
        }
    }

    // Driver code
    public
    static void main(String[] args) {
        String s = "abb";
        printPermutn(s, "");
    }
}