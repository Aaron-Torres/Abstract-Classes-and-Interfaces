
public class Driver {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		 Octagon o1 = new Octagon(); //creates a new octagon object
		 Octagon o2 = (Octagon)o1.clone(); //creates a new clone of the o1 octagon object
		 
		 //displaying both of the objects
		 System.out.println("Octagon 1: " + o1); //prints the object o1
		 System.out.println("\nOctagon 2: " + o2); //prints the object 02
		 
		 //compare both objects to check if they are the same with the same area and length
		 int compare = o1.compareTo(o2);
		 if(compare == 1) {
			 System.out.println("\nOctagon 1 > Octagon 2");
		 } 
		 else if(compare == -1) {
			 System.out.println("\nOctagon 2 > Octagon 1");
		 }
		 else {
			 System.out.println("\nThe two geometric objects are the same!");
		 }//end if-else statement

	}//end main method

}//end class
