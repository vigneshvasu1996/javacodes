package encapsulation;

public class simple_encapsulation {

	public static void main(String[] args) {
india in=new india();
System.out.println(in.getname());
System.out.println(in.getid());

	}

}
class india
{
	public int id=101;
	private String name="vignesh";
	public int getid()
	{
		id=102;
	return id;
	}
	public void setid(int id)
	{
		this.id=id;
	}
	public String getname()
	{
		String name="Ashok";
		return name;
	}
	public void setname(String name)
	{
		
		this.name=name;
	}
}
