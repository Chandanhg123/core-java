class Patient{

  private String patientName;
  private int id;
  private  String sisterName;
  private int age;
  private String diseaseName;
  private int wardNo;
  private String admitedDate;
  private String hospitalName;
  private String patientAddress;
  private String gender;
  private String consultantDoctor;
  
  public void setPatientName(String patientName){
	 this.patientName=patientName; 
	  }
  public String getPatientName(){
	 return patientName;
	  }	
  public void setId(int id){
	  this.id=id;
	  }	  
  public int getID(){
	  return id;
  }
  public void setSisterName(String sisterName){
	  this.sisterName=sisterName;
	  }
  public String getSisterName(){
	  return sisterName;
  }
  public void setAge(int age){
	  this.age=age;
	  }
	public int getAge(){
		return age;
	}
   public void setDiseaseName(String diseaseName){
	   this.diseaseName=diseaseName;
   }
   public String getDiseaseName(){
	   return diseaseName;
   }
  public void setWardNo(int wardNo){
	this.wardNo=wardNo;  
  }
  public int getWardNo(){
	  return wardNo;
  } 
  public void setAdmitedDate(String admitedDate){
	  this.admitedDate=admitedDate;
  }
  public String getAdmitedDate(){
	  return admitedDate;
  }
  public void setHospitalName(String hospitalName){
	 this.hospitalName=hospitalName; 
  }
   public String getHospitalName(){
	   return hospitalName;
   } 
   public void setPatientAddress(String patientAddress){
	 this.patientAddress=patientAddress; 
  }
    public String getPatientAddress(){
	   return patientAddress;
   }
  public void setGender(String gender){
	 this.gender=gender; 
  }
    public String getGender(){
	   return gender;
   }
  public void setConsultantDoctor(String consultantDoctor){
	  this.consultantDoctor=consultantDoctor;
  } 
 public String getConsultantDoctor(){
	 return consultantDoctor;
 }  
   
}