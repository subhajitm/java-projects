import org.jgraph.graph.Edge;
import org.jgrapht.*;
import org.jgrapht.generate.*;

import java.util.*;


public class Main {

	public static void main(String[] args) {
		
		RandomGraphGenerator rg = new RandomGraphGenerator(10, 30);
		
		RandomGraph<Vertex, Edge> G = new RandomGraph<Vertex, Edge>();
		MyVF mvg = new MyVF();
		HashMap<String,Vertex> hmap = new HashMap<String,Vertex>();
		
		rg.generateGraph(G, mvg, hmap);

	}

}
