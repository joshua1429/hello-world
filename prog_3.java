import java.io.*;
class pay extends Exception
{
          public String toString()
           {
            	            return("\t\t ....payout of bounds exception.....");
           }
}
class prog_3
{
           public static void main(String args[])
           {
           int no[], i=0;
           double p[];
           String n[];
           DataInputStream r =new DataInputStream(System.in);
           try
           {
           System.out.println("\n Enter no of employees : ");
           i=Integer.parseInt(r.readLine());
           p=new double[i];
           no=new int[i];
           n=new String[i];
           for(int j=0;j<i;j++)
{
           System.out.println("\n Enter employee name :");
           n[j]=r.readLine();
           System.out.println("\n Enter employee number :");
           no[j]=Integer.parseInt(r.readLine());
           System.out.println("\n Enter employee pay :");
           p[j]=Double.parseDouble(r.readLine());
           if( p[j]<1.0 || p[j]>9999.99 ) throw new pay();
           } 
           		System.out.println("\n\t Employee Details are . . .");
for(int j=0;j<i;j++)
           {
           System.out.println("\n Employee ID no : "+n[j]);
           	           System.out.println("\n Employee Name : "+no[j]);          
           System.out.println("\n Employee Salary : "+p[j]);
            }
           }
           		catch(pay dp)
{
           System.out.println(dp.toString());
 }
catch(Exception e){}
}
}

