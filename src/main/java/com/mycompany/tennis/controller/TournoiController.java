package com.mycompany.tennis.controller;

import com.mycompany.tennis.core.entity.Joueur;
import com.mycompany.tennis.core.entity.Tournoi;
import com.mycompany.tennis.core.service.TournoiService;

import java.util.Scanner;

public class TournoiController {

    private TournoiService tournoiService;

    public TournoiController() {
        tournoiService = new TournoiService();
    }

    public void afficheDetailsJoueur() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quel est le tournoi dont vous voulez afficher les informations ?");
        long identifiant = sc.nextLong();
        Tournoi tournoi = tournoiService.getTournoi(identifiant);
        System.out.println("Le tournoi sélectionné est " + tournoi.getNom() + " " + tournoi.getCode());
    }
    public void creerTournoi() {
        Scanner sc = new Scanner(System.in);
        Tournoi tournoi = new Tournoi();
        System.out.println("Quel est le nom du tournoi ?");
        String nomTournoi = sc.nextLine();
        tournoi.setNom(nomTournoi);

        System.out.println("Quel est le code du tournoi ?");
        String codeTournoi = sc.nextLine();
        tournoi.setCode(codeTournoi);

        tournoiService.createTournoi(tournoi);

        System.out.println("Le tournoi créé est " + tournoi.getNom() + " " + tournoi.getCode());

    }



}
