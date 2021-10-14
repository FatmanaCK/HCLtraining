package assesment_13October;
/*
Write a Java method to count all vowels in a string.
Input the string: Hcl Technologies
Expected Output:
Number of Vowels in the string: 5
 */


import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner input_string = new Scanner(System.in);
        System.out.print("Input the string: ");
        String str = input_string.nextLine();

        System.out.print("Number_of_Vowels_in_th_string: " + count_Vowels(str)+"\n");
    }
    public static int count_Vowels(String str)
    {
        int count = 0;
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o' || str.charAt(i) == 'u')
            {
                count++;
            }
        }
        return count;
    }

}
/*
my terminal after run code
"C:\Program Files\Java\jdk1.8.0_271\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.1.1\lib\idea_rt.jar=64181:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.1.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_271\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_271\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_271\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_271\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_271\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_271\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_271\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_271\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_271\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_271\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_271\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_271\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_271\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_271\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_271\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_271\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_271\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_271\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_271\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_271\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_271\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_271\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_271\jre\lib\rt.jar;C:\Users\fatma\IdeaProjects\HCL_ALgorithm\target\classes" assesment_13October.Question4
Input the string: Hcl Technologies
Number_of_Vowels_in_th_string: 5

Process finished with exit code 0
 */