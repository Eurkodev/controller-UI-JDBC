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

    public void afficheDetailsEpreuve() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quel est l'épreuve dont vous voulez afficher les informations ?");
        long identifiant = sc.nextLong();
        Epreuve epreuve = epreuveService.getEpreuve(identifiant);
        System.out.println("L'épreuve sélectionnée se déroule en : " + epreuve.getAnnee() + " et il s'agit du tournoi " + epreuve.getTournoi().getNom());
    }

}
