package com.mycompany.tennis.controller;

import com.mycompany.tennis.core.entity.Joueur;
import com.mycompany.tennis.core.service.JoueurService;

import javax.security.auth.callback.CallbackHandler;
import java.sql.SQLOutput;
import java.util.Scanner;

public class JoueurController {

    private JoueurService joueurService;

    public JoueurController() {
        this.joueurService = new JoueurService();
    }

    public void afficheDetailsJoueur() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quel est le joueur dont vous voulez afficher les informations ?");
        long identifiant = sc.nextLong();
        Joueur resultat = joueurService.getJoueur(identifiant);
        System.out.println("Le joueuer sélectionné s'appelle " + resultat.getNom() + " " + resultat.getPrenom());
    }

    public void creerJoueur() {
        Scanner sc = new Scanner(System.in);
        Joueur joueur = new Joueur();
        System.out.println("Quel est le nom du joueur ?");
        String nomJoueur = sc.nextLine();
        joueur.setNom(nomJoueur);
        System.out.println("Quel est le prénom du joueur ?");
        String prenomJoueur = sc.nextLine();
        joueur.setPrenom(prenomJoueur);

        System.out.println("Quel est le sexe du joueur ?");
        char sexeJoueur = sc.nextLine().charAt(0);
        joueur.setSexe(sexeJoueur);

        joueurService.createJoueur(joueur);

        System.out.println("Le joueur créé est " + joueur.getNom() + " " + joueur.getPrenom() + " son identifiant est " + joueur.getId());

    }

    public void renommeJoueur() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quel est l'identifiant du joueur que vous voulez renommer ?");
        long identifiant = sc.nextLong();
        sc.nextLine();
        System.out.println("Quel est le nouveau nom ?");
        String nouveauNom = sc.nextLine();
        joueurService.renomme(identifiant, nouveauNom);
    }
public void changementSexe() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quel est l'identifiant du joueur ?");
        Long id = sc.nextLong();
        sc.nextLine();
        System.out.println("Quel est le nouveau sexe ?");
        Character nouveauSexe = (Character) sc.nextLine().charAt(0);
        joueurService.changementSexe(nouveauSexe, 53L);
}




}
