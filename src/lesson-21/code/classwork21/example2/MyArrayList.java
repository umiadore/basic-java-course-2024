package classwork21.example2;
//  Делаем список на основе массива
public class MyArrayList {
    private String [] array;
    private int size;

    public MyArrayList (int initialSize) {
        size = initialSize;
        array = new String [size];
    }
    public MyArrayList () { // вызов другого конструктора, но вызывается тот код что выше
        this (0);
    }
    // getter for size
    public int getSize () {
        return  size;
    }
    // getter array (получить элемент для самого массива)
    public String get(int index) {
        return array[index];
    }
    // setter for the array (задать значение элемента массива)
    public void set (int index, String value) {
        array [index] = value;
    }
    // линейный поиск: вернуть индекс значения value (val)
    public int indexOf (String value)  {
        for (int i = 0; i < size; i++) {
            if (array[i].equalsIgnoreCase(value)) {
                return i;
            }
        }
        return -1; // -1 потому что у нас int, а не boolean, чтобы return false
    }
    // содержится ли value в списке?
    public boolean contains(String value) {
        return indexOf(value) != -1 ; // indexOf возвращает если элеимент присутствует в массиве и всегда будет -1 если такого эоемента нет в массиве
    }

    public void resize (int newSize) {
       // создаем новый массив нужного размера
        String[] temporary = new String [newSize];

        // Math.min - выбирает минимальное из двух переданных значений
        //выбираем меньший из размеров
        int minSize = Math.min(size, newSize);
        // копируем элементы из старого массива в новый
        for (int i = 0; i < minSize; i++) {
            temporary [i] = array[i];
        }
        // меняем ссылку и сохраненный размер массива
        array = temporary;
        size = newSize;
    }

    public void add(String value){
        if (size + 1 > array.length) {
            // меняем размер массива
            resize(size + 1);
            // отнимаем 1 потому что в ресайз уже изменили переменную size
            array[size - 1] = value;
        } else {
            // вставляем элемент по индексу размера (после последнего)
            array[size] = value;
            // размер увеличиваем
            size++;
        }
    }
    public void remove (int index)  {
        for (int i = index; i < size -1; i++) {
            array [i] = array[i +1];
        }
        size --;
    }
    // Доп задание: написать метод add (String value, int index), который добавляет элемент по индексу
}
