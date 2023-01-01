import java.util.*;
import java.io.*;
public class Main
{
    static int[] graph = new int[101];
    static int[] visited = new int[101];
    static int[] dice = {1, 2, 3, 4, 5, 6};
    
    private static void bfs(int start){
        visited[start] = 0;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        
        while(!queue.isEmpty()){
            int now = queue.poll();
            if (now == 100) return;
            
            for (int i = 0; i < 6; i++){
                int val = now + dice[i];
                
                if (val >= 0 && val < 101){
                    if (visited[val] == 0 && graph[val] == 0){
                        visited[val] = visited[now] + 1;
                        queue.add(val);
                    } else if (visited[graph[val]] == 0 && graph[val] != 0) {
                        visited[graph[val]] = visited[now] + 1;
                        queue.add(graph[val]);
                    }
                }
            }
        }
    }
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int ladder = Integer.parseInt(st.nextToken());
		int snake = Integer.parseInt(st.nextToken());
		
		for (int i = 0; i < ladder + snake; i++){
		    st = new StringTokenizer(br.readLine());
		    int u = Integer.parseInt(st.nextToken());
		    int v = Integer.parseInt(st.nextToken());
		    graph[u] = v;
		}
		
		bfs(1);
		System.out.println(visited[100]);
		
		br.close();
	}
}
