import java.util.*;
import java.io.*;
public class Main
{
    static int[][] graph;
    static boolean[][] visited;
    static int cnt;
    static List<Integer> result = new ArrayList<>();
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
                        cnt++;
                        queue.add(new int[]{x, y});
                    }
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
		    for (int j = 0; j < n; j++){
		        graph[i][j] = s.charAt(j) - '0';
		    }
		}
		
		for (int i = 0; i < n; i++){
		    for (int j = 0; j < n; j++){
		        if (!visited[i][j] && graph[i][j] == 1){
		            cnt = 1;
		            bfs(i, j);
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
