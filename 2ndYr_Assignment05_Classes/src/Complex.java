/* 
Author: Cillian Myles
ID: 11424252
Course: 2BP1
Program: Complex number arithmetic
Version: 1
Start date: 06/09/2013
Date of completion: 06/09/2013
*/

public class Complex {
	
    private float real, imaginary; 
  
    // Default constructor which defaults values to (1 + 1i)
    public Complex() { 
        setReal(1f); 
        setImaginary(1f); 
    } 
  
    // Constructor which allows users to specify values for complex numbers
    public Complex(float r, float i) { 
        setReal(r); 
        setImaginary(i); 
    } 
  
    public void setImaginary(float im) {
    	imaginary = im; 
    }
     
    public void setReal(float re) { 
        real = re;       
    } 
  
    public float getImaginary() { 
        return imaginary; 
    } 
  
    public float getReal() { 
        return real; 
    } 
  
    public String toString() { 
        return (getReal() + " + (" + getImaginary() + ")i"); 
    } 
      
    // Method for addition with complex numbers
    public static Complex add(Complex com1, Complex com2) { 
    					  
        return new Complex(com1.getReal()+com2.getReal(),com1.getImaginary()+com2.getImaginary()); 
    } 
     
    // Method for subtraction with complex numbers
    public static Complex subtract(Complex com1, Complex com2) { 
     
        return new Complex(com1.getReal()-com2.getReal(),com1.getImaginary()-com2.getImaginary()); 
    } 
    
    // Method for multiplication with complex numbers
    public static Complex multiply(Complex com1, Complex com2) {
   	
    	return new Complex((com1.getReal()*com2.getReal())-(com1.getImaginary()*com2.getImaginary()),
    			(com1.getImaginary()*com2.getReal())+(com1.getReal()*com2.getImaginary()));
    }
    
    // Method for calculating complex conjugate with complex numbers
    public static Complex getConjugate(Complex com1) {
        
        return new Complex(com1.getReal(),com1.getImaginary()*(-1));
    }
    
    // Method for division with complex numbers
    public static Complex divide(Complex com1, Complex com2) {
    	
   	return new Complex((multiply(com1,getConjugate(com2)).getReal())/(multiply(com2,getConjugate(com2)).getReal()),
    			(multiply(com1,getConjugate(com2)).getImaginary())/(multiply(com2,getConjugate(com2)).getReal()));
    }     
}
