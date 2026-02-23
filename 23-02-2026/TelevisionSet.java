public class TelevisionSet{
    private int price;
    private String brand;
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        if(price>=0)this.price = price;
    }
    public TelevisionSet(String brand,int price){
        this.brand=brand;
        this.price=price;
    }
    public String toString(){
        return "This TV set is designed by "+brand+" and retails at "+price+"$.";
    }
}