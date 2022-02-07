import java.util.*;
public class Driver
{
    public static void main(String[]arg)
    {
        Scanner sc=new Scanner(System.in);
        
        CredentialService cds=new CredentialService();
        
        System.out.println("Enter your First Name");
        String fname=sc.nextLine().trim();
        System.out.println("Enter your Last Name");
        String lname=sc.nextLine().trim();
        Employee emp=new Employee(fname,lname);

        System.out.println("Please Enter the Dempartment from the following");
        System.out.println("1. Technical");
        System.out.println("2. Admin");
        System.out.println("3. Human Resource");
        System.out.println("4. Legal");

        int i=sc.nextInt();

        System.out.println("Dear "+emp.firstName+" your generated credentials are as follows");
        if(i==1)
        {
            emp.email=cds.generatemail(emp.firstName,emp.lastName,"tech");
            emp.pwd=cds.generatePwd();
            cds.printdetail();

        }

        if(i==2)
        {

            emp.email=cds.generatemail(emp.firstName,emp.lastName,"admin");
            emp.pwd=cds.generatePwd();
            cds.printdetail();
            
        }

        if(i==3)
        {

            emp.email=cds.generatemail(emp.firstName,emp.lastName,"hr");
            emp.pwd=cds.generatePwd();
            cds.printdetail();
            
        }

        if(i==4)
        {

            emp.email=cds.generatemail(emp.firstName,emp.lastName,"legal");
            emp.pwd=cds.generatePwd();
            cds.printdetail();
            
        }


    }
}

