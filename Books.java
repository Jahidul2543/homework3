package homework3;

/**
 * author Md Jahidul Islam application Books version 1.1 Use of getter and
 * setter
 */

public class Books {

	private String novel;
	private int qntOfNovel;

	// default constructor
	public Books() {
	}

	// constructor 1
	public Books(String novelName, int quantity) {
		this.novel = novelName;
		this.qntOfNovel = quantity;
		// declare parameter
	}
	//

	public String getNovel() {

		return novel;
	}

	public void setNovel(String novel) {
		this.novel = novel;
	}

	public int getQntOfNovel() {
		return qntOfNovel;
	}

	public void setQntOfNovel(int qntOfNovel) {
		this.qntOfNovel = qntOfNovel;
	}

}
