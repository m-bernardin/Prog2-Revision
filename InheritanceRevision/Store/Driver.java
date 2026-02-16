public class Driver{
    public static void main(String[] args) {
        BikeStore bikes=new BikeStore("Club Velo Hudson",8, false);
        GroceryStore groceries=new GroceryStore("Que de bons choses", 100000, true);
        Store cameras=new Store("Studio May");
        System.out.println("bike info:\n"+bikes+"\ncamera info:\n"+cameras+"\ngroceries info:\n"+groceries);
    }
}