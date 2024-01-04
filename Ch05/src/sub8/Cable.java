package sub8;

public class Cable implements Socket{

	private Bulb bulb;
	public Cable(Bulb bulb) {
		this.bulb = bulb;
	}
	@Override
	public void switchOn() {
		System.out.println("불 켜짐");
	}

	@Override
	public void switchOff() {
		System.out.println("불 꺼짐");
	}

}
