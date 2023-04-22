package modele;

public class Coordonnee {

    private int x, y ;

    public Coordonnee(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }


    public String toString() {
        return "Coordonnee : x = " + this.x + ", y = " + this.y ;
    }

}
