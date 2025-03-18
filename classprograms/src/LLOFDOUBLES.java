//public class LinkedListOfDoubles {
//    private LLNode<Double> numbers = null;
//    public LinkedListOfDoubles(){}
//    public void addDouble(double d){
//        if(this.numbers == null){
//            this.numbers = new LLNode<>(d, null);
//        }else {
//            this.numbers.append(d);
//        }
//    }
//    public double min(){
//        if(this.numbers == null){
//            return -1.0;
//        }else {
//            return minHelper(this.numbers, Integer.MAX_VALUE);
//        }
//    }
//    private double minHelper(LLNode<Double> node, double min){
//        if(node == null){
//            return min;
//        }else{
//            if(node.getValue() < min){
//                return minHelper(node.getNext(), node.getValue());
//            }else{
//                return minHelper(node.getNext(), min);
//            }
//        }
//    }
//}
//
