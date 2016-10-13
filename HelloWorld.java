// test for push command

/*	compiling and executing:
1.	javac HelloWorld.java	// must have the same name with the class name in the following, then plus suffix .java.
2.	java HelloWorld
although the execution file is with a .class suffix, you don't need to add it in "java HelloWorld" command.
*/
public class HelloWorld {

   public static void main(String[] args) {

       System.out.println("Hello World!");

// Create a string with a constructor
String s1 = new String("Who let the dogs out?");
// Just using "" creates a string, so no need to write it the previous way.
String s2 = "Who who who who!";
// Java defined the operator + on strings to concatenate:
//String s3 = s1 + s1;
String s3 = s1 + " " + s2;

		System.out.println(s3);

int num = 5;
String s = "I have " + num + " cookies"; //Be sure not to use "" with primitives.

		System.out.println(s);

boolean b = false;
b = true;

boolean toBe = false;
b = toBe || !toBe;
if (b) {
    System.out.println("output a boolen ",toBe);
}
   }

}
