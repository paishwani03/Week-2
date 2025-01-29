//sublcass of Book
public class Author extends Book{
    String name = "James Gosling";
    String bio="James Arthur Gosling, OC is a Canadian computer scientist, best known as the founder and lead designer behind the Java programming language.";

    void displayInfo(){
        super.displayInfo(); 
        System.out.println("Author: "+name);
        System.out.println("Bio: "+bio);
    }
}
