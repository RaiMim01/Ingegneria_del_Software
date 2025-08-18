
import java.io.*;


public class ScritturaPoint2D
{
    public static void main(String[] args)
    throws IOException
    {
        FileOutputStream f = new FileOutputStream("esempio.bin");
        ObjectOutputStream os = new ObjectOutputStream(f);
        Punto2D p = new Punto2D(3.2,1.5);
        os.writeObject(p);
        os.flush();
        os.close();
    }
}
