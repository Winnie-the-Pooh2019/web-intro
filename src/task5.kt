fun main(args: Array<String>) {
    args.flatMap { it.split(Regex("\\s+")) }
        .filter { it.isNotEmpty() }
        .groupingBy { it }
        .eachCount()
        .toList() // Превращаем Map в List<Pair<String, Int>> для кастомной сортировки
        .sortedWith(
            compareByDescending<Pair<String, Int>> { it.second } // Сначала по кол-ву (убывание)
                .thenBy { it.first }                             // Потом по слову (возрастание)
        )
        .forEach { (word, count) ->
            println("$word $count")
        }
}