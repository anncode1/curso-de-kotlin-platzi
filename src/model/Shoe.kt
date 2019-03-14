package model

class Shoe(var sku: Int, var mark: String): Any() { // Clases para Datos - Data Class

    override fun toString(): String {
        return "SKU ID: $sku \nMarca: $mark \nModelo: $model \nSize: $size \nColor: $color"
    }

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