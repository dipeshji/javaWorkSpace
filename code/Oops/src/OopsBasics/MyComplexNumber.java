package OopsBasics;

public class MyComplexNumber {
	private double real;
	private double imag;
	
	MyComplexNumber() {
		this.real = 0.0;
		this.imag = 0.0;
	}
	
	MyComplexNumber(double real, double imag){
		this.real = real;
		this.imag = imag;
	}

	public double getReal() {
		return real;
	}

	public void setReal(double real) {
		this.real = real;
	}

	public double getImag() {
		return imag;
	}

	public void setImag(double imag) {
		this.imag = imag;
	}
	
	public void setValue(double real, double imag) {
		this.real = real;
		this.imag = imag;
	}
	
	@Override
	public String toString() {
		return "(" + this.real + this.imag + "i" + ")";
	}
	
	public boolean isReal() {
		return (imag==0);
	}
	
	public boolean isImag() {
		return (imag!=0);
	}
	
	
	public boolean equals(double real, double imag) {
		return (this.real == real && this.imag == imag);
	}
	
	public boolean equals(MyComplexNumber anoterNum) {
		return (this.real == anoterNum.real && this.imag == anoterNum.imag);
	}
	
	public double magnitude() {
		return Math.sqrt(this.real * this.real + this.imag * this.imag);
	}
	
	public double argument() {
		return Math.atan2(this.imag, this.real);
	}
	
	public MyComplexNumber add(MyComplexNumber another) {
		this.real = (this.real + another.real); 
		this.imag = (this.imag + another.imag);
		
		return this;
	}
	
	public MyComplexNumber addNew(MyComplexNumber right) {
		return new MyComplexNumber(this.real + right.real, this.imag + right.imag);
	}
	
	public MyComplexNumber subtract(MyComplexNumber another) {
		this.real = (this.real - another.imag);
		this.imag = (this.imag - another.imag);
		
		return this;
	}
	
	public MyComplexNumber subtractNew(MyComplexNumber right) {
		return new MyComplexNumber(this.real - right.real, this.imag-right.imag);
	}
	
	public MyComplexNumber multiply(MyComplexNumber right) {
		this.real = ((this.real * right.real) - (this.imag * right.imag));
		this.imag = ((this.real * right.imag) + (this.imag * right.real));
		
		return this;
	}
	
	public MyComplexNumber divide(MyComplexNumber right) {
		return this;
	}
}
