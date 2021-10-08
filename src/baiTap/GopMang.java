package baiTap;

import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        int[]arr;
        int size;
        int[]arr1;
        int size1;
        int[]arr2;
        Scanner scanner=new Scanner(System.in);
        do {
            System.out.println("bạn muốn nhập bn phần tử ở mảng một :");
            size=scanner.nextInt();

        }while (size>5);
        arr=new int[size];
        for (int i=0;i<size;i++){
            System.out.println("phần tử "+i+" : ");
            arr[i]=scanner.nextInt();
        }

        do {
            System.out.println("bạn muốn nhận bn pt...");
            size1=scanner.nextInt();
        }while (size1>5);
        arr1=new int[size1];
        for(int i=0;i<size1;i++){
            System.out.println("phần tử " +i);
            arr1[i]=scanner.nextInt();
        }
        arr2=new int[size+size1];
        for (int i=0;i<arr.length;i++){
            arr2[i]=arr[i];
        }
        int n=0;
        for (int i=size;i<arr2.length;i++){
            arr2[i]=arr1[n];
            n++;
        }
        for (int j : arr2) {
            System.out.println(j);
        }

    }
}
