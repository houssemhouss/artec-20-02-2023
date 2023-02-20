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
public class Artiste extends User {

    private String bio;

    public Artiste() {
    }

    public Artiste(String prenom,String nom,String username,String password,String email,String tel,String bio, Role role) {
        super(nom, prenom, username, password, email, tel, role);
        this.bio = bio;
    }

    public Artiste(String bio) {
        this.bio = bio;
    }

    

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    @Override
    public String toString() {
        return super.toString() + " Bio: " + bio;
    }

}
