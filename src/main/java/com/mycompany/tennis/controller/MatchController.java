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
        MatchDto epreuve = matchService.getMatch(identifiant);

    }




}
