package collections;

public class Res_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Restuarant res=new Restuarant();
          Customer c=new Customer();
          c.customerdetails();
          res.displaymenu();
          c.customer_order();    
          /*res.addmenuList("pizza", 50);
          res.displaymenu();
          res.removeItem("Dosa");
          res.displaymenu();*/
	}

}
