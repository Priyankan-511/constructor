package boot;

public class Home1 {

	public class Home {
		private String name;
		private String adress;
		private String location;

		@Override
		public String toString() {
			return "Home1 [name=" + name + ", adress=" + adress + ", location=" + location + "]";
		}

		public void setName(String name) {
			this.name = name;
		}

		public void setAdress(String adress) {
			this.adress = adress;
		}

		public void setLocation(String location) {
			this.location = location;
		}

	}

}
