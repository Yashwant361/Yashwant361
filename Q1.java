package GA.forExample;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
//        int num = 1;
//        while (num<=10){
//            System.out.println(num);
//            num++;
//        }

//        int num = 10; // print number in descending order
//        while (num>=0){
//            System.out.println(num);
//            num--;
//        }

        int num = 2; // print even and odd
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        while (num <= input) {

//                System.out.println(+input+"is even");
//                num+=2;
//        }
//        System.out.println(+input+" is odd");
            System.out.println(num);
            num+=2;

        }
    }
}