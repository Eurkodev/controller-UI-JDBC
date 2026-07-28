package com.mycompany.tennis.controller;

import com.mycompany.tennis.core.entity.Joueur;
import com.mycompany.tennis.core.service.JoueurService;

import java.sql.SQLOutput;
import java.util.Scanner;

public class JoueurController {

    private JoueurService joueurService;
    public void afficheDetailsJoueur() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quel est le joueur dont vous voulez afficher les informations ?");
        long identifiant = sc.nextLong();
        Joueur resultat = joueurService.getJoueur(identifiant);
        System.out.println("Le joueuer sélectionné s'appelle " + resultat.getNom() + " " + resultat.getPrenom());
    }
    public JoueurController() {
        this.joueurService = new JoueurService();
    }

}
