
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi;

import pi.Entities.Artiste;
import pi.Entities.Client;
import pi.Entities.User;
import pi.Entities.Role;
import pi.Services.ServiceArtiste;
import pi.Services.ServiceClient;
import pi.Services.ServiceUser;

/**
 *
 * @author Mohamed
 */
public class pi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //User u =new User("houssem", "hosni",Role.artiste);
        Client c = new Client("hosni", "houssem","hannibal","hosni.houssem.1@esprit.com","223JMT6342","504146308","Ben Arous",Role.client);
         Artiste a = new Artiste("hosni", "houssem","hannibal","hosni.houssem.1@esprit.com","223JMT6342","salut je un artiste!!","504146308",Role.artiste);

//public Client(String prenom,String nom,String username,String password,String email,String tel,String adresse, Role role)
      
        ServiceClient su = new ServiceClient();
        ServiceArtiste su1 = new ServiceArtiste();
        //sp.add(u);
        //su.add(c);
        //su.add(u2);
        su1.add(a);
        System.out.println(su.affciher());

       
 
         Artiste artiste = new Artiste();
        artiste.setId(40);
        
                artiste.setNom("Kchich");
                artiste.setPrenom("Nour");
                artiste.setUsername("nawara");
                artiste.setPassword("18/08/2000");
                artiste.setEmail("nour@gmail.com");
                artiste.setTel("50146308");
                artiste.setBio(" j aime l art");

        Boolean result = su1.modifier(artiste);
        if (result) {
            System.out.println("User modified successfully.");
        } else {
            System.out.println("Failed to modify user.");
        }

         //Client clientToDelete = new Client();
        //clientToDelete.setId(30);
        //boolean success = su.supprimer(clientToDelete);
        //if (success) {
        //    System.out.println("User deleted successfully.");
        //} else {
        //    System.out.println("Failed to delete user.");
        //}
    }
}
