class PatientRunner{

  public static void main(String org[]){
  Patient patient = new Patient();
  patient.setPatientName("Guru");
  patient.setId(1);
  patient.setSisterName("Ruchitha K P");
  patient.setAge(20);
  patient.setDiseaseName("Heart Atack");
  patient.setWardNo(25);
  patient.setAdmitedDate("20-20-2020");
  patient.setPatientAddress("Shikaripura");
  patient.setHospitalName("Usha Narshing");
  patient.setGender("Male");
  patient.setConsultantDoctor("Dhanjaya");
  System.out.println("Tha Patient Name Is"+patient.getPatientName());
  System.out.println("Tha Patient Id Is "+patient.getID());
  System.out.println("Tha Sister Name is"+patient.getSisterName());
  System.out.println("Tha Patient Age is"+patient.getAge());
  System.out.println("Tha Desease Name is"+patient.getDiseaseName());
  System.out.println("Tha Ward No Is"+patient.getWardNo());
  System.out.println("Tha Admition Date is"+patient.getAdmitedDate());
  System.out.println("Tha Hospital Name is"+patient.getHospitalName());
  System.out.println("Tha Address Name Is "+patient.getPatientAddress());
  System.out.println("Tha Patient Gender Is"+patient.getGender());
  System.out.println("Tha ConsultantDoctor is"+patient.getConsultantDoctor());
  
  
  
  }




}