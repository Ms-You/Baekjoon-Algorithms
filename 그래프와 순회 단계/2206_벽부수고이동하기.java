import java.util.*;
import java.io.*;
public class Main
{
    static int[][] graph;
    static boolean[][][] visited;
    static int[][] cnt;
    static int[] loc_x = {1, 0, -1, 0};
    static int[] loc_y = {0, 1, 0, -1};
    
    private static int bfs(int n, int m){
        cnt[0][0] = 1;
        
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0, 0});  // x좌표, y좌표, 부쉈는지 여부
        
        while(!queue.isEmpty()){
            int[] now = queue.poll();
            int now_x = now[0];
            int now_y = now[1];
            
            for (int i = 0; i < 4; i++){
                int x = now_x + loc_x[i];
                int y = now_y + loc_y[i];
                int isCrash = now[2];
                
                if (x < 0 || x >= n || y < 0 || y >= m) continue;
                
                if (graph[x][y] == 1){
                    if (isCrash == 0 && !visited[1][x][y]){
                        visited[isCrash][x][y] = true;
                        cnt[x][y] = cnt[now_x][now_y] + 1;
                        queue.add(new int[]{x, y, 1});
                    }
                } else {
                    if (!visited[isCrash][x][y]){
                        visited[isCrash][x][y] = true;
                        cnt[x][y] = cnt[now_x][now_y] + 1;
                        queue.add(new int[]{x, y, isCrash});
                    }
                }
                
                if (x == n-1 && y == m-1)
                    return cnt[n-1][m-1];
            }
        }
        
        return -1;
    }
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		graph = new int[n][m];
		visited = new boolean[2][n][m];
		cnt = new int[n][m];
		
		for (int i = 0; i < n; i++){
		    String s = br.readLine();
		    for (int j = 0; j < m; j++){
		        graph[i][j] = s.charAt(j) - '0';
		    }
		}
		
		if (n-1 == 0 && m-1 == 0) System.out.println(1);
		else System.out.println(bfs(n, m));
		
		br.close();
	}
}
