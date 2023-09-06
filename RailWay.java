class RailWay{
  private int id;
  private String name;
  private int noofTicketCounter;
  private String location;
  private int noOfPlateForm;
   
   public void setId(int id){
	   this.id=id;
   }
   public int getId(){
	   return id;
   }
  public void setName(String name){
	  this.name=name;
  }
  public String getName(){
	  return name;
	  }
  public void setNoofTicketCounter(int noofTicketCounter){
	  this.noofTicketCounter=noofTicketCounter;
  }
 public int getNoofTicketCounter(){
	 return noofTicketCounter;
 }
  public void setLocation(String location){
   this.location=location;  
 }
  public String getLocation(){
	  return location;
  }
  public void setNoOfPlateForm(int noOfPlateForm){
	  this.noOfPlateForm=noOfPlateForm;
  }
   public int getNoOfPlateForm(){
	   return noOfPlateForm;
   }
}