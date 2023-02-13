class Auto {
    var marka:String=""
    var mosh:Int=0
    var price:Double=0.0

    constructor(marka:String, mosh:Int, price:Double) {
        this.marka = marka
        this.mosh = mosh
        this.price = price
    }

    fun  Autohar(){
        println("Характеристики авто.\n Марка: ${this.marka} \n Мощность: ${this.mosh} \n Стоимость: ${this.price} р.")
    }

    fun Dollar(){
        var dpr:Double
        dpr=price/74
        //dpr=String.format("%.2f",dpr).toDouble()
        println("Стоимость авто в долларах: $dpr")
    }

    fun Hp(){
        var hp:Double
        hp=this.mosh*1.34
        println("В авто $hp лошадиных сил")
    }


}