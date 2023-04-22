package modele;


public class Zone {

    public static final int longueur = 5, largeur = 5 ;
    private Case[][] zone ;
    private String nom ;
    private int sandmassZone ;

    public Zone(String nom){

        this.nom = nom ;
        for(int i=0; i<longueur; i++){
            for(int j=0; j<largeur; j++){
                this.zone[i][j] = new Case(i,j);
            }
        }
    }

    public String getNom(){
        return this.nom;
    }

    public Case getCase(int x, int y){
        return this.zone[x][y] ;
    }

    public int getSandmassZone(){

        return this.sandmassZone ;
    }
    public void setSandmassZone(){
        for(Case[] ligne : zone){
            for(Case unit: ligne){
                this.sandmassZone += unit.getSandmass() ;
            }
        }
    }


}
