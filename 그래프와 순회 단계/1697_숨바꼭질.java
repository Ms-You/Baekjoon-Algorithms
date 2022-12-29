import java.util.*;
import java.io.*;
public class Main
{
    static int[] visited = new int[100001];
    private static int bfs(int start, int end){
        visited[start] = 0;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        
        while(!queue.isEmpty()){
            int idx = queue.poll();
            if (idx == end) 
                return visited[idx];
                
            if (idx-1 >= 0 && visited[idx-1] == 0){
                visited[idx-1] = visited[idx] + 1;
                queue.add(idx-1);
            }
            
            if (idx+1 <= 100000 && visited[idx+1] == 0){
                visited[idx+1] = visited[idx] + 1;
                queue.add(idx+1);
            }
            
            if (idx*2 <= 100000 && visited[idx*2] == 0){
                visited[idx*2] = visited[idx] + 1;
                queue.add(idx*2);
            }
        }
        
        return -1;
    }
    
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int res = bfs(n, k);
		System.out.println(res);
		
		br.close();
	}
}
