package net.davisware.revstring;

public class RevString {

    public RevString(String strToReverse) {

        int stringLen = strToReverse.length();
        char [] revString = new char[stringLen];

        System.out.println("String to reverse: " + strToReverse);

        for (int x = stringLen - 1 , j = 0; x >= 0; x--, j++) {

            revString[j] = strToReverse.charAt(x);

        }

        String reversed = new String(revString);
        System.out.println("Reversed string: " + reversed);




    }
}
