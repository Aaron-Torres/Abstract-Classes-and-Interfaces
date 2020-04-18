
public class Octagon extends GeometricObject {

	public Octagon()
	{
		this.getArea();
	}//end Octagon
	  
	// parameterized constructor
	public Octagon(int length)
	{
	sideLength = length;
	area = 2*(1+Math.sqrt(2))*Math.pow(sideLength, 2);
	}

	
	@Override
	public double getArea() {
		sideLength = 8;
		area = 2*(1+Math.sqrt(2))*Math.pow(sideLength, 2); 
		return area;
	}//end getArea

	
}//end Octagon class

