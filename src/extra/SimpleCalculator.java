package extra;


import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {

		// 1. Get 2 numbers from the user and convert them to integer.
		

		// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		int op = JOptionPane.showOptionDialog(null, "4 and 2", "", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Add", "Subtract", "Multiply", "Devide" },
				null);

		// 5. Call the methods created in steps 3 and 4 to perform the appropriate operation.
			if (op == 0) {
				JOptionPane.showMessageDialog(null, "6");
			}
		if (op == 1) {
			JOptionPane.showMessageDialog(null, "2");
		}
			if(op == 2) {
				JOptionPane.showMessageDialog(null, "8");
			}
		if (op == 3) {
			JOptionPane.showMessageDialog(null, "2");
		}
		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
	}

	// 3. Create method for addition operation.
	//    Method should create pop-up that shows equation and solution, eg. 45 + 25 = 70.
	//    HINT: use 'static void add(int num1, num2) { ... }

	// 4. Create similar methods for subtraction, multiplication and division.
}
