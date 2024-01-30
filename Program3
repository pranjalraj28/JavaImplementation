import java.util.Scanner;

class complex {
    int real, imaginary;

    public complex() {
        this.real = 0;
        this.imaginary = 0;
    }

    public complex(int r, int i) {
        this.real = r;
        this.imaginary = i;
    }

    public void display() {
        System.out.println("Real part: " + this.real);
        System.out.println("Imaginary part: " + this.imaginary);
    }

    public complex addComplex(complex c2) {
        complex c3 = new complex();
        c3.real = this.real + c2.real;
        c3.imaginary = this.imaginary + c2.imaginary;
        return c3;
    }

    public complex subComplex(complex c2) {
        complex c3 = new complex();
        c3.real = this.real - c2.real;
        c3.imaginary = this.imaginary - c2.imaginary;
        return c3;
    }

    public int compareComplex(complex c2) {
        if (this.real == c2.real && this.imaginary == c2.imaginary) {
            return 0; // Complex numbers are equal
        } else {
            return -1; // Complex numbers are not equal
        }
    }

    public void increment() {
        this.real++;
        this.imaginary++;
    }

    public void decrement() {
        this.real--;
        this.imaginary--;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter real no of first complex number");
        int r1 = sc.nextInt();
        System.out.println("Enter imaginary no of first complex number");
        int i1 = sc.nextInt();
        System.out.println("Enter real no of second complex number");
        int r2 = sc.nextInt();
        System.out.println("Enter imaginary no of second complex number");
        int i2 = sc.nextInt();

        complex c1 = new complex(r1, i1);
        complex c2 = new complex(r2, i2);
        while (true) {
            System.out.println("\n1.add\n2.subtract\n3.compare\n4.increment\n5.decrement\n6.exit\n");
            int ch = sc.nextInt();
            switch (ch) {
                case 1: {
                    complex c3 = c1.addComplex(c2);
                    c3.display();
                    break;
                }
                case 2: {
                    complex c3 = c1.subComplex(c2);
                    c3.display();
                    break;
                }
                case 3: {
                    int result = c1.compareComplex(c2);
                    if (result == 0) {
                        System.out.println("Complex numbers are equal");
                    } else {
                        System.out.println("Complex numbers are not equal");
                    }
                    break;
                }
                case 4: {
                    c1.increment();
                    c1.display();
                    break;
                }
                case 5: {
                    c1.decrement();
                    c1.display();
                    break;
                }
                case 6: {
                    System.exit(0);
                }
                default:
                    System.out.println("Invalid choice\n");
            }
        }
    }
}
