import java.util.*;
public class Questions{
    public static void main(String[] args){
        @SuppressWarnings("unused")
        Questions thing=new Questions();
    }
    public Questions(){
        printArmstrongNumber();
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
        input.close();
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
        input.close();
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
        input.close();
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
        input.close();
    }
        public void printEvenOdd(){
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a series of ten numbers\n> ");
        for(int i=0;i<10;++i){
            int num=input.nextInt();
            if(num%2==0){
                System.out.println("Entry number "+(i+1)+" ("+num+")"+" is even");
            }
            else{
                System.out.println("Entry number "+(i+1)+" ("+num+")"+" is odd");
            }
        }
        input.close();
    }
    public void countEvenOdd(){
        Scanner input=new Scanner(System.in);
        int evenCount=0,oddCount=0;
        System.out.println("Please enter a series of ten numbers\n> ");
        for(int i=0;i<10;++i){
            int num=input.nextInt();
            if(num%2==0){
                ++evenCount;
            }
            else{
                ++oddCount;
            }
        }
        System.out.println("Number evens: "+evenCount+", number of odds: "+oddCount);
        input.close();
    }
    public void findHighLow(){
        System.out.println("Please enter a series of ten numbers\n> ");
        Scanner input=new Scanner(System.in);
        int highest,lowest;
        String nums=input.nextLine();
        Scanner highScanner=new Scanner(nums);
        Scanner lowScanner=new Scanner(nums);
        Scanner checkScanner=new Scanner(nums);
        highest=checkScanner.nextInt();
        lowest=highest;
        for(int i=0;i<10;++i){
            int candidate=highScanner.nextInt();
            if(candidate>highest)highest=candidate;
        }
        for(int i=0;i<10;++i){
            int candidate=lowScanner.nextInt();
            if(candidate<lowest)lowest=candidate;
        }
        System.out.println("Highest number: "+highest+", lowest number: "+lowest);
        input.close();
        highScanner.close();
        lowScanner.close();
        checkScanner.close();
    }
    public void findHighLowEfficient(){
        System.out.println("Please enter a series of ten numbers\n> ");
        int highest=0,lowest=0;
        @SuppressWarnings("resource")
        Scanner numScanner=new Scanner(new Scanner(System.in).nextLine());
        for(int i=0;i<10;++i){
            int num=numScanner.nextInt();
            if(i==0){
                highest=num;lowest=num;
            }
            if(num>highest)highest=num;
            if(num<lowest)lowest=num;
        }
        System.out.println("Highest number: "+highest+", lowest number: "+lowest);
        numScanner.close();
    }
    public void checkPrime(){
        System.out.print("Please enter a number\n> ");
        @SuppressWarnings("resource")
        int num=new Scanner(System.in).nextInt();
        boolean prime=true;
        for(int i=2;i<num&&prime==true;++i){
            if(num%i==0)prime=false;
        }
        System.out.println("Number ("+num+") prime?: "+prime);
    }
    public void printPrimes(){
        for(int num=3;num<=100;++num){
            boolean prime=true;
            for(int divider=2;divider<num&&prime==true;++divider){
                if(num%divider==0)prime=false;
            }
            if(prime){
                System.out.println(num);
            }
        }
    }
    @SuppressWarnings("resource")
    public void printPrimesWithBounds(){
        System.out.print("Please enter the lower bound\n> ");
        int lowerBound=new Scanner(System.in).nextInt();
        System.out.print("Please enter the upper bound\n> ");
        int upperBound=new Scanner(System.in).nextInt();
        for(int num=lowerBound;num<=upperBound;++num){
            boolean prime=true;
            for(int divider=2;divider<num&&prime==true;++divider){
                if(num%divider==0)prime=false;
            }
            if(prime){
                System.out.println(num);
            }
        }
    }
    @SuppressWarnings("resource")
    public void checkPerfectNumber(){
        System.out.print("Please enter a number\n> ");
        int num=new Scanner(System.in).nextInt(),sum=0;
        for(int divider=1;divider<num;++divider){
            if(num%divider==0)sum+=divider;
        }
        if(sum==num)System.out.println(num+" is a perfect number!");
        else System.out.println(num+" is not a perfect number");
    }
    public void printPerfectNumbers(){
        for(int i=1;i<=10000;++i){
            int num=i,sum=0;
            for(int divider=1;divider<num;++divider){
                if(num%divider==0)sum+=divider;
            }
            if(sum==num)System.out.println(num+" is a perfect number!");
        }
    }
    public void printArmstrongNumber(){
        for(int num=1;num<100000;++num){
            int digits=0,digitAid=num,sum=0,powAid=num;
            while(digitAid>0){
                ++digits;
                digitAid/=10;
            }
            while(powAid>0){
                sum+=Math.pow(powAid%10,digits);
                powAid/=10;
            }
            if(sum==num)System.out.println(num+" is an armstrong number");
        }
    }
}