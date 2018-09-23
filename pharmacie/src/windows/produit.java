/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package windows;

/**
 *
 * @author Ousmane
 */
public class produit {
    private int idm;
    private int cb;
    private String design;
    private String type ;
    private String forme;
    private int stockmax;
    private int stockmin;

    public produit(int idm, int cb, String design, String type, String forme, int stockmin, int stockmax) {
        this.idm = idm;
        this.cb = cb;
        this.design = design;
        this.type = type;
        this.forme = forme;
        this.stockmax = stockmax;
        this.stockmin = stockmin;
    }

    public int getIdm() {
        return idm;
    }

    public int getCb() {
        return cb;
    }

    public String getDesign() {
        return design;
    }

    public String getType() {
        return type;
    }

    public String getForme() {
        return forme;
    }

    public int getStockmax() {
        return stockmax;
    }

    public int getStockmin() {
        return stockmin;
    }
}
