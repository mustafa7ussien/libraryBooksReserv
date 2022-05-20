
package library;

public class Book {
    protected  String name;
    protected String auther;
 

  public Book() {
  }

  public Book(String name, String auther) {
        this.name = name;
        this.auther = auther;     
  }

  public void setName(String name) {
        this.name = name;
  }

  public void setAuther(String auther) {
        this.auther = auther;
  }

   

  public String getName() {
        return name;
  }

  public String getAuther() {
        return auther;
  }

} 

   