class Sensors{
	
	int sensorId;
	String sensorType;
	String sensorSupply;
	String sensorMount;
	int sensorPrice;
	boolean sensorworksornot;
	
	public Sensors(int senId,String senType,String senSupply,String senMount,int senprice,boolean SenWorksornot){
		
		System.out.println("Tha Sensors Object creacted");
		sensorId = senId;
		sensorType=senType;
		sensorSupply=senSupply;
		sensorMount=senMount;
		sensorPrice=senprice;
		sensorworksornot=SenWorksornot;
		System.out.println("The sensor id is "+sensorId);
		System.out.println("The sensor Type is "+sensorType);
		System.out.println("The sensor Supports the voltage of  "+sensorSupply);
		System.out.println("The sensor is adjusted in the type of  "+sensorMount);
		System.out.println("The sensor price is "+sensorPrice);
		System.out.println("The sensor works or not "+sensorworksornot);
		System.out.println("\n");
	}
	
	
	
	/*
	public void sensorCondition1(){
		System.out.println("The sensor is opened and anyone can go");
	}
	public void sensorCondition2(){
		System.out.println("The sensor is closed and wait for open");
	}*/
}