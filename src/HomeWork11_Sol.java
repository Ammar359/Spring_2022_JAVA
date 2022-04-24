

import java.util.*;

    public class HomeWork11_Sol {
        public static void main(String[] args) {

            Map<Integer, String> studentMap = new HashMap<>();
            studentMap.put(1, "NewYork");
            studentMap.put(2, "Brooklyn");
            studentMap.put(3, "NewYork");
            studentMap.put(4, "Miami");
            studentMap.put(5, "miami");
            studentMap.put(6, "Denver");
            studentMap.put(7, "Chief");

            findKeysWithSameValue(studentMap);


            String[] arr = {"green", "blue", "red", "yellow", "grey", "green", "red", "grey",
                    "green", "red", "yellow", "yellow", "grey", "blue", "yellow", "grey",
                    "green", "blue", "yellow", "grey", "green", "blue", "green", "green",
                    "green", "green","red","red","red","red","red","red"};
            System.out.println("\nSolution for Q2 -> " + getColorMaxTimes(arr));

        }
        /**
         * Question-1:
         * Create a HashMap with
         *      Integer as key and
         *      String as value
         *
         *  { (101 = "HAppy") , (102 = "King") , (103 = "HAPPY") , (104 = "live") , (105 = "Happy"), (106 = "Live") }
         *
         *  Create a method that will the HashMap<Integer, String> as Input
         *  print the keys with common values (ignoring cases)
         *
         *      "Happy" is present with keys = 101, 103, 105
         *      "Live" is present with keys = 104, 106
         *
         *  { (101 = "HAppy") , (102 = "King") , (103 = "HAPPiness") , (104 = "life") , (105 = "king and queen"), (106 = "Live") }
         *  When no keys are having common values, method should print,
         *      "No keys have common values"
         *
         *
         *
         * { (101 = "HAppy") , (102 = "King") , (103 = "HAPPY") , (104 = "live") , (105 = "Happy"), (106 = "Live") }
         *
         * "Happy" -> [101, 103, 105]
         * "Live" -> [104, 106]
         *
         * String -> Set<Integer>
         *
         * 1. get all keys in variable (keySet)     [101, 102, 103, 104, 105, 106]
         * 2. create Set<Integer> to store keys with commonValue
         * 3. Loop using keys (from step-1)
         *      key = 101
         *      v101 (get()) = "HAppy"
         *          102
         *          v102
         *          if (v102 and v101 are equalsIgnoreCase)
         *              add 101 and 102 in the Set created at step-2
         *          103
         *          v103
         *          if (v103 and v101 are equalsIgnoreCase)
         *              add 101 and 103 in the Set created at step-2
         *          ...
         *          ...
         *
         *          if (Set created at step-2 has size > 0) {
         *              add pair in Map (v101, Set created at step-2)
         *          }
         *
         *      key = 102
         *      v102 (get()) - "King"
         *          103
         *          v103
         *          if (v103 and v102 are equalsIgnoreCase)
         *              add 102 and 103 in the Set created at step-2
         *
         *
         *
         */

        public static void findKeysWithSameValue(Map<Integer, String> inputMap) {
            Set<Integer> allKeys = inputMap.keySet();
            Set<Integer> keysWithSameValue = new HashSet<>();
            Map<String, String> result = new HashMap<>();

            for (Integer key : allKeys) { // key = 102
                keysWithSameValue.clear();
                for (Integer innerKey : allKeys) {  // innerKey = 101, 103, 104, 105, 106
                    if(!key.equals(innerKey) && inputMap.get(key).equalsIgnoreCase(inputMap.get(innerKey))) {
                        keysWithSameValue.add(key);
                        keysWithSameValue.add(innerKey);
                    }
                }
                if (keysWithSameValue.size() > 0) {
                    result.put(inputMap.get(key).toUpperCase(), keysWithSameValue.toString());
                }
            }
            if (result.size() > 0) {
                Set<String> commonKeys = result.keySet();
                for (String commonKey : commonKeys) {
                    System.out.println(commonKey + " is present with keys = " + result.get(commonKey));
                }
            } else {
                System.out.println("No keys have common values");
            }

        }

        /**
         * Question-2:
         *
         * String[] colorNames = {"green", "blue", "red", "yellow", "grey", "green", "red", "grey",
         *             "green", "red", "yellow", "yellow", "grey", "blue", "yellow", "grey",
         *             "green", "blue", "yellow", "grey", "green", "blue", "green", "green",
         *             "green", "green"};
         *
         *
         * Create a method that will return the name(s) of color appearing max number of times in the array.
         *
         * green - 7
         * blue - 5
         * red - 10
         * yellow - 8
         * grey - 6
         *
         * method will return "red"
         *
         * green - 7
         * blue - 10
         * red - 10
         * yellow - 8
         * grey - 6
         *
         * method will return "red", "blue"

         */

        public static Map<String, Integer> findDuplicateWordWithCount(String[] words) {
            Map<String, Integer> duplicateCount = new HashMap<>();

            for (int i=0 ; i < words.length ; i++) {
                if (!duplicateCount.containsKey(words[i])) {
                    int count = 1;
                    for (int j=i+1 ; j < words.length ; j++) {
                        if (words[j].equalsIgnoreCase(words[i])) {
                            count++;
                        }
                    }
                    if (count > 1) {
                        duplicateCount.put(words[i], count);
                    }
                }
            }
            return duplicateCount;
        }

        public static Set<String> getColorMaxTimes(String[] colors) {

            // storing count of all colors (using above method to do this step)
            Map<String, Integer> colorCount = findDuplicateWordWithCount(colors);

            // finding the maximum number in the color count
            Collection<Integer> allColorCount = colorCount.values();
            Integer maxValue = 0;

            for (Integer value : allColorCount) {
                if (value > maxValue) {
                    maxValue = value;
                }
            }

            // storing colorName with maxCount in a Set(maxColor)
            Set<String> allColorNames = colorCount.keySet();
            Set<String> maxColor = new HashSet<>();

            for (String colorName : allColorNames) {
                if (colorCount.get(colorName) == maxValue) {
                    maxColor.add(colorName);
                }
            }

            return maxColor;
        }


    }
