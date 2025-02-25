package collections;
import java.util.Scanner;
import java.util.HashMap;

public class Customer extends Restuarant {
      HashMap<String,Integer> food=new  HashMap<>();
      String Name;
      Scanner sc=new Scanner(System.in);
      void customerdetails()
      {
    	  System.out.println("Enter your name:");
    	  Name=sc.nextLine();
    	  System.out.println("Welcome to my restuarant "+Name);
      }
      
      void customer_order()
      {
    	  
    	  System.out.println(" ");
    	  System.out.println("Enter your order and do you want to finish (type as done):");
    	  System.out.println(" ");
    	  while(true)
    	  {
    		  System.out.println("Enter an action: \n (1) Add item  \n  (2) Remove item  \n  (3) View order  \n  (4) Generate bill  \n  (5) Exit");
    	        int choice = sc.nextInt();
    	        
    	        switch(choice)
    	        {
    	        case 1:
    	      //Adding items
    	          add_items();
    	        break;
      
    	        case 2://Remove item
    	        	customer_removeitem();
    	        	break;
    	        	
    	        case 3:
    	        	displayorder();
    	        	break;
    	        	
    	        case 4:  // Generate bill
                    displaybill();
                    return; // Exit after generating the bill

                case 5:  // Exit order process
                    System.out.println("Exiting order process...");
                    return;

                default:
                   System.out.println("Invalid choice. Please enter a number between 1 and 5.");
             }
        }
   }
     void add_items() 
     {     
    	 while(true)
     
	     {
		  System.out.println("enter item :");  		  
	        String item=sc.next();
	       if(item.equalsIgnoreCase("done"))
	       {  
	    	   displayorder();
		       break;
		       
	       }
	         if(!menu.containsKey(item))
	       {
	        	 
	        	 System.out.println(" ");
	        	 System.out.println("Sorry that item not available in our menu .Please choose from menu")  ;
	    	   continue;
	       }
	         if(food.containsKey(item))
	         {
	        	 
	       	  System.out.println(" ");
	        	 System.out.println("Item is already present in your order ");
	        	 continue;
	         }
	         
	    	  System.out.println(" ");
	       System.out.println("enter quantity:");  
	       int quantity=sc.nextInt();
	       food.put(item,quantity);
	       } 
     }
      void customer_removeitem()
      {
    	  System.out.println(" ");
    	  System.out.print("Do you want to remove any item ?(yes /no ):");
    	   String customer="yes";
    	  customer=sc.next();
    	  if(customer.equalsIgnoreCase("yes"))
    	  {
    		  System.out.println("Enter the item to remove:");
    		  String item=sc.next(); 
    		  if(food.containsKey(item))
    		  {
    			 food.remove(item);
    			 System.out.println(item +" is removed from your order");
        	  } 
    	     else 
    	     {
    	    	System.out.println("Your item is not present in given order"); 
    	     }
    	  }
    	  displayorder();
     }
      
      void displayorder()
      {
    	  System.out.println(" ");
           if(!food.isEmpty())
            {
        	   
         	  System.out.println(" ");
              System.out.println("Your order :");
              for(String y:food.keySet())
              {
            	  
            	  System.out.print(" ");
        	  System.out.println(y +"---->" + food.get(y));
              }
         }
          else
          {
        	  
        	  System.out.println(" ");
        	  System.out.println("No food items are left:");
          }
       }
     void displaybill()
     {
    	 
    	 int total=0;
    	 System.out.print(" ");
    	 System.out.println("----------------Bill-------------------" +"\n Customer Name :"+Name);
    	 System.out.println(" ");
    	 for(String bills:food.keySet())
    	 {
    		 int sum=0;
    		 sum=menu.get(bills)*food.get(bills);
			System.out.println(bills + "----->"+menu.get(bills) +"x" +food.get(bills) +"=" +sum);
    		 total+=sum;
    	 }
    	 System.out.println(" ");
    	 System.out.println("Your bill :"+total);
    	 if(total<=200)
    	 {
    		  int discount = (total * 10) / 100; // 10% discount
              total -= discount;
              System.out.println(" ");
              System.out.println("You received a 10% discount! Discount Amount: " + discount);
              System.out.println("Final Bill After Discount: " + total);
    	 }
   }
}






























