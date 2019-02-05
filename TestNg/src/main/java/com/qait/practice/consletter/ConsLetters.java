package com.qait.practice.consletter;

import java.util.ArrayList;
import java.util.Iterator;

public class ConsLetters {
	
	ArrayList<String> arr = new ArrayList<String>();	
	public ArrayList<String> checkEquals(ArrayList<String> name)
	{		
		Iterator<String> it = name.iterator();
		while(it.hasNext())
		{  
			String nameIndex = it.next();
			char firstChar = nameIndex.charAt(0);
						
			for(int j = 1; j < nameIndex.length(); j++)
			{
				if(firstChar == nameIndex.charAt(j))
				{						
					arr.add(nameIndex);
					break;
				}				
				firstChar = nameIndex.charAt(j);			
			}			
		}  
		return arr;
	}

}
