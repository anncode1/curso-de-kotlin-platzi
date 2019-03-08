package model

class Shoe { // Clases para Datos - Data Class
    var size: Int = 34 //Mínimo sea 34
        set(value) {
            if (value >= 34)
                field = value
            else
                field = 34
        }
        get() = field


    var color: String = "White"//Cool
    var model: String = "Boots" //No se ponga Tenis
        set(value) {
            if (value.equals("Tenis"))
                field = "Boots"
            else
                field = value
        }
        get() = field
}