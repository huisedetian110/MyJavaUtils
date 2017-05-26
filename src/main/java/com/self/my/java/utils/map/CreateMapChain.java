package com.self.my.java.utils.map;

/**
 * 用于快速创建map对象，类似于StringBuilder的append方法
 * 
 * @author chenleitang
 */
public final class CreateMapChain<K, V> {
	private HashMap<K, V> hashMap;
	
	private LinkedHashMap<K, V> linkedHashMap;
	
	/**
	 * 用于快速创建map对象，类似于StringBuilder的append方法
	 * 
	 * @author chenleitang
	 */
	public CreateMapChain() {
		
	}
	
	public HashMap<K, V> newHashMap(){
		hashMap = new HashMap<K, V>();
		return hashMap;
	}
	
	public LinkedHashMap<K, V> newLinkedHashMap(){
		linkedHashMap = new LinkedHashMap<K, V>();
		return linkedHashMap;
	}
	
	@SuppressWarnings("hiding")
	public class HashMap<K, V> extends java.util.HashMap<K, V>{
		/**
		 * @author chenleitang
		 */
		private static final long serialVersionUID = 6138743025548551368L;

		public HashMap<K, V> set(K key, V value){
			super.put(key, value);
			return this;
		}
	}
	
	@SuppressWarnings("hiding")
	public class LinkedHashMap<K, V> extends java.util.LinkedHashMap<K, V>{
		/**
		 * @author chenleitang
		 */
		private static final long serialVersionUID = 3315773776666880952L;

		public LinkedHashMap<K, V> set(K key, V value){
			super.put(key, value);
			return this;
		}
	}
}
