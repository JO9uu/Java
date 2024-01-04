package sub8;

public interface Remotecontrol {
//abstract는 생략 가능, 어차피 추상 메서드로 이루어지기 때문.
	public abstract void powerOn();
	public abstract void powerOff();
	
	public void chUp();
	public void chDown();

	public void soundUp();
	public void soundDown();
	
}
