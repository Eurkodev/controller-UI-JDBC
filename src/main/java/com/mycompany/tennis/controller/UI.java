package com.mycompany.tennis.controller;

public class UI {
    public static void main(String[] args) {
        JoueurController joueurController = new JoueurController();
        //joueurController.afficheDetailsJoueur();
        TournoiController tournoiController = new TournoiController();

        //joueurController.creerJoueur();

        //tournoiController.creerTournoi();
        tournoiController.afficheDetailsJoueur();
    }
}
