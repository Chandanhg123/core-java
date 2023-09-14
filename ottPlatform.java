class ottPlatform{

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


}