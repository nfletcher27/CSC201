public class Main {

	public static void main(String[] args) {
		Shoe sh = new Shoe("Nike", 11);
		Running run = new Running("Nike", 12, 12);
		Walking walk = new Walking("Adidas", 10, true);
		
		System.out.println(sh);
		System.out.println(run);
		System.out.println(walk);
	}

}
