bool isRotation(const string& a, const string& b) {
    return a.size() == b.size() && (a + a).find(b) != string::npos;
}
