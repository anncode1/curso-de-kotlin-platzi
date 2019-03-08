import model.Camera
import model.Movie
import model.Shoe

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

    var x = 5
    println("X es igual a 5? ${x==5}")//true

    var mensaje = "El valor de x es $x"
    x++
    println("${mensaje.replace("es", "fue")}, x es igual a: $x")

    println("Raiz cuadrada de: ${Math.sqrt(4.0)}")

    val numbers = intArrayOf(6,6,23,9,2,3,2)
    println("El promedio de los números es: ${averageNumbers(numbers,2)}")
    println("${evaluate(6)}")



    //Lambdas
    val saludo = {println("Hola mundo")}
    saludo()


    //var suma = { instrucciones -> sentencias}
    val plus = {a: Int, b: Int, c: Int -> a+b+c}
    val result = plus(3,4,5)
    println(result)
    println(plus(1,2,3))
    println({a: Int, b: Int, c: Int -> a+b+c}(7,8,9))



    val calculateNumber = { n: Int ->

        when(n){
            in 1..3 -> println("Tu número está entre 1 y 3")
            in 4..7 -> println("Tu número está entre 4 y 7")
            in 8..10 -> println("Tu número está entre 8 y 10")
        }

    }

    println(calculateNumber(6))


    val camera = Camera()
    camera.turnOn()
    camera.turnOff()
    println(camera.getCameraStatus())

    camera.setResolution(1080)
    println("Resolution: ${camera.getResolution()}")


    var shoe = Shoe()
    shoe.size = 37
    println(shoe.size)

    shoe.model = "Zapatos de Tacón"
    println(shoe.model)


    val movie = Movie("Coco", "Pixar", 120)
    println("MOVIE")
    println(movie.title)
    println(movie.creator)
    println("${movie.duration} min.")


}



fun evaluate( number: Int = 2, character: Char = '='): String {
    return "${number} es ${character}"
}

fun averageNumbers(numbers: IntArray, n: Int): Int {
    //Promedio de los numeros

    var sum = 0
    for (num in numbers){
        sum += num
    }

    return (sum / numbers.size)+n
}








