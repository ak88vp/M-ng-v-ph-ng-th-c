package baiTap;

import java.util.Scanner;

public class TimPtMax2Chieu {
    public static void main(String[] args) {
        int[][] arr;
        int current;
        int size;
        Scanner scanner =new Scanner(System.in);
        do {
            System.out.println("Enter current : ");
            current=scanner.nextInt();
            System.out.println("Enter size :");
            size= scanner.nextInt();
        }while (size<0||current<0);
        arr=new int[current][size];
        for (int i=0;i<arr.length;i++){
                    for(int j=0;j<arr[i].length;j++){
                        System.out.println("enter element "+j+"of array "+i);
                        arr[i][j]=scanner.nextInt();
            }
        }
        int max=arr[0][0];
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (max < anInt) {
                    max = anInt;
                }

            }
        }
        System.out.println("phần tử lớn nhất trong mảng 2 chiều vừa nhập là : "+max);

    }

}
