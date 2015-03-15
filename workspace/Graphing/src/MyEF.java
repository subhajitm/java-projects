import org.jgrapht.EdgeFactory;


public class MyEF implements EdgeFactory{

	@Override
	public Object createEdge(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		return new Edge(arg0, arg1);
	}

}
