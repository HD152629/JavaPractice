/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *	 |_Car
 * 
 * 1. 개요:
 * 2. 작성일 : 2017. 3. 23.
 * </pre>
 * 
 * @author		: Jeon
 * @version		: 1.0
 */
public class Car3 {
	
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	private int price;
	
	public Car3(String company, String model,int maxSpeed,String color,int price){
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.price = price;
	}
	
	public Car3(String company,String model,int maxSpeed,String color){
		this(company,model,0,color,0);
	}
	
	public Car3(String company, String model,String color){
		this(company,model,0,color);
	}
	
	public Car3(String company, String model,String color,int maxSpeed){
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	public String getCompany(){
		return company;
	}
	public String getModel(){
		return model;
	}
	public String getColor(){
		return color;
	}
	public int getMaxSpeed(){
		return maxSpeed;
	}
	public int getPrice(){
		return price;
	}
	
	/*
	public void setCompany(String newCompany){
		company = newCompany;
	}
	public void setModel(String newModel){
		model = newModel;
	}
	public void setColor(String newColor){
		color = newColor;
	}
	public void setMaxSpeed(int newmaxSpeed){
		maxSpeed = newmaxSpeed;
	}
	public void setPrice(int newPrice){
		price = newPrice;
	}
	*/
	
	
	
	
	
}
