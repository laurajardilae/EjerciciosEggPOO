package servicio;

import entidad.Raices;

public class service {
    public double getDiscriminante(Raices r){
        return Math.pow(r.getB(),2)-4*r.getA()*r.getC();
    }
    public boolean tieneRaices(Raices r){
        return getDiscriminante(r)>=0;
    }
    public boolean tieneRaiz(Raices r){
        return getDiscriminante(r)==0;
    }

}
