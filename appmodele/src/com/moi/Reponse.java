/**
 * 
 */
package com.moi;

/**
 * @author BEN LAHMAR EL HABIB
 *
 */
public class Reponse {

	int idr;
	String reponse;
	boolean istrue;
	public int getIdr() {
		return idr;
	}
	public void setIdr(int idr) {
		this.idr = idr;
	}
	public String getReponse() {
		return reponse;
	}
	public void setReponse(String reponse) {
		this.reponse = reponse;
	}
	public boolean isIstrue() {
		return istrue;
	}
	public void setIstrue(boolean istrue) {
		this.istrue = istrue;
	}
	@Override
	public String toString() {
		return "Reponse [idr=" + idr + ", reponse=" + reponse + ", istrue=" + istrue + "]";
	}
	
}
