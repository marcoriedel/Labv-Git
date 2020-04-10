public class BeerProducter implements Runnable{

    private BeerHouse beerHouse;
    public BeerProducter (BeerHouse bh){
        this.beerHouse = bh;
    }

    @Override
    public synchronized void run() {
        int newBeersAmount = 100;
        while(true){
            if(newBeersAmount >= 10){
                System.out.println("BeerHouse Previus Stock: "+beerHouse.beers + " Beers in the kitchen: "+newBeersAmount);
                beerHouse.rechargeBeer(newBeersAmount);
                newBeersAmount = 0;
            }
            newBeersAmount++;

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
