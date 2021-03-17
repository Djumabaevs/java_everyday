package ExPackageJan3;

public class Algorithms {
}

class Stack{
private int[] arrayS;
private int top;
private int stackSize;

public Stack(){
    stackSize = 1;
    top = -1;
    arrayS = new int[stackSize];
}
public void push (int item){
    if(top >= stackSize)
        resize();
    arrayS[++top] = item;
}

    private void resize() {
    int[] temp = arrayS;
    stackSize = stackSize*2;
    arrayS = new int[stackSize];
        for (int i = 0; i < top; i++) {
            arrayS[i] = temp[i];
        }
    }
    public Integer pop(){
    if (top < 0) return  null;
    return  arrayS[top--];
    }
}


