package baiTap;

import java.util.Scanner;

public class ThemPT {
    public static void main(String[] args) {
        int [] arr={0,1,2,3,4,5,6};
        int x;
        int index;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the required number :");
        x=scanner.nextInt();
        System.out.println("Location want to add :");
        index=scanner.nextInt();
        if (index<0||index>arr.length-1){
            System.out.println("Can't insert");
        }
        int[]newArr=new int[arr.length+1];
         newArr[newArr.length-1]=x;
         for (int i=0;i<arr.length;i++){
             newArr[i]=arr[i];
         }
         for (int i=newArr.length-1;i>=index;i--){
             newArr[i]=newArr[i-1];
         }
         newArr[index]=x;
        for (int j : newArr) {
            System.out.println(j);
        }


    }
}
