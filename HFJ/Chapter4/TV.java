class TV {
	String status;

	void switchon () {
		if (status == "OFF") {
			status = "ON";
			System.out.println("Switching On ");
		}
		else if (status == "ON"){
			System.out.println("Error");	
		}
	}
}