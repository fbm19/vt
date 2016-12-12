package tn.enis.model;

import java.util.ArrayList;

public class ExpressionForm {
private ArrayList<Expression> expressionList=new ArrayList<Expression>();
public void addExpression(Expression expression){
this.expressionList.add(expression);
}
public ArrayList<Expression> getExpressionList() {
	return expressionList;
}
public void setExpressionList(ArrayList<Expression> expressionList) {
	this.expressionList = expressionList;
}

}
