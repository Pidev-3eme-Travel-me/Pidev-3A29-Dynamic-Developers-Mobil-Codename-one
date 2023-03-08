/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.Date;

/**
 *
 * @author Oumayma
 */
public class Reclamation {
    private int id;
    private String TypeR,DescriptionR,Objet;
    private String DateR;

    public Reclamation(int id, String TypeR, String DescriptionR, String Objet, String DateR) {
        this.id = id;
        this.TypeR = TypeR;
        this.DescriptionR = DescriptionR;
        this.Objet = Objet;
        this.DateR = DateR;
    }

    public Reclamation(String TypeR, String DescriptionR, String Objet) {
        this.TypeR = TypeR;
        this.DescriptionR = DescriptionR;
        this.Objet = Objet;
    }

    public Reclamation(String TypeR, String DescriptionR, String Objet, String DateR) {
        this.TypeR = TypeR;
        this.DescriptionR = DescriptionR;
        this.Objet = Objet;
        this.DateR = DateR;
    }

    

    public Reclamation() {
        
    }
    
    public float getId() {
        return id;
    }

    public String getObjet() {
        return Objet;
    }

    public void setObjet(String Objet) {
        this.Objet = Objet;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTypeR() {
        return TypeR;
    }

    public void setTypeR(String TypeR) {
        this.TypeR = TypeR;
    }

    public String getDescriptionR() {
        return DescriptionR;
    }

    public void setDescriptionR(String DescriptionR) {
        this.DescriptionR = DescriptionR;
    }

    public String getDateR() {
        return DateR;
    }

    public void setDateR(String DateR) {
        this.DateR = DateR;
    }


    @Override
    public String toString() {
        return "Reclamation{" + "TypeR=" + TypeR + ", DescriptionR=" + DescriptionR + ", DateR=" + DateR + '}';
    }
    
    
    
}
