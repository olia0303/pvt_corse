package core;

public class Field {
 
	private int id;
	private int value;
	
public Field (int id, int value) {
	
	this.id = id;
	this.value = value;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public int getValue() {
	return value;
}

public void setValue(int value) {
	this.value = value;
}

@Override
public String toString() {
	return this.id + " " + this.value;
}	
	
	
	
}

