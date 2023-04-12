// copied from gfg article.

// The methods or data members declared as protected are accessible within the same package or subclasses in different packages.

// In this example, we will create two packages p1 and p2. Class A in p1 is made public, to access it in p2. 
// The method display in class A is protected and class B is inherited from class A
//  and this protected method is then accessed by creating an object of class B.

package p1;

// Class A
public class A
{
protected void display()
	{
		System.out.println("GeeksforGeeks");
	}
}


========================================================================
package p2;
import p1.*; // importing all classes in package p1

// Class B is subclass of A
class B extends A
{
public static void main(String args[])
{
	B obj = new B();
	obj.display();
}
	
}

Output: GeeksforGeeks