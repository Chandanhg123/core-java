class PossPortRunner{

  public static void main(String org[]){
  
  PossPort passport = new PossPort("Chandan","H G","Chan","Chan");
  /*passport.name="Chandan";
  passport.sirName="H G"; 
  passport.passWord="Chan";
  passport.confirmPassWord="Chan";*/
  
  passport.validatePassWord(passport.passWord,passport.confirmPassWord);
  }



}