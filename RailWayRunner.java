class RailWayRunner{

 public static void main(String org[]){
	
   RailWay railWay = new RailWay();
   railWay.setId(2);
   railWay.setName("KarthiVara Sangoli Rayanna"); 
   railWay.setNoofTicketCounter(23);
   railWay.setLocation("blr");
   railWay.setNoOfPlateForm(23);
	
System.out.println("Tha RailWay Id is"+railWay.getId());
System.out.println("Tha RailWay Name is"+railWay.getName());
System.out.println("Tha RailWay No of Ticket Counteris"+railWay.getNoofTicketCounter());
System.out.println("Tha RailWay Location is"+railWay.getLocation());
System.out.println("Tha RailWay No Of PlateForm  is"+railWay.getNoOfPlateForm());	
	 
	 
 }

}