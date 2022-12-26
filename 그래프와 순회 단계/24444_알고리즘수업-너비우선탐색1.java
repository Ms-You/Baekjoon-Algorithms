import java.util.*;
import java.io.*;
public class Main
{
    static List<List<Integer>> graph = new ArrayList<>();
    static int[] seq;
    static int cnt = 1;
    private static void bfs(int start){
        seq[start] = cnt;
        
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        
        while(!queue.isEmpty()){
            int deq = queue.poll();
            for (int i = 0; i < graph.get(deq).size(); i++){
                int val = graph.get(deq).get(i);
                if (seq[val] == 0){
                    queue.add(val);
                    seq[val] = ++cnt;
                }
            }
        }
    }
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int r = Integer.parseInt(st.nextToken());
		
		seq = new int[n+1];
		for (int i = 0; i < n+1; i++)
		    graph.add(new ArrayList<>());
		
		for (int i = 0; i < m; i++){
		    st = new StringTokenizer(br.readLine());
		    int u = Integer.parseInt(st.nextToken());
		    int v = Integer.parseInt(st.nextToken());
		    graph.get(u).add(v);
		    graph.get(v).add(u);
		}
		
		for (int i = 0; i < graph.size(); i++)
		    Collections.sort(graph.get(i));
		
		bfs(r);
		
		for (int i = 1; i < seq.length; i++)
		    System.out.println(seq[i]);
		
		br.close();
	}
}
