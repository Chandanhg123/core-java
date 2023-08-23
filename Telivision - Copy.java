class Telivision{
    static boolean isconnected;
	static int minVloume;
	static int maxVloume=6;
	static int currentVloume;


public static boolean onOrOff(){

  if(isconnected==false){
   isconnected=true;
   
  System.out.println("Tha Telivision is Turn on");
  }

  else if(isconnected==true){
	  isconnected=false;
	  System.out.println("Tha Telivision is tuen off");
	  
	  
  }
  return isconnected;
}

public static void incraeseThaTelivision(){
	
	if(isconnected==true){
	if(currentVloume<maxVloume){
		
		currentVloume=currentVloume+1;
		System.out.println("Tha Telivision incress "+currentVloume);
	}
    else{
		System.out.println("Tha Telivision is rise ");
		
	}	
		
		
	}
	else{
		
		System.out.println("Tha Telivision is turn on");
	}
	
	
	
}

public static void decraeseThaTelivision(){
	
	if(isconnected=true){
	if(currentVloume>minVloume){
		
		currentVloume=currentVloume-1;
		System.out.println("Tha decraeseThaTelivision tha vloume"+currentVloume);
		
	}
else {
	System.out.println("Tha Telivision decraese");
}	
		
	}
	else{
		System.out.println("Tha Telivision will be tyrn off");
	
	
	}
	
}

}