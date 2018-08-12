package edu.bu.met.cs665;

public class Main {

	/**
	 * This main method runs an example.
	 * 
	 * @param args
	 *            not used
	 */
	public static void main(String[] args) {

		HdmiPort myHDMIPort=new HdmiPort("MyFace", "MySound");
		VGA_Port myVGAPort=new VGA_Port();
		
		
		HDMI_To_VGA_Adapter hdmiToVGA= new HDMI_To_VGA_Adapter(myVGAPort);

		hdmiToVGA.adapt(myHDMIPort);
	}
}