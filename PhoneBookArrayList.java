import java.util.Scanner;
import java.util.InputMismatchException;

public class PhoneBookArrayList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PhoneBook pb = new PhoneBook();
		while(true) {
			System.out.println("1. Add Phone Number");
			System.out.println("2. Search Phone Number");
			System.out.println("3. Show All List");
			System.out.println("4. Delete Number");
			System.out.println("5. END");
			System.out.println("===============");
			System.out.println("Please Choice MENU");
			int menuNum = sc.nextInt();
			
			try {
			switch(menuNum) {
			case 1:    //Play Add phone number method
				pb.addInfo();
				break;
			case 2:
				pb.searchInfo();
				break;
			case 3:
				pb.showAll();
				break;
			case 4:
				pb.deleteNum();
				break;
			case 5:
				System.out.println("Close Program.");
				break;
			default: 
				throw new InputMismatchException();
			}
		}catch (InputMismatchException e) {
			System.out.println("잘못 된 값을 입력하셨습니다.");
		}
	}
	}
}
