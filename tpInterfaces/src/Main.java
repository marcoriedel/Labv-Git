import Interfaces.IBeber;
import Model.*;

public class Main {

    public static void main(String[] args){
        Espartano espartano = new Espartano("Marco",34,120);
        espartano.setiBeberr(new BeberEspartanoImp());
        espartano.setiOrinar(new OrinarEspartanoImp());

        Vikingo vikingo = new Vikingo("Vikingo",23,90);
        vikingo.setiOrinar(new OrinarVikingoImp());
        vikingo.setiBeber(new BeberVikingoImp());

        System.out.println(espartano.beber()+"-"+espartano.orinar()+" ---- "+vikingo.beber()+"-"+vikingo.orinar());


    }
}
