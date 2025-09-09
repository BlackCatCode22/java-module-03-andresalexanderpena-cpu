public class ReverseJava {
    public static void main(String[] args) {
        // Original String
        String myStr = "Hello";

        // Setting up for the reverse String
        String myRts = "";

        int strLength = myStr.length();

        System.out.println("\n strLength is " + strLength);
        System.out.println("\n char at index 5 is " + myStr.charAt(4) );




        for (int i = strLength-1; i >= 0; i--) {

            // Display the reversed String
            System.out.println("\n the char at " + i + " is " + myStr.charAt(i) );
            myRts = myRts + myStr.charAt(i);
        }

        System.out.println("\n\n myRts is: " + myRts + "\n\n");
    }
}