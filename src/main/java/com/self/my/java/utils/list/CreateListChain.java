package com.self.my.java.utils.list;

/**
 * 用于快速创建List对象，类似于StringBuilder的append方法
 * 
 * @author chenleitang
 */
public final class CreateListChain<E> {
	private ArrayList<E> arrayList;
	
	private LinkedList<E> linkedList;
	
	public CreateListChain() {
		
	}
	
	public ArrayList<E> newArrayList(){
		arrayList = new ArrayList<E>();
		return arrayList;
	}
	
	public LinkedList<E> newLinkedList(){
		linkedList = new LinkedList<E>();
		return linkedList;
	}
	
	@SuppressWarnings("hiding")
	public class ArrayList<E> extends java.util.ArrayList<E>{
		/**
		 * @author chenleitang
		 */
		private static final long serialVersionUID = 317071622303669232L;
		public ArrayList<E> set(E e){
			super.add(e);
			return this;
		}
	}
	
	@SuppressWarnings("hiding")
	public class LinkedList<E> extends java.util.LinkedList<E>{
		/**
		 * @author chenleitang
		 */
		private static final long serialVersionUID = 6835204872709442113L;
		public LinkedList<E> set(E e){
			super.add(e);
			return this;
		}
	}
}
