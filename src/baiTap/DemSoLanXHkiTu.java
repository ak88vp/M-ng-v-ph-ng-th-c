package baiTap;

import java.util.Scanner;

public class DemSoLanXHkiTu {
    public static void main(String[] args) {
        String lol="do you love me ?";
       char[] arr=lol.toCharArray();  // cắt và ném vào mảng .
        Scanner scanner=new Scanner(System.in);
        int count=0;
        System.out.println("Enter the character you want to check :");
        char check=scanner.nextLine().charAt(0);
        for(int i=0;i<arr.length;i++){
            if (check==(arr[i])){
                count++;
            }
        }
        System.out.println("The number of occurrences of the character is : "+count);

    }
}
