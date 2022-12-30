import java.util.*;
import java.io.*;
public class Main
{
    static int[][] visited;
    static int[] loc_x = {2, 2, -2, -2, 1, 1, -1, -1};
    static int[] loc_y = {1, -1, 1, -1, 2, -2, 2, -2};
    private static int bfs(int start_x, int start_y, int goal_x, int goal_y){
        visited[start_x][start_y] = 0;
        if (start_x == goal_x && start_y == goal_y) return 0;
        
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{start_x, start_y});
        
        while(!queue.isEmpty()){
            int[] val = queue.poll();
            int now_x = val[0];
            int now_y = val[1];
            
            for (int i = 0; i < 8; i++){
                int x = now_x + loc_x[i];
                int y = now_y + loc_y[i];
                
                if (x >= 0 && x < visited.length && y >= 0 && y < visited[0].length){
                    if (visited[x][y] == 0){
                        visited[x][y] = visited[now_x][now_y] + 1;
                        queue.add(new int[]{x, y});
                    }
                    
                    if (x == goal_x && y == goal_y){
                        return visited[x][y];
                    }
                }
            }
        }
        
        return -1;
    }
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++){
		    int l = Integer.parseInt(br.readLine());
		    visited = new int[l][l];
		    
		    st = new StringTokenizer(br.readLine());
		    int start_x = Integer.parseInt(st.nextToken());
		    int start_y = Integer.parseInt(st.nextToken());
		    
		    st = new StringTokenizer(br.readLine());
		    int goal_x = Integer.parseInt(st.nextToken());
		    int goal_y = Integer.parseInt(st.nextToken());
		    
		    int res = bfs(start_x, start_y, goal_x, goal_y);
		    System.out.println(res);
		}
		
		br.close();
	}
}
