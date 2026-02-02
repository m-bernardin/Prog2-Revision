import java.util.ArrayList;
import java.util.Scanner;

public class SortingDriver{
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        boolean running=true;
        Scanner input=new Scanner(System.in);
        while(running){
            System.out.print("Please select a type of algorithm:\n"+SortingAlgorithms.getOptionsString()+"\nType 'quit' to exit\n> ");
            //System.out.println("**awaiting input");
            String choice=input.nextLine();
            //System.out.println("**input received: "+choice);
            if(choice.equals("quit")){
                //System.out.println("**quitting");
                running=false;
                break;
            }
            if(invalidChoice(choice)){
                System.out.println("Please select a choice from the list");
                break;
            }
            System.out.print("Please enter a space-seperated list of numbers to be sorted\n> ");
            String toSortString=input.nextLine();
            //System.out.println("**input received: "+toSortString);
            int[] toSort=parseInput(toSortString);
            //System.out.println("**input received: "+toSort.toString());
            switch(choice){
                case "1":
                    //System.out.println("**choice selected: simple sort");
                    System.out.println(SortingAlgorithms.simpleSort(toSort));
                    break;
                case "2":
                    System.out.println(SortingAlgorithms.bubbleSort(toSort));
                    break;
            }
        }
        input.close();
    }
    private static boolean invalidChoice(String choice){
        int toValidate;
        //System.out.println("**validating input");
        try {
            //System.out.println("**catching words");
            toValidate=Integer.parseInt(choice);
        } catch (Exception e) {
            //System.out.println("**word caught");
            return true;
        }
        if(toValidate<=0||toValidate>SortingAlgorithms.getOptionsNum()){
            //System.out.println("**invalid option found ("+toValidate+")");
            return true;
        }
        //System.out.println("**choice validated");
        return false;
    }
    private static int[] parseInput(String unSortedString) {
        Scanner sorter=new Scanner(unSortedString);
        //System.out.println("**unparsed input received: "+unSortedString);
        //System.out.println("**parsing input");
        ArrayList<Integer> tempArray=new ArrayList<>();
        sorter.useDelimiter(" ");
        //System.out.println("**delimiter set");
        while(sorter.hasNext()){
            tempArray.add(sorter.nextInt());
            //System.out.println("**item added to temp ArrayList");
        }
        sorter.close();
        int[] result=new int[tempArray.size()];
        //System.out.println("**array createc with length: "+tempArray.size());
        for(int i=0;i<result.length;++i){
            result[i]=tempArray.get(i);
            //System.out.println("**item added to array");
        }
        //System.out.println("**parsing complete");
        return result;
    }
}