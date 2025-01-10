package sub8;

//implements - 인터페이스를 사용하기 위한 키워드
public class RemoteLG implements RemoteControl{

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
		System.out.println("LG - chUp...");
		
	}

	@Override
	public void chDown() {
		System.out.println("LG - chDown...");
		
	}

	@Override
	public void soundUp() {
		System.out.println("LG - soundUp...");
		
	}

	@Override
	public void soundDown() {
		System.out.println("LG - chDown...");
	
	}
	
}
