class PossPort{

 String  name;
 String sirName;
 String passWord;
 String confirmPassWord;
 
 public PossPort(String names,String sirnames,String passWords,String conf){ //it is constrator
	 
	 System.out.println("Tha Object creacte");
	 name=names;
	 sirName=sirnames;
	 passWord=passWords;
	 confirmPassWord=conf;
 }
  
  public boolean verifyPassWord(String password,String confirmPassWord){
	System.out.println("insise verifyPassWord") ; 
	  
  
  boolean isPassWorsVerify = false;
  
  
  if(passWord==confirmPassWord){
	  isPassWorsVerify=true;
	  //displayUserVerify();
	  
	  
  }
  else{
	  System.out.println("Typpe mismatch tha pass word Plz Enter Valid pass Word");
	  
	  
  }
	  
	  
  

 return isPassWorsVerify;
}
 
 public void displayUserVerify(){
	 
	 System.out.println("Tha Name of PossPort Holder"+name);
	 System.out.println("Tha Postport Holder SirName"+sirName);
	 System.out.println("Tha Possword"+passWord);
	 
 }
  public void validatePassWord(String passWord,String confirmPassWord){
  
  int minLength = 6;
  int maxLength = 18;
  int passWordLength=passWord.length();
  int conformPassWordLength=confirmPassWord.length();
  
  if(passWordLength>=minLength && passWordLength<=maxLength){
	  if(conformPassWordLength>=minLength && conformPassWordLength<=maxLength){
		 System.out.println("Password is valid"); 
		  verifyPassWord(passWord,confirmPassWord);
		  displayUserVerify();
	  }
	  
  }
  else{
	  System.out.println("Tha PassWord is nat Valid");
  }
  
  }
  
  
    


}