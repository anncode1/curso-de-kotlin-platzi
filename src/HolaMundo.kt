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


    var i = 1
    //while contadores

    while (i < 1 ){//false true
        println("mensaje: $i")
        i++
    }

    i = 1
    do {
        println("mensaje dowhile: $i")
        i++
    }while (i < 1 )



    /*try {
        var compute: String?
        compute = null
        var longitud: Int = compute!!.length
    }catch (e: NullPointerException){
        println("Ingresa un valor, no aceptamos nulos")
    }*/

    //Llamada Segura
    var compute: String? = null
    var longitud: Int? = compute?.length //null
    println("Longitud: $longitud")

    //Operador Elvis
    var teclado: String? = null
    val longitudTeclado: Int = teclado?.length ?: 0
    println("Longitud Teclado: $longitudTeclado")

    val listWithNulls: List<Int?> = listOf<Int?>(7,null,null,4)
    println("Lista con Null: ${listWithNulls}")

    val listWithoutNulls: List<Int?> = listWithNulls.filterNotNull()
    println(listWithoutNulls)

    //Array
    val countries
            = arrayOf("India", "Mexico", "Colombia", "Argentina", "Chile", "Peru")

    val days = arrayOf<String>("Lunes", "Martes", "Miercoles")



    //Promedio de los numeros
    val numbers = intArrayOf(6,6,23,9,2,3,2)
    var sum = 0
    for (num in numbers){
        sum += num
    }

    val average = sum / numbers.size
    println("Promedio: $average")

    var arrayObject = arrayOf(1,2,3)
    var intPrimitive : IntArray = arrayObject.toIntArray()

    val suma = arrayObject.sum()
    println("La suma del array es: $suma")
    arrayObject = arrayObject.plus(4)
    for (a in arrayObject){
        println("Array: $a" )
    }

    arrayObject = arrayObject.reversedArray()
    for (a in arrayObject){
        println("Array reversa: $a")
    }

    arrayObject.reverse()
    for (a in arrayObject){
        println("Array reversa: $a")
    }

}






