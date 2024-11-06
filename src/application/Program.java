package application;

import javax.swing.JOptionPane;

import model.services.*;

public class Program {

	public static void main(String[] args) {

		PrintService<Integer> ps = new PrintService<>();

		int n = Integer.parseInt(JOptionPane.showInputDialog("How many values?"));

		for (int i = 0; i < n; i++) {
			int value = Integer.parseInt(JOptionPane.showInputDialog("Value: "));
			ps.addValue(value);
		}

		ps.print();
		JOptionPane.showMessageDialog(null, "First number: " + ps.first());
	}
}
