package practice0522;

public class Car {
	//필드 선언
	public int speed;
	
	//메소드 선언
	public void SpeedUp() {
		speed += 1;
   }
	
	//final 메소드
	public final void stop() {
		System.out.println("차를 멈춤");
		speed = 0;
	}

}
