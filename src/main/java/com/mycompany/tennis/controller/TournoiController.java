package com.mycompany.tennis.controller;

import com.mycompany.tennis.core.dto.TournoiDto;
import com.mycompany.tennis.core.entity.Joueur;
import com.mycompany.tennis.core.entity.Tournoi;
import com.mycompany.tennis.core.service.TournoiService;

import java.util.Scanner;

public class TournoiController {

    private TournoiService tournoiService;

    public TournoiController() {
        tournoiService = new TournoiService();
    }

    public void afficheDetailsTournoi() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quel est le tournoi dont vous voulez afficher les informations ?");
        long identifiant = sc.nextLong();
        TournoiDto tournoi = tournoiService.getTournoi(identifiant);
        System.out.println("Le tournoi sélectionné est " + tournoi.getNom() + " " + tournoi.getCode());
    }
    public void creerTournoi() {
        Scanner sc = new Scanner(System.in);
        TournoiDto tournoiDto = new TournoiDto();
        System.out.println("Quel est le nom du tournoi ?");
        String nomTournoi = sc.nextLine();
        tournoiDto.setNom(nomTournoi);

        System.out.println("Quel est le code du tournoi ?");
        String codeTournoi = sc.nextLine();
        tournoiDto.setCode(codeTournoi);

        tournoiService.createTournoi(tournoiDto);

        System.out.println("Le tournoi créé est " + tournoiDto.getNom() + " " + tournoiDto.getCode());

    }

    public void supprimeTournoi() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quel est le tournoi a supprimer ?");
        long identifiant = sc.nextLong();
        sc.nextLine();
        tournoiService.deleteTournoi(identifiant);
    }

}
