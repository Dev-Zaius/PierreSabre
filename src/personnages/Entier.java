package personnages;

public class Entier {
	private int i = 0;
	public Entier(int i ) {
		this.i = i;
	}
	public Entier(Entier n) {
		this.i = n.i;
	}
	public boolean compare(Entier n) {
		return this.i == n.i;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Entier a = new Entier(3);
		Entier b = new Entier(a);
		Entier c = new Entier(b);
		Entier d = new Entier(4);
		if (c.compare(d)) {
			System.out.println("c == b");
		} else {
			System.out.println("c != b");
		}
	}

}
