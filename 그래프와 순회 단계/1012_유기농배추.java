import java.util.*;
import java.io.*;
public class Main
{
    static StringBuilder sb = new StringBuilder();
    static int[][] graph;
    static boolean[][] visited;
    static int cnt;
    static int[] x = {1, 0, -1, 0};
    static int[] y = {0, 1, 0, -1};
    private static void dfs(int now_x, int now_y){
        visited[now_x][now_y] = true;
        
        for (int i = 0; i < 4; i++){
            int move_x = now_x + x[i];
            int move_y = now_y + y[i];
            if (move_x >= 0 && move_x < graph.length && move_y >= 0 && move_y < graph[0].length){
                if (!visited[move_x][move_y] && graph[move_x][move_y] == 1){
                    visited[move_x][move_y] = true;
                    dfs(move_x, move_y);
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
		    int m = Integer.parseInt(st.nextToken());   // 가로 길이
		    int n = Integer.parseInt(st.nextToken());   // 세로 길이
		    int k = Integer.parseInt(st.nextToken());   // 배추 개수
		    graph = new int[m][n];
		    visited = new boolean[m][n];
		    
		    for (int j = 0; j < k; j++){
		        st = new StringTokenizer(br.readLine());
		        int x_loc = Integer.parseInt(st.nextToken());
		        int y_loc = Integer.parseInt(st.nextToken());
		        graph[x_loc][y_loc] = 1;
		    }
		    
		    for (int j = 0; j < graph.length; j++){
		        for (int l = 0; l < graph[0].length; l++){
		            if (!visited[j][l] && graph[j][l] == 1){
		                dfs(j, l);
		                cnt++;
		            }
		        }
		    }
		    
		    sb.append(cnt).append('\n');
		    cnt = 0;
		}
		
	    System.out.println(sb.toString());
		
		br.close();
	}
}
