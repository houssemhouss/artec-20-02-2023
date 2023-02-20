/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi.Services;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import pi.Entities.Artiste;
import pi.Utils.MyDB;
import java.util.ArrayList;
import pi.Entities.Role;

/**
 *
 * @author houssem
 */
public class ServiceArtiste implements IService<Artiste> {

   
    Connection cnx;
    Statement stm;

    public ServiceArtiste() {
        cnx = MyDB.getInstance().getCnx();

    }

    public void add(Artiste t) {
        try {
            String qry = "INSERT INTO `users`(`nom`,`prenom`,`username`,`password`,`email`,`tel`,`bio`,`role`,`archive`) VALUES ('" + t.getNom() + "','" + t.getPrenom() + "','" + t.getUsername() + "','" + t.getPassword() + "','" + t.getEmail() + "','" + t.getTel() + "','" + t.getBio() + "','" + t.Role.artiste.toString() + "','" + 0 + "');";
            stm = cnx.createStatement();
            stm.executeUpdate(qry);
        } catch (SQLException ex) {

            System.out.println(ex.getMessage());

        }

    }

    @Override
    public List<Artiste> affciher() {
        List<Artiste> artistes = new ArrayList();
        try {
            String qry = "SELECT * FROM `users` WHERE role = '" + Role.artiste.toString() + "'";

            stm = cnx.createStatement();

            ResultSet rs = stm.executeQuery(qry);

            while (rs.next()) {

                Artiste artiste = new Artiste();
                artiste.setId(rs.getInt("id_user"));
                artiste.setNom(rs.getString("nom"));
                artiste.setPrenom(rs.getString("prenom"));
                artiste.setUsername(rs.getString("username"));
                artiste.setPassword(rs.getString("password"));
                artiste.setEmail(rs.getString("email"));
                artiste.setTel(rs.getString("tel"));
                artiste.setBio(rs.getString("bio"));
                artiste.setRole(Role.valueOf(rs.getString("role")));

                artistes.add(artiste);
            }
            return artistes;

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return artistes;

    }

    @Override
    public Boolean modifier(Artiste t) {
        try {
            //`nom`,`prenom`,`username`,`password`,`email`,`tel`,`adresse`,`role`,`archive`
          
           
         String qry ="UPDATE `users` SET `nom`='" + t.getNom() + "',`prenom`='" + t.getPrenom() + "',`username`='" + t.getUsername() + "',`password`='" +t.getPassword() + "',`email`='" + t.getEmail() + "',`tel` ='" + t.getTel() +"',`adresse`='" +t.getBio() + "' WHERE id_user = '" + t.getId() + "';";
 
            stm = cnx.createStatement();
            stm.executeUpdate(qry);
            return true;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }

    @Override
    public Boolean supprimer(Artiste t) {
return null;    }
    
}
