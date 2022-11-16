public class DogPuppy {

    /** 
    Instance variables are defined first
    Instance variables should be defined as 'private', meaning their values
    can be accessed only from methods defined inside the class.  If the
    values need to be retrieved or set from outside the class we should
    define "getter" and "setter" methods.  More on that later
     */
    private int health;             // An integer that represents a dog's health
    private int height;             // An integer that represents a dog's height
    private int weight;             // An integer that represents a dog's weight
    private int energy;             // An integer that represents a dog's energy
    private int mood;               // An integer that represents a dog's mood
    private int strength;           // An integer that represents a dog's strength

    /* Methods are defined next */
    public void walk() {
        health = health + 5;
        energy = energy - 2;
        strength = strength - 2;
    }

    public void socialize() {
        energy = energy - 1;
        mood = mood + 2;
    }

    public void eat() {
        health = health + 5;
        weight = weight + 1;
        energy = energy + 2;
        mood = mood + 5;
    }

    public void sleep () {
        health = health + 5;
        energy = energy + 1;
        mood = mood + 2;
        strength = strength + 3;
    }

    public void growUp() {
        health = health + 10;
        height = height + 50;
        weight = weight + 50;
        strength = strength + 20;
        energy = energy - 5;
    }

    public void eatChocolate() {
        health = health - 1000;
    }
    
    public void fart() {
        mood = mood + 5;
        weight = weight - 1;
    }

}

