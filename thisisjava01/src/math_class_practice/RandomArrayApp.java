package math_class_practice;




public class RandomArrayApp {

	
	public static void main(String[] args) {
      int[] number = new int[7];
      
      for(int i=0; i<number.length; i++) {//배열의 길이는 인덱스의 갯수
    	  number [i] = (int) (Math.random()*45)+1;
    	  
    		for(int j=0;j<i;j++) {		//미리 뽑아놓은 걸로 결정	
				if(number[i] == number[j]) {
					i--;
					break;
				}

    		}
    		
      }
      for(int i = 0; i < number.length; i++) {
    	  System.out.print(number[i] + " ");
      }
      
	}
	
	}



      

