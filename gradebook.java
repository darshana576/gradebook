import java.util.Scanner;

public class gradebook {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int count =0;
        student[] students=new student[5];
        students[count++]=new student("Raj",89);
        students[count++]=new student("rohan",45);
        students[count++]=new student("Rahul",97);
        students[count++]=new student("priya",77);
System.out.println("add new student?(y/n)");
if(sc.next().equalsIgnoreCase("y"))
{

System.out.println("enter name");
String name=sc.next();
System.out.println("enter marks");
int marks=sc.nextInt();
students[count++]=new student(name,marks);
    }
System.out.println("Gradebook");
int sum =0;
for(int i=0;i<count;i++)
{
student s= students[i];
System.out.println("Student name="+s.name+"score="+s.score);
sum=sum+s.score;

}
double avg=sum/count;
System.out.println("average mrks "+avg);

    
    sc.close();
}
}
