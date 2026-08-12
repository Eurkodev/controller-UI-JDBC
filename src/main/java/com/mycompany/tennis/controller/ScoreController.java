package com.mycompany.tennis.controller;

import com.mycompany.tennis.core.dto.ScoreFullDto;
import com.mycompany.tennis.core.entity.Score;
import com.mycompany.tennis.core.service.ScoreService;

import java.util.Scanner;

public class ScoreController {
    public void afficheDetailsScore() {
        ScoreService scoreService = new ScoreService();
        Scanner sc = new Scanner(System.in);
        System.out.println("Quel est l'identifiant du score à afficher ?");
        Long identifiant = sc.nextLong();
        sc.nextLine();
        ScoreFullDto scoreDto = scoreService.getScore(identifiant);
        if(scoreDto.getSet1()!=null) System.out.println("Le score du set 1 est : " + scoreDto.getSet1());
        else System.out.println("Pas de score pour le set 1");
        if (scoreDto.getSet2()!=null) System.out.println("Le score du set 2 est : " + scoreDto.getSet2());
        else System.out.println("Pas de score pour le set 2");
        if (scoreDto.getSet3()!=null) System.out.println("Le score du set 3 est : " + scoreDto.getSet3());
        else System.out.println("Pas de score pour le set 3");
        if (scoreDto.getSet4()!=null) System.out.println("Le score du set 4 est : " + scoreDto.getSet4());
        else System.out.println("Pas de score pour le set 4");
        if (scoreDto.getSet5()!=null) System.out.println("Le score du set 5 est : " + scoreDto.getSet5());
        else System.out.println("Pas de score pour le set 5");
        }


    }




