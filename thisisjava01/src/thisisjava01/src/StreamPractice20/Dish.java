package StreamPractice20;

import java.util.List;

public class Dish {
	private String food;
	private boolean vegetarian;
	private int calorie;
	private Type type;
	
	
	public Dish(String food, boolean vegetarian, int calorie, Type type) {

		this.food = food;
		this.vegetarian = vegetarian;
		this.calorie = calorie;
		this.type = type;
	}


	public String getFood() {
		return food;
	}


	public void setFood(String food) {
		this.food = food;
	}


	public boolean isVegetarian() {
		return vegetarian;
	}


	public void setVegetarian(boolean vegetarian) {
		this.vegetarian = vegetarian;
	}


	public int getCalorie() {
		return calorie;
	}


	public void setCalorie(int calorie) {
		this.calorie = calorie;
	}


	public Type getType() {
		return type;
	}


	public void setType(Type type) {
		this.type = type;
	}
	
	public void printInfo() {
		String str1 = " ";
        if(!vegetarian) {
        	str1 = "(X)";
        }
        
        String str2 = " ";
        switch(type) {
        case MEAT :
        	str2 = "고기";
        	break;
        	
        case OTHER : 
        	str2 = "기타";
        	break;
        case FISH :
        	str2 = "생선";
        	
        	
        }

		System.out.println("음식="+ food + " | 채식" + str1 + "| 열량=" + calorie + "(Kcal) " + " | " + str2 );

	}
	

	
}