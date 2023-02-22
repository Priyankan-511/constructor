package boot;

import thing.PoliceStation;

public class PoliceStationRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PoliceStation policeStation = new PoliceStation();
		System.out.println(policeStation.toString());

		System.out.println(policeStation.equals(policeStation));

		PoliceStation PoliceStation = new PoliceStation();
		System.out.println(PoliceStation.toString());

		System.out.println(PoliceStation.equals(PoliceStation));



	}

}
