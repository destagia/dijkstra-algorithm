package miyatin

object Main extends App {

    println("- - - - Dijkstra Algorithm - - - -")

    val A = Point("A", List(
            Node(2,"B"), Node(4,"C"), Node(5, "D")))

    val B = Point("B", List(
            Node(3,"C"), Node(2,"D")))

    val C = Point("C", List(
            Node(2,"D"), Node(6,"E"), Node(4,"F")))

    val D = Point("D", List(
            Node(1,"E")))

    val E = Point("E", List(
            Node(1,"F")))

    val F = Point("F", Nil)

    val d = new Dijkstra(List(A,B,C,D,E,F))
    val result = d.make

}