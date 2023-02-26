import java.util.Scanner;

public class ChallangeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input= new Scanner(System.in);
		
		System.out.println("Enter a number to see its reverse (Enter 0 to stop):");
		String numStr=input.nextLine();
		
		while(!numStr.equalsIgnoreCase("0") && !numStr.isEmpty()) {
			
			char chArr[] = numStr.toCharArray();
			
			int posDec = numStr.indexOf(",");
			if(posDec==-1)
				posDec=numStr.indexOf(".");

			System.out.println("Reverse of the number:");
			for(int i=chArr.length;i>0;i--) {
				if(i==posDec+1) {
					// Skip the decimal point
				}
				else if(i==chArr.length-posDec) {
					System.out.print(chArr[i-1]);
					System.out.print(chArr[posDec]);
				}
				else {
					System.out.print(chArr[i-1]);
				}
			}
			System.out.println("\n\nEnter a number to see its reverse (Enter 0 to stop):");
			numStr=input.nextLine();
		}
		System.out.println("\nProgram Stopped!");
	}
}


