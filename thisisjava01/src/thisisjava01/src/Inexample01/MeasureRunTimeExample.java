package Inexample01;

public class MeasureRunTimeExample {

	public static void main(String[] args) {
		long time1 = System.nanoTime();
		int sum=0;
		for(int i=1; i<100000; i++) {
			sum+=1;
		}
     long time2 = System.nanoTime();
     
     System.out.println("1~100000까지의 합:" +sum);
     System.out.println("계산에 " + (time2-time1) + " 나노초과 소요되었습니다");
	}

}
