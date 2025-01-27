class Book{

    // Attributes
    
    String title;
    String author;
    double price;
    
    // Default constructor
    Book(){
     title="Programming in java";
     author="Jai Vardhan Singh";
     price=88.6;
     display();
     }
    
    // Parametrized constructor
    Book(String title, String author, double price){
      this.title=title;
      this.author=author;
      this.price=price;
      }
      
      // Instance Method
     void display() {
         System.out.println("Book title: " + title);
         System.out.println("Book author: " + author);
         System.out.println("Book price: " + price);
     }
     
     public static void main(String args[]){
     
         // creating object
         Book obj = new Book();
         Book obj1 = new Book("Sad people","Coolen hoover",33.4);
         obj.display();
         obj1.display();
         }
         }
 