package modele;

import java.util.ArrayList;

public class Aventurier {

    private String nom;

    private Coordonnee coordonnee;
    private int eau;

    private ArrayList<ARTEFACT> artefact;
    private Case currentCase;

    private int nbAction ;

    public Aventurier(String nom, int x, int y){

        this.nom = nom;
        this.coordonnee.setX(x);
        this.coordonnee.setY(y);
        this.eau = 5;
        this.artefact = null;
        this.currentCase = null;
        this.nbAction = 4 ;
    }

    public int getNbAction(){
        return this.nbAction;
    }
    public void action(){
        if(this.nbAction >= 1 ){
            this.nbAction--;
        }
    }
    public void resetNbAction(){ this.nbAction = 4 ;}




    public void ramasseArtefact(ARTEFACT artefact) {

        if (this.artefact == null) {
                this.artefact = new ArrayList<ARTEFACT>();
                this.artefact.add(artefact);
        } else {
                this.artefact.add(artefact);
        }
    }

    public int getEau() { return eau; }
    public void boitEau(){
        this.eau--;
    }
    public void remplitEau(){
        this.eau = 5;
    }
    public void donneEau(Aventurier joueur){
        if(this.eau > 0 && this.currentCase == joueur.currentCase) {
            this.eau--;
            joueur.eau++;
        }
    }

    public void exploreCase(Case acase){

        if(acase.estBloquee() == false && this.currentCase.estAdjacente(acase)){
            this.currentCase = acase;
            this.coordonnee = acase.getCoord();

        }
        if(acase.estConnue() == false){
            this.currentCase.setConnue(true);
        }
    }

    public void ramasse(){
        if(this.currentCase.contientArtefact() && this.currentCase.getSandmass() <= 10){
            this.artefact.add(currentCase.getArtefact()) ;
            this.currentCase.setArtefact(null);
        }
        else {
            System.out.print("Pas d'artefact ou trop de sable");
        }
    }

    public void creuse(){

        if(this.currentCase.getSandmass() >= 5) {
            this.currentCase.addSandmass(-5);
        }
    }
}
