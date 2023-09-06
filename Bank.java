class Bank{
   private int id;
   private String name;
   private String branchName;
   private String manager;
   private String ifseCode;
   
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
	   public void setBranchName(String branchName){
		this.branchName=branchName;   
	   }
	   public String getBranchName(){
		   return branchName;
	   }
	   public void setManager(String manager){
		 this.manager=manager;		 
	   }
	   public String getManager(){
		   return manager;
	   }
	   public void setIfseCode(String ifseCode){
		   this.ifseCode=ifseCode;
	   }
	   public String getIfseCode(){
		   return ifseCode;
	   }
	   
	   
   
}