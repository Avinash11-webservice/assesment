package com;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class Product {
	ProductService productservice=new ProductService();

	// Get call using spring based web services
	@GetMapping("/myurl")
	public String sayHello() {
		System.out.println("sayHello....");
		return "Hi User";
	}

	// retrieve the product info using @GET Method
	@GetMapping("/productinfo")
   public ProductInfo getProductInfo() {
		
		ProductInfo product =new  ProductInfo();
   //creating java object
   product.setProduct_id(1);
   product.setProduct_name("micromax");
   product.setSeller_id(22);
   product.setBrand_id(33);
   product.setInventory_id(55);
   product.setProduct_details("TOM");
   return product;

	}

	// retrieve the person information by id
	@GetMapping("/productinfo/{​​​​​​​id}​​​​​​​")
   public ProductInfo getStudentById(@PathVariable("id") Integer id) {
		
       ProductInfo product =new  ProductInfo();
       //creating java object
       product.setProduct_id(1);
       product.setProduct_name("micromax");
       product.setSeller_id(22);
       product.setBrand_id(33);
       product.setInventory_id(55);
       product.setProduct_details("TOM");
       return product;
       
  
}
		// add the product information POst
	@PostMapping(value = "/insertproductdetails")
  public ProductInfo insertDummyProduct(@RequestBody ProductInfo product) 
	
	{
		return new ProductService().addProduct(product); //calling the service
  }
		// update product info
	@PutMapping("/update")
  public ProductInfo updateProductInfo(@RequestBody ProductInfo product) 
	
{

  return new ProductService().updateProduct(product);
  
}

	// get list
	@GetMapping("/getlist")
  public List<ProductInfo> getDummyList()
	
	{
List<ProductInfo> listOfProduct = new ProductService().getAllProductlist();
  return listOfProduct;
	}  
	
	
	// delete list
	@DeleteMapping("/delete/{​​​​​​​id}​​​​​​​")
  public List<ProductInfo> deleteProductById(@PathVariable Integer id) {
	new ProductService().deleteProduct(id);
      return new ProductService().getAllProductlist();
	}

}
