int canCompleteCircuit(const vector<int>& gas, const vector<int>& cost) {
    long long total = 0, tank = 0;
    int start = 0;
    for (size_t i = 0; i < gas.size(); i++) {
        long long diff = (long long)gas[i] - cost[i];
        total += diff;
        tank += diff;
        if (tank < 0) {
            start = (int)i + 1;
            tank = 0;
        }
    }
    return total >= 0 ? start : -1;
}
