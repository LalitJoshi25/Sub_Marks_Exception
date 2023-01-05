package exception_m;
import java.util.*;
@SuppressWarnings("serial")
public class DemoException2 extends Exception{
	
	public DemoException2(String msg) {
		super(msg);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int i = 1, totalM = 0;
		System.out.println("Enter the 6 sub marks");
		
		while(i<=6) {
			try {
				System.out.println("Enter marks of sub "+i+" : ");
				int sub = Integer.parseInt(s.nextLine());
				if(sub<0 || sub>100) {
					DemoException2 ob = new DemoException2("Invalid marks");
					throw ob;
				}
				if(sub>=0 && sub <=34) {
					DemoException2 ob1 = new DemoException2("Fail in subject");
					throw ob1;
				}
				totalM = totalM +sub;
				i++;
			}
			catch(NumberFormatException e) {
				e.printStackTrace();
			}
			catch(DemoException2 ob) {
				System.err.println(ob.getMessage());
				if(ob.getMessage().equalsIgnoreCase("Fail in subject")) {
					System.out.println("Program stopped");
					System.exit(0);
				}
			}
		}
		System.out.println("Total Marks "+totalM);
		float per = (float) totalM/6;
		System.out.println("per"+ per);
		s.close();
	}

}
