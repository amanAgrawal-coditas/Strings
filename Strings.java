package Week_3;
import java.lang.reflect.*;
import java.util.*;
/*
class EmployeeConstructor {
    int empId;
    String empName;
    String address;
    float salary;

    EmployeeConstructor() {

    }

    public EmployeeConstructor(int empId, String empName, String address, float salary) {
        this.empId = empId;
        this.empName = empName;
        this.address = address;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmployeeConstructor{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                '}';
    }
}

 *///Q9
class StringFunctionality
{

    /*
void arr()
Scanner sc=new Scanner(System.in);
{
    System.out.println("enter the string ");
    String name=sc.nextLine();
    char ch[]=name.toCharArray();
    for(char index:ch)
    {
        System.out.println(index);
    }

}

     *///Q6
    /*

   void replace()
   {
   Scanner sc=new Scanner(System.in);
       System.out.println("enter the string");
       String string=sc.nextLine();
      String string1=string.toUpperCase();
      char[] ch =string1.toCharArray();
      for(int i=0;i<ch.length;i++)
      {
          if(ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U')
          {
             ch[i]= (char) (ch[i]+1);
          }
      }
      String str=new String(ch);
      str=str.toLowerCase();
      System.out.print(str);

   }

  *///Q5
    /*
void display()
{
    String name="            I am a good person and I enjoy life                 ";
    String str=" ";
    System.out.println(name.trim());
   name=name.replaceAll("\\s","");
    System.out.println(name);
    String string="ramesh";
    System.out.println("the Unicode value is "+ string.codePointAt(5));
}

     *///Q4
    /*
    void str()
    {
    Scanner sc=new Scanner(System.in);
        String name;
        System.out.println("enter the string");
        name=sc.nextLine();
        HashSet <Character> ch = new HashSet<>();
        for(int i = 0 ; i < name.length();i++ )
        {
            ch.add(name.charAt(i));
        }
        for(char c:ch)
        {
            System.out.print(c);
        }
    }
    *///Q3
    /*
int count=0;
    void vowel(String name)
    {
    Scanner sc=new Scanner(System.in);
        System.out.println("enter the name of the string");
        name=sc.nextLine();
        for(int i=0;i<name.length();i++)
        {
            char ch = name.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == ' ')
            {
                count++;
            }
        }
        System.out.println(count);
    }

     *///Q2
    /*
        void Meth(int p)
        {
        Scanner sc=new Scanner(System.in);
            System.out.println("enter the number of elements");
            String[] array = new String[p];
            System.out.println("Enter the Elements of the array");
            for(int i=0;i<array.length;i++)
            {
                array[i]=sc.nextLine();
            }
            System.out.println("the normal array is");
            for(String index:array)
            {
                System.out.println(index);
            }
            for(int index=0;index<array.length-1;index++)
            {
                for (int j = index+1; j < array.length ; j++)
                {
//                    String name = array[j];
//                    String name2 = array[j+1];
                    if (array[index].length() > array[j].length())
                    {
                        String temp = array[j];
//                        name = name2;
//                        name2 = temp;
                        array[j]=array[index];
                        array[index]=temp;
                    }
                }
            }
            System.out.println(Arrays.toString(array));
            System.out.println("the sorted array is ");
            for(String index:array)
            {
                System.out.println(index);
            }

}
 *///Q1
}


public class Strings
{
    public static void main(String[] args) {

        StringFunctionality stringFunctionality = new StringFunctionality();
//        stringFunctionality.Meth(5);//Q1
//        stringFunctionality.vowel("Aman");//Q2
//        stringFunctionality.str();//Q3
//        stringFunctionality.display();//Q4
//        stringFunctionality.replace();//Q5
//        stringFunctionality.arr();//Q6
          /*
        String val="Hi,all.How are you?";
        StringTokenizer stringTokenizer=new StringTokenizer(val,",.?",true);
        while(stringTokenizer.hasMoreTokens())
            System.out.println(stringTokenizer.nextToken());

         *///Q7
          /*
        String expression= "3+(20%2)*(20/2)";

        char[] arr =expression.toCharArray();
        System.out.println("The tokens are");
        for(char ch:arr)
        {
            System.out.print(ch+",");
        }

        System.out.println();
        System.out.println("The operators are as follows");
        for(char ch:arr)
        {
            if(ch=='+'|| ch=='('||ch=='%'||ch==')'||ch=='*'||ch=='/')
                System.out.print(ch+",");
        }
        System.out.println();
        System.out.println("The operands are");
        for(char ch:arr)
        {
            if(ch!='+'&& ch!='('&&ch!='%'&&ch!=')'&&ch!='*'&&ch!='/')
                System.out.print(ch+",");
        }

    }
}

         *///Q8
          /*
        EmployeeConstructor employee1=new EmployeeConstructor();
        EmployeeConstructor employee2=new EmployeeConstructor(243,"Aman Agrawal","Varansi",453434.87f);
        System.out.println(employee1);
        System.out.println(employee2);
         *///Q9
    }
}
