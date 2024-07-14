

package array_of_objects;


public class Array_of_objects {
public static  class Book{
    String title;
    String author ;
    int year;
    String genre;
     
    public Book(String t, String a, int y, String g ){
        title=t;
        author=a;
        year=y;
        genre=g;
        
    }
    
    public void print (){
        
        System.out.println("Title : "+title);
        System.out.println("Author :"+author);
        System.out.println("Year :"+year);
        System.out.println("genre :"+genre);
        System.out.println();
    }
    
}

    public static void main(String[] args) {
       Book books[]=new Book [3];
       books[0] = new Book("To Kill a Mockingbird", "Harper Lee", 1960, "Fiction");
        books[1] = new Book("1984", "George Orwell", 1949, "Dystopian");
        books[2] = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, "Tragedy");
         
        System.out.println("initial book details :");
         for (int i=0;i<books.length;i++){
            books[i].print();
         }
         books[1]=null;
         
         System.out.println("book details after remove one objects :");
        
         for (int i=0;i<books.length;i++){
             if (books[i]!=null){
               books[i].print();
             }
         }
         
    }
}
