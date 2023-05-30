package genericpractice09;

public class GenericPFH<T extends Person & Fly & Hidden> {
//클래스랑 인터페이스 섞어서 쓸 때 클래스부터 와야함 (person부터 와야함)
	T field;

	public T getField() {
		return field;
	}

	public void setField(T field) {
		this.field = field;
	}

}
