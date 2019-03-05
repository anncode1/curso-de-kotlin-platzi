//const tiempo de compilación
const val N = "NAME" // variables manera global
var n = "n" //mala practica de programación
val n2 = "n" //variables local tiempo de ejecución

//Funciones Puras
fun main(args: Array<String>) {
    println("Hola Mundo")
    println(1+1)
    println(3-1)
    println(2*2)
    println(4/2)
    println(7%2)

    val a = 4
    val b = 2

    println(a.plus(b))
    println(a.minus(b))
    println(a.times(b))
    println(a.div(b))

    val name = args[0]  //tiempo de ejecución
    println(name)
    println(N)

    val nombre = "Anahí"
    val apellido: String = "Salgado"

    val nombreapellido = "Anahi \"Salgado\""

    println("Tu nombre es: $nombre $apellido")
    println("Tu nombre es: $nombreapellido")

    //Raw String
    val parrafo = """
        ** Lorem Ipsum is simply dummy text of the printing
        ** and typesetting industry. Lorem Ipsum has been the
        ** industry's standard dummy text ever since the 1500s,
        ** when an unknown printer took a galley of type and
        ** scrambled it to make a type specimen book.
    """.trimIndent()

    println(parrafo.trimMargin("** "))

    //Operador Rango
    val oneToHundred = 1..5
    for (i in oneToHundred){
        println(i)
    }

    //val aToC = 'A'..'C'
    for (letra in 'A'..'C'){
      println(letra)
    }


    //if operadores lógicos booleano true o false
    val numero = 20
    if (numero.equals(5)){//true
        println("Sí son iguales")
    }else{
        println("No, no son iguales")
    }

    //when switch case
    when(numero){
        in 1..5 -> println("Sí está entre 1 y 5")
        in 1..3 -> println("Sí está entre 1 y 3")
        else -> println("No está en alguno de los anteriores")
    }



}






