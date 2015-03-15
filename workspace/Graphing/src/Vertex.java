import java.util.Vector;


public class Vertex{

	int id;
	Vector<Edge> edgeList;
	
	public Vertex() {
		
	}
	
	public Vector<Edge> getEdgeList(){
		return edgeList;
	}
}