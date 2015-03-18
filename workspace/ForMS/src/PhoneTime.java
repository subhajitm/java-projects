
public class PhoneTime {

	void maxcalls(int[] s, int[] e, int[] r, int n){
		int pc,ps,pe,cc,cs,ce;
		
		// initialize
		pc = -1; cc = 0; cs = 0; ce = 0; ps = 0; pe = 0;
		for(int i=0; i<n;i++){
			if(s[i]>=ce){
				if (cc > pc) {
					ps = cs;
					pe = ce;
					pc = cc;
				}
				cs = s[i];
				ce = e[i];
				cc = 0;
			} else if (s[i] > cs) {
				cs = s[i];
			} else if (e[i] < ce){
				ce = e[i];				
			}
			cc++;			
		}
		if (cc > pc) {
			ps = cs;
			pe = ce;
			pc = cc;
		}
		r[0] = ps;
		r[1] = pe;
		r[2] = pc;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] s = {1,1,2,2,4,4};
		int[] e = {3,5,4,5,6,5};
		int[] r = new int[3];
		int n = s.length;
		PhoneTime pt = new PhoneTime();
		pt.maxcalls(s, e, r, n);
		System.out.println("start: "+r[0]+" end: "+r[1]+" count: "+r[2]);
		
	}

}
