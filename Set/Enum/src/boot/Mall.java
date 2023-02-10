package boot;

public class Mall {
	public String name;
	public String ambience;
	public int nosflore;

	public Mall(String name, String ambience  ) {
		System.out.println("no arg constructor");
	}

	public void setname(String name) {
		this.name = name;
	}

	public void setambience(String ambience) {
		this.ambience = ambience;
	}

	public void setnosflorel(int nosflore) {
		this.nosflore = nosflore;
	}

	public void display(){
		System.out.println("details about Mall");
		System.out.println("name:" + name);
		System.out.println("ambience:" + ambience);
		System.out.println("nosflore:" + nosflore);
		
		
		
			}
}

		
