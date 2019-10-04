import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Calculator
{
	
	static	JButton zero = new JButton("0");
	static	JButton one = new JButton("1");
	static	JButton two = new JButton("2");
	static	JButton three = new JButton("3");
	static	JButton four = new JButton("4");
	static	JButton five = new JButton("5");
	static	JButton six = new JButton("6");
	static	JButton seven = new JButton("7");
	static	JButton eight = new JButton("8");
	static	JButton nine = new JButton("9");
	static	JButton add = new JButton("+");
	static	JButton substract = new JButton("-");
	static	JButton multiply = new JButton("*");
	static	JButton divide = new JButton("/");
	static	JButton equals = new JButton("=");
	static	JButton modulas = new JButton("%");
	static	JButton reset = new JButton("RESET");
	static	JButton dot = new JButton(".");
		
	static	JTextField tf = new JTextField();
	
	static int action=0;
	
	public static void main(String[] args)
	{
		
		JFrame frame = new JFrame();
		
		Container cntr = frame.getContentPane();
		cntr.setLayout(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(400,100,420,400);
		frame.setTitle("Calculator");
		Font f = new Font("arial",Font.BOLD,20);
		tf.setFont(f);
		
		cntr.add(tf);
		tf.setBounds(20,5,370,50);
		
		cntr.add(one);
		one.setBounds(20,80,50,50);
		
		cntr.add(two);
		two.setBounds(90,80,50,50);
		
		cntr.add(three);
		three.setBounds(160,80,50,50);
		
		cntr.add(four);
		four.setBounds(20,150,50,50);
		
		cntr.add(five);
		five.setBounds(90,150,50,50);
		
		cntr.add(six);
		six.setBounds(160,150,50,50);
		
		cntr.add(seven);
		seven.setBounds(20,220,50,50);
		
		cntr.add(eight);
		eight.setBounds(90,220,50,50);
		
		cntr.add(nine);
		nine.setBounds(160,220,50,50);
		
		cntr.add(zero);
		zero.setBounds(90,290,50,50);
		
		cntr.add(multiply);
		multiply.setBounds(270,80,50,50);
		
		cntr.add(divide);
		divide.setBounds(340,80,50,50);
		
		cntr.add(modulas);
		modulas.setBounds(270,150,50,50);
		
		cntr.add(substract);
		substract.setBounds(340,150,50,50);
		
		cntr.add(equals);
		equals.setBounds(270,220,50,50);
		
		cntr.add(add);
		add.setBounds(340,220,50,120);
		
		cntr.add(reset);
		reset.setBounds(160,290,160,50);
		
		cntr.add(dot);
		dot.setBounds(20,290,50,50);
		dot.setFont(f);
		
		dot.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent Event)
			{
				dot_action(Event);
			}
		});
		
		one.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent Event)
			{
				one_action(Event);
			}
		});
		
		two.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent Event)
			{
				two_action(Event);
			}
		});
		
		three.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent Event)
			{
				three_action(Event);
			}
		});
		
		four.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent Event)
			{
				four_action(Event);
			}
		});
		
		five.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent Event)
			{
				five_action(Event);
			}
		});
		
		six.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent Event)
			{
				six_action(Event);
			}
		});
		
		seven.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent Event)
			{
				seven_action(Event);
			}
		});
		
		eight.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent Event)
			{
				eight_action(Event);
			}
		});
		
		nine.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent Event)
			{
				nine_action(Event);
			}
		});
		
		zero.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent Event)
			{
				zero_action(Event);
			}
		});
		
		multiply.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent Event)
			{
				multiply_action(Event);
			}
		});
		
		divide.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent Event)
			{
				divide_action(Event);
			}
		});
		
		modulas.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent Event)
			{
				modulas_action(Event);
			}
		});
		
		substract.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent Event)
			{
				substract_action(Event);
			}
		});
		
		equals.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent Event)
			{
				equals_action(Event);
			}
		});
		
		add.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent Event)
			{
				add_action(Event);
			}
		});
		
		reset.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent Event)
			{
				reset_action(Event);
			}
		});
	}
	
	public static void dot_action(ActionEvent Event)
	{
		tf.setText(tf.getText()+".");
	}
	
	public static void one_action(ActionEvent Event)
	{
		tf.setText(tf.getText()+"1");
	}
	
	public static void two_action(ActionEvent Event)
	{
		tf.setText(tf.getText()+"2");
	}
	
	public static void three_action(ActionEvent Event)
	{
		tf.setText(tf.getText()+"3");
	}
	
	public static void four_action(ActionEvent Event)
	{
		tf.setText(tf.getText()+"4");
	}
	
	public static void five_action(ActionEvent Event)
	{
		tf.setText(tf.getText()+"5");
	}
	
	public static void six_action(ActionEvent Event)
	{
	tf.setText(tf.getText()+"6");
	}
	
	public static void seven_action(ActionEvent Event)
	{
		tf.setText(tf.getText()+"7");
	}
	
	public static void eight_action(ActionEvent Event)
	{
	tf.setText(tf.getText()+"8");
	}
	
	public static void nine_action(ActionEvent Event)
	{
		tf.setText(tf.getText()+"9");
	}
	
	public static void zero_action(ActionEvent Event)
	{
		tf.setText(tf.getText()+"0");
	}
	
	public static void reset_action(ActionEvent Event)
	{
		tf.setText("");
	}
	
	public static void multiply_action(ActionEvent Event)
	{
		tf.setText(tf.getText()+" * ");
		
		action = 1;
	}
	
	public static void divide_action(ActionEvent Event)
	{
		tf.setText(tf.getText()+" / ");
		action = 2;
	}
	
	public static void modulas_action(ActionEvent Event)
	{
		tf.setText(tf.getText()+" % ");
		action = 3;
	}
	
	public static void substract_action(ActionEvent Event)
	{
		tf.setText(tf.getText()+" - ");
		action = 4;
	}
	
	public static void add_action(ActionEvent Event)
	{
		tf.setText(tf.getText()+" + ");
		action = 5;
	}
	
	public static void equals_action(ActionEvent Event)
	{
		
		tf.setText(tf.getText()+" = ");
		
		String str = tf.getText();
		String[] splitStr = str.split("\\s+");
		
		float n1 = Float.parseFloat(splitStr[0]);
		float n2 = Float.parseFloat(splitStr[2]);
	
		if(action == 1)
		{
			tf.setText(tf.getText()+" "+(float)(n1*n2));
		}
		
		else if(action == 2)
		{
			tf.setText(tf.getText()+" "+(float)(n1/n2));
		}
		
		else if(action == 3)
		{
			tf.setText(tf.getText()+" "+(float)(n1%n2));
		}
		
		else if(action == 4)
		{
			tf.setText(tf.getText()+" "+(float)(n1-n2));
		}
		
		else if(action == 5)
		{
			tf.setText(tf.getText()+" "+(float)(n1+n2));
		}
	
	}
	
}