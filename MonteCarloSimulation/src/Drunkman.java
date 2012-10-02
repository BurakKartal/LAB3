import java.util.Random;

public class Drunkman {

	public static void main(String[] args) {     
		Random rand = new Random();    
		int iState = rand.nextInt();    
		double pValue = 0.60;     
		int numSteps = rand.nextInt(100) + 1;   
		int nSteps = 0;     
		if (numSteps>=0) {        
			System.out.println(iState);      
			while (nSteps<numSteps) {           
				if (rand.nextDouble() < pValue)             
					iState++;            
				else               
					iState--;            
				System.out.print(iState);       
				nSteps++;
			}
		}
	}

}
