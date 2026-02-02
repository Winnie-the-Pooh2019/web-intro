fun main(args: Array<String>) {
    args.flatMap { it.split(Regex("\\s+")) }
        .filter { it.isNotEmpty() }
        .groupingBy { it }
        .eachCount()
        .toSortedMap() // Сортируем по ключу (алфавиту)
        .forEach { (word, count) ->
            println("$word $count")
        }
}