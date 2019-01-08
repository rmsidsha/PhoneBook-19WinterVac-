
public class StandardInfo {
private String name;    
private String number;
	public StandardInfo() {//instructor
	
	}
	public StandardInfo(String name, String number) {//instructor
		this.name = name;
		this.number = number;
	}
	
	public void setName(String name) {  //set name
		this.name = name;
	}
	public String getName() {   //get name
		return number;
	}
	public void setNumber(String number) {  //set name
		this.number = number;
	}
	public String getNumber() {    //get name
		return number;
	}
	@Override
	public String toString() {	
		return "["+name+"] "+number;
	}

}
