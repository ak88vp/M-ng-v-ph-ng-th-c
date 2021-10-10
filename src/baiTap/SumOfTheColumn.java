package baiTap;

import java.util.Scanner;

public class SumOfTheColumn {
    public static void main(String[] args) {
        int[][] arr;
        int row;
        int size;
        int column;
        int sum=0;
        Scanner scanner=new Scanner(System.in);
        do {
            System.out.println("Enter row : ");
            row=scanner.nextInt();
            System.out.println("Enter size : ");
            size=scanner.nextInt();
        }while (row<0 || size<0);

        arr=new int[row][size];
        for (int i=0;i< arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.println("Enter element "+j+" of array "+i);
                arr[i][j]=scanner.nextInt();
            }
        }
        System.out.println("Enter the column you want to sum");;
        column=scanner.nextInt();
        for (int[] ints : arr) {
            sum += ints[column];
        }
        System.out.println("sum : "+sum);
    }
}
