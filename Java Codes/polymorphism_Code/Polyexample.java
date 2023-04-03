package polymorphism_Code;
public class Polyexample {

    // the ability of any object to indentify as more than one type 

    public static void main(String[] args) {

        car Car =new car();
        Bicycle bicycle = new Bicycle();
        boat Boat =new boat();

        vehicle[] racers={Car, bicycle,Boat};

        // car.go();
        // Bicycle.go();
        // boat.go();

        for(vehicle X:racers){
            X.go();
        }


        
    }
    
} 
