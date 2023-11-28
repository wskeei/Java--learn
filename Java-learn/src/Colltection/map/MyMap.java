package Colltection.map;

public class MyMap<K,V> {

    private MyEntry<K,V>[] elements;

    private int size;

    private float loadFactor = 0.75f; //负载因子

    public MyMap() {
        this(16);
    }

    public MyMap(int capacity) {
        this.elements = new MyEntry[capacity];
    }

    public V put(K key, V value){
        int currentSize = size + 1;
        if(currentSize >= elements.length * loadFactor){
            MyEntry<K,V>[] entries = new MyEntry[currentSize<<1];
            for(MyEntry<K,V> entry: entries){
                int hash = entry.getKey().hashCode();
                int index = hash & (entries.length - 1);
                entries[index] = entry;
            }
            elements = entries;
        }
        int hash = key.hashCode();
        int index=  hash & (elements.length - 1);
        MyEntry<K,V> addEntry = new MyEntry<>(key, value, null);
        if(elements[index] == null){
            elements[index] = addEntry;
        } else {
            MyEntry<K,V> existEntry = elements[index];
            while (existEntry.getNext() != null){
                existEntry = existEntry.getNext();
            }
            existEntry.setNext(addEntry);
        }
        size++;
        return elements[index].getValue();
    }

    public V get(K key){
        for(MyEntry<K,V> entry: elements){
            if(entry == null) continue;
            K k = entry.getKey();
            if(k.equals(key)) return entry.getValue();
            MyEntry<K, V> temp =entry.getNext();
            while (temp != null){
                if(temp.getKey().equals(key)) return temp.getValue();
                temp = temp.getNext();
            }
        }
        return null;
    }


    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }
}
