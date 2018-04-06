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
public class Administrador {
    public Administrador(){}
    public String Usuario, Password;

    public String getUsuario() {
        return Usuario;
    }

    public String getPassword() {
        return Password;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
}
