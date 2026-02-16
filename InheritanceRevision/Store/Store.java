public class Store {
    public final double SALES_TAX_RATE=0.06;
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public Store(String name){
        this.name=name;
    }
    public String toString(){
        return "Name: "+name;
    }
}