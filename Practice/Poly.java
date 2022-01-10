class Bird {
	
	public void singing() {
		System.out.println("Chirp chirp chirp");
	}	
}

class Robin extends Bird {
	
	public void chirp() {
		System.out.println("Tweeeeeeeet");
	}
}

class Seagull extends Bird {
	
	public void singing() {
		System.out.println("SQUAAWK");
	}
}
public class Dunno {
	public static void main(String[] args) {
		
		Bird mrTweet = new Bird();
		mrTweet.singing();
		
		Seagull mrGull = new Seagull();
		mrGull.singing();
		
	}
}
