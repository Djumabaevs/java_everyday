package ExPackageFeb5;




class Doing6 {

}
public class Employee{
    public String name;
    public int age;
    public String toString(){
        return "name is" + name + "age is" + age;
    }
}

class StoredEmployee{
public String key;
public Employee employee;
public StoredEmployee(String key, Employee employee){
    this.key = key;
    this.employee = employee;
}
}

class HashTable{
    private Employee[] hashtable;

    public HashTable(){
        hashtable = new Employee[10];
    }
    public void put(String key, Employee employee){
        int hashedKey = hashKey(key);
        if(hashtable[hashedKey] != null){
            System.out.println("Sorry the position is not empty: " + hashedKey);
        } else {
            hashtable[hashedKey] = employee;
        }
    }

    public int hashKey(String key){
        return key.length() % hashtable.length;
    }

    public Employee get(String key){
        int hashedKey = hashKey(key);
        return hashtable[hashedKey];
    }

    public void printHashtable(){
        for (int i = 0; i < hashtable.length; i++) {
            System.out.println(hashtable[i]);
        }
    }

    private boolean occupied(int index){
        return hashtable[index] != null;
    }

    public void putOptimized(String key, Employee employee){
        int hashedKey = hashKey(key);
        if(occupied(hashedKey)){
            int stopIndex = hashedKey;
            if(hashedKey == hashtable.length - 1){
                hashedKey = 0;
            } else {
                hashedKey++;
            }
            while(occupied(hashedKey) && hashedKey != stopIndex){
                hashedKey = (hashedKey  +1) % hashtable.length;
            }
        }

        if(occupied(hashedKey)){
            System.out.println("Sorry, this place is occipied!" + hashedKey);
        } else {
            hashtable[hashedKey] = employee;
        }
    }


}
