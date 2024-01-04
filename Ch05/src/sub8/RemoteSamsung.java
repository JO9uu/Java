package sub8;

public class RemoteSamsung implements Remotecontrol{

	@Override
	public void powerOn() {
		System.out.println("Samsung - powerOn...");
	}

	@Override
	public void powerOff() {
		System.out.println("Samsung - powerOff...");
	}

	@Override
	public void chUp() {
		System.out.println("Samsung - powerchUp...");
	}

	@Override
	public void chDown() {
		System.out.println("Samsung - chDown...");
	}

	@Override
	public void soundUp() {
		System.out.println("Samsung - soungUp...");
	}

	@Override
	public void soundDown() {
		System.out.println("Samsung - soundDown...");
	}
	

		
	
}

