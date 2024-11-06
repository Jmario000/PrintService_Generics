package model.services;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class PrintService<T> {
	List<T> list = new ArrayList<>();

	public PrintService() {
	}

	public void addValue(T value) {
		list.add(value);
	}

	public T first() {
		if (list.isEmpty()) {
			throw new IllegalStateException("List is empty");
		}
		T firstValue = list.get(0);
		return firstValue;
	}

	public void print() {
		StringBuilder sb = new StringBuilder("[");

		if (!list.isEmpty()) {
			sb.append(list.get(0));
		}

		for (int i = 1; i < list.size(); i++) {
			sb.append(", ").append(list.get(i));
		}

		JOptionPane.showMessageDialog(null, sb + "]");
	}
}
