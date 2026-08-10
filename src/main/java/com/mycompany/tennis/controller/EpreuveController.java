package com.mycompany.tennis.controller;

import com.mycompany.tennis.core.entity.Epreuve;
import com.mycompany.tennis.core.entity.Tournoi;
import com.mycompany.tennis.core.service.EpreuveService;
import com.mycompany.tennis.core.service.TournoiService;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class EpreuveController {

    private EpreuveService epreuveService;

    public EpreuveController() {
        epreuveService = new EpreuveService();
    }

    public void afficheDerniereEpreuve() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quel est l'épreuve dont vous voulez afficher les informations ?");
        long identifiant = sc.nextLong();
        Epreuve epreuve = epreuveService.getEpreuveAvecTournoi(identifiant);
        System.out.println("Le nom du tournoi est : " + epreuve.getTournoi().getNom());

    }

    public void afficheRolandGarros() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quel est l'épreuve dont vous voulez afficher les informations ?");
        long identifiant = sc.nextLong();
        Epreuve epreuve = epreuveService.getEpreuveSansTournoi(identifiant);

    }

}
