package com.syntax.class32;

import java.util.ArrayList;
import java.util.List;

public class ListDemoSohilDid {
	
	
	public List<String> findElement() {
		ArrayList<String>list=new ArrayList<>();
		
		list.add("Hello");
		list.add("bye");
		list.add("Hello");
		return list;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListDemoSohilDid d=new ListDemoSohilDid();
		List<String>list=d.findElement();

	}

}
