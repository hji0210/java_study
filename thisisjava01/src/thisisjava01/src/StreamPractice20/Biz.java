package StreamPractice20;

import java.util.List;

import StreamPractice19.Color;

public class Biz {
       public static void viewMenu(List<Dish> menu) {
    	System.out.println("==== 메뉴 : 전체 ====="); 
    	menu.stream().forEach( n-> n.printInfo());
    	
        
       }
       public static void viewHighCaloriesMenu(List<Dish> menu) {
       	System.out.println("\n==== 메뉴 : 고열량(500 이상) =====");
       	menu.stream()
       	.filter(n -> n.getCalorie()>=500)
       	.sorted((n1, n2) -> Integer.compare(n2.getCalorie(), n1.getCalorie()))
       	.forEach(n -> n.printInfo());
          }
       
       
       public static void viewLowCaloriesMenu(List<Dish> menu) {
       	System.out.println("\n==== 메뉴 : 저열량(300 미만) =====");
     	menu.stream()
       	.filter(n -> n.getCalorie()<300)
       	.sorted((n1, n2) -> Integer.compare(n1.getCalorie(), n2.getCalorie()))
       	.forEach(n -> n.printInfo());
          }
       	
       	
       	
       	
       public static void viewFishMenu(List<Dish> menu) {
       	System.out.println("\n==== 메뉴 : 생선 =====");   
    	menu.stream()
      	.filter(n -> n.getType().equals(Type.FISH))
      	.sorted((n1, n2) -> Integer.compare(n1.getCalorie(), n2.getCalorie()))
      	.forEach(n -> n.printInfo());
       }
      	
       	
       	
       
       public static void viewMeatMenu(List<Dish> menu) {
       	System.out.println("\n==== 메뉴 : 고기 =====");   
    	menu.stream()
      	.filter(n -> n.getType().equals(Type.MEAT))
      	.forEach(n -> n.printInfo());
       }
      	
       	
       	
       	
          
       
       
       public static void viewVegetarianMenu(List<Dish> menu){
       	System.out.println("\n==== 채식 메뉴 =====");  
     	menu.stream()
      	.filter(n -> n.isVegetarian() == true )
      	.sorted((n1, n2) -> Integer.compare(n1.getCalorie(), n2.getCalorie()))
      	.forEach(n -> n.printInfo());
       }
      	
       	
          }
          

