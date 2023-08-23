class Mixer{
  static boolean isconnected;
  static int minVloume;
  static int maxVloume=6;
  static int currentVloume;

public static boolean onOrOff(){
	if(isconnected==false){
	isconnected=true;
	System.out.println("Tha Mixer is turned on");	
		
		
		
	}else if(isconnected==true){
		
		isconnected=false;
		System.out.println("Tha Mixer ir Turnoff");
	}
	
	return isconnected;
}


public static void increseaThaMixerButten(){
	
	if(isconnected==true){
		if(currentVloume<maxVloume){
		currentVloume=currentVloume+1;
  System.out.println("Tha Mixer Vloume is increse"+currentVloume);		
			
		
		
	}
	else{
	System.out.println("Tha Mixer Vloume is Rise");	
		
	}
	}
   else{
	   System.out.println("Tha Mixer is turn on");
   
	
	}
}

 public static void dicreseaThaMixerButten(){
	 
	 if(isconnected==true){
		if(currentVloume>minVloume){
			
		currentVloume=currentVloume-1;	
		System.out.println("Tha is reached to maxVloume"+currentVloume);
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