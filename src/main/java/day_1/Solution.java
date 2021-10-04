package day_1;

public class Solution {
    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 7, 8, 9};
        int total = 6;
        int[] temp= sumTwo(arr, total);
        System.out.println(temp [0]);
        System.out.println(temp [1]);
    }

    public static int[] sumTwo(int[] arr, int total) {
        int []temp = new int[2];
        for (int i=0; i<arr.length; i++){
            for (int j=i+1; j<arr.length; j++){
                if (arr [i]+arr[j] == total){
                    temp[0]=i;
                    temp[1]=j;
                    return temp;
                }
            }
        }
        return temp;

    }




}




