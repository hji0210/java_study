package thisisjava01;

public class FootBallPlayer {
	
	String name;
	String uniformNumber;
	String teamName;
	int speed;
	int tech;
	
	void printInfo(){ //실행한 것으로 값을 돌려주지 않고 그냥 출력만함
	System.out.println("====FootballPlayerInfo======");
	System.out.println("선수= " + name);
	System.out.println("유니폼번호= " + uniformNumber);
	System.out.println("팀이름= " + teamName);
	System.out.println("속도= " + speed);
	System.out.println("기술= " + tech);
	}
	

}
