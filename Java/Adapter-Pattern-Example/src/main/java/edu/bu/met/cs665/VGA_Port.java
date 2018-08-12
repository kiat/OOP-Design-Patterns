package edu.bu.met.cs665;

public class VGA_Port implements DisplayPort {

	private String visualData;

	/**
	 * @param visualData
	 */
	public VGA_Port(String visualData) {
		this.visualData = visualData;
	}

	/**
	 * Simple constructor.
	 */
	public VGA_Port() {
	}

	@Override
	public void display() {
		System.out.println("This is display info comming from VGA Port: " + visualData);
	}

	/**
	 * @return the visualData
	 */
	public String getVisualData() {
		return visualData;
	}

	/**
	 * @param visualData
	 *            the visualData to set
	 */
	public void setVisualData(String visualData) {
		this.visualData = visualData;
	}

}