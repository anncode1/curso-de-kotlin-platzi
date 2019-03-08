package model

class Shoe(var sku: Int, var mark: String) { // Clases para Datos - Data Class

    init {
        println("SKU ID: $sku")
        println("Marca: $mark")
    }

    var size: Int = 34 //Mínimo sea 34
        set(value) {
            if (value >= 34)
                field = value
            else
                field = 34
        }
        get() = field

    var model: String = "Boots" //No se ponga Tenis
        set(value) {
            if (value.equals("Tenis"))
                field = "Boots"
            else
                field = value
        }
        get() = field

    var color: String = "White"//Cool

}