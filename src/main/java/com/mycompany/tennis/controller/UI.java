package com.mycompany.tennis.controller;

import com.mycompany.tennis.core.entity.Score;

public class UI {
    public static void main(String[] args) {
        //JoueurController joueurController = new JoueurController();
       // joueurController.supprimeJoueur();


       //joueurController.afficheDetailsJoueur();

        //TournoiController controller = new TournoiController();
        //controller.afficheDetailsTournoi();

       // EpreuveController epreuveController = new EpreuveController();
        // epreuveController.afficheRolandGarros();

        //MatchController matchController = new MatchController();
        //matchController.afficheDetailsMatch();


       // matchController.afficheDetailsMatch();
       // matchController.ajouterMatch();

        ScoreController scoreController = new ScoreController();
        scoreController.supprimeMatch();
    }
}
