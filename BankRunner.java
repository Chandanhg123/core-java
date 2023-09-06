class BankRunner{


  public static void main(String org[]){
	  Bank bank = new Bank();
	  bank.setId(2);
	  bank.setName("Canar Bamk");
	  bank.setBranchName("Isuru");
	  bank.setManager("Pavana");
	  bank.setIfseCode("canara12301225");
	  System.out.println("Tha Bank Id Is "+bank.getId());
	  System.out.println("Tha Bank Name Is"+bank.getName());
	  System.out.println("Tha Bank Branch Is"+bank.getBranchName());
	  System.out.println("Tha maneger name Is"+bank.getManager());
	  System.out.println("Tha ifse code is"+bank.getIfseCode());
  }



}