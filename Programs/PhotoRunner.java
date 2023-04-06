class PhotoRunner{
public static void main(String[] args)
{
  int ref= Photo.size("2*4");
  System.out.println("stamp size photo");

  String ref= Photo.colour("green");
  System.out.println("photo colour is green");
  
  int ref= Photo.pixel("2");
  System.out.println("photo pixel is 2");
  
  String ref= Photo.type("stamp");
  System.out.println("photo is stamp size");
  
  String ref= Photo.clear("image");
  System.out.println("photo is not clear");
}

}