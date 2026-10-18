class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < magazine.length(); i++) {
            map.put(magazine.charAt(i), map.getOrDefault(magazine.charAt(i), 0) + 1);
        }

        for (int i = 0; i < ransomNote.length(); i++) {

            int count = map.getOrDefault(ransomNote.charAt(i), 0);
            if (count == 0) {
                return false;
            }

            map.put(ransomNote.charAt(i), count - 1);
        }

        return true;
    }
}