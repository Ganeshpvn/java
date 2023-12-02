import java.util.HashMap;

public class ArrayFrequency {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 1, 2, 3, 1, 2, 1};

        // Call the method to find the frequency of each element
        findFrequency(array);
    }

    public static void findFrequency(int[] array) {
        // Create a HashMap to store the frequency of each element
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        // Iterate through the array and update the frequency map
        for (int element : array) {
            if (frequencyMap.containsKey(element)) {
                // If the element is already present in the map, increment its frequency
                frequencyMap.put(element, frequencyMap.get(element) + 1);
            } else {
                // If the element is not present in the map, add it with a frequency of 1
                frequencyMap.put(element, 1);
            }
        }

        // Print the frequency of each element
        System.out.println("Element\tFrequency");
        for (HashMap.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + "\t\t" + entry.getValue());
        }
    }
}

