import java.util.*;
import java.io.*;
public class Main
{
    static StringBuilder sb = new StringBuilder();
    static List<List<Integer>> graph = new ArrayList<>();
    static boolean[] visited;
    private static void dfs(int start){
        visited[start] = true;
        sb.append(start).append(' ');
        for (int i = 0; i < graph.get(start).size(); i++){
            int val = graph.get(start).get(i);
            if (!visited[val]){
                dfs(val);
            }
        }
    }
    
    private static void bfs(int start){
        visited[start] = true;
        sb.append(start).append(' ');
        
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        
        while(!queue.isEmpty()){
            int now = queue.poll();
            for (int i = 0; i < graph.get(now).size(); i++){
                int val = graph.get(now).get(i);
                if (!visited[val]){
                    queue.add(val);
                    visited[val] = true;
                    sb.append(val).append(' ');
                }
            }
        }
    }
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());   // 정점 개수
		int m = Integer.parseInt(st.nextToken());   // 간선 개수
		int r = Integer.parseInt(st.nextToken());   // 시작 정점
		
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
		
		for (int i = 0; i < graph.size(); i++)
		    Collections.sort(graph.get(i));
	    
	    dfs(r);
	    System.out.println(sb.toString());
	    sb.setLength(0);
	    
	    visited = new boolean[n+1];
	    bfs(r);
	    System.out.println(sb.toString());
		
		br.close();
	}
}
