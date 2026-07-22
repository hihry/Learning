// Encapsulation : Binding of data with specific methods


// Abstrraction 


// Interr=face 


// Polymorphism 


// Solid Principles
/*
  Design Patterns 
   
*/
class Vechicle{
    getEngine(){

    }
}

class Car extends Vechicle(){
    @Override
    getEngine(){
        return "idiot"
    }
}

class Truck extends Vechicle(){
    @Override
    getEngine(){
        throw new RuntimeException("damnnn")
    }
}