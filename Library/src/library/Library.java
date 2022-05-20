
package library;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Library {

 

   
         public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
         LibraryManager b=new LibraryManager(4000,"admin",1234,25);
         int x=0;
     
try{    
                     // the dat of issue and return boorow book insial 
         int d1=0,d2=0,m1=0,m2=0,y1=0,y2=0;
while (x!=3){
         System.out.println("1:LibraryManger");
         System.out.println("2: student");
         System.out.println("3: break");
         int a=input.nextInt();
   if(a==1){
         System.out.println("Enter password please");
         int password=input.nextInt();
         if(password==1111){
         
         {
             
         System.out.println("1: to add book");
         System.out.println("2: to delete book");
         System.out.println("3: to search book");
         System.out.println("4: to show all book");
         System.out.println("5: to show all borrow book");
         int d=input.nextInt();
         switch(d){
                   //add book
     case 1:
         {  
         String   bo_name;//=null;
         String   auther;//=null;
            
         System.out.println("what number of books you need add");
         int h=input.nextInt();
         for(int i=0;i<h;i++){
         System.out.print("Enter  name of book :");
         bo_name=input.next();
         System.out.print("Enter auther of book :");
         auther=input.next();
         Book l=new Book(bo_name,auther);
         b.addbook(l);
         System.out.println("The book add successfuly");

         }
        
         break;
         }
     case 2:
         {
         System.out.println("Enter index of book you need delet");
         int xx=input.nextInt();
         b.deletbook(xx);
         break;
         }
     case 3:
         {
         System.out.println("Enter name of book you nedd search of");
         String sss=input.next();
         // the search tru or false
         boolean bb=b.searchbook(sss);
         if(bb==true)
         System.out.println("the book is found");
         else
         System.out.println("the book is not found");
         break;
         }
     case 4:
            //to show book
         {
         b.showbook();
         break;
         }
     case 5:
        {
        b.showborrowbook();
        
        student s1=new student("fci",2,"mostaf",1234,20);
        System.out.println(s1.getName()+" ,"+s1.getFacultyname()+","+s1.getStage()+","+s1.getId()+" ,"+s1.getStage());
        
        }
         default :
         {
         System.out.println("the wrong shose");
         break;
         }
         }
         }
         }
         else
             System.out.println("incorrect password!!!");}
else if(a==2){
             // to search and borrow and return
         System.out.println("1: to search book");
         System.out.println("2: to borrow book");
         System.out.println("3: to return book");
         int z=input.nextInt();
       switch(z)
         {
     case 1:
         {
         System.out.println("Enter name of book you nedd search of");
         String sss=input.next();
         // the search tru or false
         boolean bb=b.searchbook(sss);
         if(bb==true)
         System.out.println("the book is found");
         else
         System.out.println("the book is not found");
         break;
         }        
     case 2:
         {
         System.out.println("Enter the issue date/n");
         System.out.println("enter number of day..");
         d1=input.nextInt();
         System.out.println("enter number of month..");
         m1=input.nextInt();
         System.out.println("enter number of year..");
         y1=input.nextInt();
         System.out.println("Enter book you need borrow"); 
         String r=input.next();
         b.borrowbook(r);
         
         student s1=new student("fci",2,"mostafa",1234,20);
         System.out.println("please Enter your faculty");
         String faculty=input.next();
         s1.setFacultyname(faculty);
         System.out.println("please Enter your stage");
         int stage=input.nextInt();
         s1.setStage(stage);
         System.out.println("please Enter your name");
         String name=input.next();
         s1.setName(name);
         System.out.println("please Enter your id");
         int id=input.nextInt();
         s1.setId(id);
         System.out.println("please Enter your age");
         int age=input.nextInt();
         s1.setAge(age);
         
         System.out.println(s1.getName()+" ,"+s1.getFacultyname()+","+s1.getStage()+","+s1.getId()+" ,"+s1.getStage());
         break;
         }
      case 3:
         {
         System.out.println("Enter the return date /n");
         System.out.println("enter number of day..");
         d2=input.nextInt();
         System.out.println("enter number of month..");
         m2=input.nextInt();
         System.out.println("enter number of year..");
         y2=input.nextInt();
         if((((y2-y1)*365)+((m2-m1)*30)+(d2-d1))>=20){
         System.out.println("you shoud pay fine");
         System.out.println("Enter the name of book you return");
         String k1=input.next();
         System.out.println("Enter auther");
         String k2=input.next();
         Book n=new Book(k1,k2);
         b.returnbook(n);
         }
         else
         {
         System.out.println("Enter the name of book you return");
         String k1=input.next();
         System.out.println("Enter auther");
         String k2=input.next();
         Book n=new Book(k1,k2);
         b.returnbook(n);
         }   
         break;
         }   
     default :
         {
         System.out.println("the wrong shose");
         break;
         }
         }
         }
else if(a==3){
    
         break;}
         }
    }
    catch(InputMismatchException e)
    { System.out.println("error: enter correct number");}

    catch(Exception e)
    { System.out.println(e.getMessage());}

    

    

      
         }
         //To change body of generated methods, choose Tools | Templates.
         }
