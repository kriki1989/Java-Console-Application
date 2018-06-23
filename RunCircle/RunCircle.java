public class RunCircle{

	public static void main(String[] args){

		Circle myCircle = new Circle (1.35);
		Circle myCircle1 = new Circle ();
		Circle myCircle2 = new Circle (1.5,"White");

		//System.out.println (myCircle.getRadius()+" "+myCircle.getArea()+" \n"+myCircle1.getRadius()+" "+myCircle1.getArea());
		System.out.println (myCircle.toString()+" \n \n"+myCircle1.toString()+" \n \n"+myCircle2.toString());
	}
}