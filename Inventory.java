package collections;
import java.util.ArrayList;
public class Inventory {
        private ArrayList<Product>products;
         
        public Inventory()
        {
        	products=new ArrayList<>();
        }
         
        public void addProduct(Product product)
        {
        	products.add(product);
        	System.out.println("Products added in inventory :"+product.getName());
        }
        
        public void removeProduct(String productname,int productQuantity)
        {
        	for(Product product:products)
        	{
        		if(product.getName().equals(productname))
        		{
        			if(productQuantity<=product.getQuantity())
        			{
        				product.setQuantity(product.getQuantity()-productQuantity);
        			}
        			else
        			{
        				System.out.println("No enough stock to remove");
        			}
        		}
        	}
        	System.out.println("Product is removed from the inventory :"+"("+productname+ ","+productQuantity+")");
        }
        public void checkLowInventory()
        {
        	System.out.println("Product avaliable :");
        	for(Product product:products)
        	{
        		if(product.getQuantity()<10)
        		{
        			System.out.println("Low Inventory: "+product.getName() +"("+product.getQuantity()+")" );
        		}
        	}
        }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
              Inventory inventory=new Inventory();
               
              Product p1=new Product("Bata",8);
              Product p2=new Product("Paragon",9);
              Product p3=new Product("Adidas",8);
              
              inventory.addProduct(p1);
              inventory.addProduct(p2);
              inventory.addProduct(p3);
              
              inventory.checkLowInventory();

              inventory.removeProduct("Adidas",8);
              
              inventory.checkLowInventory();


	}

}
