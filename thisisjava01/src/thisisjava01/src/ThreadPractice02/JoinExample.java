package ThreadPractice02;

public class JoinExample {

	public static void main(String[] args) {
      SumThread  sumThread = new SumThread();
      SumThread sumThread2 = new SumThread();
	  sumThread.start();
      try {
    	  sumThread.join();
      }catch(InterruptedException e) {
    	  
      }
       System.out.println("1~100합:" + sumThread.getSum());

	}

}
