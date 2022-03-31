
public class Main {

	public static void main(String[] args) {

		Plane normalPlane = new Plane("31NP", 2000);
		ComercialPlanes comercial = new ComercialPlanes("32CP", 1800, 300);
		Concorde CASH = new Concorde("33CC", 12000, 1050);
		Boeing BoeingPlane = new Boeing("34BO", 3200, 45);
		FigtherPlanes militaryPlane = new FigtherPlanes("35MP", 3500);
		MIG mig = new MIG("36MG", 6500);
		TomCat TC = new TomCat("37", 8500);
		TC.launchMissile();
		militaryPlane.launchMissile();
		System.out.println(normalPlane.getPlaneID());
	}

}
