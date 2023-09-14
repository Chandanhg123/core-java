class Spotify{

  String SongLists[] = new String[10];
  int index;
  
  public boolean addplayerList(String songList){
  System.out.println("Tha Add Tha  Song List");
  
  boolean isAdded = false;
  if(songList != null){
  System.out.println("Tha validation is Paopare Procssed to Add Song List");
  
  SongLists[index] = songList;
  index++;
  isAdded=true;
  System.out.println("Tha Is Added is Add succseFully");
  
  
  }
   return isAdded;
  
  }

  public void getSongList(){
  
  for(int index=0;index<SongLists.length;index++){
  System.out.println(SongLists[index]);
  }
  
  
}

}