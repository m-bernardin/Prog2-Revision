public class Driver{
    public static void main(String[] args) {
        BikeStore bikes=new BikeStore("Club Velo Hudson",8, false);
        Store cameras=new Store("Studio May");
        System.out.println("bike info:\n"+bikes.toString()+"\ncamera info:\n"+cameras.toString());
    }
}