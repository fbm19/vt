package tn.enis.model;

public class ExpressionHandler {
private String trueText;
private String textToTest;
public String getTrueText() {
	return trueText;
}
public void setTrueText(String trueText) {
	this.trueText = trueText;
}
public String getTextToTest() {
	return textToTest;
}
public void setTextToTest(String textToTest) {
	this.textToTest = textToTest;
}
public ExpressionHandler(String trueText, String textToTest) {
	super();
	this.trueText = trueText;
	this.textToTest = textToTest;
}
public char[] compareTexts(){
char[] result=new char[this.trueText.length()];

for(int i=0;i<textToTest.length();i++)
{
	if (textToTest.charAt(i)==trueText.charAt(i))
		result[i]='V';
	else if (trueText.indexOf(textToTest.charAt(i))>0)
		result[i]='T';
	else result[i]='*';
}
	return result;
}

}
