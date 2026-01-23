public class Album{
    String name;
    int tracksNum;
    double price;
    public static void main(String[] args) {
        new Album("In the Court of the Crimson King", 5, 65.75);
        System.out.println("\n");
        new Album("Gentle Giant", 7, 45.99);
    }
    public Album(String name,int tracksNum,double price){
        this.name=name;
        this.tracksNum=tracksNum;
        this.price=price;
        printDetails();
    }
    public void checkAffordability(){
        if(price>50.0)System.out.print("This album is expensive!\n");
        else System.out.print("This album is cheap!\n"); 
    }
    public void printDetails(){
        System.out.println("Album name: "+name+"\nNumber of tracks: "+tracksNum+"\nPrice: "+price+"\nAffordability: ");
        checkAffordability();
    }
}
