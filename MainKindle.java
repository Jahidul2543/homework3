package homework3;

public class MainKindle {

	public static void main(String[] args) {

		KindleNew kindle = new KindleNew();
		kindle.bookAppearance();
		kindle.autoLightAdjustment();
		kindle.bookMark();
		kindle.markAble();
		kindle.readableInGadgets();
		kindle.searchAble();
		kindle.bookMark("Chapter");  //bookMark method has been overloaded by this call.

	}

}
