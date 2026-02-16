public class MobileStore extends Store{
    private int annualSales;
    private int[] nbHandsetsSoldByMonth;
    public int getAnnualSales() {
        return annualSales;
    }
    public void setAnnualSales(int annualSales) {
        this.annualSales = annualSales;
    }
    public int[] getNbHandsetsSoldByMonth() {
        return nbHandsetsSoldByMonth;
    }
    public void setNbHandsetsSoldByMonth(int[] nbHandsetsSoldByMonth) {
        this.nbHandsetsSoldByMonth = nbHandsetsSoldByMonth;
    }
    public MobileStore(String name,int annualSales,int[] nbHandsetsSoldByMonth){
        super(name);
        this.annualSales=annualSales;
        this.nbHandsetsSoldByMonth=nbHandsetsSoldByMonth;
    }
    public String toString(){
        return super.toString()+"\nAnnual sales: "+annualSales+"\nAverage selling price: "+averagePrice()+"\nBest month: "+bestMonth();
    }
    private String bestMonth(){
        int highestMonth=0;
        for(int i=0;i<nbHandsetsSoldByMonth.length;++i){
            if(nbHandsetsSoldByMonth[i]>nbHandsetsSoldByMonth[highestMonth])highestMonth=i;
        }
        return translateMonth(highestMonth)+" ("+nbHandsetsSoldByMonth[highestMonth]+")";
    }
    private String translateMonth(int highestMonth) {
        switch (highestMonth) {
            case 0:
                return "January";
            case 1:
                return "February";
            case 2:
                return "March";
            case 3:
                return "April";
            case 4:
                return "May";
            case 5:
                return "June";
            case 6:
                return "July";
            case 7:
                return "August";
            case 8:
                return "September";
            case 9:
                return "October";
            case 10:
                return "November";
            case 11:
                return "December";
        }
        return "INVALID MONTH";
    }
    private double averagePrice() {
        int totalSold=0;
        for(int i=0;i<nbHandsetsSoldByMonth.length;++i){
            totalSold+=nbHandsetsSoldByMonth[i];
        }
        return annualSales/totalSold;
    }
}