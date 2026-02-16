public class GroceryStore extends Store{
    private int annualRevenue;
    private boolean independent;
    public int getAnnualRevenue() {
        return annualRevenue;
    }
    public void setAnnualRevenue(int annualRevenue) {
        this.annualRevenue = annualRevenue;
    }
    public boolean isIndependent() {
        return independent;
    }
    public void setIndependent(boolean independent) {
        this.independent = independent;
    }
    public GroceryStore(String name,int annualRevenue,boolean independent){
        super(name);
        this.annualRevenue=annualRevenue;
        this.independent=independent;
    }
    public String toString(){
        return super.toString()+"\nAnnual revenue: "+annualRevenue+"\nAnnual taxes: "+calculateTaxes()+"\nIs independent: "+independent;
    }
    private double calculateTaxes(){
        return annualRevenue*SALES_TAX_RATE;
    }
}