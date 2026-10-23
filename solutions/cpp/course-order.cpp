bool canFinish(int numCourses, const vector<vector<int>>& prerequisites) {
    vector<int> indeg(numCourses, 0);
    vector<vector<int>> after(numCourses);
    for (const auto& pre : prerequisites) {
        int course = pre[0], before = pre[1];
        indeg[course]++;
        after[before].push_back(course);
    }
    queue<int> ready;
    for (int i = 0; i < numCourses; i++)
        if (indeg[i] == 0) ready.push(i);
    int done = 0;
    while (!ready.empty()) {
        int node = ready.front();
        ready.pop();
        done++;
        for (int nxt : after[node])
            if (--indeg[nxt] == 0) ready.push(nxt);
    }
    return done == numCourses;
}
