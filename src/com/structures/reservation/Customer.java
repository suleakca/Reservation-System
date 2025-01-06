package com.structures.reservation;

import java.util.ArrayList;

public class Customer implements Comparable<Customer> {
	// attributes
	private String nameandsurname;
	private int idnumber;
	private String emailaddress;
	private int phonenumber;
	private ArrayList<String> service;
	private int periodofstay;
	private int creditcardinfo;
	private int point;

	// getters and setters

	public String getNameandsurname() {
		return nameandsurname;
	}

	public void setNameandsurname(String nameandsurname) {
		this.nameandsurname = nameandsurname;
	}

	public int getIdnumber() {
		return idnumber;
	}

	public void setIdnumber(int idnumber) {
		this.idnumber = idnumber;
	}

	public String getEmailaddress() {
		return emailaddress;
	}

	public void setEmailaddress(String emailaddress) {
		this.emailaddress = emailaddress;
	}

	public int getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}

	public ArrayList<String> getService() {
		return service;
	}

	public void setService(ArrayList<String> service) {
		this.service = service;
	}

	public int getPeriodofstay() {
		return periodofstay;
	}

	public void setPeriodofstay(int periodofstay) {
		this.periodofstay = periodofstay;
	}

	public int getCreditcardinfo() {
		return creditcardinfo;
	}

	public void setCreditcardinfo(int creditcardinfo) {
		this.creditcardinfo = creditcardinfo;
	}

	// default constructor
	public Customer() {

		nameandsurname = null;

		idnumber = 0;
		emailaddress = null;
		phonenumber = 0;
		service = null;
		periodofstay = 0;
		creditcardinfo = 0;

	}

	// constructor
	public Customer(String nameandsurname, int idnumber, String emailaddress, int phonenumber,
			ArrayList<String> service, int periodofstay, int creditcardinfo) {
		super();
		this.nameandsurname = nameandsurname;
		this.idnumber = idnumber;
		this.emailaddress = emailaddress;
		this.phonenumber = phonenumber;
		this.service = service;
		this.periodofstay = periodofstay;
		this.creditcardinfo = creditcardinfo;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	@Override
	public int compareTo(Customer o) {
		// TODO Credit card no comparison

		if (creditcardinfo > o.creditcardinfo) {
			return 1;
		} else if (creditcardinfo < o.creditcardinfo) {
			return -1;
		}
		else return 0;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return nameandsurname;
	}

}
