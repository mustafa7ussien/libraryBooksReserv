package library;

    import java.util.ArrayList;
public class LibraryManager extends person {
    double salary;
    ArrayList<Book>Booklist;
    ArrayList<Book>borrow_books;

    public LibraryManager() {
        salary=4000;
    }

    public LibraryManager(double salary, String name, int id, int age) {
        super(name, id, age);
        this.salary = salary;
        Booklist=new ArrayList<Book>();      
        borrow_books=new ArrayList<Book>();
        }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
    
    //override method
 
    public void addbook(Book b){
        Booklist.add(b);
    }
   
    //int becous begin of zero 
    public void deletbook(int b){
        Booklist.remove(b);
    }
    
    public void showbook(){
        for(int i=0;i<Booklist.size();i++)
        {System.out.println("Book "+(i+1)+": "+Booklist.get(i).getName()+", Auther is : "+Booklist.get(i).getAuther());}     
    }
    public boolean searchbook(String b){
        for(int i=0;i<Booklist.size();i++){
        if(Booklist.get(i).getName().equalsIgnoreCase(b))
        return true;
        }
        return false;
    }
    //to borrow book
    public void borrowbook(String g){
      //search book
        for(int i=0;i<Booklist.size();i++){
        if(Booklist.get(i).getName().equalsIgnoreCase(g)){
            
            //delet book thats search
            
         //  borrow_books=new ArrayList<Book>();
         // array get integer and object
        borrow_books.add(i, Booklist.get(i));
            
            
        Booklist.remove(i);
        }
        }
 // System.out.println(borrow_books);
    }
    public void showborrowbook(){
  
        for(int i=0;i<borrow_books.size();i++)
        {System.out.println("Book "+(i+1)+borrow_books.get(i).getName()+", Auther is : "+borrow_books.get(i).getAuther());}
    }
  
 
    public void returnbook(Book n){
        Booklist.add(n);
    }
    }  
   
