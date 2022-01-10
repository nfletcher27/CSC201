interface Objects2 {

	public void chirp();
	public void tweet();
}

public class Objects implements Objects2 {
	
	
	public static void main(String[] args) {
		
		Objects object = new Objects();
		System.out.println(object instanceof Objects);
		
		Objects birdy = new Objects();
		birdy.chirp();
		
	}

	@Override
	public void chirp() {
		System.out.println("Chirp!");
		
	}

	@Override
	public void tweet() {
		System.out.println("Tweet!");
		
	}
}
