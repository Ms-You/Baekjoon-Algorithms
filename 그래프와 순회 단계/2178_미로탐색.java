import java.util.*;
import java.io.*;
public class Main
{
    static int[][] graph;
    static int[][] visited;
    static int[] x = {1, 0, -1, 0};
    static int[] y = {0, 1, 0, -1};
    
    private static void bfs(){
        visited[0][0] = 1;
        
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0});
        
        while(!queue.isEmpty()){
            int[] val = queue.poll();
            int now_x = val[0];
            int now_y = val[1];
            
            for (int i = 0; i < 4; i++){
                int move_x = now_x + x[i];
                int move_y = now_y + y[i];
                
                if (move_x >= 0 && move_x < graph.length && move_y >= 0 && move_y < graph[0].length){
                    if (visited[move_x][move_y] == 0 && graph[move_x][move_y] == 1){
                        visited[move_x][move_y] = visited[now_x][now_y] + 1;
                        queue.add(new int[]{move_x, move_y});
                    }
                }
            }
        }
    }
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		graph = new int[n][m];
		visited = new int[n][m];
		
		for (int i = 0; i < n; i++){
		    String s = br.readLine();
		    for (int j = 0; j < m; j++){
		        graph[i][j] = s.charAt(j) - '0';
		    }
		}
		
		bfs();
		
		System.out.println(visited[n-1][m-1]);
		
		br.close();
	}
}
