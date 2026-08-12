package com.mycompany.tennis.controller;

import com.mycompany.tennis.core.dto.EpreuveFullDto;
import com.mycompany.tennis.core.dto.MatchDto;
import com.mycompany.tennis.core.service.MatchService;

import java.util.Scanner;

public class MatchController {

    private MatchService matchService;

    public MatchController() {
        matchService = new MatchService();
    }

    public void afficheDetailsMatch() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quel est le match dont vous voulez afficher les informations ?");
        long identifiant = sc.nextLong();
        MatchDto matchDto = matchService.getMatch(identifiant);
        System.out.println("Il s'agit d'un match de " + matchDto.getEpreuve().getAnnee() + " qui s'est déroulé à " + matchDto.getEpreuve().getTournoi().getNom());

    }




}
