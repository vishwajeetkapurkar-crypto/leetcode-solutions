class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character, Integer> table = new HashMap<>();
        HashMap<Character, Integer> original = new HashMap<>();

        if (s1.length() > s2.length()) {
            return false;
        }

        // 1. Populate the first window
        for (int i = 0; i < s1.length(); i++) {
            original.put(s1.charAt(i), original.getOrDefault(s1.charAt(i), 0) + 1);
            table.put(s2.charAt(i), table.getOrDefault(s2.charAt(i), 0) + 1);
        }

        // Check the first window before sliding
        if (table.equals(original)) {
            return true;
        }

        // 2. Slide the window starting from index s1.length()
        for (int i = s1.length(); i < s2.length(); i++) {
            // Add the new incoming character on the right
            char incoming = s2.charAt(i);
            table.put(incoming, table.getOrDefault(incoming, 0) + 1);

            // Remove the old outgoing character on the left
            char outgoing = s2.charAt(i - s1.length());
            if (table.get(outgoing) == 1) {
                table.remove(outgoing);
            } else {
                table.put(outgoing, table.get(outgoing) - 1);
            }

            // Compare frequency maps directly
            if (table.equals(original)) {
                return true;
            }
        }

        return false;
    }
}