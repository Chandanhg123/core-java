class Zudio{

    int id;
	String location;
	int noOfWorkers;
	String[] brands;
	
	public Zudio(int ids,int noOfWorkers,String loc,String[]brandss){
		System.out.println("Cloth object creact");
		id=ids;
		location=loc;
		noOfWorkers=noOfWorkers;
		brands=brandss;
		System.out.println("Tha Barands Name is"+id+"  "+noOfWorkers+""+location);
	}
	
   public  void salingCloths(){
   }

   public void doBusiness(){
   }

   public void getAllBrands(String brands[]){
	   
	  for(int index=0;index<brands.length;index++){
		  
		  System.out.println(brands[index]);
		  
	  } 
	   
	   
	   
   } 

}