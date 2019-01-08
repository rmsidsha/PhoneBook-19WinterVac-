import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class PhoneBook {
	ArrayList<StandardInfo> Standard = new ArrayList<StandardInfo>(); 
	Scanner sc = new Scanner(System.in);
	public PhoneBook() {//instructor
		
	}
	public boolean addInfo() {
		System.out.println("Insert Name");
		String nameInput = sc.nextLine();
		System.out.println("Insert Phone Number");
		String numInput = sc.nextLine();
	}
}
