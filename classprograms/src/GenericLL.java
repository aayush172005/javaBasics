//public class GenericLL<T>{
//    private T value;
//        private GenericLL<T> next;
//        public GenericLL(T val, GenericLL<T> next) {
//            this.value = val;
//            this.next = next;
//        }
//        public T getValue() {
//            return this.value;
//        }
//        public void setValue(GenericLL<T> node) {
//            this.value = node.value;
//
//        }
//        public void setNext(GenericLL<T>node) {
//            this.next = node;
//        }
//
//        public int size() {
//           if (this.next == null) {
//            return 1;
//           } else {
//            return 1 + this.next.size();
//          }
//    }
//     public void append(T value) {
//        if (this.next == null) {
//            this.next = new GenericLL<>(value, null);
//        } else {
//            this.next.append(value);
//        }
//    }
//
//    public GenericLL<T> find(T value) {
//        if (this.value.equals(value)) {
//            return this;
//        } else if (this.next == null) {
//            return null;
//        } else {
//            return this.next.find(value);
//        }
//    }
//
//        public static void main(String[] args) {
//            GenericLL<Integer> first = new GenericLL<>(1, null);
//            first = new GenericLL<>(2, first);
//            first = new GenericLL<>(3, first);
//        }
//    }
//}

