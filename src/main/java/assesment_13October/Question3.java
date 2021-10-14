package assesment_13October;

import java.util.Scanner;

/*
Write a Java method to display the middle character of a string.
a) If the length of the string is even there will be two middle characters.
b) If the length of the string is odd there will be one middle character.

Input a string: 367
Expected Output:
The middle character in the string: 6
 */
public class Question3 {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        System.out.print("Input a string: ");
        String str = enter.nextLine();
        System.out.print("MiddleCharacter : " + middleCharacter(str)+ "\n");
    }
    public static String middleCharacter(String str)
    {
        int position;
        int length;
        if (str.length() % 2 == 0)
        {
            position = str.length() / 2 - 1;
            length = 2;
        }
        else
        {
            position = str.length() / 2;
            length = 1;
        }
        return str.substring(position, position + length);
    }
    }

/*
after run see on my terminal
"C:\Program Files\Java\jdk1.8.0_271\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.1.1\lib\idea_rt.jar=56449:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.1.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_271\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_271\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_271\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_271\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_271\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_271\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_271\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_271\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_271\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_271\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_271\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_271\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_271\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_271\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_271\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_271\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_271\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_271\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_271\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_271\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_271\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_271\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_271\jre\lib\rt.jar;C:\Users\fatma\IdeaProjects\HCL_ALgorithm\target\classes" assesment_13October.Question3
Input a string: 367
MiddleCharacter : 6


Fatmana
 */