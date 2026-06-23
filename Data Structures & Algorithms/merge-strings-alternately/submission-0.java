class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n1 = word1.length();
        int n2 = word2.length();

        char[] word3 = new char[n1 + n2];

        int i=0; int j=0; int k=0;
        while (i < n1 && j < n2) {
            word3[k++] = word1.charAt(i++);
            word3[k++] = word2.charAt(j++); 
        }

        while (i<n1) word3[k++] = word1.charAt(i++);
        while (j<n2) word3[k++] = word2.charAt(j++);

        return new String(word3);
    }
}