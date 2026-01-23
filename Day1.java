import java.util.*;
public class Thingy{
    public static void main(String[] args){
        Thingy thing=new Thingy();
    }
    public Thingy(){
        calculateYears();
    }
    public void singleCharCheck(){
        char toCheck;
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a character");
        toCheck=input.next().charAt(0);
        if(toCheck<='z'&&toCheck>='a'){
            System.out.println("Lowercase character");
        }
        else if(toCheck<='Z'&&toCheck>='A'){
            System.out.println("Uppercase character");
        }
        else{
            System.out.println("Other character");
        }
        input.close();
    }
    public void continualCharCheck(){
        boolean running=true;
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a character\nType 'quit' to exit");
        while(running){
            String in=input.next();
            if(in.equals("quit")){
                running=false;
                break;
            }
            char toCheck=in.charAt(0);
            if(toCheck<='z'&&toCheck>='a'){
                System.out.println("Lowercase character");
            }
            else if(toCheck<='Z'&&toCheck>='A'){
                System.out.println("Uppercase character");
            }
            else{
                System.out.println("Other character");
            }
        }
        input.close();
    }
    public void singleSoccerTeamCheck(){
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a height in cm");
        int height=Integer.parseInt(input.next());
        System.out.println("Please enter a weight in kg");
        int weight=Integer.parseInt(input.next());
        if((height>=170&&height<=190)&&(weight>=80)){
            System.out.println("Student may join the soccer team");
        }
        if(height>=190&&weight>=80&&weight<=95){
            System.out.println("Student may join the basketball team");
        }
        input.close();
    }
    /**
    public void continualSoccerTeamCheck(){
        boolean running=true;
        Scanner input=new Scanner(System.in);
        System.out.println("Type 'quit' to exit");
        while(running){
            System.out.println("Please enter the height and the weight of the student, seperated by a space");
            String in=input.nextLine();
        }
    }
        */
    public void checkEvenAndDivideBySeven(){
        Scanner input=new Scanner(System.in);
        System.out.print("Please enter a number\n> ");
        int num=input.nextInt();
        if(num%2==0){
            System.out.println("Number is even");
        }
        else{
            System.out.println("Number is odd");
        }
        if(num%7==0){
            System.out.println("Number is a factor of 7");
        }
        else{
            System.out.println("Number is not a factor of 7");
        }
    }
    public void checkEvenAndDivideBySevenContinual(){
        boolean running=true;
        Scanner input=new Scanner(System.in);
        while(running){
            System.out.print("Please enter a number\nType 'quit' to exit\n> ");
            int num=input.nextInt();
            if(num%2==0){
                System.out.println("Number is even");
            }
            else{
                System.out.println("Number is odd");
            }
            if(num%7==0){
                System.out.println("Number is a factor of 7");
            }
            else{
                System.out.println("Number is not a factor of 7");
            }
        }
    }
    public void convertCase(){
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a letter");
        char toConvert=input.next().charAt(0);
        if(toConvert<='z'&&toConvert>='a'){
            System.out.println(toConvert-32);
        }
        else if(toConvert<='Z'&&toConvert>='A'){
            System.out.println(toConvert+32);
        }
        else{
            System.out.println("Error, please enter a letter");
        }
    }
    public void calculateYears(){
        Scanner input=new Scanner(System.in);
        System.out.print("Please enter a number of days\n> ");
        int days=input.nextInt();
        int years=days/365;
        days=days%365;
        int months=days/30;
        days=days%30;
        System.out.println("Years: "+years+", months: "+months+", days: "+days);
    }
}