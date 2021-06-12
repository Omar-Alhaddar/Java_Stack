
public class Project {
	
	String name;
	String Desc;
	
	public Project() {
		
		
	}

	public Project(String name) {
		
		
	}

	public Project(String name, String description) {
		
		
	}
	
	
	public String elevatorPitch(String name , String Desc) {
		String K = name+Desc;
		return K.format("%s:%s", name,Desc);
		
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return Desc;
	}

	public void setDesc(String desc) {
		Desc = desc;
	}

	

}
