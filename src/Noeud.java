import java.util.*;

public class Noeud {
    private int id;
    LinkedList<Arc> succ=new LinkedList<Arc>();
    boolean mark;


    public Noeud(int id) {
        this.id=id;

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id=id;
    }


    public 	LinkedList<Arc> getSuccesseurs(){
        return this.succ;
    }

    public boolean isMark() {
        return mark;
    }


    public void setMark(boolean mark) {
        this.mark = mark;
    }


    public void setSuccesseurs(LinkedList<Arc> succ) {
        this.succ = succ;
    }


    public boolean hasSuccesseur(int j) {
        LinkedList<Integer> cibles = new LinkedList<Integer>();
        boolean trouve=false;

        for(Arc c:succ) {
            cibles.add(c.getCible().getId());
        }
        for(int i:cibles) {
            if(i==j) {
                trouve=true;
            }

        }
        return trouve;


    }

    public String toString() {
        String successeurs="";
        for(Arc n:this.succ) {

            successeurs=successeurs+n.getCible().getId()+" ";
        }
        if(!this.succ.isEmpty()) {
            return id+ " ---> "+ successeurs;
        }else {
            return id+"";
        }
    }
   int couleur;
    public int getDegre() {
        int cpt=0;
        for(Arc arc : succ) {
            cpt++;
        }
        return cpt;
    }

    public int getCouleur() {
        return couleur;
    }

    public boolean hasCouleur() {
        return couleur!=-1;
    }

    public void setCouleur(int couleur) {
        this.couleur = couleur;
    }

}
