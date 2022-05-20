package library;


public abstract class person {
    String name;
    int id;
    int age;
    public boolean Searchbook;
    

    public person() 
    { 
        name="unkown";
        id=0;
        age=0;
    }

    public person(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    
    
}
