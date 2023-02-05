package thisprogram;

public class Rainbow {
	public int clrcount;
	public String shape;
	public String occur;
	public String combination;
	public boolean beautiful;
	public String start;
	public String end;
	
	public Rainbow(int clrcount, String shape, String occur,String combination,boolean beautiful,String start,String end)
	{
		this.clrcount=clrcount;
		this.shape=shape;
		this.occur=occur;
		this.combination=combination;
		this.beautiful=beautiful;
		this.start=start;
		this.end=end;
	}
	public void display() {
		
		System.out.println("clrcount:"+this.clrcount);
		System.out.println("shape:"+this.shape);
        System.out.println("occur:"+this.occur);
        System.out.println("combination:"+this.combination);
        System.out.println("beautiful:"+this.beautiful);
        System.out.println("start:"+this.start);
        System.out.println("end:"+this.end);

		
	}
}
