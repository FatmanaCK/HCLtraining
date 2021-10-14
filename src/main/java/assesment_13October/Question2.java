package assesment_13October;
import java.lang.*;
/*
Create two String reference variables. Then create two String literals with the same value - "cat" - and assign them to the reference variables.
 Try using the "==" operator to verify that they are pointing to the same String object.
  Now say new String("cat") and assign that to the first reference variable.
   Try verifying again with "==". Now try creating a reference variable of type StringBuilder or StringBuffer.
   Give this the value of "cat" – then call append() method on this object, modifying the value. Notice there is no append() method on a String object,
   since it is immutable.
 */
public class Question2 {
    public static void main(String[] args) {
      //  String first= "Cat";
      //  String second= "Cat";
     //   String third = new String("Cat");

     //   System.out.println("first == second :"+(first==second));
     //   System.out.println("first == third :"+(first==third));

        StringBuilder str = new StringBuilder("Cat ");
        System.out.println("string = " + str);

        // appends the string argument to the StringBuilder
        str.append("Cat");

        System.out.println("After append = " + str);

        str = new StringBuilder("CAT ");
        System.out.println("string = " + str);

         }

}

