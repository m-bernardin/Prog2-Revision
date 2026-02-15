import java.util.ArrayList;
import java.util.Scanner;
public class ObjectArrays{
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        System.out.print("Please select an option:\n0. sport\n1. notDatabase\n2. removeEvenOdd\n3. findAndReplace\n> ");
        switch (new Scanner(System.in).nextInt()) {
            case 0:
                sport();
                break;
            case 1:
                notDatabase();
                break;
            case 2:
                removeEvenOdds();
                break;
            case 3:
                findAndReplace();
                break;
        }
    }
    //q1
    public static void sport(){
        Scanner input=new Scanner(System.in);
        System.out.print("Please enter the number of athletes\n> ");
        Athlete[] athletes=new Athlete[input.nextInt()];
        input.nextLine();
        for(int i=0;i<athletes.length;++i){
            System.out.print("Creating athlete "+i+"...\nPlease enter this athletes name\n> ");
            String name=input.nextLine();
            System.out.print("Please enter this athletes weight\n> ");
            int weight=Integer.parseInt(input.nextLine());
            System.out.print("Please enter this athletes height\n> ");
            int height=Integer.parseInt(input.nextLine());
            athletes[i]=new Athlete(name, weight, height);
        }
        int lightestPos=0,tallestPos=0;
        for(int i=0;i<athletes.length;++i){
            if(i==0){
                lightestPos=0;
                tallestPos=0;
            }
            else{
                if(athletes[i].getWeight()<athletes[lightestPos].getWeight()){
                    lightestPos=i;
                }
                if(athletes[i].getHeight()>athletes[tallestPos].getHeight()){
                    tallestPos=i;
                }
            }
        }
        System.out.println("Height of the lightest athlete ("+athletes[lightestPos].getWeight()+"): "+athletes[lightestPos].getHeight()+"\nWeight of the tallest athlete ("+athletes[tallestPos].getHeight()+"): "+athletes[tallestPos].getWeight());
        input.close();
    }
    public static void notDatabase(){
        Scanner input=new Scanner(System.in);
        System.out.print("Please enter the number of Departments\n> ");
        Department[] departments=new Department[input.nextInt()];
        System.out.print("Please enter the number of people\n> ");
        Person[] people=new Person[input.nextInt()];
        input.nextLine();
        for(int depPointer=0;depPointer<departments.length;++depPointer){
            System.out.print("Creating new Department...\nPlease enter this departments name\n> ");
            departments[depPointer]=new Department(input.nextLine(), depPointer+1);
            System.out.println("Department number: "+depPointer+1);
        }
        for(int personPointer=0;personPointer<people.length;++personPointer){
            System.out.print("Creating new Person...\nPlease enter this persons name\n> ");
            String name=input.nextLine();
            System.out.print("Please enter this persons age\n> ");
            int age=Integer.parseInt(input.nextLine()),deptNo=-1;
            boolean valid=false;
            while(!valid){
                System.out.print("Please enter this persons department number\n> ");
                deptNo=Integer.parseInt(input.nextLine());
                if(deptNo<=departments.length&&deptNo>0){
                    valid=true;
                }
            }
            people[personPointer]=new Person(name, deptNo, age);
        }
        input.close();
        System.out.println("All personal info:");
        for(int i=0;i<people.length;++i){
            System.out.println(people[i].getName()+", "+people[i].getAge()+" year(s) old, department: "+departments[people[i].getDeptNo()-1].getName());
        }
    }
    //q3 DOESNT WORK
    public static void removeEvenOdds(){
        ArrayList<String> strings=new ArrayList<>();
        ArrayList<Integer> integers=new ArrayList<>();
        Scanner input=new Scanner(System.in);
        for(int i=0;i<10;++i){
            System.out.print("Please enter a string\n> ");
            strings.add(input.nextLine());
            System.out.print("Please enter a number\n> ");
            integers.add(Integer.parseInt(input.nextLine()));
        }
        input.close();
        System.out.println("Visualisation of ArrayLists:");
        for(String string:strings){System.out.print(string+" ");}
        System.out.println("");
        for(Integer integer:integers){System.out.print(integer+" ");}
        int rmString=0,rmInteger=0;
        for(int i=9;i>=0;--i){
            if(rmString+i%2==0){
                strings.remove(i);
                ++rmString;
            }
            if(rmInteger+i%2!=0){
                integers.remove(i);
                ++rmInteger;
            }
        }
        System.out.println("Visualisation of ArrayLists:");
        for(String string:strings){System.out.print(string+" ");}
        System.out.println("");
        for(Integer integer:integers){System.out.print(integer+" ");}
    }
    //q4
    public static void findAndReplace(){
        Scanner input=new Scanner(System.in);
        ArrayList<String> phrase=new ArrayList<>();
        System.out.print("Please enter the length of the phrase\n> ");
        int length=Integer.parseInt(input.nextLine());
        for(int i=0;i<length;++i){
            System.out.print("Please enter the next word\n> ");
            String word=input.next();
            if(word.length()==4)phrase.add("****");
            else phrase.add(word);
        }
        input.close();
        for(String string:phrase){
            System.out.print(string+" ");
        }
    }
}