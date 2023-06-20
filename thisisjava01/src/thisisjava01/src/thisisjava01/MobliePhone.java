package thisisjava01;

public class MobliePhone {//여기 파일에 정보가 다 들어가 있음


	
	String company;
	String product;
	String operatingsystem;
	int memory;
	int battery;
	int storage;
	boolean pen;
	String color;
	
	  void a() { //실행한 것으로 값을 돌려주지 않고 그냥 출력만함..?
			System.out.println("===========Mobile phone Info==========");
			System.out.println("회사=" + company );
			System.out.println("제품=" + product );
     		System.out.println("운영체제=" + operatingsystem );
			System.out.println("컬러= " + color );
			System.out.println("펜=" + pen );
			System.out.println("메모리=" + memory);
			System.out.println("스토리지=" + storage);
			System.out.println("배터리=" + battery);
			
		
				if (pen) {
					System.out.println("펜 : 지원");
				} else {
					System.out.println("펜 : 미지원");
				}

				System.out.println("메모리 : " + memory + " (GB)");
				System.out.println("스토리지 : " + storage + " (GB)");
				System.out.println("배터리 : " + battery + " (mAh)");
			}
			

	}

