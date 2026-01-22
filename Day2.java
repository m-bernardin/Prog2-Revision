import java.util.*;
public class Day2{
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        Day2 thing = new Day2();
    }
    public Day2(){
        printPrimes();
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
}