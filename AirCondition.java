class AirCondition{

 static boolean isconnected;
 static int minVloume;
 static int maxVloume=6;
 static int currentvloume;
 
 
 public static  boolean onOrOff(){
	 
	 if(isconnected==false){
		isconnected=true;
    System.out.println("Tha AirCondition is turn on ");		
		 
		 
	 }else if (isconnected==true){
		 isconnected=false;
		 
		 System.out.println("Tha AirCondition is turn off");
		 
		 
	 }
	 
	 return isconnected;
	 
	 
	 
	 
 }

 public static void increcseVolumeOfAir(){
	 
	 if(isconnected==true){
		if(currentvloume<maxVloume){
			
		currentvloume=currentvloume+1;	
		System.out.println("Tha is reached to maxVloume"+currentvloume);
		} 
		 
		 
	 else {
		System.out.println("Tha ari condition is reached to tha maxVloume"); 
		 
	 }
	 }
	 else
	 {
		 
		 System.out.println("Tha AirCondition is must be turn on");
	 }
	 
	 
	 
	 
	 }
 
public static void dicrecseVolumeOfAir(){
	 
	 if(isconnected==true){
		if(currentvloume>minVloume){
			
		currentvloume=currentvloume-1;	
		System.out.println("Tha is reached to maxVloume"+currentvloume);
		} 
		 
		 
	 else {
		System.out.println("Tha ari condition is reached to tha minVloume"); 
		 
	 }
	 }
	 else
	 {
		 
		 System.out.println("Tha AirCondition is must be turn of");
	 }
	 
	 
	 
	 
	 }

}

