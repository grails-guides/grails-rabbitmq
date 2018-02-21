package demo

class Book {
    String image
    String title
    String author
    String about
    String href
    static mapping = {
        about type: 'text'
    }
}