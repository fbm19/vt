package tn.enis.model;

public class Expression {
private String value;
private boolean status;
private char[] result;

public char[] getResult() {
	return result;
}
public void setResult(char[] result) {
	this.result = result;
}
public String getValue() {
	return value;
}
public void setValue(String value) {
	this.value = value;
}
public boolean isStatus() {
	return status;
}
public void setStatus(boolean status) {
	this.status = status;
}
public Expression(String value) {
	super();
	this.value = value;
 
}

}
