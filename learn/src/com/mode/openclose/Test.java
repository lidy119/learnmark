package com.mode.openclose;

public class Test {
	public static void main(String[] args) {
		AbstractChart pieChart = new PieChart();
		Display dp = new Display();
		dp.setChart(pieChart);
		dp.display();

	}
}
