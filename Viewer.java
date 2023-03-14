import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;

class Viewer {

	JTextField textField;
	JLabel labelInfo;

	Viewer(){
		Controller controller = new Controller (this);

		labelInfo = new JLabel (" ");
		labelInfo.setBounds (10, 10, 280, 100);
		labelInfo.setHorizontalAlignment (JLabel.RIGHT);
	
		textField  = new JTextField();
	   	textField.setBounds (10,10,280,100);
		textField.setForeground(Color.WHITE);
		textField.setBackground(Color.DARK_GRAY);
		textField.setHorizontalAlignment (JLabel.RIGHT);   
		textField.setFont(new Font("Castellar", Font.PLAIN, 40));     //Handles

		JButton buttonOne= new JButton("1");
		buttonOne.setBounds (10,290,70,60);
		buttonOne.addActionListener(controller);
		buttonOne.setActionCommand("One");
		buttonOne.setFont(new Font("BROADWAY", Font.PLAIN, 20));
		buttonOne.setForeground(Color.WHITE);
		buttonOne.setOpaque(false);
		buttonOne.setContentAreaFilled(false);
		buttonOne.setBorderPainted(false);    // "TimesRoman", Font.BOLD, 30); 

		
		JButton buttonTwo = new JButton("2");
		buttonTwo.setBounds (80,290,70,60);
		buttonTwo.addActionListener(controller);
		buttonTwo.setActionCommand("Two");
		buttonTwo.setFont(new Font("BROADWAY", Font.PLAIN, 20));
		buttonTwo.setForeground(Color.WHITE); //Segoe UI
		buttonTwo.setOpaque(false);
		buttonTwo.setContentAreaFilled(false);
		buttonTwo.setBorderPainted(false);    
		                                     

		JButton buttonThree = new JButton("3");
		buttonThree.setBounds (150,290,70,60);
		buttonThree.addActionListener(controller);
		buttonThree.setActionCommand("Three");
		buttonThree.setFont(new Font("BROADWAY", Font.PLAIN, 20));     //BROADWAY
		buttonThree.setForeground(Color.WHITE);
		buttonThree.setOpaque(false);
		buttonThree.setContentAreaFilled(false);
		buttonThree.setBorderPainted(false);      
		
		JButton buttonFour = new JButton("4");
		buttonFour.setBounds (10,230,70,60);
		buttonFour.addActionListener(controller);
		buttonFour.setActionCommand("Four");
		buttonFour.setFont(new Font("BROADWAY", Font.PLAIN, 20));
		buttonFour.setForeground(Color.WHITE);
		buttonFour.setOpaque(false);
		buttonFour.setContentAreaFilled(false);
		buttonFour.setBorderPainted(false);           

		JButton buttonFive = new JButton("5");
		buttonFive.setBounds (80,230,70,60);
		buttonFive.addActionListener(controller);
		buttonFive.setActionCommand("Five");
		buttonFive.setFont(new Font("BROADWAY", Font.PLAIN, 20));
		buttonFive.setForeground(Color.WHITE);
		buttonFive.setOpaque(false);
		buttonFive.setContentAreaFilled(false);
		buttonFive.setBorderPainted(false);     
		
		JButton buttonSix = new JButton("6");
		buttonSix.setBounds (150,230,70,60);
		buttonSix.addActionListener(controller);
		buttonSix.setActionCommand("Six");
		buttonSix.setFont(new Font("BROADWAY", Font.PLAIN, 20));
		buttonSix.setForeground(Color.WHITE);
		buttonSix.setOpaque(false);
		buttonSix.setContentAreaFilled(false);
		buttonSix.setBorderPainted(false);      

		JButton buttonSeven = new JButton("7");
		buttonSeven.setBounds (10,170,70,60);
		buttonSeven.addActionListener(controller);
		buttonSeven.setActionCommand("Seven");
		buttonSeven.setFont(new Font("BROADWAY", Font.PLAIN, 20));  //Bauhaus 93
		buttonSeven.setForeground(Color.WHITE);
		buttonSeven.setOpaque(false);
		buttonSeven.setContentAreaFilled(false);
		buttonSeven.setBorderPainted(false);     
		
		JButton buttonEight = new JButton("8");
		buttonEight.setBounds (80,170,70,60);
		buttonEight.addActionListener(controller);
		buttonEight.setActionCommand("Eight");
		buttonEight.setFont(new Font("BROADWAY", Font.PLAIN, 20));
		buttonEight.setForeground(Color.WHITE);
		buttonEight.setOpaque(false);
		buttonEight.setContentAreaFilled(false);
		buttonEight.setBorderPainted(false);    

		JButton buttonNine = new JButton("9");
		buttonNine.setBounds (150,170,70,60);
		buttonNine.addActionListener(controller);
		buttonNine.setActionCommand("Nine");
		buttonNine.setFont(new Font("BROADWAY", Font.PLAIN, 20));
     	buttonNine.setForeground(Color.WHITE);
		buttonNine.setOpaque(false);
		buttonNine.setContentAreaFilled(false);
		buttonNine.setBorderPainted(false);    

		JButton buttonZero = new JButton("0");
		buttonZero.setBounds (80,350,70,60);
		buttonZero.addActionListener(controller);
		buttonZero.setActionCommand("Zero");
		buttonZero.setFont(new Font("BROADWAY", Font.PLAIN, 20));
		buttonZero.setForeground(Color.WHITE);
		buttonZero.setOpaque(false);
		buttonZero.setContentAreaFilled(false);
		buttonZero.setBorderPainted(false);     

		JButton buttonDeleteeverything = new JButton("C");
		buttonDeleteeverything.setBounds (10,110,140,60);
		buttonDeleteeverything.addActionListener(controller);
		buttonDeleteeverything.setActionCommand("Delete everything");
		buttonDeleteeverything.setFont(new Font("BROADWAY", Font.PLAIN, 20));   //Arial
		buttonDeleteeverything.setForeground(Color.WHITE);
		buttonDeleteeverything.setOpaque(false);
		buttonDeleteeverything.setContentAreaFilled(false);
		buttonDeleteeverything.setBorderPainted(false);   

		JButton buttonDelete = new JButton("<x");
		buttonDelete.setBounds (150,110,70,60);
		buttonDelete.addActionListener(controller);
		buttonDelete.setActionCommand("Delete");
		buttonDelete.setFont(new Font("BROADWAY", Font.PLAIN, 20));
		buttonDelete.setForeground(Color.WHITE);
		buttonDelete.setOpaque(false);
		buttonDelete.setContentAreaFilled(false);
		buttonDelete.setBorderPainted(false);   

		JButton buttonDivide = new JButton("/");
		buttonDivide.setBounds (220,110,70,60);
		buttonDivide.addActionListener(controller);
		buttonDivide.setActionCommand("Divide"); 
		buttonDivide.setFont(new Font("BROADWAY", Font.PLAIN, 20));
		buttonDivide.setForeground(Color.WHITE);
		buttonDivide.setOpaque(false);
		buttonDivide.setContentAreaFilled(false);
		buttonDivide.setBorderPainted(false);     

		JButton buttonMultiply = new JButton("x");
		buttonMultiply.setBounds (220,170,70,60);
		buttonMultiply.addActionListener(controller);
		buttonMultiply.setActionCommand("Multiply");
		buttonMultiply.setFont(new Font("BROADWAY", Font.PLAIN, 20));
		buttonMultiply.setForeground(Color.WHITE);
		buttonMultiply.setOpaque(false);
		buttonMultiply.setContentAreaFilled(false);
		buttonMultiply.setBorderPainted(false);     

		JButton buttonMinus = new JButton("-");
		buttonMinus.setBounds (220,230,70,60);
		buttonMinus.addActionListener(controller);
		buttonMinus.setActionCommand("Minus");
		buttonMinus.setFont(new Font("BROADWAY", Font.PLAIN, 20));
		buttonMinus.setForeground(Color.WHITE);
		buttonMinus.setOpaque(false);
		buttonMinus.setContentAreaFilled(false);
		buttonMinus.setBorderPainted(false);      
		
		JButton buttonPlus= new JButton("+");
		buttonPlus.setBounds (220,290,70,60);
		buttonPlus.addActionListener(controller);
		buttonPlus.setActionCommand("Plus");
		buttonPlus.setFont(new Font("BROADWAY", Font.PLAIN, 20));
		buttonPlus.setForeground(Color.WHITE);
		buttonPlus.setOpaque(false);
		buttonPlus.setContentAreaFilled(false);
		buttonPlus.setBorderPainted(false);    
                                                                                                    
		JButton buttonEquals = new JButton("=");
		buttonEquals.setBounds (150,350,140,60);
		buttonEquals.addActionListener(controller);
		buttonEquals.setActionCommand("Equals");
		buttonEquals.setFont(new Font("BROADWAY", Font.PLAIN, 20));
		buttonEquals.setForeground(Color.WHITE);
		buttonEquals.setOpaque(false);
		buttonEquals.setContentAreaFilled(false);
		buttonEquals.setBorderPainted(false);  

		JButton buttonPoint = new JButton(".");
		buttonPoint.setBounds (10,350,70,60);
		buttonPoint.addActionListener(controller);
		buttonPoint.setActionCommand("Point");
		buttonPoint.setFont(new Font("BROADWAY", Font.PLAIN, 20));
		buttonPoint.setForeground(Color.WHITE);
		buttonPoint.setOpaque(false);
		buttonPoint.setContentAreaFilled(false);
		buttonPoint.setBorderPainted(false);        

		JFrame frame = new JFrame ("Calculator");
		frame.setSize(320,460);
		frame.setLocation(500,100);
		frame.setLayout(null);
		frame.getContentPane().setBackground(Color.DARK_GRAY);

		frame.add(textField);
		frame.add(labelInfo);
		frame.add(buttonOne);
		frame.add(buttonTwo);
		frame.add(buttonThree);
		frame.add(buttonFour);
		frame.add(buttonFive);			
		frame.add(buttonSix);
		frame.add(buttonSeven);	
		frame.add(buttonEight);
		frame.add(buttonNine);
		frame.add(buttonZero);
		frame.add(buttonPoint);
		frame.add(buttonPlus);			
		frame.add(buttonMinus);
		frame.add(buttonMultiply);	
		frame.add(buttonDivide);
		frame.add(buttonEquals);
		frame.add(buttonMultiply);	
		frame.add(buttonDelete);	
		frame.add(buttonDeleteeverything);
		frame.setVisible(true);
		}
		public void updateLabel(String text){
			textField.setText(text);
			}

		public void update(String text) {
			labelInfo.setText(text);
			}

	
	
}