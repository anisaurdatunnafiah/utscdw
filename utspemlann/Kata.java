package utspemlann;

class Kata {
    static String greet(String name, String owner) {
    if (name.equals(owner)) {
        return  "Hello boss";
    }else {
        return "Hello guest";
    }
}

    public static void main(String[] args) {
        String name1 = "John";
        String owner1 = "Alice";
        System.out.println(greet(name1, owner1));
        
        String name2 = "Alice";
        String owner2 = "Alice";
        System.out.println(greet(name2, owner2));
    }
}
