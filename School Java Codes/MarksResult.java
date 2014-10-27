//To ask for the Marks & Details of one person and create a table of it telling Where he failed or passed.
import java.io.*;
public class MarksResult
{
public static void main(String args[])throws IOException
{
  BufferedReader read=new BufferedReader(new InputStreamReader(System.in));
  String name,clas,ndlang,thsub;
  int math,bio,phy,chem,sub,hist,geog,evs,lang,engone,engtwo;
  int failCount=0;
  System.out.println("Enter name of the Student to Prepare Table of:");
    name=read.readLine();
  System.out.println("Enter "+name+"'s class:");
    clas=read.readLine();
  System.out.println("Enter "+name+"'s 2nd Lang:");
    ndlang=read.readLine();
  System.out.println("Enter "+name+"'s 7th Subject:");
    thsub=read.readLine();
  System.out.println("Enter "+name+"'s English I Marks:");
    engone=Integer.parseInt(read.readLine());
  System.out.println("Enter "+name+"'s English II Marks:");
    engtwo=Integer.parseInt(read.readLine());
  System.out.println("Enter "+name+"'s Maths Marks:");
    math=Integer.parseInt(read.readLine());
  System.out.println("Enter "+name+"'s Biology Marks:");
    bio=Integer.parseInt(read.readLine());
  System.out.println("Enter "+name+"'s Physics Marks:");
    phy=Integer.parseInt(read.readLine());
  System.out.println("Enter "+name+"'s Chemistry Marks:");
    chem=Integer.parseInt(read.readLine());
  System.out.println("Enter "+name+"'s "+thsub+" Marks:");
    sub=Integer.parseInt(read.readLine());
  System.out.println("Enter "+name+"'s History Marks:");
    hist=Integer.parseInt(read.readLine());
  System.out.println("Enter "+name+"'s Geography Marks:");
    geog=Integer.parseInt(read.readLine());
  System.out.println("Enter "+name+"'s EVS Marks:");
    evs=Integer.parseInt(read.readLine());
  System.out.println("Enter "+name+"'s "+ndlang+" Marks:");
    lang=Integer.parseInt(read.readLine());
  System.out.println();
  System.out.println("----------Report Generated for "+name+"----------");
  System.out.println("Name:"+name);
  System.out.println("Class:"+clas);
  System.out.print("Maths Marks:"+math);
  if(math>=40)
  {
     System.out.println("(Passed)");
  }
  else
  {
      System.out.println("(Failed)");
      failCount++;
  }
  System.out.print("Science Marks:"+(bio+phy+chem)/3);
  if((bio+phy+chem)/3>=40)
  {
     System.out.println("(Passed)");
  }
  else
  {
      System.out.println("(Failed)");
      failCount++;
  }
  System.out.print(ndlang+" Marks:"+lang);
  if(lang>=40)
  {
     System.out.println("(Passed)");
  }
  else
  {
      System.out.println("(Failed)");
      failCount++;
  }
  System.out.print(thsub+" Marks:"+sub);
  if(sub>=40)
  {
     System.out.println("(Passed)");
  }
  else
  {
      System.out.println("(Failed)");
      failCount++;
  }
  System.out.print("EVS:"+evs);
  if(evs>=40)
  {
     System.out.println("(Passed)");
  }
  else
  {
      System.out.println("(Failed)");
      failCount++;
  }
  System.out.print("English:"+(engone+engtwo)/2);
  if((engone+engtwo)/2>=40)
  {
     System.out.println("(Passed)");
  }
  else
  {
      System.out.println("(Failed)");
      failCount++;
      failCount++;
  }
  System.out.print("S. Studies Marks:"+(hist+geog)/2);
  if((hist+geog)/2>=40)
  {
     System.out.println("(Passed)");
  }
  else
  {
      System.out.println("(Failed)");
      failCount++;
  }
  System.out.println("\nTotal Marks="+(math+((bio+phy+chem)/3)+lang+sub+evs+((hist+geog)/2)+((engone+engtwo)/2))+"/700");
  System.out.println("Total %"+((math+((bio+phy+chem)/3)+lang+sub+evs+((hist+geog)/2)+((engone+engtwo)/2)))/7);
  if(failCount>=2)
  {
      System.out.println("You Failed.");
  }
  else
  {
      System.out.println("You Passed.");
  }
  System.out.println("-------------------------------------------------");
}
}
  