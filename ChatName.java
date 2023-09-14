class ChatName{

   String chatNames[]= new String[10];
   int index;
   
   public boolean addChatName(String chatName){
   System.out.println("Tha Add Tha Movie name");
   boolean isAdded = false;
   if(chatName != null){
   System.out.println("Tha validation is Paopare Procssed to Add Chat Name");
   
   chatNames[index]= chatName;
   index++;
   isAdded=true;
   System.out.println("Chat is Add Succsfully");
   
   }
   return isAdded;
   }
   
   public void getChrt(){
   for(int index=0;index<chatNames.length;index++){
   System.out.println(chatNames[index]);
   
   }
   
   
   }
   
   
   
}







/*class ottPlatform{

    String movieNames[] = new String[4];
	int index;
	//crad opratiom done
	//create
	public boolean addMovieName(String movieName){
		System.out.println("Inside Add Movie()");
		boolean isAdded = false;
		if(movieName != null){
			System.out.println("Validation is Prapar procesd to  add Movie Name");
			
			movieNames[index]= movieName;
			index++;
			isAdded=true;
			
			System.out.println("movieName"+"Add Succsfully");
			
		}
		
		return isAdded;
		
	}
	
	//read
public void getmovie(){
	for(int index=0;index<movieNames.length;index++){
		System.out.println(movieNames[index]);
	}
	
}


}*/