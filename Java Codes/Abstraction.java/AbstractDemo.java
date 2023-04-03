/*Abstract Class and Abstract Mehod Demo */

public class AbstractDemo {
    public static void main(String a[]) {

        Maheshphone obj = new Sureshphone(); // cannot create object of abstract class
        obj.call(); // but we can crete object for suresh class
                    // becuase it is concreate class.
        obj.cook();
        obj.dance();
        obj.move();
    }
}

/*
 * Mahesh want his phone to do multiple features,
 * so we created class Maheshphone and everyphone
 * has his basic feature(call) so public method call
 */
abstract class Maheshphone {
    public void call() {
        System.out.println("calling");
    }

    /*
     * mahesh want his phone to move, dance
     * and cook but he dont know the implementation
     * of these features and when you dont know the
     * implementation and dont want to provide implentation
     * we declare it as Abstract
     */

    public abstract void move(); // Abstract Methods

    public abstract void dance();

    public abstract void cook();

}

// when one class extends abstract class its
// compulsary to define all the methods
abstract class Rameshphone extends Maheshphone {

    public void move() {
        System.out.println("Moving");
    }

}

class Sureshphone extends Rameshphone { // concrete class
    public void dance() {
        System.out.println("dancing");
    }

    public void cook() {
        System.out.println("cooking");
    }

}
