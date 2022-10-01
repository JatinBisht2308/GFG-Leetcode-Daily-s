class Solution {
    
    private boolean[][] visited;

    int countDistinctIslands(int[][] grid) {
        // Your Code here
        visited = new boolean[grid.length][grid[0].length];
        Map<Integer, List<List<int[]>>> map = new HashMap<>();
        
        int ans = 0;
        
        for (int i = 0 ; i < grid.length ; i++) {
            for (int j = 0 ; j < grid[0].length ; j++) {
                if (grid[i][j] == 1 && !visited[i][j]) {
                    List<int[]> list = new ArrayList<>();
                    
                    list.add(new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE});
                    
                    dfs(grid, i, j, list);
                    int n = list.size();
                    
                    int[] minXY = list.get(0);
                    
                    // Considering every island with origin i.e. (0, 0)
                    for (int k = 1 ; k < n ; k++) {
                        int[] temp = list.get(k);
                        temp[0] = Math.abs(temp[0] - minXY[0]);
                        temp[1] = Math.abs(temp[1] - minXY[1]);
                    }
                    
                    list.remove(0);
                    n--;
                    
                    if (map.containsKey(n)) {
                        boolean matched = false;
                        
                        for (List<int[]> seq : map.get(n)) {
                            int idx = 0;
                            boolean flag = false;
                            
                            for (int[] xy : seq) {
                                if ((xy[0] != list.get(idx)[0]) || (xy[1] != list.get(idx)[1])) {
                                    flag = true;
                                    break;
                                }
                                idx++;
                            }
                            
                            if (!flag) {
                                matched = true;
                                break;
                            }
                        }
                        
                        if (!matched) {
                            map.get(n).add(list);
                        }
                    } else {
                        map.put(n, new ArrayList<>());
                        map.get(n).add(list);
                    }
                }
            }
        }
        
        for (int i : map.keySet()) {
            ans += map.get(i).size();
        }
        
        return ans;
    }
    
    private void dfs(int[][] grid, int i, int j, List<int[]> list) {
        if (i < 0 || i == grid.length || j < 0 || j == grid[0].length || grid[i][j] == 0 || visited[i][j]) {
            return;
        }
        
        visited[i][j] = true;
        
        int[] temp = list.get(0);
        temp[0] = Math.min(temp[0], i);
        temp[1] = Math.min(temp[1], j);
        
        list.add(new int[]{i, j});
        
        dfs(grid, i-1, j, list);
        dfs(grid, i, j+1, list);
        dfs(grid, i+1, j, list);
        dfs(grid, i, j-1, list);
    }
}