package raj.ds;

import java.util.Scanner;

public class Day2_Add_or_Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number");
        int a = sc.nextInt();
        if(a%2 == 0){
            System.out.println("Given num is even");
        }else{
            System.out.print("Given num is Odd");
        }
    }
}
