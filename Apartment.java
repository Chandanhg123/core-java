class Apartment{


   int apartmentId;
   String apartmentName;
   String apartmentLocation;
  int noOfFlower;
  int noOfTwoBhkFlotes;
  int noOfThreeBhkFlotes;
  
  public Apartment(int apertmetids,String apartmentname,String apartmentloc,int noofa,int nooffl,int nooffla){
	  
	  
	  System.out.println("Apartment Object Creacted");
	  apartmentId=apertmetids;
	  apartmentName=apartmentname;
	  apartmentLocation=apartmentloc;
	  noOfFlower=noofa;
	  noOfTwoBhkFlotes=nooffl;
	  noOfThreeBhkFlotes=nooffla;
	 System.out.println("Apartmet id is" +apartmentId);
	System.out.println("Tha Apartment Name is" +apartmentName);
	System.out.println("Tha Apartment Location is " +apartmentLocation);
	System.out.println("Tha Aprtment Number of Floweres" +noOfFlower);
	System.out.println("Tha Apartment Number if Two BHK Flotes is" +noOfTwoBhkFlotes);
	System.out.println("Tha Apartment Number if Three BHK Flates" +noOfThreeBhkFlotes);
  }
  
  
  public static void provideAccomadation(){
	  
	  System.out.println("To provide tha large space to tha peoples");
  }

  



}