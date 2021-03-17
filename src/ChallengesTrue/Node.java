package ChallengesTrue;

public class Node {
    int key;
    String value;
    Node leftChild;
    Node rightChild;
    private int key2;

    public Node(int key2) {
        this.key2 = key2;
    }

    public int getKey2() {
        return key2;
    }

    public void setKey2(int key2) {
        this.key2 = key2;
    }

    public Node(int key, String value){
        super();
        this.key = key;
        this.value = value;
    }
}
