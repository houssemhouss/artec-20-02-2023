/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi.Entities;

/**
 *
 * @author houssem
 */
public class Client extends User {

    private String adresse;

    public Client() {
    }

     public Client(String prenom,String nom,String username,String password,String email,String tel,String adresse, Role role) {
    super(nom, prenom, username,email, password, tel, role);
    this.adresse = adresse;
}

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return super.toString() + " Adresse: " + adresse;
    }

}
