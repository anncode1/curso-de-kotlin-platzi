package model

abstract class Product(var name: String, var description: String, var sku: Int){

    override fun toString(): String {
        return "\nName: $name \nDescription: $description \nSKU $sku"
    }

    abstract fun create(): String

    abstract fun read(): String

    abstract fun update(): String

    abstract fun delete(): String


}