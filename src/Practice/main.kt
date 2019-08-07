package Practice

import Practice.Spices.Curry


fun main1(args: Array<String>) {

    val book = Book(title = "O Segredo da Mente Milionária",author =  "T Harver Eker", year = 2019, pages = 100)
    val titleAndAuthorAndYear = book.titleAndAuthorAndYear()
    println("Here is your book ${titleAndAuthorAndYear.first} written by ${titleAndAuthorAndYear.second} in ${titleAndAuthorAndYear.third}.")


}

fun main(args: Array<String>){
    val book1 = Book(title = "O Segredo",author =  "T Harver Eker", year = 2019, pages = 100)
    val book2 = Book(title = "O Segredo da Mente Milionária",author =  "T Harver Eker", year = 2019, pages = 100)
    val allBooks = setOf(book1, book2)
    val library = mapOf("author" to allBooks)
    println(library.any { it.value.any()})


    val moreBook = mutableMapOf<String, String>("William" to "Schiller")
    moreBook.getOrPut("Jungle Book") {"Kipling"}
    moreBook.getOrPut("Hamlet") {"Shakespear"}
    println(moreBook)

    val book3 = Book(title = "O Segredo",author =  "T Harver Eker", year = 2019, pages = 100)
    println(book3.canBorrow(11))
    println(book3.printUrl())

    val book4 = Book(title = "O Segredo",author =  "T Harver Eker", year = 2019, pages = 100)
    val puppy = Puppy()
    while (book4.pages > 0) {
        puppy.playWithBook(book4)
        println("${book4.pages} left in ${book4.title}")
    }
    println("Sad puppy, no more pages in ${book4.title}. ")

}


val spices1 = listOf(
        Curry("curry",  "mild")
)

//val spice2 = listOf(
//        Spice(name = "pepper", spiciness = "medium",),
//        Spice(name = "cayenne", spiciness = "spicy"),
//        Spice(name = "ginger", spiciness = "mild"),
//        Spice(name = "red curry", spiciness = "medium"),
//        Spice(name = "green curry", spiciness = "mild"),
//        Spice(name = "hot pepper", spiciness = "extremely spicy")
//)

val spice = Curry("cayenne", "spicy")

val spiceList = spices1.filter { it.heat < 5 }

fun makeSalt() = Curry("Salt", "")


fun makeSpice(){
    val curry = Curry("curry", "medium")
    curry.heat
    println(curry.color)

}