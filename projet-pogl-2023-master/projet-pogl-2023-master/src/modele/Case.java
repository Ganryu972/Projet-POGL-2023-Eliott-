package modele;

import java.util.ArrayList;

public class Case {

    // Coordonnées de la case
    private Coordonnee coord ;

    // Désigne si la case est connue ou pas
    private boolean connue;

    // Désigne si la zone est bloquée
    private boolean bloquee;

    // Quantité de sable
    private int sandmass;

    // Contient artefact ou non
    private ARTEFACT artefact;

    private static boolean clickable;

    private ArrayList<Aventurier> player;

    public Case(int x, int y){

        this.coord.setX(x);
        this.coord.setY(y);
        this.bloquee = false;
        this.artefact = null;
        this.sandmass = 0;
        this.connue = false;
    }

    public Coordonnee getCoord(){
        return this.coord ;
    }

    public boolean estBloquee(){
        return this.bloquee;
    }

    public void setBloquee(boolean bloquee) {
        this.bloquee = bloquee;
    }

    public boolean estConnue(){ return this.connue;}
    public void setConnue(boolean x){this.connue = x;}

    public boolean estAdjacente(Case cible){

        int resX, resY;
        resX = this.coord.getX() - cible.coord.getX();
        resY = this.coord.getY() - cible.coord.getY();
        if(resX >= -1 && resX <= 1){
            if(resY >=-1 && resY <= 1){
                return true ;
            }
        }
        return false ;
    }

    public void addSandmass(int x){
        this.sandmass += x ;
    }
    public int getSandmass() {
        return sandmass;
    }

    public boolean contientArtefact(){
        if(this.artefact != null){
            return true;
        }
        return false ;
    }

    public void setArtefact(ARTEFACT artefact) {
        this.artefact = artefact;
    }

    public ARTEFACT getArtefact() {
        return artefact;
    }


    public void addJoueur(Aventurier joueur) {

        if (this.player.isEmpty()) {
            this.player = new ArrayList<Aventurier>();
            this.player.add(joueur);
        } else this.player.add(joueur);
    }

}
