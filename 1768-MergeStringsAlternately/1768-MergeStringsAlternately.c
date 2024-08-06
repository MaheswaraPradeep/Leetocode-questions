char* mergeAlternately(char* word1, char* word2) {
    int len1 = strlen(word1);
    int len2 = strlen(word2);
    char* word3 = (char*)malloc(sizeof(char) * (len1 + len2 + 1));

    int i = 0, j = 0, k = 0;

    // Correctly alternate characters from word1 and word2
    while (i < len1 && j < len2) {
        word3[k++] = word1[i++];
        word3[k++] = word2[j++];
    }

    // Add remaining characters from word1, if any
    while (i < len1) {
        word3[k++] = word1[i++];
    }

    // Add remaining characters from word2, if any
    while (j < len2) {
        word3[k++] = word2[j++];
    }

    // Null-terminate the result
    word3[k] = '\0';

    return word3;
}
