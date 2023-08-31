class ZudioRunner{

  public static void main(String chandan[]){
  
  String[] brands ={"Puma","Nike","Zara","Arrow"}; 
  
   Zudio zudios = new Zudio(2,5,"Shimogga",brands);
  
   /*zudios.id = 2;
   zudios.noOfWorkers=5;
   zudios.location="Shimogga";
   zudios.brands=brands;*/
  
  //zudios.doBusiness();
  /*System.out.println("Tha Barands Name is"+zudios.id+"  "+zudios.noOfWorkers+""+zudios.location);*/
  System.out.println("List of all Brandes");
  zudios.getAllBrands(zudios.brands);
  
  
  }





}
