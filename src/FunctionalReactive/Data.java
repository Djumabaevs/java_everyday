package FunctionalReactive;

public class Data<T> implements IData<T> {
    private T data;

    public Data(T data) {
        this.data = data;
    }
    @Override
    public T getData() {
        return data;
    }
    @Override
    public void setData(T data) {
        this.data = data;
    }
    public String toString() {
        return " " + data;
    }
}
interface IData<T> {
    T getData();

  void setData(T data);
}
class Demo {
    public static void main(String[] args) {
        Data<String> d1 = new Data<>("This is d1");
        System.out.println(d1);
        Data<Integer> d2 = new Data<>(10);
        System.out.println(d2);

    }
}
