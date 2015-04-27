import java.util.ArrayList;
import java.util.Random;
/**
 * Write a description of class CreatureWar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CreatureWar
{
    private ArrayList<Creature> sideOne;
    private ArrayList<Creature> sideTwo;
    public Random r = new Random();
    int i = r.nextInt(10)+5;
    /**
     * Constructor for objects of class CreatureWar
     */
    public CreatureWar()
    {
            sideOne = new ArrayList<Creature>();
            sideTwo = new ArrayList<Creature>();
            
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
   */
    public Creature addCreature()
    {
            Random r = new Random();
            int c1 = r.nextInt(4);
            if(c1 == 0)
            {
               return new Human(); 
            }
            if(c1 == 1)
            {
                return new Elf(); 
            }
            if(c1 == 2)
            {
                return new Balrog(); 
            }
            return new CyberDemon(); 
    }
 
   public void battle()
   {
       int j = 0;
       while(j<i)
       {
           while(sideOne.get(j).isAlive() == true && sideTwo.get(j).isAlive() == true)
           {   
               sideOne.get(j).takeDamage(sideTwo.get(j).attack());
               sideTwo.get(j).takeDamage(sideOne.get(j).attack());
           }
        }
   }
   public void createArmy()
   {
        for(int k = 0; k < i; k++)
        {
            sideOne.add(addCreature());
            sideTwo.add(addCreature());
        }
   }
}
