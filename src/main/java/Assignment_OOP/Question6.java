package Assignment_OOP;

/*
. (overloading) Overload the Dog’s "showExcitement" method.
 Take in an int argument - levelOfExcitement - and customize the level of excitement displayed when the method is invoked.
 Also, create an eating() method that is overloaded. First method has no parameters and display “eating!” and the second,
 overloaded method takes in a String called food, and displays “eating (food)”

 */
public class Question6 {

    public class Dog {

        String name;
        int age;
        double weight;

        public Dog(String name, int age, double weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }


        public void showExcitement(){
            System.out.println(name + " is wagging their tail!!!!!!! :)");
        }

        public void showExcitement(int levelOfExcitement){
            System.out.println(name + " is wagging their tail!!!!  Their level is " + levelOfExcitement + "!!!!!!");
        }


        //create an eating() method that is overloaded. First method has no parameters and display “eating!” and the second,
        // overloaded method takes in a String called food, and displays “eating (food)”

        public void eating(){
            System.out.println( "eating!!!");
        }

        public void eating (String food){

            System.out.println("eating food "+ food);
        }

    }

    }
