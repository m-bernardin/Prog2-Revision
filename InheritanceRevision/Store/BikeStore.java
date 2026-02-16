public class BikeStore extends Store{
    private int nbBikeBrands;
    private boolean sponsorsClub;
    public int getNbBikeBrands() {
        return nbBikeBrands;
    }
    public void setNbBikeBrands(int nbBikeBrands) {
        this.nbBikeBrands = nbBikeBrands;
    }
    public boolean isSponsorsClub() {
        return sponsorsClub;
    }
    public void setSponsorsClub(boolean sponsorsClub) {
        this.sponsorsClub = sponsorsClub;
    }
    public BikeStore(String name,int nbBikeBrands,boolean sponsorsClub){
        super(name);
        this.nbBikeBrands=nbBikeBrands;
        this.sponsorsClub=sponsorsClub;
    }
    public String toString(){
        return super.toString()+"\nNb of bike brands carried: "+nbBikeBrands+"\nSponsors a bike club: "+sponsorsClub;
    }
}