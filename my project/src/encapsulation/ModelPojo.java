package encapsulation;

class college

{
	public int id=101;
	private String name="rama";

	public String school="besant";
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
	name="vignesh";
		return name;
	}
	public void setName(String name) {
	
		this.name = name;
		
	}
	
}

public class ModelPojo {
	

	public static void main(String[] args) {
		
	college sc=new college();
		System.out.println(sc.getId());
		System.out.println(sc.getName());
	}

}
