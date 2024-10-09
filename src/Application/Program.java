package Application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	Map<String, Integer> map = new LinkedHashMap<>();
    	System.out.print("Enter file full path:");
    	String path = sc.nextLine();
    	
    	try(BufferedReader br = new BufferedReader(new FileReader(path))){
    		String total; 
    		while((total = br.readLine()) != null) {
    			if(!total.isEmpty()){
    			String[] list = total.split(" ");
    			String name = list[0];
    			Integer quantity = Integer.parseInt(list[1]);
    			map.put(name,map.getOrDefault(name,0)+ quantity);  			 		  
    			}   			
    		}
    		for(String m : map.keySet()) {
    			System.out.println(m +":"+ map.get(m));	
    		}
    	}catch(IOException e) {
    		System.out.println("Error" + e.getMessage());
 
    	}finally {
    		if(sc != null)
    			sc.close();
    	}
	}
}
