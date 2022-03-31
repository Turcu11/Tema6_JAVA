
public class Concorde extends ComercialPlanes {

	public Concorde(String planeID, int totalEnginePower, int maxNumberOfPassagers) {
		super(planeID, totalEnginePower, maxNumberOfPassagers);
	}

	public void goSuperSonic() {
		System.out.println("PlaneID: " + this.planeID + " - Super-Sonic mode activated");
	}

	public void goSubSonic() {
		System.out.println("PlaneID: " + this.planeID + " - Super-Sonic mode deactivated");
	}

}
