public class BeerProducter implements Runnable{

    private BeerHouse beerHouse;
    public BeerProducter (BeerHouse bh){
        this.beerHouse = bh;
    }

    @Override
    public void run() {
        //int newBeersAmount = 0;
        while(true){
            beerHouse.rechargeBeer();

            /*try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
        }
    }
}
