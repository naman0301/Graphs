
import java.util.*;
class Graph1{
	class Edge{
		String Source,Destination;
		public Edge(String Source,String Destination){
			this.Source=Source; this.Destination=Destination;
		}
		@Override
		public String toString(){
			return   "\n" +Source +"=>"+Destination;
		}
	}
	
	List<Edge> G[];
	public Graph1(int n){
		G=new LinkedList[n];
		for(int i=0;i<G.length;i++)
			G[i]=new LinkedList<Edge>();
	}
	boolean isConnected(String Source,String Destination){
		for(Edge source: G[1])
			if(source.Destination==Destination) 
				return true;
		return false;
	}

	void addEdge(String Source,String Destination){
		for(int i=0;i<G.length;i++) {
			G[i].add(0,new Edge(Source,Destination));
		}
	}
	@Override
	public String toString(){
		String result="";
		for(int i=0;i<G.length;i++)
			result=G[i]+"\n";
		return result;
	}
}
public class Graph {
	public static void main(String[] args) {
		Graph1 g=new Graph1(7);
		g.addEdge("Website A", "Website B");
		g.addEdge("Website A", "Website C");
		g.addEdge("Website B", "Website C");
		g.addEdge("Website B", "Website E");
		g.addEdge("Website C", "Website B");
		g.addEdge("Website C", "Website F");
		g.addEdge("Website E", "Website B");
		
		System.out.println(g);
		System.out.println(g.isConnected("Website A","Website C"));
	}
}