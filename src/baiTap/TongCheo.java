package baiTap;

import java.util.Scanner;

public class TongCheo {
    public static void main(String[] args) {
        int [][] arr;
        int column;
        int size;
        Scanner scanner=new Scanner(System.in);
        do {
            System.out.println("Enter column :");
            column=scanner.nextInt();
            System.out.println("Enter size : ");
            size=scanner.nextInt();
        }while (size<column||size>column);
        arr=new int[column][size];
        for (int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.println("enter element "+j+" of array" +i);
                arr[i][j]=scanner.nextInt();
            }
        }
        int sum=0;
        for (int i=0;i<arr.length;i++){
           sum+= arr[i][i];
        }
        System.out.println("Sum of elements from left to right is : "+sum);
    }
}
