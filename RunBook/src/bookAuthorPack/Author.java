package bookAuthorPack;

public class Author {

	private String name;
	private String email;
	private String gender;

//Overloaded constructors
	public Author (String n){
		this.name = n;
	}

	public Author (String n, String e, String g){
		this.name= n;
		this.email=e;
		this.gender=g;
	}

	public String getName(){
		return this.name;
	}

	public String getEmail(){
		return this.email;
	}

	public String getGender(){
		return this.gender;
	}

	public void setName (String name){
		this.name = name;
	}

	public String toString(){
		return ("Author [name= " +this.name+ ", email= " +this.email+ ", gender= " +this.gender+ "]");
	}
	
}
