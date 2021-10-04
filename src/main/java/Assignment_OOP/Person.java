package Assignment_OOP;

/*
question7(encapsulation)
 Create a class called Person. Add three properties - name, age, shoeSize.
Create a method called "walking" that prints out that the name of the person, their age, and with shoeSize is walking.
Create another method called "startWalking," which will invoke the "walking" method created earlier.
Encapsulate all properties and the "walking" method by setting their accessibility to private and creating getters/setters for each property.
Create a driver class (with a standard main method) to use for testing the Person class.


 */
public class Person {

    //Add three properties - name, age, shoeSize.
    String name;
    int age;
    double shoeSize;

     //Encapsulate all properties and the "walking" method by setting their accessibility to private and creating getters/setters for each property.


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getShoeSize() {
        return shoeSize;
    }

    public void setShoeSize(double shoeSize) {
        this.shoeSize = shoeSize;
    }

    public Person (String name, int age, double shoeSize ) {
        this.name = name;
        this.age = age;
        this.shoeSize = shoeSize;
    }


        //Create a method called "walking" that prints out that the name of the person, their age, and with shoeSize is walking.
        private void walking(){

            System.out.println(name+"  "+ age +"  "+ shoeSize + " is walking");
        }
        //Create another method called "startWalking," which will invoke the "walking" method created earlier.
        public void startWalking(){

            walking();

        }
    }




    //Create a driver class (with a standard main method) to use for testing the Person class.
class Driver{
        public static void main(String[] args) {
            Person person1=new Person("Betul",+9,4);

            person1.startWalking();

        }
}
