package com.assignment;
class Customer{
	int id;
	String name;
	double walletBalance;
	String address;
	public Customer(int id, String name, double walletBalance, String address) {
		super();
		this.id = id;
		this.name = name;
		this.walletBalance = walletBalance;
		this.address = address;
	}
}
class Item{
	int id;
	String name;
	String companyName;
	double price;
	boolean isInStock;
	public Item(int id, String name, String companyName, double price, boolean isInStock) {
		super();
		this.id = id;
		this.name = name;
		this.companyName = companyName;
		this.price = price;
		this.isInStock = isInStock;
	}
	public boolean isInstock() {
		// TODO Auto-generated method stub
		return isInStock;
	}
	
}
class ShoppingWebsite{
	public String purchaseItem(Item i, Customer c)throws ItemOutOfStockException,InsufficientBalanceException{
		if(!i.isInstock()) {
			throw new ItemOutOfStockException("Item is out of stock");
		}
		if(i.price>c.walletBalance) {
			throw new InsufficientBalanceException ("Customer wallet balance is not sufficient.");
		}
		return "Order Successful";
	}
}
class ItemOutOfStockException extends Exception{
	public ItemOutOfStockException(String message) {
		super(message);
	}
}
class InsufficientBalanceException extends Exception{
	public InsufficientBalanceException(String message) {
		super(message);
	}
}
public class SampleTestCase {
public static void main(String[] args) {
	Customer cusDet= new Customer(927392,"Steve",5000.0,"USA");
	Item itemDet = new Item(27392,"T-shirt","US polo",800,true);
	ShoppingWebsite obj= new ShoppingWebsite();
	try {
	String out=obj.purchaseItem(itemDet, cusDet);
	System.out.println("out= "+out);
	}catch(ItemOutOfStockException e) {
		System.out.println(e.getMessage());
	}catch(InsufficientBalanceException e) {
		System.out.println(e.getMessage());
	}
}
}
