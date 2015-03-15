import org.jgrapht.VertexFactory;


public class MyVF implements VertexFactory{

	@Override
	public Object createVertex() {
		// TODO Auto-generated method stub
		return new Vertex();
	}

}
