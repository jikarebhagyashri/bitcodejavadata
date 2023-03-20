public class Data2 implements Rules<String>{
        private int data;

        public Data2(int data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return "Data2{" +
                    "data=" + data +
                    '}';
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        @Override
        public void execute(String val) {
            System.out.println("executing rule for " + val);
        }
    }

