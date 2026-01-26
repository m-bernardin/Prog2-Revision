import java.util.Scanner;

public class Driver{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Please select an operation:\n0. Find numbers\n1. Operate on a number\n> ");
        int option1=input.nextInt();
        switch (option1) {
            case 0:
                System.out.print("Please select an operation:\n"+new NumberRangeFinder().getOptions()+"> ");
                break;
            case 1:
                System.out.print("Please select an operation:\n"+new NumberManipulator().getOptions()+"> ");
        }
        int option2=input.nextInt();
        switch(option1){
            case 0:
                System.out.print("Please enter the lower bound:\n> ");
                int lowerBound=input.nextInt();
                System.out.print("Please enter the upper bound:\n> ");
                int upperBound=input.nextInt();
                switch (option2) {
                    case 0:
                        System.out.println("Odd numbers within this range (inclusive):");
                        System.out.print(new NumberRangeFinder().evenString(lowerBound, upperBound));
                        break;
                    case 1:
                        System.out.println("Even numbers within this range (inclusive):");
                        System.out.print(new NumberRangeFinder().oddString(lowerBound, upperBound));
                        break;
                    case 2: 
                        System.out.println("Perfect numbers within this range (inclusive):");
                        System.out.print(new NumberRangeFinder().perfectString(lowerBound, upperBound));
                        break;
                }
                break;
            case 1:
                System.out.print("Please enter a number:\n> ");
                int num=input.nextInt();
                switch (option2) {
                    case 0:
                        System.out.println("Number reversed:");
                        System.out.print(new NumberManipulator().reverse(num));
                        break;
                    case 1:
                        System.out.println("Number as words:");
                        System.out.print(new NumberManipulator().word(num));
                        break;
                }
                break;
        }
        input.close();
    }
}