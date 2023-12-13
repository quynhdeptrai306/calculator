package model;

public class ModelCalculator {
	private double fist_value;
	private double second_value;
	private double answer;
	public ModelCalculator() {
		super();
	}
	public double getFist_value() {
		return fist_value;
	}
	public void setFist_value(double fist_value) {
		this.fist_value = fist_value;
	}
	public double getSecond_value() {
		return second_value;
	}
	public void setSecond_value(double second_value) {
		this.second_value = second_value;
	}
	public double getAnswer() {
		return answer;
	}
	public void setAnswer(double answer) {
		this.answer = answer;
	}
	public void plus() {
		this.answer=this.fist_value+this.second_value;
	}
	public void minus() {
		this.answer=this.fist_value-this.second_value;
	}
	public void multipy() {
		this.answer=this.fist_value*this.second_value;
	}
	public void divide() {
		this.answer=this.fist_value/this.second_value;
	}
	public void power() {
		this.answer=Math.pow(fist_value, second_value);
	}
	public void mod() {
		this.answer=this.fist_value%this.second_value;
	}
}
