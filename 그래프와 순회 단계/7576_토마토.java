import java.util.*;
import java.io.*;
public class Main
{
    static int[][] graph;
    static int[] loc_x = {1, 0, -1, 0};
    static int[] loc_y = {0, 1, 0, -1};
    static Queue<int[]> queue = new LinkedList<>();
    
    private static int bfs(int n, int m){
        while(!queue.isEmpty()){
            int[] val = queue.poll();
            int now_x = val[0];
            int now_y = val[1];
            
            for (int i = 0; i < 4; i++){
                int x = now_x + loc_x[i];
                int y = now_y + loc_y[i];
                
                if (x >= 0 && x < n && y >= 0 && y < m){
                    if (graph[x][y] == 0){
                        graph[x][y] = graph[now_x][now_y] + 1;
                        queue.add(new int[]{x, y});
                    }
                }
            }
        }
        
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                if (graph[i][j] == 0) return -1;
                else if (max < graph[i][j]) max = graph[i][j];
            }
        }
        
        return max-1;
    }
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		
		graph = new int[n][m];
		for (int i = 0; i < n; i++){
		    st = new StringTokenizer(br.readLine());
		    for (int j = 0; j < m; j++){
		        graph[i][j] = Integer.parseInt(st.nextToken());
		        if (graph[i][j] == 1)
		            queue.add(new int[]{i, j});
		    }
		}
		
		int res = bfs(n, m);
		System.out.println(res);
		
		br.close();
	}
}
