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
    public void addCreature()
    {
            int c1 = r.nextInt(4);
            int c2 = r.nextInt(4);
            if(c1 == 0)
            {
               sideOne.add(new Human()); 
            }
            if(c1 == 1)
            {
                sideOne.add(new Elf()); 
            }
            if(c1 == 2)
            {
                sideOne.add(new Balrog()); 
            }
            if(c1 == 3)
            {
                sideOne.add(new CyberDemon()); 
            }
            
            if(c2 == 0)
            {
               sideTwo.add(new Human()); 
            }
            if(c2 == 1)
            {
                sideTwo.add(new Elf()); 
            }
            if(c2 == 2)
            {
                sideTwo.add(new Balrog()); 
            }
            if(c2 == 3)
            {
                sideTwo.add(new CyberDemon()); 
            }
    }
   /**
   public void addCreature(Creature creature)
   {
        sideOne.add(creature);
        sideTwo.add(creature);
   }*/
    public void battle(Creature c1, Creature c2)
    {
        c1.takeDamage(c2.attack());
        c2.takeDamage(c1.attack());
    }
    public static void main(String args[])
    {
        Random r = new Random();
        int i = r.nextInt(10)+5;
        for(int k = 0; k < i; k++)
        {
            sideTwo.addCreature();
        }
    }
}
