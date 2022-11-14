public class DogPuppy {
	
  /** 
    Instance variables are defined first
    Instance variables should be defined as 'private', meaning their values
      can be accessed only from methods defined inside the class.  If the
      values need to be retrieved or set from outside the class we should
      define "getter" and "setter" methods.  More on that later
  */
  private String health; 		// 
  private int height; 		        // 
  private int weight; 		        // weight in pounds
  private String energy; 	        // "brown", "black", etc
  private String mood; 		        // "Good", "Mid", "Bad"
  private String strength; 		// "Energetic", "Mid", "Tired"

  /* Methods are defined next */
  public void sleep() {
    health = health + 10;
    energy = energy + 10;
  }

  public void eat() {
    weight = weight + 1;
  }

  public void run () {
    energy = energy - 1;
  }

  public void growOld() {
    weight = weight + 10;
    health = health - 2;
    energy = energy - 1;
    hairColor = "gray";
  }

  public void vape() {
    health = health - 10;
  }

}

