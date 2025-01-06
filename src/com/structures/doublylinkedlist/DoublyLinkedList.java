package com.structures.doublylinkedlist;

import com.structures.reservation.Customer;

public class DoublyLinkedList {

	private NodeCustomer first;
	private NodeCustomer last;
	
	
	//empty 
	public DoublyLinkedList(){
		first = null;
		last = null;
	}

	public boolean isEmpty(){
		return first==null;	
	}
		
		
	public void insertAtFront(Customer c){
		if(isEmpty()){
			
			first=last=new NodeCustomer(c,first);
			
		}
		else
		{
			NodeCustomer x = new NodeCustomer(c);
			x.setNext(first);
			first.setPrev(x);
			first=x;
		}
	}
		
			
	public void removeFromFront(){
			
		if(isEmpty()){				
			System.out.println("the list is empty");
					
		}
		else
		{
			if(first==last)
				first=last=null;
		    else
		    {
		    first=first.getNext();
		    first.setPrev(null);
		    }
	     }
	}
					
					
	public void removeFromBack(){
		if(isEmpty()){	
			System.out.println("the list is empty");
		}
		else{
			
			if(first==last)
				first=last=null;
			else{
				last=last.getPrev();
				last.setNext(null);
			}			
		}
	}
	
	
	
	
	
	
	
	
	
	
}//class
