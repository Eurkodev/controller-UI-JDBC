package com.mycompany.tennis.controller;

import com.mycompany.tennis.core.dto.EpreuveFullDto;
import com.mycompany.tennis.core.dto.JoueurDto;
import com.mycompany.tennis.core.dto.MatchDto;
import com.mycompany.tennis.core.dto.ScoreFullDto;
import com.mycompany.tennis.core.entity.Match;
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
        if(matchDto.getScoreDto().getSet1()!=null) System.out.println("Le score du set 1 est : " + matchDto.getScoreDto().getSet1());
        else System.out.println("Pas de score pour le set 1");
        if (matchDto.getScoreDto().getSet2()!=null) System.out.println("Le score du set 2 est : " + matchDto.getScoreDto().getSet2());
        else System.out.println("Pas de score pour le set 2");
        if (matchDto.getScoreDto().getSet3()!=null) System.out.println("Le score du set 3 est : " + matchDto.getScoreDto().getSet3());
        else System.out.println("Pas de score pour le set 3");
        if (matchDto.getScoreDto().getSet4()!=null) System.out.println("Le score du set 4 est : " + matchDto.getScoreDto().getSet4());
        else System.out.println("Pas de score pour le set 4");
        if (matchDto.getScoreDto().getSet5()!=null) System.out.println("Le score du set 5 est : " + matchDto.getScoreDto().getSet5());
        else System.out.println("Pas de score pour le set 5");
        System.out.println("Il s'agit d'un match de " + matchDto.getEpreuve().getAnnee() + " qui s'est déroulé à " + matchDto.getEpreuve().getTournoi().getNom());

    }

    public void tapisVert() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quel est l'identifiant du match que vous voulez modifier ?");
        long identifiant = sc.nextLong();
        sc.nextLine();
        matchService.tapisVert(identifiant);

    }

    public void ajouterMatch() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quel est l'identifiant de l'épreuve ?");
        long epreuveId = sc.nextLong();
        sc.nextLine();
        System.out.println("Quel est l'identifiant du vainqueur ?");
        long vainqueurId = sc.nextLong();
        sc.nextLine();
        System.out.println("Quel est l'identifiant du finaliste ?");
        long finalisteId = sc.nextLong();
        sc.nextLine();

        MatchDto matchDto = new MatchDto();
        matchDto.setEpreuve(new EpreuveFullDto());
        matchDto.getEpreuve().setId(epreuveId);
        matchDto.setFinaliste(new JoueurDto());
        matchDto.getFinaliste().setId(finalisteId);
        matchDto.setVainqueur(new JoueurDto());
        matchDto.getVainqueur().setId(vainqueurId);

        System.out.println("Quelle est la valeur du set 1 ?");
        byte set1 = sc.nextByte();
        sc.nextLine();
        System.out.println("Quelle est la valeur du set 2 ?");
        byte set2 = sc.nextByte();
        sc.nextLine();System.out.println("Quelle est la valeur du set 3  ?");
        byte set3 = sc.nextByte();
        sc.nextLine();System.out.println("Quelle est la valeur du set 4 ?");
        byte set4 = sc.nextByte();
        sc.nextLine();System.out.println("Quelle est la valeur du set 5 ?");
        byte set5 = sc.nextByte();
        sc.nextLine();

        ScoreFullDto scoreFullDto = new ScoreFullDto();
        scoreFullDto.setSet1(set1);
        scoreFullDto.setSet2(set2);
        scoreFullDto.setSet3(set3);
        scoreFullDto.setSet4(set4);
        scoreFullDto.setSet5(set5);

        scoreFullDto.setMatch(matchDto);
        matchDto.setScoreDto(scoreFullDto);

       matchService.createMatch(matchDto);

    }
public void supprimeMatch() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quel est l'identifiant du match à supprimer ? ");
        long identifiant = sc.nextLong();
        sc.nextLine();
        matchService.deleteMatch(identifiant);

}


}
