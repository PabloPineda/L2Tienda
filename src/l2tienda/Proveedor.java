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
public class Proveedor {
    public Proveedor(){
    }
        public String NombreEmpresa,NombreEncargado, PáginaWeb;
    public int DUI, Teléfono ; 
        public String getNombreEmpresa(){
        return NombreEmpresa;
        }
        
        public void setNombreEmpresa (String NombreEmpresa) {
        this.NombreEmpresa = NombreEmpresa;
        }

        public String getNombreEcargado(){
        return NombreEncargado;
        }
    
        public void setNombreEncargado (String NombreEncargado){
        this.NombreEncargado = NombreEncargado;
        }
        public String getPáginaWeb(){
        return PáginaWeb;
        }
        public void setPáginaWeb(String PáginaWeb){
        this.PáginaWeb = PáginaWeb;
        }
        public int getDUI(){
        return DUI;
        }
        public void setDUI(int DUI){
        this.DUI = DUI;
        }
        public int getTeléfono(){
        return Teléfono;}
        
        public void setTeléfono(int Teléfono){
           this.Teléfono = Teléfono;
       }
        
    }
    
    


