
    class Animal {
        void sound() {
            System.out.println("Animals make sounds");
        }
    }

    // Child class inheriting from Animal
    class Dog extends Animal {
        void bark() {
            System.out.println("Dog barks");
        }
    }
    class Cat extends Animal {
      void meow(){
          System.out.println("Cat meows");
      }

    }
    class Lion extends Animal {
     void roar(){
         System.out.println("Lion roars");
     }

    }


    public class Inheritance {
        public static void main(String[] args) {
            Dog d = new Dog();
            Cat c = new Cat();
            Lion l = new Lion();
            d.sound();
            d.bark();
            c.meow();
            l.roar();
        }
    }


