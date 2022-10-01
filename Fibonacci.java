// Ivan Yu

import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci {
    private ArrayList<Long> fibNums = new ArrayList<Long>();
    private long currNum = 0;
    private Scanner input = new Scanner(System.in);
    private int numOfFib = 0;

    public Fibonacci() {
        System.out.print("How many numbers of the Fibonacci Sequence would you like to see: ");
        boolean tmp = true;
        while (tmp) {
            try {
                numOfFib = Integer.parseInt(input.nextLine());
                tmp = false;
            } catch (NumberFormatException e) {
                System.out.print("Please enter a number: ");
            }
        }
        fibNums.add(Long.valueOf(0));
        fibNums.add(Long.valueOf(1));
    }

    public void updateNum() {
        if (fibNums.size() < numOfFib) {
            currNum = fibNums.get(fibNums.size() - 1) + fibNums.get(fibNums.size() - 2);
            fibNums.add(currNum);
            updateNum();
        }
    }

    public void printNums() {
        for (int i = 0; i < fibNums.size(); i++) {
            System.out.println(fibNums.get(i));
        }
    }

    public static void main(String args[]) {
        Fibonacci f = new Fibonacci();
        f.updateNum();
        f.printNums();
    }
}