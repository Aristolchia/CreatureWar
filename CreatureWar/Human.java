/**
 * Human is a basic creature
 * 
 * @author Crosbie 
 * @version April 20, 2015
 */
public class Human extends Creature 
{
  Human() {
      super();
  }
  
  Human(int str, int hp){
      super(rand.nextInt(13)+5, rand.nextInt(25)+5);
  }
  
}
