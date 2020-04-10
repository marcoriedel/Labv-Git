public class Main {

    public static void main(String[] args) {
        BeerHouse bh = new BeerHouse();
        Thread beerProducer = new Thread(new BeerProducter(bh));
        Thread beerConsumer = new Thread(new BeerConsumer("Marco",bh));
        Thread beerConsumer2 = new Thread(new BeerConsumer("Diego",bh));
        Thread beerConsumer3 = new Thread(new BeerConsumer("Juan",bh));
        Thread beerConsumer4 = new Thread(new BeerConsumer("Pedro",bh));

        beerProducer.start();
        beerConsumer.start();
        beerConsumer2.start();
        beerConsumer3.start();
        beerConsumer4.start();
    }
}