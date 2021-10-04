package Assignment_OOP;

public class Date {
    /*
     Create a class called Date that includes three instance variables—a month (type int), a day (type int) and a year (type int).
     Provide a constructor that initializes the three instance variables and assumes that the values provided are correct.
     Provide a set and a get method for each instance variable.
     Provide a method displayDate that displays the month, day and year separated by forward slashes (/).
     Write a test app named DateTest that demonstrates class Date’s capabilities.
      */

    int day;
    int month;
    int year;
    //three instance variables—a month (type int), a day (type int) and a year (type int)


    public Date (int day, int month,int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Provide a set and a get method for each instance variable.
        public int getMonth() {
            return month;
        }

        public void setMonth(int month) {
            this.month = month;
        }

        public int getDay() {
            return day;
        }

        public void setDay(int day) {
            this.day = day;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public void displayDate(){
// Provide a method displayDate that displays the month, day and year separated by forward slashes (/).
            System.out.println(month + "/" + day + "/" + year);

        }

    }

    class DateTest{

        public static void main(String[] args) {

            Date date = new Date(9, 8, 2012);
            //my sweetie birthday 9/8/2012 <3
            System.out.println("my sweetie life is starting again with you ");
            date.displayDate();

        }

    }