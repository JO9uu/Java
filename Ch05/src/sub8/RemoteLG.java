package sub8;

public class RemoteLG implements Remotecontrol {

	@Override
	public void powerOn() {
		System.out.println("LG - powerOn...");
	}

	@Override
	public void powerOff() {
		System.out.println("LG - powerOff...");
	}

	@Override
	public void chUp() {
		System.out.println("LG - powerchUp...");
	}

	@Override
	public void chDown() {
		System.out.println("LG - chDown...");
	}

	@Override
	public void soundUp() {
		System.out.println("LG - soungUp...");
	}

	@Override
	public void soundDown() {
		System.out.println("LG - soundDown...");

	}
}
