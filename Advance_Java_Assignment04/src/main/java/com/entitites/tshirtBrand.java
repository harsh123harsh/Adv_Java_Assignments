package com.entitites;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class tshirtBrand {
	@Id
	private String ID;
	private String NAME;
	private String COLOUR;
	private String GENDER_RECOMMENDATION;
	private String SIZE;
	private float PRICE;
	private float RATING;
	private String AVAILABILITY;
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String nAME) {
		NAME = nAME;
	}
	public String getCOLOUR() {
		return COLOUR;
	}
	public void setCOLOUR(String cOLOUR) {
		COLOUR = cOLOUR;
	}
	public String getGENDER_RECOMMENDATION() {
		return GENDER_RECOMMENDATION;
	}
	public void setGENDER_RECOMMENDATION(String gENDER_RECOMMENDATION) {
		GENDER_RECOMMENDATION = gENDER_RECOMMENDATION;
	}
	public String getSIZE() {
		return SIZE;
	}
	public void setSIZE(String sIZE) {
		SIZE = sIZE;
	}
	public float getPRICE() {
		return PRICE;
	}
	public void setPRICE(float pRICE) {
		PRICE = pRICE;
	}
	public float getRATING() {
		return RATING;
	}
	public void setRATING(float rATING) {
		RATING = rATING;
	}
	public String getAVAILABILITY() {
		return AVAILABILITY;
	}
	public void setAVAILABILITY(String aVAILABILITY) {
		AVAILABILITY = aVAILABILITY;
	}
	@Override
	public String toString() {
		return "tshirtBrand [ID=" + ID + ", NAME=" + NAME + ", COLOUR=" + COLOUR
				+ ", GENDER_RECOMMENDATION=" + GENDER_RECOMMENDATION + ", SIZE=" + SIZE + ", PRICE=" + PRICE
				+ ", RATING=" + RATING + ", AVAILABILITY=" + AVAILABILITY + "]";
	}
	
}
