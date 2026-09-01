public class LibraryFinder {

    /**
     * Linear search: returns the index of the first matching title, or -1 if not found.
     * Prints every inspected index so the search can be traced.
     */
    public static int findFirst(String[] items, String target) {
        for (int i = 0; i < items.length; i++) {
            System.out.println("Checking index " + i);
            if (items[i].equals(target)) {
                return i; // found – stop immediately
            }
        }
        return -1; // not found after scanning entire array
    }

    /**
     * Linear search: counts ALL matching titles, including duplicates.
     * Prints every inspected index so the search can be traced.
     */
    public static int countMatches(String[] items, String target) {
        int count = 0;
        for (int i = 0; i < items.length; i++) {
            System.out.println("Checking index " + i);
            if (items[i].equals(target)) {
                count = count + 1; // increment accumulator
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // Unsorted array of book titles (Lab 2 example)
        String[] books = {"C", "Java", "DSA", "Java", "SQL"};

        // 1. findFirst("Java") – should return index 1
        System.out.println("=== Test 1: findFirst('Java') ===");
        int idx1 = findFirst(books, "Java");
        System.out.println("Result: " + idx1 + "\n");

        // 2. countMatches("Java") – should return 2 (two duplicates)
        System.out.println("=== Test 2: countMatches('Java') ===");
        int cnt1 = countMatches(books, "Java");
        System.out.println("Result: " + cnt1 + "\n");

        // 3. Target not present – "Python"
        System.out.println("=== Test 3: findFirst('Python') ===");
        int idx2 = findFirst(books, "Python");
        System.out.println("Result: " + idx2 + "\n");

        System.out.println("=== Test 4: countMatches('Python') ===");
        int cnt2 = countMatches(books, "Python");
        System.out.println("Result: " + cnt2 + "\n");

        // 4. Target at the last position – "SQL"
        System.out.println("=== Test 5: findFirst('SQL') ===");
        int idx3 = findFirst(books, "SQL");
        System.out.println("Result: " + idx3 + "\n");

        System.out.println("=== Test 6: countMatches('SQL') ===");
        int cnt3 = countMatches(books, "SQL");
        System.out.println("Result: " + cnt3 + "\n");

        // 5. Target at the first position – "C"
        System.out.println("=== Test 7: findFirst('C') ===");
        int idx4 = findFirst(books, "C");
        System.out.println("Result: " + idx4 + "\n");

        System.out.println("=== Test 8: countMatches('C') ===");
        int cnt4 = countMatches(books, "C");
        System.out.println("Result: " + cnt4 + "\n");
    }
}