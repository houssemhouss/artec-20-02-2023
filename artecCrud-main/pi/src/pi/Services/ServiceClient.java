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
import java.util.ArrayList;
import java.util.List;
import pi.Entities.Client;
import pi.Entities.Role;
import pi.Utils.MyDB;

/**
 *
 * @author houssem
 */
public class ServiceClient implements IService<Client> {

    Connection cnx;
    Statement stm;

    public ServiceClient() {
        cnx = MyDB.getInstance().getCnx();

    }

    public void add(Client t) {
        try {
            String qry = "INSERT INTO `users`(`nom`,`prenom`,`username`,`password`,`email`,`tel`,`adresse`,`role`,`archive`) VALUES ('" + t.getNom() + "','" + t.getPrenom() + "','" + t.getUsername() + "','" + t.getPassword() + "','" + t.getEmail() + "','" + t.getTel() + "','" + t.getAdresse() + "','" + t.Role.client.toString() + "','" + 0 + "');";
            stm = cnx.createStatement();
            stm.executeUpdate(qry);
        } catch (SQLException ex) {

            System.out.println(ex.getMessage());

        }

    }

    @Override
    public List<Client> affciher() {
        List<Client> clients = new ArrayList();
        try {
            String qry = "SELECT * FROM `users` WHERE role = '" + Role.client.toString() + "'";

            stm = cnx.createStatement();

            ResultSet rs = stm.executeQuery(qry);

            while (rs.next()) {

                Client client = new Client();
                client.setId(rs.getInt("id_user"));
                client.setNom(rs.getString("nom"));
                client.setPrenom(rs.getString("prenom"));
                client.setUsername(rs.getString("username"));
                client.setPassword(rs.getString("password"));
                client.setEmail(rs.getString("email"));
                client.setTel(rs.getString("tel"));
                client.setAdresse(rs.getString("adresse"));
                client.setRole(Role.valueOf(rs.getString("role")));

                clients.add(client);
            }
            return clients;

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return clients;

    }

    @Override
    public Boolean modifier(Client t) {
        try {
            //`nom`,`prenom`,`username`,`password`,`email`,`tel`,`adresse`,`role`,`archive`
          
           
         String qry ="UPDATE `users` SET `nom`='" + t.getNom() + "',`prenom`='" + t.getPrenom() + "',`username`='" + t.getUsername() + "',`password`='" +t.getPassword() + "',`email`='" + t.getEmail() + "',`tel` ='" + t.getTel() +"',`adresse`='" +t.getAdresse() + "' WHERE id_user = '" + t.getId() + "';";
 
            stm = cnx.createStatement();
            stm.executeUpdate(qry);
            return true;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }

    @Override
    public Boolean supprimer(Client t) {

        try {
            String qry = "UPDATE `users` SET `archive`='" + 1 +  "' WHERE id = '" + t.getId() + "';";
            //String qry = "DELETE FROM user WHERE `id_user`='" + user.getId() + "'";
            stm = cnx.createStatement();
            stm.executeUpdate(qry);
            return true;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }

}
