public class Main 
{
    public static void main(String[] args)
    {
        Feeder f = new Feeder();
        System.out.println(f);

        //System.out.println(f.currentFood);
        Feeder g = new Feeder(500);
        System.out.println(g.getCurrentFood());
        g.simulateOneDay(12);
        System.out.println(Math.random());
        double random = Math.random() * 10;
        System.out.println(random);
        int random1 = (int) Math.random() * 10;
        System.out.println(random1);
        int random2 = (int)(Math.random() * 10);
        System.out.println(random2);
        int random3 = (int)(Math.random() * 10 + 1);
        System.out.println(random3);
        int random4 = (int)(Math.random() * 40 + 10);
        System.out.println(random4);
        System.out.println(Math.random() < 0.05);

    }
}