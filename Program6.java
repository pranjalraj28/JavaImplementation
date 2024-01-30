
import java.util.Scanner;

class Bank {
    double bal, intrate;

    public void getdata() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter balance: ");
        bal = scanner.nextDouble();
    }

    public void printdata() {
        System.out.println("Account Balance: " + bal);
    }

    public void interest() {
        // This method can remain the same for all banks
    }
}

class SBIbank extends Bank {
    @Override
    public void interest() {
        intrate = 0.08;
        System.out.println("The Interest rate for SBI bank is: " + intrate);
        System.out.println("The Interest earned is: " + (intrate * bal));
        System.out.println();
    }
}

class Citybank extends Bank {
    @Override
    public void interest() {
        intrate = 0.07;
        System.out.println("The Interest rate for City bank is: " + intrate);
        System.out.println("The Interest earned is: " + (intrate * bal));
        System.out.println();
    }
}

class Canarabank extends Bank {
    @Override
    public void interest() {
        intrate = 0.09;
        System.out.println("The Interest rate for Canara bank is: " + intrate);
        System.out.println("The Interest earned is: " + (intrate * bal));
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create arrays to store objects for each bank
        SBIbank[] sbiAccounts = new SBIbank[5];
        Citybank[] cityAccounts = new Citybank[5];
        Canarabank[] canaraAccounts = new Canarabank[5];

        // Input data for SBI bank accounts
        for (int i = 0; i < 5; i++) {
            sbiAccounts[i] = new SBIbank();
            System.out.println("Welcome to SBI bank (Member " + (i + 1) + ")");
            sbiAccounts[i].getdata();
            sbiAccounts[i].printdata();
            sbiAccounts[i].interest();
        }

        // Input data for City bank accounts
        for (int i = 0; i < 5; i++) {
            cityAccounts[i] = new Citybank();
            System.out.println("Welcome to City bank (Member " + (i + 1) + ")");
            cityAccounts[i].getdata();
            cityAccounts[i].printdata();
            cityAccounts[i].interest();
        }

        // Input data for Canara bank accounts
        for (int i = 0; i < 5; i++) {
            canaraAccounts[i] = new Canarabank();
            System.out.println("Welcome to Canara bank (Member " + (i + 1) + ")");
            canaraAccounts[i].getdata();
            canaraAccounts[i].printdata();
            canaraAccounts[i].interest();
        }
    }
}
