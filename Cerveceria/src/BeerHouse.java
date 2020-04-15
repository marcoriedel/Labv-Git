public class BeerHouse {

     int beers=1;
     private boolean available = false;

     public synchronized void consumeBeer (int order){

         while (!available){
             try {
                 wait();
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
         }
         beers -= order;
         System.out.println("Beer Stock " + beers);
         available = true;
         if(beers <=10){
             available = false;
             notifyAll();
         }
    }
    public synchronized void  rechargeBeer (){
        while (!available)
        {
            beers ++;
            System.out.println("BeerHouse Stock: "+beers);
            if(beers >= 100){
                available=true;
                notifyAll();
            }

        }



    }

}