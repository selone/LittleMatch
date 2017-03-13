package com.cacheserverdeploy.deploy.util;

import java.util.Iterator;



public class Bag<Item> implements Iterable<Item> {
	private class Node{
		Item item;
		Node next;
	}
	private Node first;
	private int N;
	public boolean isEmpty(){return  N == 0; }
	public int size(){ return N;}
	public void add(Item item){
		Node oldFirst=first;
		first=new Node();
		first.item=item;
		first.next=oldFirst;
		N++;
	}
	
	@Override
	public Iterator<Item> iterator() {
		
		return new ListIterator();
	}
	private class ListIterator implements Iterator<Item>{
		private Node current = first;
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return current!=null;
		}
		public void remove(){}
		@Override
		public Item next() {
			Item item=current.item;
			current=current.next;
			return item;
		}
		
	}
	
}
