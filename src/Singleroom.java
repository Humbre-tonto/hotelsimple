import java.io.Serializable;

public class Singleroom implements Serializable
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String name;
    String contact;
    String gender;   
   
    Singleroom()
    {
        this.name="";
    }
    Singleroom(String name,String contact,String gender)
    {
        this.name=name;
        this.contact=contact;
        this.gender=gender;
    }
}