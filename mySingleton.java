// Implement Singleton Class
// A singleton class is a class that can have only one object (an instance of the class) at a time.The purpose of singleton is to control object creation by keeping private constructor.

public class mySingleton
{
	     
    private static mySingleton myObj;
    private mySingleton()
{
         
}
    public static mySingleton getInstance(){
        if(myObj == null){
            myObj = new mySingleton();
        }
        return myObj;
    }
     
    public void getSomeThing(){
        // do something here
        System.out.println("I am here....");
    }
     
    public static void main(String a[]){
        mySingleton st = mySingleton.getInstance();
        st.getSomeThing();
    }
}
/*
Output
I am here....

Create a class student having attributes roll (integer), name(string) and marks(double). Create appropriate constructors and a show method to output the values of roll, name and marks of each student. Create an array of 3 student objects and show the result.


INHERITANCE 

ARRAY OF OBJECTS


*/