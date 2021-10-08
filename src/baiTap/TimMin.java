package baiTap;

import java.util.Scanner;

public class TimMin {
    public static void main(String[] args) {
        int size;
        int [] arr;
        Scanner scanner=new Scanner(System.in);
        do {
            System.out.println("nhập size ");
            size=scanner.nextInt();
        }while (size>5);
        arr=new int[size];
        for (int i=0;i<size;i++){
            System.out.println("phần tử "+i+" : ");
            arr[i]=scanner.nextInt();
        }
        int min=arr[0];
        for (int i=0;i<size;i++){
            if (min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("Min : "+min);

    }
}
