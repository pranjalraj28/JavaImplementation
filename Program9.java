

import java.util.Scanner;

interface Compute {
    double convert(double value);
}

class KBGBConverter implements Compute {
    public double convert(double kb) 
    {
        // 1 GB = 1000*1000 KB
        return (kb / (1000*1000));
    }
}

class EuroRsConverter implements Compute {
    public double convert(double euro) 
    {
        //1 Euro = 90 Rs
        return euro * 90.0;
    }
}

public class Main {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        Compute GBConverter = new KBGBConverter();
        System.out.print("Enter number of Kilo Bytes (KBs): ");
        double kb = scanner.nextDouble();

        double gb = GBConverter.convert(kb);
        System.out.println(kb + " KB is equal to " + gb + " GB");

        Compute EuroConverter = new EuroRsConverter();
        System.out.print("Enter amount in Euros: ");
        double eur = scanner.nextDouble();

        double rs = EuroConverter.convert(eur);
        System.out.println(eur + " Euros is equal to " + rs + " Rupees");
        scanner.close();
    }
}

