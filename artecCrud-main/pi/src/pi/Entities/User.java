/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi.Entities;

/**
 *
 * @author Mohamed
 */
public class User {

     protected int id;
     protected String nom;
     protected String prenom;
     protected String username;
     protected String password;
     protected String tel,email;
     
     public  Role Role;

    public User() {
    }

    // Constructeur

    public User(String nom, String prenom, String username, String password,String email, String tel, Role Role) {
        this.nom = nom;
        this.prenom = prenom;
        this.username = username;
        this.password = password;
        this.tel = tel;
        this.email=email;
        this.Role = Role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    public Role getRole() {
        return Role;
    }

    public void setRole(Role Role) {
        this.Role = Role;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", username=" + username + ", password=" + password + ", tel=" + tel + ", email=" + email + ", Role=" + Role + '}';
    }

    

}