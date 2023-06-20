package anonymous01;

import interface04.B;

public class App {


	public static void main(String[] args) {

		System.out.println("===== Variable =====");
		System.out.println("\n----- implements Interface -----");
        Beer beer  = new Beer();
        beer.drink();
        
        Soda soda = new Soda();
        soda.drink();
        
        Water water = new Water();
        water.drink();
        
		System.out.println("\n----- Anonymous -----");
		// 익명 클래스는 Beer, Soda, Water 클래스를 생성하지 않는다.

		
		//익명 객체의 생성자 만들기
		Drink beer1= new Drink() {//beer나 water클래스 안만들고 생성
			@Override
			public void drink() {
			System.out.println("맥주를 마시다.");	
			}
		};//class가 따로 없어서 ;함
		
		beer1.drink();
		
		Drink soda1= new Drink() {
			@Override
			public void drink() {
			System.out.println("소다를 마시다.");	
			}
		};
		soda1.drink();
		
		
		Drink water1= new Drink() {
			@Override
			public void drink() {
			System.out.println("물을 마시다.");	
			}
		};
		water1.drink();
		
		
		
		
		
		 //람다식
	      
	      System.out.println("\n-----Lambda -----");
		  Drink beer2 =() -> {
			System.out.println("맥주를 마시다.");  
		  };
		  beer2.drink();
		
		  

		  Drink soda2 =() -> {
			System.out.println("소다를 마시다.");  
		  };
		    soda2.drink();
		
		  
	
		  Drink water2 =() -> {
			System.out.println("물을 마시다.");  
		  };
		    water2.drink();
		
		


		System.out.println("\n===== Method =====");
		System.out.println("\n----- implements Interface -----");
         

		
		System.out.println("\n----- Anonymous -----");

		
		
		
		
	       //매소드 안에서 익명개체 정의
	      Biz b = new Biz();
	      b.biz(new Drink() {//new Drink를 해야하는데 자체에서 만듬
	    	  @Override
				public void drink() {
				System.out.println("맥주를 마시다.");	
				}
	      });

	      b.biz(new Drink() {//new Drink를 해야하는데 자체에서 만듬
	    	  @Override
				public void drink() {
				System.out.println("소다를 마시다.");	
				}
	      });
	      

	      b.biz(new Drink() {//new Drink를 해야하는데 자체에서 만듬
	    	  @Override
				public void drink() {
				System.out.println("물을 마시다.");	
				}
	      });
	      

	      b.biz(new Drink() {//new Drink를 해야하는데 자체에서 만듬
	    	  @Override
				public void drink() {
				System.out.println("와인을 마시다.");	
				}
	      });
	      

	      b.biz(new Drink() {//new Drink를 해야하는데 자체에서 만듬
	    	  @Override
				public void drink() {
				System.out.println("커피를 마시다.");	
				}
	      });
	     
	      
	      
	      //람다식
	      System.out.println("\n-----Lambda -----");
	      b.biz(() -> {
	    	  System.out.println("콜라를 마시다.");
	    	  
	      });
	      
	      b.biz(() -> {
	    	  System.out.println("주스를 마시다.");
	    	  
	      });
	      

	}

}


