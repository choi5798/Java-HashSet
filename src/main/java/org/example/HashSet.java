package org.example;

public class HashSet {
    // Main 함수가 작동되게 구현
    // 추가 필드, 메소드 자유롭게 구현
    // java.util.* 사용금지
    // main 메소드 수정 X
    public void put(Object value) {

    }

    public boolean contains(Object value) {

    }

    public void delete(Object value) {

    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        Employee emp1 = new Employee(1, "Kim", 25);
        Employee emp2 = new Employee(2, "Park", 20);
        Employee emp3 = new Employee(3, "Lee", 30);

        HashSet hSet = new HashSet();
        hSet.put(emp1);
        hSet.put(emp2);
        hSet.put(emp3);

        System.out.println(hSet.contains(new Employee(1, "Kim", 25))); // true
        System.out.println(hSet.contains(new Employee(2, "Park", 20))); // true
        System.out.println(hSet.contains(new Employee(3, "Lee", 30))); // true
        System.out.println(hSet.contains(new Employee(3, "Lee", 31))); // false
        System.out.println(hSet.contains(2)); // true

    }
}