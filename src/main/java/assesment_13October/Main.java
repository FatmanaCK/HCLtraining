package assesment_13October;

import java.util.StringTokenizer;

/* question1
Write a program to read a string and to test whether first and last character are same.
The string is said to be be valid if the 1st and last character are the same. Else the string is said to be invalid.
Include a class UserMainCode with a static method checkCharacters which accepts a string as input .
The return type of this method is an int.Output should be 1 if the first character and last character are same . If they are different then return -1 as output.
Create a classMain which would get the input as a string and call the static method checkCharacters present in the UserMainCode.

Sample Input :
the picture was great
Sample Output : Valid
Sample Input :
this
Sample Output :
Invalid
 */
public class Main {


                public static void main(String[] args) {

                  String input = "this";
                    System.out.println(checkForFirstAndLastChar(input));

                }

                public static int checkForFirstAndLastChar(String input) {

                    StringTokenizer t = new StringTokenizer(input, " ");
                    String s = t.nextToken();
                    String string1 = " ";
                    while (t.hasMoreTokens()) {

                        string1 = t.nextToken();
                    }
                    if (s.charAt(0) == input.charAt(string1.length() - 1))

                        return 1;
                    else

                        return 0;
                }
            }





