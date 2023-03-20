public class Data1 implements Rules<Boolean>{
        private int data;

        public Data1(int data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return "Data1{" +
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
        public void execute(Boolean val) {
            System.out.println("Executing rule for " + val);
        }
    }

