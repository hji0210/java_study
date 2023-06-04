package ScannerPractice05;



public class Member {
	
	private String id;
    private String name;
    private int age;
    private String sex;
    
    public Member() {
    	
    }
    
	public Member(String id, String name, int age, String sex) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {//toString은 주소값 대신 클래스 객체 안에 셋팅 되어 있는값을 찍어내기 위해 쓴다.
		                       // 단 롬복이 있다면 getter,setter,toString 정의할 필요없다.
		
		return "Member [id=" + id + ", name=" + name + ", age=" + age + ", sex=" + sex + "]";
	}
    
    

}