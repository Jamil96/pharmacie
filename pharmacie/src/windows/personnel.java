/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package windows;

import java.sql.Date;

/**
 *
 * @author MOUSTAPHA
 */
public class personnel {
private int id;
private double salaire;
private int cin;
private String nom;
private String prenom;
private Date date;
private String adress;
private int tel;
private String email;
private int fax;
private int idpro;

    public personnel(int id, double salaire, int cin, String nom, String prenom, Date date, String adress, int tel, String email, int fax, int idpro) {
        this.id = id;
        this.salaire = salaire;
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
        this.date = date;
        this.adress = adress;
        this.tel = tel;
        this.email = email;
        this.fax = fax;
        this.idpro = idpro;
    }

    public int getId() {
        return id;
    }

    public double getSalaire() {
        return salaire;
    }

    public int getCin() {
        return cin;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public Date getDate() {
        return date;
    }

    public String getAdress() {
        return adress;
    }

    public int getTel() {
        return tel;
    }

    public String getEmail() {
        return email;
    }

    public int getFax() {
        return fax;
    }

    public int getIdpro() {
        return idpro;
    }

}
