class Book{
	 private String author_name="karan";
	 Book(){}
	 Book(String author_name){
	 	this.author_name=author_name;
	 }
	void displaydata(){
		System.out.println("author_name : "+author_name);
	}
}
class Book_publication extends Book{
		private String title;
		Book_publication(String title){
	 	this.title=title;
	 	}
		void displaydata(){
		System.out.println("book_title : "+title);
		}
}
class Paper_publication extends Book{
		private String title;
		Paper_publication(String title){
	 	this.title=title;
	 	}
		void displaydata(){
		System.out.println("paper_title : "+title);
		}
}
class BookDemo{
	public static void main(String[] args){
		Book b1 = new Book(args[0]);
		b1.displaydata();

		Book bk1 = new Book_publication(args[1]);
		bk1.displaydata();

		Book bk2 = new Paper_publication(args[2]);
		bk2.displaydata();
	}
}