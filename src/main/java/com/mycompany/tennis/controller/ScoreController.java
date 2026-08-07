package com.mycompany.tennis.controller;

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
        Score score = scoreService.getScore(identifiant);
        if(score.getSet1()!=null) System.out.println("Le score du set 1 est : " + score.getSet1());
        else System.out.println("Pas de score pour le set 1");
        if (score.getSet2()!=null) System.out.println("Le score du set 2 est : " + score.getSet2());
        else System.out.println("Pas de score pour le set 2");
        if (score.getSet3()!=null) System.out.println("Le score du set 3 est : " + score.getSet3());
        else System.out.println("Pas de score pour le set 3");
        if (score.getSet4()!=null) System.out.println("Le score du set 4 est : " + score.getSet4());
        else System.out.println("Pas de score pour le set 4");
        if (score.getSet5()!=null) System.out.println("Le score du set 5 est : " + score.getSet5());
        else System.out.println("Pas de score pour le set 5");
        }


    }




