package com.company;

import java.util.Arrays;

public class Array {
    private String[] array = new String[5];

    public String[] getArray() {
        return array;
    }

    public void setArray(String[] array) {
        this.array = array;
    }

    public String[] add(String newElement) {

        String[] arrayNew = new String[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            arrayNew[i] = array[i];
        }
        arrayNew[array.length] = newElement;

        return arrayNew;
    }

    public String get(int index) {
        return array[index];
    }


    public boolean containsForIndex(int index) {

        for (int i = 0; i < array.length; i++) {
            if (index <= array.length) {
                return true;
            }
        }
        return false;
    }

    public String[] clear() {
        return new String[array.length];
    }

    public int getSize() {
        return array.length;
    }

    public int find(String str) {
        int index= 0;
        for (int i = 0; i < array.length; i++) {
            if (str.equals(array[i])) {
               index = i;
            }
        }
        return index;
    }

    public boolean contains(String string) {
        for (int i = 0; i < array.length; i++) {
            if (string.equals(array[i])) {
                return true;
            }
        }
        return false;
    }


//    public boolean equals(Array arr) {
//        if (this == arr) return true;
//        if (arr == null || getClass() != arr.getClass()) return false;
//        return Arrays.equals(array, ((Array) arr).array);
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Array array1 = (Array) o;
        return Arrays.equals(array, array1.array);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(array);
    }

    public String[] delete(String delElem){
        String[] arrayNew = new String[array.length - 1];
        int index  = find(delElem);
            for (int i = 0; i< index ; i++) {
              arrayNew[i] = array[i];
            }
            for (int i = index; i<arrayNew.length ; i++) {
                arrayNew[i] = array[i+1];

            }
            return arrayNew;

    }


}
