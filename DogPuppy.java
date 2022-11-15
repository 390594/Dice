public class DogPuppy {

    /** 
    Instance variables are defined first
    Instance variables should be defined as 'private', meaning their values
    can be accessed only from methods defined inside the class.  If the
    values need to be retrieved or set from outside the class we should
    define "getter" and "setter" methods.  More on that later
     */
    private int health;               // An integer that represents
    private int height;               // An integer that represents
    private int weight;               // An integer that represents
    private int energy;               // An integer that represents
    private int mood;                 // An integer that represents
    private int strength;             // An integer that represents

    /* Methods are defined next */
    public void Walk() {
        health = health + 5;
        energy = energy - 2;
        strength = strength - 2;
    }

    public void Socialize() {
        energy = energy - 1;
        mood = mood + 2;
    }

    public void Eat() {
        health = health + 5;
        weight = weight + 1;
        energy = energy + 2;
        mood = mood + 5;
    }

    public void Sleep () {
        health = health + 5;
        energy = energy + 1;
        mood = mood + 2;
        strength = strength + 3;
    }

    public void Growup() {
        health = health + 10;
        height = height + 50;
        weight = weight + 50;
        strength = strength + 20;
        energy = energy - 5;
    }

    public void EatChocolate() {
        health = health - 1000;
    }

}

