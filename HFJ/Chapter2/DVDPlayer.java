class DVDPlayer {
	boolean canRecord = false;
	void recordDVD() {
		if (canRecord == true) {
		System.out.println("DVD recording");
		}
	}
}
class DVDPlayerTestDrive {
	public static void main(String [] args) {
		DVDPlayer d = new DVDPlayer();
		d.canRecord = true;
		// d.PlayDVD();
		 
		d.recordDVD();
		 
	}
}
