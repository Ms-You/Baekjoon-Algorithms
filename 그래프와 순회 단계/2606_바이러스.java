import java.util.*;
import java.io.*;
public class Main
{
    static List<List<Integer>> graph = new ArrayList<>();
    static boolean[] visited;
    static int cnt = 0;
    private static void dfs(int start){
        visited[start] = true;
        for (int i = 0; i < graph.get(start).size(); i++){
            int val = graph.get(start).get(i);
            if (!visited[val]){
                visited[val] = true;
                cnt++;
                dfs(val);
            }
        }
    }
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine()); // 정점 수
		int m = Integer.parseInt(br.readLine()); // 간선 수
		
		visited = new boolean[n+1];
		for (int i = 0; i < n+1; i++)
		    graph.add(new ArrayList<>());
		
		for(int i = 0; i < m; i++){
		    st = new StringTokenizer(br.readLine());
		    int u = Integer.parseInt(st.nextToken());
		    int v = Integer.parseInt(st.nextToken());
		    graph.get(u).add(v);
		    graph.get(v).add(u);
		}
	    
	    dfs(1);
	    
	    System.out.println(cnt);
		
		br.close();
	}
}
