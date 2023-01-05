import java.util.*;
import java.io.*;
public class Main
{
    static StringBuilder sb = new StringBuilder();
    static int[][] graph;
    static boolean[][] visited;
    static int cnt;
    static int[] loc_x = {1, 0, -1, 0};
    static int[] loc_y = {0, 1, 0, -1};
    
    private static void bfs(int idx_x, int idx_y){
        visited[idx_x][idx_y] = true;
        
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{idx_x, idx_y});
        
        while(!queue.isEmpty()){
            int[] now = queue.poll();
            int now_x = now[0];
            int now_y = now[1];
            
            for (int i = 0; i < 4; i++){
                int x = now_x + loc_x[i];
                int y = now_y + loc_y[i];
                
                if (x >= 0 && x < graph.length && y >= 0 && y < graph[0].length){
                    if (!visited[x][y] && graph[x][y] == 1){
                        visited[x][y] = true;
                        queue.add(new int[]{x, y});
                    }
                }
            }
        }
        
    }
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++){
		    st = new StringTokenizer(br.readLine());
		    int m = Integer.parseInt(st.nextToken());
		    int n = Integer.parseInt(st.nextToken());
		    int k = Integer.parseInt(st.nextToken());
		    
		    graph = new int[m][n];
		    visited = new boolean[m][n];
		    cnt = 0;
		    
		    for (int j = 0; j < k; j++){
		        st = new StringTokenizer(br.readLine());
		        int u = Integer.parseInt(st.nextToken());
		        int v = Integer.parseInt(st.nextToken());
		        graph[u][v] = 1;
		    }
		    
		    for (int j = 0; j < graph.length; j++){
		        for (int l = 0; l < graph[0].length; l++){
		            if (!visited[j][l] && graph[j][l] == 1){
		                bfs(j, l);
		                cnt++;
		            }
		        }
		    }
		    
		    sb.append(cnt).append('\n');
		}
		
	    System.out.println(sb.toString());
		
		br.close();
	}
}
