import java.util.Collection;
import java.util.*;

import org.jgrapht.EdgeFactory;
import org.jgrapht.UndirectedGraph;


public class RandomGraph<V,E> implements UndirectedGraph<V,E>{

	Set<V> Vx;
	Set<E> Ed;
	
	public RandomGraph(){
		Vx = new HashSet();
		Ed = new HashSet();
	}
	@Override
	public Object addEdge(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		Edge e = new Edge(arg0, arg1);
		Ed.add((E) e);
		return e;
	}

	@Override
	public boolean addEdge(Object arg0, Object arg1, Object arg2) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addVertex(Object arg0) {
		// TODO Auto-generated method stub
		Vx.add((V) arg0);
		return false;
	}

	@Override
	public boolean containsEdge(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsEdge(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsVertex(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Set edgeSet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set edgesOf(Object arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set getAllEdges(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getEdge(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EdgeFactory getEdgeFactory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getEdgeSource(Object arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getEdgeTarget(Object arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double getEdgeWeight(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean removeAllEdges(Collection arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Set removeAllEdges(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeAllVertices(Collection arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeEdge(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object removeEdge(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeVertex(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Set vertexSet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int degreeOf(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

}
