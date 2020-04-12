package Model;

import Interfaces.IBeber;
import Interfaces.IOrinar;

public class Espartano extends Humano {

    Integer toleranciaExtra;

    public IOrinar getiOrinar() {
        return iOrinar;
    }

    public void setiOrinar(IOrinar iOrinar) {
        this.iOrinar = iOrinar;
    }

    public IBeber getiBeber() {
        return iBeber;
    }

    public void setiBeberr(IBeber iBeber) {
        this.iBeber = iBeber;
    }

    IOrinar iOrinar;
    IBeber iBeber;

    public Espartano(String nombre, Integer edad, Integer peso) {
        super(nombre, edad, peso);
    }

    public Integer getToleranciaExtra() {
        return toleranciaExtra;
    }

    public void setToleranciaExtra(Integer toleranciaExtra) {
        this.toleranciaExtra = toleranciaExtra;
    }

    public String orinar(){
        return iOrinar.Orinar();
    }
    public String beber(){
        return iBeber.Beber();
    }



}
