package thisprogram;

public class umbrella {
	public int no;
	public int clrcount;
	public String  colour;
	public String brand;
	public String pattern;
	public boolean open;
	public boolean close;


	
public umbrella (int no,int clrcount,String colour,String brand,String pattern,boolean open,boolean close )
{
	this.no=no;
	this.clrcount=clrcount;
	this.colour=colour;
	this.brand=brand;
	this.pattern=pattern;
	this.open=open;
	this.close=close;
}
	public void display() {
		System.out.println("no:"+this.no);
		System.out.println("clrcount:"+this.clrcount);
		System.out.println("colour:"+this.colour);
		System.out.println("brand:"+this.brand);
		System.out.println("pattern:"+this.pattern);
		System.out.println("open:"+this.open);
		System.out.println("close:"+this.close);
	}
	
	
	
	
	
			
	

}
