//Belajar kotlin if else
fun main(args: Array<String>){
    val data1:Int=10
    val data2:Int=30
    val min: Int
    
    if (data1 < data2){
        min = data2
    }else{ 
        min = data1
    }
    print("this number"+min)
}

// penambahan dengan kotlin
fun main (args: Array<String>){
    val data1:Int=20
    val data2:Int=30
    val jumlah = data1 + data2
    print("result number"+jumlah)
}

// pengurangan dengan kotlin
fun main (args: Array<String>){
    val data1:Int=500
    val data2:Int=137
    val jumlah = data1 - data2
    print("result number" +jumlah)
}

// perkalian dengan kotlin
fun main (args: Array<String>){
    val data1:Int=50
    val data2:Int=2
    val jumlah = data1 * data2
    print("result number" +jumlah)
}

//pembagian dengan kotlin
fun main (args: Array<String>){
    val data1:Int=30
    val data2:Int=2
    val jumlah = data1 / data2
    print("result number" +jumlah)
}