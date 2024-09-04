class Solution {
 public:
  int robotSim(vector<int>& commands, vector<vector<int>>& obstacles) {
    constexpr int dirs[4][2] = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    int ans = 0;
    int d = 0;  // 0 := north, 1 := east, 2 := south, 3 := west
    int x = 0;  // start x
    int y = 0;  // start y
    unordered_set<pair<int, int>, PairHash> obstaclesSet;

    for (const vector<int>& o : obstacles)
      obstaclesSet.insert({o[0], o[1]});

    for (const int c : commands) {
      if (c == -1) {  // turn right
        d = (d + 1) % 4;
      } else if (c == -2) {  // turn left
        d = (d + 3) % 4;
      } else {
        for (int step = 0; step < c; ++step) {
          int nx = x + dirs[d][0];
          int ny = y + dirs[d][1];
          if (obstaclesSet.find({nx, ny}) != obstaclesSet.end())
            break;
          x = nx;
          y = ny;
        }
      }
      ans = max(ans, x * x + y * y);
    }

    return ans;
  }

 private:
  struct PairHash {
    size_t operator()(const pair<int, int>& p) const {
      return hash<int>()(p.first) ^ hash<int>()(p.second);
    }
  };
};
