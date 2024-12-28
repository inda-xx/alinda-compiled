public class SecureDataCopyExample {

    public static Credentials[] shallowCopy(Credentials[] original) {
        return original.clone();
    }

    public static Credentials[] deepCopy(Credentials[] original) {
        Credentials[] copy = new Credentials[original.length];

        for (int i = 0; i < original.length; i++) {
            copy[i] = new Credentials(original[i].getDataId(), original[i].getUsername(), original[i].getPassword());
        }

        return copy;
    }

    public static void printOutArray(Credentials[] array){
        for (Credentials credentials : array) {
            System.out.println(credentials);
        }
    }

    public static void main(String[] args) {
        Credentials[] originalArray = {
            new Credentials("ID1", "user1", "pass1"),
            new Credentials("ID2", "user2", "pass2"),
            new Credentials("ID3", "user3", "pass3")
        };

        Credentials[] shallowCopyArray = shallowCopy(originalArray);

        Credentials[] deepCopyArray = deepCopy(originalArray);

        shallowCopyArray[0].setPassword("newShallowPass");  // This will also affect the original
        deepCopyArray[1].setPassword("newDeepPass");        // This will not affect the original

        System.out.println("Original Array:");
        printOutArray(originalArray);

        System.out.println("\nShallow Copy Array:");
        printOutArray(shallowCopyArray);

        System.out.println("\nDeep Copy Array:");
        printOutArray(deepCopyArray);
    }
}