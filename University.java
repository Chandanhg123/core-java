class University{
                 static String collages[] = { "AIT ", "RV ", "Reva ", "NIE ", "Malnad ", "Acharya " , "Rajeev ", "Ramaiah ",
                                             "JSS ", "Nitte meenakshi ", "PES "};
			static	 int Price [] = {1000,2000,3000,4000,5000,6000,7000,8000,9000,10000};	
				
											 
            public static void main (String args[]){
				
			
			
              for(int Index=0;Index<collages.length;Index++){
			System.out.println(collages[Index]);	
		
		}
		
		for(int Index=collages.length-1;Index>=0;Index--){
			System.out.println(collages[Index]);
          }
}
}