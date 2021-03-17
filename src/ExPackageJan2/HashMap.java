package ExPackageJan2;

import java.util.LinkedList;
import java.util.List;

public class HashMap {
    LinkedList<Entry> [] hashMap = new LinkedList[2];
    int size = 0;
    public HashMap() {}

    public void put(Key key, Value value){
        if(size >= hashMap.length){
            resize();
        }
        int index = getIndex(key) % hashMap.length;

        if(hashMap[index] == null){
            hashMap[index] = new LinkedList<>();
            hashMap[index].add(new Entry(key,value));
        } else {
            for (Entry entry : hashMap[index]){
                if(entry.key.equals(key)){
                    entry.value = value;
                    size++;
                    return;
                }
            }
            hashMap[index].add(new Entry(key,value));
            size++;
            return;
        }
    }

    public Value get(Key key){
        int index = getIndex(key) % hashMap.length;
        if (hashMap[index] == null) return  null;
        for (Entry entry : hashMap[index]){
            if(entry.key.equals(key)){
                return entry.value;
            }
        }
    return null;
    }

    public void remove(Key key){
        if (key == null) return;
        int index = getIndex(key) % hashMap.length;
        if(hashMap[index]==null) return;
        Entry toRemove = null;
        for (Entry entry : hashMap[index]){
            if(entry.key.equals(key)){
                toRemove = entry;
                break;
            }
        }
        if (toRemove == null) return;
        hashMap[index].remove(toRemove);
        size--;

    }

    public boolean containsKey(Key key){
        if (key == null) return false;
        int index = getIndex(key) % hashMap.length;
        if (hashMap[index] == null) return  false;
        for (Entry entry : hashMap[index]){
            if(entry.key.equals(key)){
                return  true;
            }
        }
        return false;
    }

    public void resize(){
        LinkedList<Entry>[] oldHashMap = hashMap;
        hashMap = new LinkedList[size*2];
        size = 0;

        for (LinkedList<Entry> entries : oldHashMap) {
            if (entries == null)
                continue;
            for (Entry entry : entries) {
                put(entry.key, entry.value);
            }
        }
    }


    public int size() {
        return  size;
    }
    public int getIndex(Key key){
        return key.hashCode();
    }

}
