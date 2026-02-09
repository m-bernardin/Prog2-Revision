import java.util.Scanner;
public class ObjectArrays{
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        System.out.print("Please select an option:\n0. Sport\n> ");
        switch (new Scanner(System.in).nextInt()) {
            case 0:
                Sport();
                break;
        }
    }
    //q1
    public static void Sport(){
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
}