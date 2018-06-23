
public class CircleTest {

	public static void main(String[] args) {
		Creator creator = new Creator ("Antonis");
		CircleEx c1 = new CircleEx (5,3,2,creator);
		CircleEx c2 = new CircleEx (c1);
		
		System.out.println(c1);
		System.out.println(c2);
		
		if (c1.equals(c2)) {
			System.out.println ("same circles");
		}else {
			System.out.println ("Different circles");
		}
		
		if (c1.getCreator().getName().equals(c2.getCreator().getName())) {
			System.out.println ("same creator");
		}else {
			System.out.println("Different creator");
		}
	}

}
