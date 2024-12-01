package proizvodjacpotrosac;

public class Izvestavac extends Thread
{

    private static int counter = 0;
    private int id;

    private Skladiste[] skladiste;

    public Izvestavac(Skladiste[] skladiste)
    {
        this.skladiste = skladiste;
        this.id = ++counter;
    }

    @Override
    public void run()
    {
        System.out.println(" ");
        System.out.println("Izvestavac " + id + " " + skladiste[0].getStanje() + " " + skladiste[1].getStanje() + " " + skladiste[2].getStanje());
        System.out.println(" ");
    }

    @Override
    public String toString()
    {
        return String.format("Izvestavac " + id);
    }
}