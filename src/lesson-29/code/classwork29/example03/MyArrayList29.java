package classwork29.example03;

import classwork26.example01.Item;

import java.util.Iterator;

//  Делаем список на основе массива
public class MyArrayList29 <T> implements Iterable<T> { // iterable это то что мы можем по этому классу сделать несколько итераций. итерация - это одно выполнение цикла


    private Object [] array;
    private int size;

    public MyArrayList29(int initialSize) {
        size = initialSize;
        array = new Object [size];
    }
    public MyArrayList29() { // вызов другого конструктора, но вызывается тот код что выше
        this (0);
    }
    // getter for size
    public int getSize () {
        return  size;
    }
    // getter array (получить элемент для самого массива)
    public T get(int index) {
        return (T)array[index];
    }
    // setter for the array (задать значение элемента массива)
    public void set (int index, T value) {
        array [index] = value;
    }
    // линейный поиск: вернуть индекс значения value (val)
    public int indexOf (T value)  {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(value)) {
                return i;
            }
        }
        return -1; // -1 потому что у нас int, а не boolean, чтобы return false
    }
    // содержится ли value в списке?
    public boolean contains(T value) {
        return indexOf(value) != -1 ; // indexOf возвращает если элеимент присутствует в массиве и всегда будет -1 если такого эоемента нет в массиве
    }

    public void resize (int newSize) {
       // создаем новый массив нужного размера
        Object[] temporary = new Object [newSize];

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

    public void add(T value){
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

    @Override
    public Iterator<T> iterator() {
        return new MyIterator<>(array);
    }
    private class MyIterator <T> implements Iterator<T>  {

        private Object[] array;
        private int current; // указатель
        public MyIterator (Object[]array) {
            this.array = array;
            current =0;
        }

        @Override
        public boolean hasNext() {
            return current < array.length;
        }

        @Override
        public T next() {
            return (T)array[current++];
        }
    }
}
