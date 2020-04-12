package Model;

import Interfaces.IBeber;
import Interfaces.IOrinar;

public class Vikingo extends Humano {

    Integer BebedorProfesional;
    IOrinar iOrinar;
    IBeber iBeber;

    public IOrinar getiOrinar() {
        return iOrinar;
    }

    public void setiOrinar(IOrinar iOrinar) {
        this.iOrinar = iOrinar;
    }

    public IBeber getiBeber() {
        return iBeber;
    }

    public void setiBeber(IBeber iBeber) {
        this.iBeber = iBeber;
    }

    public Vikingo(String nombre, Integer edad, Integer peso) {
        super(nombre, edad, peso);
    }

    public Integer getBebedorProfesional() {
        return BebedorProfesional;
    }

    public void setBebedorProfesional(Integer bebedorProfesional) {
        BebedorProfesional = bebedorProfesional;
    }

    public String orinar(){
        return  iOrinar.Orinar();
    }

    public String beber(){
        return iBeber.Beber();
    }



}
