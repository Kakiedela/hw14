//5. Создать файл kotlin в котором необходимо
//написать функцию расширения для data класса
//считающую и возвращающую сумму полей data
//class
class Anyway(){
    fun data(data : Data): Int {
        return data.second + data.first
    }
}
