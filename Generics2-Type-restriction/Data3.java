public class Data3 implements Rules<Integer>{
        private int data;

        public Data3(int data) {
            this.data = data;
        }

        @Override
        public void execute(Integer val) {
            System.out.println("rules for " + val);
        }

        @Override
        public String toString() {
            return "Data3{" +
                    "data=" + data +
                    '}';
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }
    }

