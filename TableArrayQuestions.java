import java.util.Scanner;
@SuppressWarnings("unused")
public class TableArrayQuestions{
    public static void main(String[] args) {
        TableArrayQuestions thing=new TableArrayQuestions();
    }
    public TableArrayQuestions(){
        sumColumns();
    }
    private String printTable(int[][] table,int nbColumns, int nbRows){
        String tableString="Visualisation of table:\n";
        for(int x=0;x<nbColumns;++x){
            for(int y=0;y<nbRows;++y){
                tableString+=table[x][y]+" ";
            }
            tableString+="\n";
        }
        return tableString;
    }
    //q2
    private void sumTable(){
        Scanner input=new Scanner(System.in);
        System.out.print("Please enter a number of columns\n> ");
        int columns=input.nextInt();
        System.out.print("Please enter a number of rows\n> ");
        int rows=input.nextInt();
        int[][] table=new int[columns][rows];
        for(int x=0;x<table.length;++x){
            for(int y=0;y<table.length;++y){
                System.out.print("Please enter a number\n> ");
                table[x][y]=input.nextInt();
            }
        }
        System.out.println("Table built");
        input.close();
        System.out.print(printTable(table,table.length,table.length));
        int sum=0;
        for(int x=0;x<table.length;++x){
            for(int y=0;y<table.length;++y){
                sum+=table[x][y];
            }
        }
        System.out.println("Sum of whole table is "+sum);
    }
    //q3
    private void sumRows(){
        Scanner input=new Scanner(System.in);
        int[][] table=new int[3][3];
        for(int x=0;x<table.length;++x){
            for(int y=0;y<table.length;++y){
                System.out.print("Please enter a number\n> ");
                table[x][y]=input.nextInt();
            }
        }
        System.out.println("Table built");
        input.close();
        System.out.print(printTable(table,table.length,table.length));
        for(int x=0;x<table.length;++x){
            int sum=0;
            for(int y=0;y<table.length;++y){
                sum+=table[x][y];
            }
            System.out.println("Sum of row "+x+": "+sum);
        }
    }
    //q4 -- print the sum of the columns of a 2*5 table
    private void sumColumns(){
        Scanner input=new Scanner(System.in);
        int[][] table=new int[2][5];
        for(int x=0;x<2;++x){
            for(int y=0;y<5;++y){
                System.out.print("Please enter a number\n> ");
                table[x][y]=input.nextInt();
            }
        }
        System.out.println("Table built");
        input.close();
        System.out.print(printTable(table,2,5));
        for(int y=0;y<5;++y){
            int sum=0;
            for(int x=0;x<2;++x){
                sum+=table[x][y];
            }
            System.out.println("Sum of column: "+sum);
        }
    }
}