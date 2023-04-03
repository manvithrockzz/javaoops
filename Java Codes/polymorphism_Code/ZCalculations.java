package polymorphism_Code;

public class ZCalculations {

    public void add(int a, int b){
        //add method code
        
    }

    // same method but can use in two ways, call 
    // this method when we have two inputs or call when we have 3 inputs
    public void add(int a, int b, int c){
        //add method code
    }

    // ! this is called method overloading

    public static void main(String[] args) {
        ZCalculations c = new ZCalculations();
        c.add(2,3);
        c.add(2,3,4);


        // System.out.println();
        
    }
    
}
