package Challanges;

public class Challenge2 {
   private EmployeeNode head;
   private EmployeeNode tail;
   private int size;

    public static void main(String[] args) {

    }

     public boolean addBefore(Employee newEmployee, Employee existingEmployee){
        if(head == null){
            return false;
        }
        EmployeeNode current = head;
        while(current != null && !current.getEmployee().equals(existingEmployee)){
            current = current.getNext();
         }
        if(current == null){
            return false;
        }
        EmployeeNode newNode = new EmployeeNode(newEmployee);
        newNode.setPrevious(current.getPrevious());
        newNode.setNext(current);
        current.setPrevious(newNode);

        if(head == current){
            head = newNode;
        } else {
            newNode.getPrevious().setNext(newNode);
        }

         size++;
        return true;
     }


}
