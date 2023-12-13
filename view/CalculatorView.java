package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.CaculatorController;
import model.ModelCalculator;

public class CalculatorView  extends JFrame{
	private ModelCalculator modelCalculator;
	private JTextField jTextField_firstvalue;
	private JTextField jTextField_secondvalue;
	private JTextField TextField_answer;

	public CalculatorView() {
		this.modelCalculator= new ModelCalculator();
		this.init();
	}

	private void init() {
		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setTitle("Minilator");
		
		Font font= new Font("Arial", Font.BOLD , 20);
		ActionListener actionListener= new CaculatorController(this);
		
		JLabel jLabel_firstvalue= new JLabel("1st value: ");
		jLabel_firstvalue.setFont(font);
		JLabel jLabel_secondvalue= new JLabel("2nd value: ");
		jLabel_secondvalue.setFont(font);
		JLabel jLabel_answer = new JLabel("Answer: ");
		jLabel_answer.setFont(font);
		
		jTextField_firstvalue= new JTextField(50);
		jTextField_firstvalue.setFont(font);
		jTextField_secondvalue= new JTextField(50);
		jTextField_secondvalue.setFont(font);
		TextField_answer= new JTextField(100);
		TextField_answer.setFont(font);
		
		JPanel jPanelIO= new JPanel();
		jPanelIO.setLayout(new GridLayout(3,2,10,10));
		jPanelIO.add(jLabel_firstvalue);
		jPanelIO.add(jTextField_firstvalue);
		jPanelIO.add(jLabel_secondvalue);
		jPanelIO.add(jTextField_secondvalue);
		jPanelIO.add(jLabel_answer);
		jPanelIO.add(TextField_answer);
		
		JButton jButton_plus= new JButton("+");
		jButton_plus.addActionListener(actionListener);
		jButton_plus.setFont(font);
		JButton jButton_minus= new JButton("-");
		jButton_minus.addActionListener(actionListener);
		jButton_minus.setFont(font);
		JButton jButton_multipy= new JButton("*");
		jButton_multipy.addActionListener(actionListener);
		jButton_multipy.setFont(font);
		JButton jButton_divide= new JButton("/");
		jButton_divide.addActionListener(actionListener);
		jButton_divide.setFont(font);
		JButton jButton_power= new JButton("^");
		jButton_power.addActionListener(actionListener);
		jButton_power.setFont(font);
		JButton jButton_mod= new JButton("%");
		jButton_mod.addActionListener(actionListener);
		jButton_mod.setFont(font);
		
		JPanel jPanel_tinh= new JPanel();
		jPanel_tinh.setLayout(new GridLayout(2,3,10,10));
		jPanel_tinh.add(jButton_plus);
		jPanel_tinh.add(jButton_minus);
		jPanel_tinh.add(jButton_multipy);
		jPanel_tinh.add(jButton_divide);
		jPanel_tinh.add(jButton_power);
		jPanel_tinh.add(jButton_mod);
		
		this.setLayout(new BorderLayout(10,10));
		this.add(jPanelIO, BorderLayout.CENTER);
		this.add(jPanel_tinh,BorderLayout.SOUTH);
		jPanel_tinh.setBackground(Color.GRAY);
		
		
		
		this.setVisible(true);
		
	}
	public void plus() {
		double first_value= Double.valueOf(this.jTextField_firstvalue.getText());
		this.modelCalculator.setFist_value(first_value);
		double second_value=Double.valueOf(this.jTextField_secondvalue.getText());
		this.modelCalculator.setSecond_value(second_value);
		this.modelCalculator.plus();
		this.TextField_answer.setText(this.modelCalculator.getAnswer()+"");
	}
	public void minus() {
		double first_value= Double.valueOf(this.jTextField_firstvalue.getText());
		this.modelCalculator.setFist_value(first_value);
		double second_value=Double.valueOf(this.jTextField_secondvalue.getText());
		this.modelCalculator.setSecond_value(second_value);
		this.modelCalculator.minus();
		this.TextField_answer.setText(this.modelCalculator.getAnswer()+"");
	}
	public void multipy() {
		double first_value= Double.valueOf(this.jTextField_firstvalue.getText());
		this.modelCalculator.setFist_value(first_value);
		double second_value=Double.valueOf(this.jTextField_secondvalue.getText());
		this.modelCalculator.setSecond_value(second_value);
		this.modelCalculator.multipy();
		this.TextField_answer.setText(this.modelCalculator.getAnswer()+"");
	}
	public void divide() {
		double first_value= Double.valueOf(this.jTextField_firstvalue.getText());
		this.modelCalculator.setFist_value(first_value);
		double second_value=Double.valueOf(this.jTextField_secondvalue.getText());
		this.modelCalculator.setSecond_value(second_value);
		this.modelCalculator.divide();
		this.TextField_answer.setText(this.modelCalculator.getAnswer()+"");
	}
	public void power() {
		double first_value= Double.valueOf(this.jTextField_firstvalue.getText());
		this.modelCalculator.setFist_value(first_value);
		double second_value=Double.valueOf(this.jTextField_secondvalue.getText());
		this.modelCalculator.setSecond_value(second_value);
		this.modelCalculator.power();
		this.TextField_answer.setText(this.modelCalculator.getAnswer()+"");
	}
	public void mod() {
		double first_value= Double.valueOf(this.jTextField_firstvalue.getText());
		this.modelCalculator.setFist_value(first_value);
		double second_value=Double.valueOf(this.jTextField_secondvalue.getText());
		this.modelCalculator.setSecond_value(second_value);
		this.modelCalculator.mod();
		this.TextField_answer.setText(this.modelCalculator.getAnswer()+"");
	}
	
	
}
