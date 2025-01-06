package com.structures.doublylinkedlist;

import com.structures.reservation.Customer;

public class NodeCustomer {

	private Customer c;
	private NodeCustomer prev;
	private NodeCustomer next;
	
	
	//no customer
	public NodeCustomer (){
		
		prev=null;
		next=null;
		c=null;
	}

	//1 customer
	public NodeCustomer (Customer c){
		
		prev=null;
		next =null;
		setC(c);
	}
	
       //more than one item 
	public NodeCustomer(Customer c, NodeCustomer next){
		prev=null;
		this.next=next;
		setC(c);
		
		
	}
	

	public NodeCustomer(Customer c, NodeCustomer prev, NodeCustomer next) {
		this.c = c;
		this.prev = prev;
		this.next = next;
		setC(c);
	}


	public Customer getC() {
		return c;
	}


	public void setC(Customer c) {
		this.c = c;
	}


	public NodeCustomer getPrev() {
		return prev;
	}


	public void setPrev(NodeCustomer prev) {
		this.prev = prev;
	}


	public NodeCustomer getNext() {
		return next;
	}


	public void setNext(NodeCustomer next) {
		this.next = next;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
