package ch05_dfs_bfs;

import java.util.ArrayList;

public class dfsExample {
	//깊이 우선 배열
	
	//방문했는지 여부 체크
	public static boolean[] visited = new boolean[9];
	public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
	
	public static void dfs(int x) {
		//방문을 했다면 true값 입력
		visited[x] = true;
		System.out.print(x + " ");
		
		//노드(x)의 값의 size만큼 for문
		for(int i=0;i<graph.get(x).size();i++) {
			//노드(x)와 인접한 행렬의 값을 y에 넣음
			int y = graph.get(x).get(i);
			//만약 그 노드에 방문하지 않았다면
			if(!visited[y]) {
				//방문하기
				dfs(y);
			}
		}
	}
	

	public static void main(String[] args) {
		//그래프 초기화
		for(int i = 0; i<9;i++) {
			graph.add(new ArrayList<Integer>());
		}
		
		
		//노드 값 연결
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
		
		dfs(1);



	}

}
