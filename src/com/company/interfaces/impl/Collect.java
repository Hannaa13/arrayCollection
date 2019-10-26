package com.company.interfaces.impl;

import com.company.interfaces.CustomCollection;



public class Collect implements CustomCollection {

    public String[] array;
    public int count = 0;

    public Collect() {
        this.array = new String[3];
    }

    @Override
    public boolean add(String str) {

        if (count < array.length) {
            array[count] = str;
            count++;
        } else {
            array = copy();
            array[count] = str;
            count++;
        }
        return true;
    }

    public String[] copy() {
        String[] arrNew = new String[count + count * 2 / 3];
        for (int i = 0; i < array.length; i++) {
            arrNew[i] = array[i];
        }
        return arrNew;
    }

    @Override
    public boolean addAll(String[] strArr) {
        for (int i = 0; i < strArr.length; i++) {
            add(strArr[i]);
        }
        return true;
    }

    @Override
    public boolean addAll(Collect strColl) {
        trim();
        String[] arrayNew = new String[array.length + strColl.size()];

        for (int i = 0; i < count; i++) {
            arrayNew[i] = array[i];
        }
        for (int i = 0; i < strColl.size(); i++) {
            arrayNew[count] = strColl.getByIndex(i);
count++;
        }
            array = arrayNew;
            return true;
        }

    @Override
    public boolean delete(int index) {
      if (index > size()) return false;
      else {
          count--;
          for (int i = index; i < count; i++) {
              array[i] = array[i + 1];
          }
      }
      return true;
    }

    @Override
    public boolean delete(String str) {
      if (!contains(str))  return false;
      else {
          delete(find(str));
      }
      return true;
      }


    @Override
    public String getByIndex(int index) {
        if (index >= count)  return null;
        else
          return  array[index];
    }


    @Override
    public boolean contains(String str) {
        for (int i = 0; i < count; i++) {
            if (str == (array[i])) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean clear() {
        for (int i = 0; i < array.length ; i++) {
            array[i] = null;
        }
        return true;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public boolean trim() {
        if (count==array.length) return false;
        String[] arrayNew = new String[count];
        for (int i = 0; i < count; i++) {
             {
                arrayNew[i] =array[i];
            }
        }
        array = arrayNew;
        return true;
    }

    @Override
    public boolean compare(Collect coll) {

        if (count != coll.size()) return false;
        String[] arrayNew = new String[coll.size()];
        for (int i = 0; i < coll.size(); i++) {
            arrayNew[i] = coll.getByIndex(i);

            if (array[i] != arrayNew[i]) return false;
        }
                return true;
        }




    public int find(String str) {
        int index= 0;
        for (int i = 0; i < count; i++) {
            if (str == (array[i])) {
               index = i;
            }
        }
        return index;
    }


        public boolean addOld(String str) {
            if (count < array.length) {
                array[count] = str;
                count++;
            }
            else {
                array = copyOneElem();
                array[count] = str;
                count++;
            }
            return true;
        }

        public String[] copyOneElem() {
        String[] arrayNew = new String[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            arrayNew[i] = array[i];
        }

        return arrayNew;
    }

}
