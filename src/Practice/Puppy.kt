package Practice

import java.util.*

class Puppy {

    fun playWithBook(book: Book){
        book.tornPages(Random().nextInt(12))
    }

}