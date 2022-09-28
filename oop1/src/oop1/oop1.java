package oop1;

public class oop1 {

	public static void main(String[] args) {
		String mesaj = "Vade Oranı";
		
		//set value
		Product product1 = new Product();
		
		product1.setName("Delonghi Kahve Makinesi");
		product1.setUnitPrice(7500);
		product1.setDiscount(7);
		product1.setUnitsInStock(3);
		product1.setImageUrl("bilmemne jpg");
		
		System.out.println(product1.name);
		
		Product product2 = new Product();
		
		product2.setName("Smeng Kahve Makinesi");
		product2.setUnitPrice(7500);
		product2.setDiscount(8);
		product2.setUnitsInStock(2);
		product2.setImageUrl("bilmemne jpg");
		
         Product product3 = new Product();
		
		product3.setName("Kitchen Kahve Makinesi");
		product3.setUnitPrice(7500);
		product3.setDiscount(9);
		product3.setUnitsInStock(4);
		product3.setImageUrl("bilmemne jpg");
		
		Product[] products = {product1,product2,product3};
		
		for(Product product : products) {
		    System.out.println(product.getName());
		}
		IndividualCustomer individualCustomer = new	IndividualCustomer();
		individualCustomer.setId(0);
		individualCustomer.setPhone(mesaj);
		individualCustomer.setCustomerNumber(mesaj);
		individualCustomer.setFirstName("Engin");
		individualCustomer.setLasttName(mesaj);
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("Kodlama.io");
		corporateCustomer.setPhone("0543232323");
		corporateCustomer.setTaxNumber("11111165656");
		corporateCustomer.setCustomerNumber("54321");
		
       Customer[] customers = {individualCustomer,corporateCustomer};
    	   
       }

	}
