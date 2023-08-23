class Fan{
    static boolean isconnected;
	static int minVloume;
	static int maxVloume=6;
	static int currentVloume;


public static boolean onOrOff(){

  if(isconnected==false){
   isconnected=true;
   
  System.out.println("Tha Fan is Turn on");
  }

  else if(isconnected==true){
	  isconnected=false;
	  System.out.println("Tha Fan is tuen off");
	  
	  
  }
  return isconnected;
}

public static void incraeseThaFan(){
	
	if(isconnected==true){
	if(currentVloume<maxVloume){
		
		currentVloume=currentVloume+1;
		System.out.println("Tha Fan incress "+currentVloume);
	}
    else{
		System.out.println("Tha Fan is rise ");
		
	}	
		
		
	}
	else{
		
		System.out.println("Tha Fan is turn on");
	}
	
	
	
}

public static void decraeseThaFan(){
	
	if(isconnected=true){
	if(currentVloume>minVloume){
		
		currentVloume=currentVloume-1;
		System.out.println("Tha decraeseThaFan tha vloume"+currentVloume);
		
	}
else {
	System.out.println("Tha Fan decraese");
}	
		
	}
	else{
		System.out.println("Tha Fan will be tyrn off");
	
	
	}
	
}

}