package genericpractice09;

public class GenericFH<T extends Fly & Hidden> {
//인플리먼트는 인플리먼트라고 쓰지말고 상속으로 통일
	T field;

	public T getField() {
		return field;
	}

	public void setField(T field) {
		this.field = field;
	}
}
