/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package windows;

/**
 *
 * @author MOUSTAPHA
 */
public class profil {
    private int id;
    private String login;
    private String pass;
    private String designation;

    public profil(int id, String login, String pass, String designation) {
        this.id = id;
        this.login = login;
        this.pass = pass;
        this.designation = designation;
    }

    public int getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getPass() {
        return pass;
    }

    public String getDesignation() {
        return designation;
    }
}
