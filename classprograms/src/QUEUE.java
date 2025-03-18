//public class QUEUE<A> {
//
//    private LLNode<A> front;
//    private LLNode<A> back;
//
//    public QUEUE() {
//        this.front = null;
//        this.back = null;
//    }
//
//    public void enqueue(A value) {
//        if (this.back == null) {
//            this.back = new LLNode((Integer) value, null);
//            this.front = this.back;
//        } else {
//            this.back. (LLNode <A> (value, null));
//            this.back = this.back.getNext();
//        }
//    }
//
//    public A dequeue() {
//        if (this.front == null) {
//            return null;
//        } else {
//            A toReturn = this.front.getValue();
//            this.front = this.front.getNext();
//            if (this.front == null) {
//                this.back = null;
//            }
//            return toReturn;
//        }
//    }
//
//    public static void main(String[] args) {
//        QUEUE<Integer> queue = new QUEUE<>();
//        queue.enqueue(3);
//        queue.enqueue(7);
//        queue.enqueue(2);
//        int x = queue.dequeue();
//        x = queue.dequeue();
//        x = queue.dequeue();
//        x = queue.dequeue();
//    }
//}


