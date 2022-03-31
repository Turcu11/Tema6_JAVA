
public class ComercialPlanes extends Plane {

	protected int maxNumberOfPassagers;

	public ComercialPlanes(String planeID, int totalEnginePower, int maxNumberOfPassagers) {
		super(planeID, totalEnginePower);
		this.maxNumberOfPassagers = maxNumberOfPassagers;
	}

	public int getMaxNumberOfPassagers() {
		return maxNumberOfPassagers;
	}
}
