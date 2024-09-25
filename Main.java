public class Main 
{
    public static void main(String[] args)
    {
        //Feeder f = new Feeder();
        //System.out.println(f);
        //System.out.println(f.currentFood);

        //Feeder g = new Feeder(500);
        //System.out.println(g.getCurrentFood());
        //g.simulateOneDay(12);

        //System.out.println(Math.random());
        //double random = Math.random() * 10;
        //System.out.println(random);
        //int random1 = (int) Math.random() * 10;
        //System.out.println(random1);
        //int random2 = (int)(Math.random() * 10);
        //System.out.println(random2);
        //int random3 = (int)(Math.random() * 10 + 1);
        //System.out.println(random3);
        //int random4 = (int)(Math.random() * 40 + 10);
        //System.out.println(random4);
        //System.out.println(Math.random() < 0.05);

        //g.simulateOneDay(12);
        //System.out.println(g.getCurrentFood());
        
        //Feeder h = new Feeder(1000);
        //h.simulateOneDay(22);
        //System.out.println(h.getCurrentFood());

        //Feeder i = new Feeder(100);
        //i.simulateOneDay(5);
        //System.out.println(i);

        //Feeder j = new Feeder(250);
        //System.out.println(j.simulateManyDays(10, 5));

        //Feeder j = new Feeder(0);
        //System.out.println(j.simulateManyDays(5, 10));
        
        //Feeder k = new Feeder(0);
        //System.out.println(k.simulateManyDays(5, 10));

        Feeder aTest = new Feeder(500);
        System.out.println(aTest.simulateOneDay(12));

        Feeder bTest = new Feeder(1000);
        System.out.println(bTest.simulateOneDay(22));

        Feeder cTest = new Feeder(100);
        System.out.println(cTest.simulateOneDay(5));

        Feeder dTest = new Feeder(2400);
        System.out.println(dTest.simulateManyDays(10, 4));
        
        Feeder eTest = new Feeder(250);
        System.out.println(eTest.simulateManyDays(10, 5));
        
        Feeder fTest = new Feeder(2400);
        System.out.println(fTest.simulateManyDays(10, 5));


    }
}