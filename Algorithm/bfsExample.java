package ch05_dfs_bfs;

import java.util.*;

public class bfsExample {
	//너비 우선 배열
	
	//방문했는지 여부 판단
	public static boolean[] visited = new boolean[9];
	public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
	
	public static void bfs(int start) {
		//Queue선언
		Queue<Integer> q = new LinkedList<>();
		//시작값넣기
		q.offer(start);
		//true변경
		visited[start] = true;
		
		//Queue가 비어있지 않으면
		while(!q.isEmpty()) {
			//poll한 값을 x에 넣어서 출력
			int x = q.poll();
			System.out.print(x + " ");
			
			//graph의 x노드(1)의 값 만큼 for문
			for(int i=0;i<graph.get(x).size();i++) {
				//x노드와 인접한 노드의 값을 y에 넣음
				int y = graph.get(x).get(i);
				//만약 y에 방문하지 않았다면
				if(!visited[y]) {
					//Queue에 y를 넣고
					q.offer(y);
					//방문한것 true
					visited[y] = true;
				}
			}
		}
		
		
	}

	public static void main(String[] args) {
		for(int i = 0; i<9;i++) {
			graph.add(new ArrayList<Integer>());
		}
		
		graph.get(1).add(2);
		graph.get(1).add(3);
		graph.get(1).add(8);
		
		graph.get(2).add(1);
		graph.get(2).add(7);
		
		graph.get(3).add(1);
		graph.get(3).add(4);
		graph.get(3).add(5);

		graph.get(4).add(3);
		graph.get(4).add(5);
		
		graph.get(5).add(3);
		graph.get(5).add(4);
		
		graph.get(6).add(7);
		
		graph.get(7).add(2);
		graph.get(7).add(8);
		
		graph.get(8).add(1);
		graph.get(8).add(7);
		
		bfs(1);

	}

}
