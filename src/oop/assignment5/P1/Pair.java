package oop.assignment5.P1;

public class Pair<Integer, String> {
	private Integer key;
	private String value;

	public Pair(Integer key, String value) {
		this.key = key;
		this.value = value;
	}

	public Integer getKey() {
		return key;
	}

	public void setKey(Integer key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public java.lang.String toString() {
		return "This pair is : key -> " + this.key + ", value -> " + this.value;
	}

}
