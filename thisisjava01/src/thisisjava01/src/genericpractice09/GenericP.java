package genericpractice09;

public class GenericP<T extends Person> {
	//person으로 상속받은 애들만 셋팅

	T field;

	public T getField() {
		return field;
	}

	public void setField(T field) {
		this.field = field;
	}

}
