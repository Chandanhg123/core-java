class Hotel{

  String menuLists[] = new String[10];
  int index;
  
  public boolean addMenuLest(String menuList){
  System.out.println("Tha Add Tha HOtel Food Name");
  
  boolean isAdded = false;
  if(menuList != null){
  System.out.println("Tha validation is Paopare Procssed to Add Chat Name");
  
  menuLists[index] = menuList;
  index++;
  isAdded=true;
  System.out.println("Tha Is Added is Add succseFully");
  
  
  }
   return isAdded;
  
  }

  public void getMenu(){
  
  for(int index=0;index<menuLists.length;index++){
  System.out.println(menuLists[index]);
  }
  
  
}

}