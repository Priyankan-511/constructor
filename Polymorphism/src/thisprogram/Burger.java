package thisprogram;

public class Burger {
	public int ingrediant;
	public String shape;
	public String chees;
	public String combination;
	public boolean testy;
	public String shopstart;
	public String shopend;
	public int itemcount;
	public boolean containsfries;
	
public Burger(int ingrediant, String shape, String chees,String combination,boolean testy,String shopstart,String shopend,int itemcount,boolean containsfries)

{
		this.ingrediant=ingrediant;
		this.shape=shape;
		this.chees=chees;
		this.combination=combination;
		this.testy=testy;
		this.shopstart=shopstart;
		this.shopend=shopend;
		this.itemcount=itemcount;
		this.containsfries=containsfries;
		
	}
	public void display() {
		
		System.out.println("ingrediant:"+this.ingrediant);
		System.out.println("shape:"+this.shape);
        System.out.println("chees:"+this.chees);
        System.out.println("combination:"+this.combination);
        System.out.println("testy:"+this.testy);
        System.out.println("shopstart:"+this.shopstart);
        System.out.println("shopend:"+this.shopend);
        System.out.println("itemcount:" +this.itemcount);
        System.out.println("containsfries:" +this.containsfries);

		
	}


}
