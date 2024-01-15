package lessons;

public class Casting {

public static void main(String[] args) {

// Integer to String
String myString1 = "";
int myInteger1 = 13;
myString1 = Integer.toString(myInteger1);
System.out.println(myString1);

// String to Integer
String myString2 = "33";
int myInteger2;
myInteger2 = Integer.parseInt(myString2);

// Double to String
String myString3 = "";
double myDouble1 = 13.3;
myString3 = Double.toString(myDouble1);

// String to Double
String myString4 = "6.8";
double myDouble2;
myDouble2 = Double.parseDouble(myString4);

// Integer to Double
int myInteger3 = 42;
double myDouble3 = (double)myInteger3;

// Double to Integer
double myDouble4 = 13.3;
int myInteger4 = 0;
myInteger4 = (int)myDouble4;

// Casting Double to Integer truncates
// (it does not round)
double myDouble5 = 324.7;

System.out.println((int)myDouble5);
}

}