public class Main {
    public static void main(String[] args) {
        MyHashTable<Object, Object> table;
        table = new MyHashTable<Object, Object>();

        for (int i = 0; i < 10000; i++) {
            MyTestingClass key = new MyTestingClass();
            Student value = new Student();
            table.put(key, value);
        }
        table.printBucketSizes();

    }

    private static class Student {
    }

    private static class MyTestingClass {
        private int x;
        private int y;

        public MyTestingClass() {
            this.x = (int) (Math.random() * 100);
            this.y = (int) (Math.random() * 100);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            MyTestingClass that = (MyTestingClass) o;
            return x == that.x && y == that.y;
        }

        @Override
        public int hashCode() {
            int result = 17;
            result = 31 * result + x;
            result = 31 * result + y;
            return result;
        }
    }}