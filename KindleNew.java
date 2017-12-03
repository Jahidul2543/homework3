package homework3;

public class KindleNew extends Kindle implements PdfBook {

	@Override 
	public void readableInGadgets() {
		System.out.println("Shall be readbale");
		
	}

	@Override
	public void markAble() {
		System.out.println("Shall be able to heighlight as required");
		
	}

	@Override
	public void searchAble() {
		System.out.println("Shall be able to search key words");
				
	}

	@Override
	public void bookAppearance() {
		System.out.println("Shall have appearance like book");
		
	}
	@Override
	public void bookMark() {
		System.out.println("Over Ride bookMark Method");
	}
    
}
