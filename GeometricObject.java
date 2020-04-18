
public abstract class GeometricObject implements Comparable<GeometricObject>, Cloneable {
	
	//protected variable can be used if a child class extends the parent class GeometricObject
	protected int sideLength;
	protected double area;
	
	public int compareTo(GeometricObject obj) {
		if(sideLength == obj.sideLength) {
			
			//check if area are equal
			if(area == obj.area) {
				return 0; //same
			}else if(area > obj.area) { //if this area is greater than the obj area
				return 1;
			}//else if
			else {
				return -1;
			}//end if-else
		}//end outer if
		else if(sideLength > obj.sideLength) {
			return 1;
		}
		else {
			return -1;
		}//end if-else statement
	}//end compareTo method
	
	//clones the object
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}//end object clone
	
	abstract public double getArea();
	
	//overriding (run time polymorphism) the returned string to output all the fields 
	@Override
	public String toString() {
		String area1 = String.format("%.2f", area);
		return "Geometric Object" + "\nSidelength: " + sideLength + "\nArea: " + area1;
	}//end toString method

}//end class
