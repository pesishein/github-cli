package com.sheinfeld.cli.pojos;

public class StatData {
		
	private String key;
	private Object value;
	
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public Object getValue() {
		return value;
	}
	public void setValue(Object value) {
		this.value = value;
	}
	public StatData(String key, Object value) {
		super();
		this.key = key;
		this.value = value;
	}
}
