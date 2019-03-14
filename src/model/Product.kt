package model

open class Product(var name: String, var description: String, var sku: Int){

    override fun toString(): String {
        return "\nName: $name \nDescription: $description \nSKU $sku"
    }

    open fun create(): String{
        return "Create"
    }

    open fun read(): String{
        return "read"
    }

    open fun update(): String{
        return "update"
    }

    open fun delete(): String{
        return "delete"
    }


}