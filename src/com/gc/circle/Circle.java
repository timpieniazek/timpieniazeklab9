package com.gc.circle;

public class Circle {
	
	private double radius;
		
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getCircumference() {
		return radius * 2 * Math.PI;
	}
	
	public String getFormattedCircumference() {
		return formatNumber(getCircumference());
	}
	
	public double getArea() {
		return radius * radius * Math.PI;
	}
	
	public String getFormattedArea() {
		return formatNumber(getArea());
	}
	
	private String formatNumber(double x) {
		return String.format("%.2f", x);
	}
	
}
