
public class TomCat extends FigtherPlanes {

	public TomCat(String planeID, int totalEnginePower) {
		super(planeID, totalEnginePower);

	}

	public void refuel() {
		System.out.println(
				"PlaneID: " + this.planeID + "Initiating refueling procedure - Locating refueller - Catching up -\r\n"
						+ "Refueling - Refueling complete.");
	}
}
