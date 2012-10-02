import java.util.Random;

public class MonteCarlo {

	double xPoint;
	double yPoint;
	double radius;

	public MonteCarlo(double radius){
		this.xPoint = radius;
		this.yPoint = radius;
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public boolean isInside( double x , double y){      
		double distancex = this.xPoint-x;    
		double distancey = this.yPoint-y;     
		double distance = Math.sqrt(distancex*distancex+distancey*distancey);     
		return distance <= this.radius;      
	}

	public double computePI (double numThrows){          
		Random randomGen = new Random ();          
		double hits = 0;         
		double PI = 0;                         
		double width = radius * 2;             

		for (int i = 0; i <= numThrows; i++){                    
			double xPosition = (randomGen.nextDouble()) * width;       
			double yPosition = (randomGen.nextDouble()) * width;        
			if (isInside(xPosition, yPosition)){            
				hits++;                           
			}                        
			PI = (4 * (hits/numThrows));                      
		}                    
		System.out.println("Throw numbers = " + numThrows);                 
		System.out.println("Hit numbers = " + hits); 
		System.out.println("PI number is = " + PI);
		return PI;       
	}


	public static void main(String[] args) {

		MonteCarlo mc1 = new MonteCarlo(7);
		mc1.computePI(10000);

	}

}
