class DrumKitTestDrive {
public static void main(String[] args) {
DrumKit d = new DrumKit();
d.Snare = false;
d.PlaySnare();
	if (d.Snare == true) {
		d.PlaySnare();
}
d.playTopHat();
}	
}





class DrumKit {
boolean TopHat = true;
boolean Snare = true;


void PlaySnare () {
	System.out.println("bang bang ba-bang");
}
void playTopHat() {
	System.out.println("diing ding da-ding");
}	
}