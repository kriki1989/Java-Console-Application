
public class CircleEx {
	
	private int x;
	private int y;
	private int radius;
	private Creator creator;
	
	CircleEx (int x, int y, int r, Creator creator){
		this.x = x;
		this.y = y;
		this.radius = r;
		this.creator = creator;
	}
	
	public CircleEx (CircleEx original) {
		this(original.x, original.y, original.radius, original.creator);
		this.creator =  new Creator (original.creator);
	}
	
	public String toString() {
		return "CircleEx [x=" + x + ", y=" + y + ", radius=" + radius + ", creator=" + creator + "]";
	}
	
	public Creator getCreator() {
		return this.creator;
	}


}
