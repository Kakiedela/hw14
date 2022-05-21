//2. Создать класс данных с 2 полями типа int.
//Сделать функцию для генерации объекта data
//класса рандомными числами.
//3. Создать класс наследник от класса данных
//4. Сделать класс ‘Util’ который будет содержать в
//себе поля типа класса наследника и метод
//который будет считать и возвращать сумму
//полей data class
//5. Создать файл kotlin в котором необходимо
//написать функцию расширения для data класса
//считающую и возвращающую сумму полей data
//class
open class Data(val first: Int, val second: Int)
fun randomForData() : List<Data>{
    val dataList = arrayListOf<Data>()
    for (i in 0..(0..20).random()){
        dataList.add(
            Data(
                (0..10).random(), (0..10).random()
            )
        )
    }
    return dataList
}
open class Heir (x: Int, y: Int) : Data(x,y)
open class Util (x: Int, y: Int) : Heir(x,y){
    fun sum(x: Int, y:Int) = x + y
}




