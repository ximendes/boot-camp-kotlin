package Practice

   const val MAX_NUMBER_BOOKS = 10

open class Book (val title: String,  val author: String, val year: Int, var pages: Int){

   private var currentPage =  1

   open fun readPage() = currentPage ++

   fun titleAndAuthor(): Pair<String, String>{
      return (title to author)
   }

   fun titleAndAuthorAndYear(): Triple<String, String, Int>{
    return Triple(title, author, year)
   }

   fun canBorrow(numberBooks: Int) = numberBooks < MAX_NUMBER_BOOKS

   fun printUrl() = println(Constant.BASE_URL + title + ".html")

   companion object{
      val BASE_URL = "/book/all/"
   }

}

class eBook(title: String, author: String, var format: String = "text", year: Int, pages: Int): Book(title, author, year, pages){

   private var wordsRead = 0

   override fun readPage() = wordsRead + 250
}


object Constant{
   const val BASE_URL = "/book/all/"
}

fun Book.weight(): Double{return pages * 1.5}

fun Book.tornPages(torn: Int) = if (pages >= torn) pages -= torn else pages = 0