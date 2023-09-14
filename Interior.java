class Interior{

  String interiorNames[] = new String[10];
  int index;
  
  public boolean addmaterialName(String materialName){
  System.out.println("Tha Add Tha Metrial Names");
  
  boolean isAdded = false;
  if(materialName != null){
  System.out.println("Tha validation is Paopare Procssed to Add Tha Meterial Name");
  
  interiorNames[index] = materialName;
  index++;
  isAdded=true;
  System.out.println("Tha Is Added is Add succseFully");
  
  
  }
   return isAdded;
  
  }

  public void getmarerial(){
  
  for(int index=0;index<interiorNames.length;index++){
  System.out.println(interiorNames[index]);
  }
  
  
}

}