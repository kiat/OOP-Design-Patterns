package edu.bu.met.cs665.emailcollectorsystem;

import java.util.ArrayList;
import java.util.List;


public abstract class Email {

	String header = "New Email";
	String text = "Some Text";
	String bcc = "NO BCC";
	String disclaimer = "NO DISCLAIMER";
	String virusInspection = "NO VIRUS SCAN";
	List<String> bccList = new ArrayList<>();
	String bccEmail;




	/**
	 * Method for adding email address to bcc list.
	 *
	 * @param bccEmail of shop
	 */
	public void addEmailToBccList(String bccEmail) {
		bccList.add(bccEmail);
	}

	/**
	 * Method for removing email address from bcc list.
	 *
	 * @param bccEmail of shop
	 */
	public void removeEmailFromBccList(String bccEmail) {
		bccList.remove(bccEmail);
	}

	/**
	 * Method for removing all email addresses from bcc list.
	 */
	public void removeBcc() {
		bccList.clear();
	}

	/**
	 * Getters and Setters.
	 */

	public String getBccEmail() {
		return bccEmail;
	}

	public void setBccEmail(String bccEmail) {
		this.bccEmail = bccEmail;
	}

	public List<String> getBccList() {
		return bccList;
	}

	public void setBccList(List<String> bccList) {
		this.bccList = bccList;
	}

	public String getEmail() {
		return header;
	}

	public String getEmailText() {
		return text;
	}

	public String getBcc() {
		return bcc;
	}

	public String getDisclaimer() {
		return disclaimer;
	}

	public String getVirusInspection() {
		return virusInspection;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public void setText(String text) {
		this.text = text;
	}

	public void setBcc(String bcc) {
		this.bcc = bcc;
	}

	public void setDisclaimer(String disclaimer) {
		this.disclaimer = disclaimer;
	}

	public void setVirusInspection(String virusInspection) {
		this.virusInspection = virusInspection;
	}

	/**
	 * The abstract method to be implemented by the classes extending from Email class.
	 */
	public abstract String sendEmail();
}
