int myAtoi(const string& s) {
    size_t i = 0, n = s.size();
    while (i < n && s[i] == ' ') i++;
    long long sign = 1;
    if (i < n && (s[i] == '+' || s[i] == '-')) {
        sign = s[i] == '-' ? -1 : 1;
        i++;
    }
    long long value = 0;
    while (i < n && s[i] >= '0' && s[i] <= '9') {
        value = value * 10 + (s[i] - '0');
        if (value > 2147483648LL) value = 2147483648LL;
        i++;
    }
    value = sign * value;
    return (int)max(-2147483648LL, min(2147483647LL, value));
}
