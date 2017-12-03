package homework3;

public abstract class Kindle {

	public abstract void bookAppearance();

	public void autoLightAdjustment() {
		System.out.println("Device shall be able to adjust screen brightness automatically");
	}

	public void bookMark() {
		System.out.println("User shall be able to bookmark ");
	}
    
	public void bookMark(String chapter) {
		System.out.println("User shall be able to bookmark Chapter ");
	}

}
