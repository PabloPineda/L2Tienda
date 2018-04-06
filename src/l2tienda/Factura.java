/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l2tienda;

/**
 *
 * @author Pablo López
 */
public class Factura {
    public Factura(){
    }
    public String FechaFact;
    public int CódigoF,CódigoP, CantidadP ;

    public String getFechaFact() {
        return FechaFact;
    }

    public int getCódigoF() {
        return CódigoF;
    }

    public int getCódigoP() {
        return CódigoP;
    }

    public int getCantidadP() {
        return CantidadP;
    }

    public void setFechaFact(String FechaFact) {
        this.FechaFact = FechaFact;
    }

    public void setCódigoF(int CódigoF) {
        this.CódigoF = CódigoF;
    }

    public void setCódigoP(int CódigoP) {
        this.CódigoP = CódigoP;
    }

    public void setCantidadP(int CantidadP) {
        this.CantidadP = CantidadP;
    }
    
    
}
