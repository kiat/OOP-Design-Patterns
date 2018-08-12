package edu.bu.met.cs665;

public class HdmiPort implements DisplayPort, SoundPort {

	private String soundData;
	private String visualData;
	
	/**
	 * @param soundData
	 * @param visualData
	 */
	public HdmiPort(String visualData, String soundData) {
		this.soundData = soundData;
		this.visualData = visualData;
	}
	
	@Override
	public void makeSound() {
		System.out.println("This is sound info comming from " + soundData);
	}

	@Override
	public void display() {
        System.out.println("This is display info comming from " + visualData);
	}

	/**
	 * @return the soundData
	 */
	public String getSoundData() {
		return soundData;
	}

	/**
	 * @param soundData the soundData to set
	 */
	public void setSoundData(String soundData) {
		this.soundData = soundData;
	}

	/**
	 * @return the visualData
	 */
	public String getVisualData() {
		return visualData;
	}

	/**
	 * @param visualData the visualData to set
	 */
	public void setVisualData(String visualData) {
		this.visualData = visualData;
	}

	

}
