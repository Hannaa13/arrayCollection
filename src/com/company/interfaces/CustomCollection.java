package com.company.interfaces;

import com.company.interfaces.impl.Collect;


public interface CustomCollection {

    boolean add(String str);

    boolean addAll(String[] strArr);

    boolean addAll(Collect strColl);

    boolean delete (int index);

    boolean delete (String str);

    String getByIndex (int index);

    boolean contains(String str);

    boolean clear();

    int size();

    boolean trim();

   boolean compare(Collect coll);


}
