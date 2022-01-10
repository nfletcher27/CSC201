class Outside {
	int a = 10;
	String outer = "This is the outer class";
	
	class Inside {
		String inside = "This is the inner class";
	}
}

public class Objects {
	public static void main(String[] args) {
		
		Outside outer = new Outside();
		Outside.Inside inner = outer.new Inside();
		System.out.println(outer.outer+ "\n" + inner.inside);
		
		
	}
}
