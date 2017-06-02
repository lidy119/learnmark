package com.mode.openclose;

public class Display {

	private AbstractChart chart;
	
	public void setChart(AbstractChart chart){
		this.chart = chart;
	}
	void display(){
		chart.display();
	}
}
