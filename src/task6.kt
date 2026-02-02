fun main(args: Array<String>) {
    // Выбираем источник данных
    val rawInput = if (args.isNotEmpty()) {
        args.toList()
    } else {
        // Читаем стандартный ввод, пока он не кончится
        generateSequence(::readLine).toList()
    }

    rawInput.flatMap { it.split(Regex("\\s+")) }
        .filter { it.isNotEmpty() }
        .groupingBy { it }
        .eachCount()
        .toList()
        .sortedWith(
            compareByDescending<Pair<String, Int>> { it.second }
                .thenBy { it.first }
        )
        .forEach { (word, count) ->
            println("$word $count")
        }
}