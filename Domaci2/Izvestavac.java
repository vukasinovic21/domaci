package proizvodjacpotrosac;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

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
        /*System.out.println(" ");
        System.out.println("Izvestavac " + id + " " + skladiste[0].getStanje() + " " + skladiste[1].getStanje() + " " + skladiste[2].getStanje());
        System.out.println(" ");*/
        String output = "Izvestavac" + id + " Skladiste1 "
                + skladiste[0].getStanje() + " Skladiste2 "
                + skladiste[1].getStanje() + " Skladiste3 "
                + skladiste[2].getStanje();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("izvestaj.txt", true)))
        {
            writer.write(output);
            writer.newLine();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public String toString()
    {
        return String.format("Izvestavac " + id);
    }
}