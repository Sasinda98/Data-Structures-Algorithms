package com.gayal.data.structures.DynamicArray;


public class DynamicArray {

    private static final int DEFAULT_SIZE = 10;
    private static final float DEFAULT_GROWTH_FACTOR = 1.5f;


    private Object[] array;
    public int capacity;
    public int size;
    public float growthFactor;

    public DynamicArray() {

        this.array = new Object[DEFAULT_SIZE];
        this.capacity = DEFAULT_SIZE;
        this.size = 0;
        this.growthFactor = DEFAULT_GROWTH_FACTOR;

    }

    public DynamicArray(int capacity) {

        this.array = new Object[capacity];
        this.capacity = capacity;
        this.size = 0;
        this.growthFactor = DEFAULT_GROWTH_FACTOR;

    }

    public DynamicArray(int capacity, float growthFactor) {

        this.array = new Object[capacity];
        this.capacity = capacity;
        this.size = 0;
        this.growthFactor = growthFactor;

    }

    public int getSize() {

        return size;

    }

    public int getCapacity() {

        return capacity;

    }

    public void put(Object object) {

        grow();
        array[size] = object;
        size += 1;

    }

    private void grow() {

        if (size == capacity) {
            int newCapacity = (int) Math.ceil(growthFactor * capacity);
            final Object[] grownArray = new Object[newCapacity];

            /*
             * Copy data to newly created larger array.
             * */
            for (int i = 0; i < size; i++)
                grownArray[i] = array[i];


            array = grownArray;
            capacity = newCapacity;
        }

    }

    public Object removeAt(int index) {

        if (index >= capacity || index < 0)
            throw new IndexOutOfBoundsException("Capacity of array is: " + capacity + ". Index requested is: " + index);

        shrink();

        Object remove = array[index];
        array[index] = null;
        size--;

        for (int i = index; i < size; i++)
            this.array[i] = array[i + 1];

        return remove;

    }

    public void insertAt(int index, Object object) {

        if (index >= capacity || index < 0)
            throw new IndexOutOfBoundsException("Capacity of array is: " + capacity + ". Index requested is: " + index);

        grow();

        for (int i = size; i > index; i--)
            array[i] = array[i - 1];

        array[index] = object;
        size++;
    }

    private void shrink() {

        float ratio = (float) size / capacity;

        if (ratio <= 0.5) {

            int newCapacity = capacity / 2;

            if (newCapacity >= size) {

                Object[] shrunkArray = new Object[newCapacity];

                for (int i = 0; i < size; i++) {
                    shrunkArray[i] = array[i];
                }

                array = shrunkArray;
                capacity = newCapacity;

            }

        }

    }

    public Object get(int index) {

        if (index >= capacity || index < 0)
            throw new IndexOutOfBoundsException("Capacity of array is: " + capacity + ". Index requested is: " + index);

        return array[index];

    }

    public void print() {
        String contents = "";

        for (int i = 0; i < capacity; i++)
            contents = contents + array[i] + ", ";

        System.out.println("[" + contents.substring(0, contents.length() - 2) + "]");
    }


}
