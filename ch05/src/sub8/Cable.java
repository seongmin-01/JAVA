package sub8;

public class Cable implements Socket{

	private Bulb bulb;
	
	public Cable(Bulb bulb) {
		this.bulb = bulb;
	}
	
	@Override
	public void swichOn() {
		bulb.lightOn();
	}

	@Override
	public void swichOff() {
		bulb.lightOut();
		
	}

	
}
