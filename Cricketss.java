class Cricketss{

  String playerLists[] = new String[10];
  int index;
  
  public boolean addplayerList(String playerList){
  System.out.println("Tha Add Tha  Cricket  Name");
  
  boolean isAdded = false;
  if(playerList != null){
  System.out.println("Tha validation is Paopare Procssed to Add Cricketer  Name");
  
  playerLists[index] = playerList;
  index++;
  isAdded=true;
  System.out.println("Tha Is Added is Add succseFully");
  
  
  }
   return isAdded;
  
  }

  public void getCrickerNameList(){
  
  for(int index=0;index<playerLists.length;index++){
  System.out.println(playerLists[index]);
  }
  
  
}

}