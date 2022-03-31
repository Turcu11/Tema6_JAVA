
public class FigtherPlanes extends Plane {

	public FigtherPlanes(String planeID, int totalEnginePower) {
		super(planeID, totalEnginePower);
	}

	public void launchMissile() {
		System.out.println("PlaneID: " + this.planeID
				+ "Initiating missile launch procedure - Acquiring target - Launching missile - Break-\r\n"
				+ "ing away - Missile launch complete");
	}

}
