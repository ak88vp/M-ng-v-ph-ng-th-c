package baiTap;

import java.util.Scanner;

public class XoaPT {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6};
        int number;
        int index = arr.length;
        int index_delete = -1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number you want tp delete :");
        number = scanner.nextInt();
        int i = 0;
        while (i < index) {
            if (number == arr[i]) {
                index_delete = i;
                System.out.println("found the number to delete, the location: " + index_delete);
                break;
            }
            i++;
        }
        if (index_delete == -1) {
            System.out.println("the number you need to remove is not in the array .");
        }
        for (int j = index_delete; j < index-1; j++) {
            arr[j] = arr[j + 1];
        }
        for (int j=0;j<index-1;j++){
            System.out.print(arr[j]+",");
        }


    }
}
