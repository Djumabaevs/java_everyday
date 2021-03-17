package ExPackageFeb5;

public class Doing7hash {
    private StoredEmployee[] hashtable;

    public Doing7hash(){
        hashtable = new StoredEmployee[10];
    }
    public void put(String key, Employee employee){
        int hashedKey = hashKey(key);
        if(occupied(hashedKey)){
            int stopIndex = hashedKey;
            if(hashedKey == hashtable.length - 1){
                hashedKey = 0;
            } else {
                hashedKey++;
            }
            while(occupied(hashedKey) && hashedKey != stopIndex){
                hashedKey = (hashedKey + 1) % hashtable.length;
            }
        }
        if(occupied(hashedKey)){
            System.out.println("sorry, no place at this position " + hashedKey);
        } else {
            hashtable[hashedKey] = new StoredEmployee(key, employee);
        }

    }

    private int findKey(String key){
        int hashedKey = hashKey(key);
        if(hashtable[hashedKey] != null & hashtable[hashedKey].key.equals(key)){
            return hashedKey;
        }
        int stopIndex = hashedKey;
        if(hashedKey == hashtable.length - 1){
            hashedKey = 0;
        } else {
            hashedKey++;
        }
        while(hashedKey != stopIndex && hashtable[hashedKey] != null &&
        !hashtable[hashedKey].key.equals(key)){
            hashedKey = (hashedKey + 1) % hashtable.length;
        }
        if(stopIndex == hashedKey){
            return -1;
        } else {
            return hashedKey;
        }
    }

    public int hashKey(String key){
        return key.length() % hashtable.length;
    }

    private boolean occupied(int index){
        return hashtable[index] != null;
    }

    public Employee get(String key){
        int hashedKey = findKey(key);
        if(hashedKey == -1){
            return null;
        }
        return hashtable[hashedKey].employee;
    }

    public void printHashtable(){
        for (int i = 0; i < hashtable.length; i++) {
            if(hashtable[i] == null){
                System.out.println("empty");
            } else {
                System.out.println("position " + i + hashtable[i].employee);
            }
        }
    }
}
