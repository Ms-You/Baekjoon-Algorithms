import java.util.*;
import java.io.*;
public class Main
{
    static List<Integer>[] graph;  // 이차원 배열 사용 시 메모리 초과
    static int[] seq;  // 방문 순서 저장
    static int cnt;
    private static void dfs(int start){
        seq[start] = cnt;
        for (int i = 0; i < graph[start].size(); i++){
            int val = graph[start].get(i);
            if (seq[val] == 0){
                cnt++;
                dfs(val);
            }
        }
    }
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());  // 정점 개수
		int m = Integer.parseInt(st.nextToken());  // 간선 개수
		int r = Integer.parseInt(st.nextToken());  // 시작 정점
		
		graph = new ArrayList[n+1];
		seq = new int[n+1];
		for (int i = 0; i < n+1; i++)
		    graph[i] = new ArrayList<>();
		    
		for (int i = 0; i < m; i++){
		    st = new StringTokenizer(br.readLine());
		    int u = Integer.parseInt(st.nextToken());
		    int v = Integer.parseInt(st.nextToken());
		    graph[u].add(v);
		    graph[v].add(u);
		}
		
		for (int i = 0; i < graph.length; i++)
		    Collections.sort(graph[i]);  // 오름차순 정렬
		
		cnt = 1;  // 시작 정점 방문
		dfs(r);
		
		
		for (int i = 1; i < seq.length; i++)
		    System.out.println(seq[i]);
		
		br.close();
	}
}
