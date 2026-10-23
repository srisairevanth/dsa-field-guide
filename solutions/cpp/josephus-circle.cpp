int josephusSurvivor(int n, int k) {
    long long survivor = 0;
    for (long long i = 2; i <= n; i++) survivor = (((survivor + k) % i) + i) % i;
    return (int)survivor + 1;
}
