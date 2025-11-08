package LinkedList;
 class Node {
    int taskId;
    String taskName;
    int priority;
    String dueDate;
    Node next;
    public Node(int taskId, String taskName, int priority, String dueDate) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }
}

class CLL {
    Node head;
    Node tail;
    public CLL() {
        head = null;
        tail = null;
    }
public void addTaskFirst(int taskId, String taskName, int priority, String dueDate) {
        Node newNode = new Node(taskId, taskName, priority, dueDate);
        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head; 
        } else {
            newNode.next = head;
            head = newNode;
            tail.next = head; 
        }
    }
    public void addTask(int taskId, String taskName, int priority, String dueDate) {
        Node newNode = new Node(taskId, taskName, priority, dueDate);
        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head; 
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head; 
        }
    }
public void removeTask(int taskId) {
        if (head == null) {
            return; 
        }
       
        if (head.taskId == taskId) {
            if (head == tail) { 
                head = null;
                tail = null;
            } else {
                head = head.next;
                tail.next = head;
            }
            return;
        }
        Node current = head;
        Node previous = null;
        do {
            previous = current;
            current = current.next;
            if (current.taskId == taskId) {
                previous.next = current.next;
                if (current == tail) {
                    tail = previous;
                }
                return;
            }
        } while (current != head);
}
    public void displayTasks() {
        if (head == null) {
            System.out.println("No tasks available.");
            return;
        }
        Node current = head;
        do {
            System.out.println("Task ID-> " + current.taskId + " Name-> " + current.taskName + " Priority->" + current.priority + " Due Date->" + current.dueDate);
            current = current.next;
        } while (current != head);
    }
}
 public class Task {
    public static void main(String[] args) {
        CLL taskScheduler = new CLL();
        taskScheduler.addTaskFirst(1, "Task 1", 2, "2024-10-01");
        taskScheduler.addTask(2, "Task 2", 1, "2024-09-15");
        taskScheduler.addTask(3, "Task 3", 3, "2024-11-20");
        taskScheduler.displayTasks();
        taskScheduler.removeTask(2);
        System.out.println("After removing Task 2:");
        taskScheduler.displayTasks();
    }
}
