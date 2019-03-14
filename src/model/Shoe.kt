package model

class Shoe(name: String, description: String, sku: Int, var brand: String):
    Product(name, description, sku) { // Clases para Datos - Data Class

    override fun create(): String{
        return "Create shoe"
    }


    override fun read(): String {
        return "Read shoe"
    }

    override fun update(): String {
        return "Update shoe"
    }

    override fun delete(): String {
        return "Delete shoe"
    }


    override fun toString(): String {

        return super.toString() + "SKU ID: $sku \nMarca: $brand \nModelo: $model \nSize: $size \nColor: $color"
    }

    init {
        println("SKU ID: $sku")
        println("Brand: $brand")

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