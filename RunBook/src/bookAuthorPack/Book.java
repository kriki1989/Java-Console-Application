package bookAuthorPack;

public class Book {

		//4 private instance variables
		private String name;
		private Author author;
		private double price;
		private int qty;

		//Constructor
		public Book (){
		}

		public Book (String n, Author a, double p, int q){
			this.name = n;
			this.author = a;
			this.price = p;
			this.qty = q;
		}

		//Public Methods
		public String getName(){
			return this.name;
		}

		public String getAuthor(){
			return this.author.toString();
		}

		public double getPrice(){
			return this.price;
		}

		public void setPrice(double a){
			this.price = a;
		}

		public int getQty(){
			return this.qty;
		}

		public void setQty(int a){
			this.qty= a;
		}

		public String toString(){
			String text = "Book [name=" +this.name+ ", " +author.toString()+ ", price= " +this.price+ ", qty= " +this.qty+ "]";
			return text;
		}

		public String getAuthorName(){
			return this.author.getName();
		}

		public String getAuthorEmail(){
			return this.author.getEmail();
		}

		public String getAuthorGender(){
			return this.author.getGender();
		}

		public void setAuthorName (String name){
			this.author.setName(name);
		}
	
}
