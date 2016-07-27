package cqu.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListAll {
	public static void main(String[] args) {
		String[] array= {"1","2","3","4"};
		listAll(Arrays.asList(array), "");
	}
	
	public static void listAll(List<String> list,String prefix) {
			System.out.println(prefix);
	
		for(int i =0;i<list.size();i++){
			List<String> temp = new LinkedList<String>(list);
			listAll(temp, prefix+temp.remove(i));
			
		}
		
	}
}
