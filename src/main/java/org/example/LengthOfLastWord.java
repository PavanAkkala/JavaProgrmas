package org.example;

public class LengthOfLastWord {

    public static void main(String[] args) {

        String s = " Don Reddy ";

        int l = lengthOf(s);
        System.out.println(l);

    }

    public static int lengthOf(String s) {

        String str = s.trim();

        int count = 0;

        for (int i=str.length()-1; i>=0; i--) {

            if(str.charAt(i)!=' ') {

                count++;
            }

            else {

                break;
            }
        }

        return count;
    }
}
