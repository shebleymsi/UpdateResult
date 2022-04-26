package result;

import java.util.Scanner;

public class RangeResult {

    public static double score;

    public static void main(String[] args) {
        RangeResult obj = new RangeResult();
        obj.getGrade();
    }

    public void getGrade() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your score to get the result : ");
        double score = input.nextDouble();
        if( score >100){
            System.out.println("Please input  the number below 101 ");
        }else if (score >= 90 && (score <= 100)  ) {
            System.out.println("Excellent");
        } else if (score >= 80 && (score <= 89) ) {
            System.out.println("Very Good");
        } else if (score >= 70 && (score <= 79) ) {
            System.out.println("Good");
        } else if (score >= 60 && (score <= 69) ) {
            System.out.println("Average");
        } else if (score >= 50 && (score <= 59) ) {
            System.out.println("Pass");
        } else if (score >= 40 && (score <= 49) ) {
            System.out.println("Poor");
        } else if (score >= 33 && (score <= 39) ) {
            System.out.println("Very poor");
        } else{
            System.out.println("Need to repeat this course");
        }
    }
}
