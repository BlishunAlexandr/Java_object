package a3;

public class Cat implements Comparable<Cat>{
        private int age;
        private String name;

        public Cat(String name, int age) {
            this.age = age;
            this.name = name;
        }

        @Override
        public String toString() {
            return "name: " + name + ", age: " + age ;
        }

        @Override
        public int compareTo(Cat o){
            if (this.age > o.age) return 1;
            else if (this.age < o.age) return -1;
            else return 0;
        }
}
