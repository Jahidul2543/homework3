package homework3;

public class TestBook {

	public static void main(String[] args) {

		Books novelBook = new Books("Blue Sky", 20);
		// passing value to the parameter according to order of constructor
		System.out.println("\r" + "Name of Novel: " + novelBook.getNovel() + " " + "\n" + "Number of Available Book: "
				+ novelBook.getQntOfNovel());
		// called those private variable by getter method
		Books storyBook = new Books("Adventure of Sea", 25);
		// created object variable of Books class and initialized value on it by passing
		// value on parameters
		System.out.println("\r" + "Name of Story Book: " + storyBook.getNovel() + " " + "\n"
				+ "Number of Available Book: " + storyBook.getQntOfNovel());
		// called those private variable by getter method

		Books textBook = new Books();
		// used default constructor to create object variable/reference variable
		textBook.setNovel("Lav Rove");
		textBook.setQntOfNovel(30);
		// used setter method to to set value to the private variable

		System.out.println("\r" + "Name of Text Book: " + textBook.getNovel() + " " + "\n"
				+ "Number of Available Book: " + textBook.getQntOfNovel());
		// used getter method to get the assigned value of the private variables

	}

}
