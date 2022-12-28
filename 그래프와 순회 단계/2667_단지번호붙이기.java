import java.util.*;
import java.io.*;
public class Main
{
    static int[][] graph;
    static boolean[][] visited;
    static List<Integer> result = new ArrayList<>();
    static int cnt;
    static int[] x = {1, 0, -1, 0};
    static int[] y = {0, 1, 0, -1};
    private static void dfs(int now_x, int now_y){
        visited[now_x][now_y] = true;
        
        for (int i = 0; i < 4; i++){
            int move_x = now_x + x[i];
            int move_y = now_y + y[i];
            if (move_x >= 0 && move_x < graph.length && move_y >= 0 && move_y < graph.length){
                if (!visited[move_x][move_y] && graph[move_x][move_y] == 1){
                    visited[move_x][move_y] = true;
                    cnt++;
                    dfs(move_x, move_y);
                }
            }
        }
    } 
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		graph = new int[n][n];
		visited = new boolean[n][n];
		
		for (int i = 0; i < n; i++){
		    String s = br.readLine();
		    for (int j = 0; j < s.length(); j++){
		        graph[i][j] = s.charAt(j) - '0';
		    }
		}
		
		for (int i = 0; i < n; i++){
		    for (int j = 0; j < n; j++){
		        if (!visited[i][j] && graph[i][j] == 1){
		            cnt = 1;
		            dfs(i, j);
		            result.add(cnt);
		        }
		    }
		}
		
		System.out.println(result.size());
		Collections.sort(result);
		for (int r : result)
		    System.out.println(r);
		
		br.close();
	}
}
