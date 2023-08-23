class Speaker{

  static boolean isconnected;
  static int minVolume;
	static int maxVolume=6;
	static int currentVolume;
    public static boolean onOrOff(){
	
	
	System.out.println("Inside OnOrOff");
	if(isconnected==false){
	isconnected=true;
	System.out.println("Tha Speaker is turn on...and Enjoy tha party");
	
	}else if(isconnected==true){
	isconnected=false;
	System.out.println("Tha Speaker is Turn off..And go To Sleap");
	}
	
	System.out.println("end of OnOrOff");
	return  isconnected;
	
	
	
	}


 public static void increaseVolume(){
	
System.out.println("Starte tha increaseVolume");	
if(isconnected==true){
if(currentVolume<maxVolume){
	
	currentVolume=currentVolume+1;
	System.out.println("tha current volume is reached to maxVolume "+currentVolume);
	
}	
else{
	
	System.out.println("Tha current volume is reached to maxVolume");
}
}


else {
	
	System.out.println("Speaker must be turn on ");
}	
	
System.out.println("end  tha increaseVolume");	
}


	 
	 
 
 
 public static void decreaseVolume(){
	
System.out.println("Starte tha increaseVolume");	
if(isconnected==false){
if(currentVolume>minVolume){
	
	currentVolume=currentVolume-1;
	System.out.println("tha current volume is reached to maxVolume "+currentVolume);
	
	
}


else{
	
	System.out.println("Tha current volume is reached to maxVolume");
}
}	
 
else {
	
	System.out.println("Speaker must be turn on ");
}	
	
	


System.out.println("end  tha increaseVolume");
	 
	 
 }
}
 