package Assignment_OOP;
/*
Create a Dog class with three properties - name (String), age(int), weight(double).
Override the toString() method using Eclipse's auto-generation feature.
Create a test class to create two instances of Dog, set their properties, and then call the toString() on them.
Add a showExcitement() method that displays the name of the dog + "is wagging its tail!!!" when invoked on the instance.
" when invoked on the instance.

 */
public class Dog {
    //three properties - name (String), age(int), weight(double)
    String name;
    int age;
    double weight;

    public Dog (String name, int age, double weight){
        this.name=name;
        this.age=age;
        this.weight=weight;

    }
  //Override the toString() method using Eclipse's auto-generation feature. (sag click sonra toString sec otomatik override oluyor)


    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }


    //Add a showExcitement() method that displays the name of the dog + "is wagging its tail!!!" when invoked on the instance.
    //" when invoked on the instance.
    public void showExcitement(){
        System.out.println(name + " is wagging their tail!!! :)");
    }

  static class DogTest{
//yukariyi static yapmayincA asagisi hata veriyor.
      public static void main(String[] args) {

          //Create a test class to create two instances of Dog, set their properties, and then call the toString() on them.

          Dog dog1= new Dog ("dog1_of_Name: Benekli",9,43.8); //(name,age,weight) (yukarida tanimladigimiz icin parantez icini yazmasak hata veriyor)
          Dog dog2 =new Dog("dog2_of_NAme: Karaca",7,24.6);

          System.out.println(dog1);
          System.out.println(dog2);

          dog1.showExcitement();
          dog2.showExcitement();

      }
  }

}
