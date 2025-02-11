package collections;

import java.util.HashMap;
import java.util.Set;


public class Restuarant  {
	HashMap<String,Integer> menu=new HashMap<>();
	
	public Restuarant()
	{
		menu.put("idli",10);
		menu.put("Dosa",15);
		menu.put("Vada",20);
		menu.put("Poori",25);
		menu.put("Paratha",30);		
	}
	
	void addmenuList(String food,int price)
	{
	   menu.put(food,price);
	}
	
	void removeItem(String item)
	{
		menu.remove(item);
		System.out.println(" ");
		System.out.println("Removing item :"+item);
	}
	void displaymenu()
	{
		System.out.println("-------------Food available in menu-----------------");
		for(String food:menu.keySet())
		{
			System.out.println(food +"---->  "+menu.get(food));
		}
	}
	
	
}
