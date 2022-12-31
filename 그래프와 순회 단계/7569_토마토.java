import java.util.*;
import java.io.*;
public class Main
{
    static int[][][] graph;
    static Queue<int[]> queue = new LinkedList<>();
    static int[] loc_x = {1, 0, 0, -1, 0, 0};
    static int[] loc_y = {0, 1, 0, 0, -1, 0};
    static int[] loc_z = {0, 0, 1, 0, 0, -1};
    
    private static int bfs(int h, int n, int m){
        while(!queue.isEmpty()){
            int[] val = queue.poll();
            int now_z = val[0];
            int now_x = val[1];
            int now_y = val[2];
            
            for (int i = 0; i < 6; i++){
                int z = now_z + loc_z[i];
                int x = now_x + loc_x[i];
                int y = now_y + loc_y[i];
                
                if (x >= 0 && x < n && y >= 0 && y < m && z >= 0 && z < h){
                    if (graph[z][x][y] == 0){
                        graph[z][x][y] = graph[now_z][now_x][now_y] + 1;
                        queue.add(new int[]{z, x, y});
                    }
                }
            }
        }
        
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < h; i++){
            for (int j = 0; j < n; j++){
                for (int k = 0; k < m; k++){
                    if (graph[i][j][k] == 0) return -1;
                    else if (max < graph[i][j][k]) max = graph[i][j][k];
                }
            }
        }
        
        return max - 1;
    }
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		
		graph = new int[h][n][m];
		for (int i = 0; i < h; i++){
		    for (int j = 0; j < n; j++){
		        st = new StringTokenizer(br.readLine());
		        for (int k = 0; k < m; k++){
		            graph[i][j][k] = Integer.parseInt(st.nextToken());
		            if (graph[i][j][k] == 1)
		                queue.add(new int[]{i, j, k});
		        }
		    }
		}
		
		int res = bfs(h, n, m);
		System.out.println(res);
		
		br.close();
	}
}
