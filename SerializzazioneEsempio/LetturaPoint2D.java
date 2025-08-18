
import java.io.*;
import java.util.List;
import java.util.ArrayList;
import java.lang.Throwable;

public class LetturaPoint2D
{
    public static void main(String[] args)
    throws IOException, ClassNotFoundException
    {
        FileInputStream f = new FileInputStream("esempio.bin");
        ObjectInputStream is = new ObjectInputStream(f);
        Punto2D p;
        p = (Punto2D) is.readObject(); // Legge e deserializza l'oggetto Punto2D
        is.close();
        System.out.println("x,y = " + p.ascissa() + ", " + p.ordinata());
    }
}
