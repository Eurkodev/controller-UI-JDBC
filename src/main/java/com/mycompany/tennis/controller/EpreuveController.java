package com.mycompany.tennis.controller;

import com.mycompany.tennis.core.dto.EpreuveFullDto;
import com.mycompany.tennis.core.dto.EpreuveLightDto;
import com.mycompany.tennis.core.dto.JoueurDto;
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
        EpreuveFullDto epreuve = epreuveService.getEpreuveDetaillee(identifiant);
        System.out.println("Le nom du tournoi est : " + epreuve.getTournoi().getNom());
        for (JoueurDto joueurdto : epreuve.getParticipants()) {
            System.out.println(joueurdto.getNom() + " " + joueurdto.getPrenom());
        }
    }

    public void afficheRolandGarros() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quel est l'épreuve dont vous voulez afficher les informations ?");
        long identifiant = sc.nextLong();
        EpreuveLightDto epreuve = epreuveService.getEpreuveSansTournoi(identifiant);
    }

}
