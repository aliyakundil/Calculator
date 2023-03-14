class Model{
	
	Viewer viewer;
	String temp;
	String leftValue;
	String rightValue;
	char action;

	
	Model(Viewer viewer) {
		this.viewer = viewer;
		temp = "";
		leftValue = "";
		rightValue = "";
		action = '@';
	}
	
		public void doAction(String value) {
			
		//	System.out.println(value);
				if(value.equals("One")) {
						temp = temp + "1";
				} else if(value.equals("Two")){
						temp = temp + "2";
				} else if(value.equals("Three")){
						temp = temp + "3";
				} else if(value.equals("Four")){
						temp = temp + "4";
				} else if(value.equals("Five")){
						temp = temp + "5";
				} else if(value.equals("Six")){
						temp = temp + "6";
				} else if(value.equals("Seven")){
						temp = temp + "7";
				} else if(value.equals("Eight")){
						temp = temp + "8";
				} else if(value.equals("Nine")){
						temp = temp + "9";
				} else if(value.equals("Zero")){
						temp = temp + "0"; 
				} else if(value.equals("Point")){
						temp = temp + ".";
				} else if(value.equals("Plus")) {
						leftValue = temp;
						viewer.updateLabel(leftValue + "+");
						temp ="";
						action = '+';
						return;
				} else if(value.equals("Minus")) {
						leftValue = temp;
						viewer.updateLabel(leftValue + "-");
						temp = "";
						action = '-';
						return;
				} else if(value.equals("Multiply")) {
						leftValue = temp;
						viewer.updateLabel(leftValue + "x");
						temp = "";
						action = 'x';
						return;
				} else if(value.equals("Divide")) {
						leftValue = temp;
						viewer.updateLabel(leftValue + "/");
						temp ="";
						action = '/';
						return;
				} else if (value.equals(".")){
						temp = temp + ".";
						if (temp.endsWith("..")) {
						temp = temp.substring(0, temp.length () - 1); }
				} else if (value.equals("Delete everything")){
						temp = "";
						viewer.updateLabel("");
						leftValue = temp;
						viewer.updateLabel(leftValue + "");
						temp ="";
						action = 'C';
				} else if (value.equals("Delete")){
						temp = temp.substring (0, temp.length() - 1);
						viewer.updateLabel("");
						leftValue = temp;
						viewer.updateLabel(leftValue + "");
						action = 'C';
				} else if(value.equals("Equals")) {
						rightValue = temp;
						double numberLeft = Double.parseDouble ( leftValue);
						double numberRight = Double.parseDouble( rightValue);
						double answer = 0;
				
				
					switch(action) {
							case '+':
									answer = numberLeft + numberRight;
							break;
							case '-':
									answer = numberLeft - numberRight;
							break;
							case 'x':
									answer = numberLeft * numberRight;
							break;
							case '/':
									answer = numberLeft / numberRight;
							break;
						}

							String infoLabel = " " + numberLeft + " " + action + " " + numberRight + " " + "=" + " " + answer;
							viewer.updateLabel(infoLabel);
							temp = String.valueOf(answer);

							if (temp.endsWith(".0")) {
							temp = temp.substring(0, temp.length () - 2);
						}


			//	temp = String.valueOf(answer);
	
			}
	
		viewer.updateLabel(temp);
			//	System.out.println("value = " + value);
	        	
	}
	
}