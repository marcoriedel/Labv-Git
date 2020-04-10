public class BeerHouse {

     int beers;

    synchronized public void consumeBeer (int order){
        this.beers -= order;
        System.out.println("Beer Stock " +beers);

    }
    synchronized  public void  rechargeBeer (int newBeersAmount){
        this.beers += newBeersAmount;
        System.out.println("BeerHouse Stock: "+beers );
    }

}