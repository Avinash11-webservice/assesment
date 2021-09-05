
package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ProductService {

	static HashMap<Integer,ProductInfo> productIdMap = null; // map list
	
	public ProductService() {
		if (productIdMap == null) {
			productIdMap = new HashMap<Integer, ProductInfo>();
			
			ProductInfo SamsungProduct = new ProductInfo(1, "samsungA30", 101, 201, 301, "ABC");
			ProductInfo MIProduct = new ProductInfo(2, "Redminote5pro", 102, 202, 302, "DEF");
			ProductInfo OppoProduct = new ProductInfo(3, "OppoA10", 103, 203, 303, "GHI");
			ProductInfo IPhoneProduct = new ProductInfo(4, "IPhone12", 104, 204, 304, "JKL");
			

			// adding map list of collections in java
			productIdMap.put(1, SamsungProduct);
			productIdMap.put(4, MIProduct);
			productIdMap.put(3, OppoProduct);
			productIdMap.put(2, IPhoneProduct);
	}
}
	public List<ProductInfo> getAllProductlist() {
		List<ProductInfo> productlist = new ArrayList<ProductInfo>(productIdMap.values());
		return productlist;
	}

	public ProductInfo getProduct(int id) {
		ProductInfo Product = productIdMap.get(id);
		return Product;
	}
	// add Product
		public ProductInfo addProduct(ProductInfo product) {
			product.setProduct_id(getMaxId() + 1);
	// key , value
			productIdMap.put(product.getProduct_id(), product); /// logic class
			return product;
		}

		// update
		public ProductInfo updateProduct(ProductInfo product) {
			if (product.getProduct_id() <= 0)
				return null;
			productIdMap.put(product.getProduct_id(), product);
			return product;
		}
	//delete

		public void deleteProduct(int id)

		{
			productIdMap.remove(id);
		}

		public static HashMap<Integer, ProductInfo> getProductIdMap()

		{

			return productIdMap;
		}

		// Utility method to get max id
		public static int getMaxId()
	    {
	    	int max = 0;
	        for (int id : productIdMap.keySet()){
	        	if (max <= id)
	                max = id;}
	        return max;
	    }
	}