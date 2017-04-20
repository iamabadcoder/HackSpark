object HelloWorld {

    def main(args: Array[String]) {
        var capital = Map("US"-> "Washington", "France" -> "Paris");
        capital += ("Japan" -> "Tokyo");

        println(capital("France"));

        for (i <- 1 to 10) {
            println(i)
        }
    }
    
}
