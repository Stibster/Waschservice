/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waschservice.core;

/**
 *
 * @author tmann
 */
public class Waschmaschine {
    
    private int wmId;
    private Besitzer wmBesitzer;

    public void setWmId(int wmId) {
	this.wmId = wmId;
    }

    public void setWmBesitzer(Besitzer wmBesitzer) {
	this.wmBesitzer = wmBesitzer;
    }

    public int getWmId() {
	return wmId;
    }

    public Besitzer getWmBesitzer() {
	return wmBesitzer;
    }
    
}
