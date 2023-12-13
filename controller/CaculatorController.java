package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.CalculatorView;

public class CaculatorController implements ActionListener {
	private CalculatorView calculatorView;

	public CaculatorController(CalculatorView calculatorView) {
		this.calculatorView = calculatorView;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String src= e.getActionCommand();
		if(src.equals("+")) {
			this.calculatorView.plus();
		}
		else if(src.equals("-")) {
			this.calculatorView.minus();
		}
		else if(src.equals("*")) {
			this.calculatorView.multipy();
		}
		else if(src.equals("/")) {
			this.calculatorView.divide();
		}
		else if(src.equals("^")) {
			this.calculatorView.power();
		}
		else if(src.equals("%")) {
			this.calculatorView.mod();
		}
		
	}
	
}
