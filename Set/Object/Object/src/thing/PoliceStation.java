package thing;

public class PoliceStation {
	private String name;
	private String location;
	private String shape;
	private int ticketprice;
	private int peoplecount;
	private String ownername;
	
	

	public PoliceStation() {
		System.out.println("no argument constructor");
	}

	public PoliceStation(String name, String location, String shape,int ticketprice,int peoplecount,String ownername) {
		this.name = name;
		this.location = location;
		this.shape = shape;
		this.ticketprice=ticketprice;
		this.peoplecount=peoplecount;
		this.ownername=ownername;
	}

	public boolean equals(Object arg) {
		System.out.println("running equals in Park" + arg);
		if (arg != null) {
			System.out.println("arg is not null");
			if (arg instanceof PoliceStation) {
				System.out.println("arg is PoliceStation");
				PoliceStation casted = (PoliceStation) arg;
				PoliceStation left = this;
				PoliceStation right = casted;
				if (left.name.equals(right.name) && left.location.equals (right.location) && left.shape.equals(right.shape) &&left.ticketprice==(right.ticketprice)&&left.peoplecount==(right.peoplecount) && left.ownername.equals(right.ownername) ) {
					System.out.println("left is equal to right");
					return true;
				} else {
					System.out.println("left is not equal to right");
				}

			} else {
				System.err.println("arg is not Park");
			}
		} else {
			System.err.println("arg is null");
		}

		return false;
	}

	public String toString() {
		{
			return " [name: " + this.name + " ] [location:" + this.location + " ] [shape:" + this.shape + "] [ticketprice:" + this.ticketprice+"] [peoplecount:" +this.peoplecount+"][ownername:" + this.ownername+"]";
		}
	}


}
