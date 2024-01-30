
import java.util.Scanner;
class employeeDetails{
    String name,id,department,designation;
    int age;
    double salary;

    public void getData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the employee");
        name = sc.nextLine();
        System.out.println("Enter the id of the employee");
        id = sc.nextLine();
        System.out.println("Enter the department of the employee");
        department = sc.nextLine();
        System.out.println("Enter the designation of the employee");
        designation = sc.nextLine();
        System.out.println("Enter the age of the employee");
        age = sc.nextInt();
        System.out.println("Enter the salary of the employee");
        salary = sc.nextDouble();
    }

    public void readData(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("Department: "+department);
        System.out.println("Age: "+age);
        System.out.println("Salary: "+salary);
        System.out.println("Designation: "+ designation);
    }
}
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of employee");
        int num = sc.nextInt();
        employeeDetails[] employee = new employeeDetails[num];

        //Reading the details of the employees
        for(int i =0;i<num;i++){
            System.out.println("\nEnter details of employee "+ (i+1));
            employee[i] = new employeeDetails();
            employee[i].getData();
        }

        //Displaying the details of the employees
        for(int i=0;i<num;i++){
            System.out.println("\nDetail of employee "+ (i+1));
            employee[i].readData();
        }

        //calculating the sum of salary of employees in sales department
        double total =0;
        for(int i=0;i<num;i++){
            if(employee[i].department.compareTo("sales") == 0){
                total += employee[i].salary;
            }
        }
        //Displaying the result
        System.out.println("The sum of salary of employees in sales department is "+total);

        //Highest paid manager in purchase department
        double max =-1;
        int index =0;
        for(int i=0;i<num;i++){
            if((employee[i].department.compareTo("purchase") == 0) && (employee[i].designation.compareTo("manager") == 0)){
                if(employee[i].salary> max){
                    max = employee[i].salary;
                    index=i;
                }
            }
        }
        if(max == -1){
            System.out.println("No manager in purchase department");
        }
        else{
            System.out.println("\nDetails of the highest paid manager of purchase department:");
            employee[index].readData();
        }
    }
    
}
