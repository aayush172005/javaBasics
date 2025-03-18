public class LLNode {
    private int val ;
    private LLNode next;
    public LLNode(int val,LLNode next) {
        this.val = val;
        this.next = next;

    }

    public String toString() {
        String Out = "";
        Out +=this.val;
        if(this.next != null) {
            Out +=" "+ this.next.toString();
        }
        return Out;
    }
    public static void main(String[]args){
        LLNode head = new LLNode(1,null);
        head = new LLNode(2,head);
        head = new LLNode(3,head);
        head = new LLNode(4,head);
        head = new LLNode(5,head);
      String elements = head.toString();
        System.out.println("LL elements are : " + elements);

    }
}


