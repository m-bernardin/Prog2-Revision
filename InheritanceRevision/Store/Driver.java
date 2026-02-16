import java.util.Scanner;
public class Driver{
    public static void main(String[] args) {
        BikeStore bikes=new BikeStore("Club Velo Hudson",8, false);
        GroceryStore groceries=new GroceryStore("Que de bons choses", 100000, true);
        Store cameras=new Store("Studio May");
        MobileStore phones=new MobileStore("Rogers", 4500000, new int[]{50,2,90,45,6,2,123,7,567,3,78,43});
        System.out.println("bike info:\n"+bikes+"\ncamera info:\n"+cameras+"\ngroceries info:\n"+groceries+"\nphones info:\n"+phones);
        Scanner input=new Scanner(System.in);
        boolean running=true;
        while (running) {
            System.out.print("Create a...\n0. Quit\n1. Store\n2. Bike store\n3.Grocery store\n4. MobileStore\n>");
            switch (input.nextInt()) {
                case 0:
                    running=false;
                    System.out.println("Goodbye...");
                    break;
                case 1:
                    input.nextLine();
                    System.out.print("Creating a store...\nPlease enter a name\n>");
                    Store store=new Store(input.nextLine());
                    System.out.println(store);
                    break;
                case 2:
                    input.nextLine();
                    System.out.print("Creating a bike store...\nPlease enter a name\n>");
                    String name=input.nextLine();
                    System.out.print("Please enter the number of bike brands this store carries\n>");
                    int nbBikeBrands=input.nextInt();
                    BikeStore bikeStore;
                    System.out.print("Does this store sponsor a club? (Y/n)\n>");
                    if(input.next().equals("Y"))bikeStore=new BikeStore(name, nbBikeBrands, true);
                    else bikeStore=new BikeStore(name, nbBikeBrands, false);
                    System.out.println(bikeStore);
                    break;
            }
        }
    }
}