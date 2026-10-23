int countOnes(int n) {
    unsigned long long m = n < 0 ? (unsigned long long)(-(long long)n) : (unsigned long long)n;
    int count = 0;
    while (m) {
        count += (int)(m & 1);
        m >>= 1;
    }
    return count;
}
