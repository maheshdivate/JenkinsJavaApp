class Ex02 {
    public static void main(String[] args) {
        Helper.print("Apple123");
        for(int i =0; i < args.length;i++)
            Helper.print(args[i]); 
    }
}

/*
Rules of creating a class in Java:
A Java file is recommended to have only one class per file and it should be public. 
However U can have non-public classes as many as U want and its scope will be limited to the package. This is called as Default scope. But the main function class should be public and should have the same name as the filename. 
The class with main is not mandatory to have public accessor if there the classname and the filename are matching.... 

-------------------------------main Function-----------------------------------------------
main is the entry point of the Java Application. Note that it is not global, rather it is placed within a class. main should be public always. It returns nothing. 
There is no concept of global functions in Java. 
A Class has to be instantiated before we use any methods of the class. Now this method main is to be invoked. A class cannot be instantiated outside, as no global scope is available. A method has to be invoked without an object, that is done using a modifier called static.
It will take String [] as arguement, that is the command line args to be passed when the program runs. If no args are provided, the Runtime simply ignores the args.  
main calls other functions in it. When the main ends, Ur app will terminate. return is used to exit the main function and terminate the program. 
It is recommended to have a shorter main function as much as possible. UR code should be as much modular as possible.(One fn should do only one task)
*/ 