package raj.ds;

import java.util.Scanner;

public class day3Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num1 = sc.nextInt();

        for(int i = 1; i<=10; i++){
            System.out.println(num1 +"*"+i+"="+num1*i);

        }

    }
}
