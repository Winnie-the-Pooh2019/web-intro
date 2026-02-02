fun main(args: Array<String>) {
    args.flatMap { it.split(Regex("\\s+")) }
        .filter { it.isNotEmpty() }
        .sorted()
        .forEach { println(it) }
}