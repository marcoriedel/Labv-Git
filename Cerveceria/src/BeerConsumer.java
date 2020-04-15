import java.util.Random;

public class BeerConsumer implements Runnable {

    private String name;
    private BeerHouse beerHouse;

    public BeerConsumer (String name, BeerHouse bh){
        this.beerHouse = bh;
        this.name = name;
    }

    @Override
    public void run() {
        while (true){
                if(beerHouse.beers > 0){
                    Random ran = new Random();
                    int order = ran.nextInt(3) + 1;
                    System.out.println(name+": I want "+order+ " beer.");
                    beerHouse.consumeBeer(order);
                    /*try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }*/
                }else {
                    System.out.println("No More beers for today my friends... ");
                    System.exit(0);
                }
        }
    }
}
