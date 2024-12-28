public class SecureDataCopyExample {

    static class Credentials {
        String username;
        String password;

        Credentials(String username, String password) {
            this.username = username;
            this.password = password;
        }

        public Credentials(Credentials original) {
            this.username = original.username;
            this.password = original.password;
        }
    }

    // Demonstrate shallow copy
    public static Credentials[] shallowCopy(Credentials[] original) {
        return Arrays.copyOf(original, original.length);
    }

    // Demonstrate deep copy
    public static Credentials[] deepCopy(Credentials[] original) {
        Credentials[] copy = new Credentials[original.length];
        for (int i = 0; i < original.length; i++) {
            copy[i] = new Credentials(original[i]);
        }
        return copy;
    }

    public static void main(String[] args) {
        Credentials[] originalArray = {
            new Credentials("user1", "pass1"),
            new Credentials("user2", "pass2")
        };

        Credentials[] shallowCopyArray = shallowCopy(originalArray);
        Credentials[] deepCopyArray = deepCopy(originalArray);

        // Modifying the shallow copy affects the original
        shallowCopyArray[0].username = "modifiedUser1";

        // Modifying the deep copy does not affect the original
        deepCopyArray[1].username = "unaffectedUser2";

        System.out.println("Original: " + originalArray[0].username + ", " + originalArray[1].username);
        System.out.println("Shallow Copy: " + shallowCopyArray[0].username + ", " + shallowCopyArray[1].username);
        System.out.println("Deep Copy: " + deepCopyArray[0].username + ", " + deepCopyArray[1].username);
    }
}