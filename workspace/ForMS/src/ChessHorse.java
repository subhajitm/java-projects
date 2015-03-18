
public class ChessHorse {

	void find(int x, int y, Coordiante[][] t){
		t[x][y].setFlag(true);
		
		if(x-2>=0 && y+1 <8 && t[x-2][y+1].isFlag() == false){
			t[x-2][y+1].setDad(t[x][y]);
			find(x-2, y+1, t);
		}
		if(x-2>=0 && y-1>=0 && t[x-2][y-1].isFlag() == false){
			t[x-2][y-1].setDad(t[x][y]);
			find(x-2, y-1, t);
		}
		if(x-1>=0 && y+2<8 && t[x-1][y+2].isFlag() == false){
			t[x-1][y+2].setDad(t[x][y]);
			find(x-1, y+2, t);
		}
		if(x-1>=0 && y-2>=0 && t[x-1][y-2].isFlag() == false){
			t[x-1][y-2].setDad(t[x][y]);
			find(x-1, y-2, t);
		}
		if(x+1<8 && y+2<8 && t[x+1][y+2].isFlag() == false){
			t[x+1][y+2].setDad(t[x][y]);
			find(x+1, y+2, t);
		}
		if(x+1<8 && y-2>=0 && t[x+1][y-2].isFlag() == false){
			t[x+1][y-2].setDad(t[x][y]);
			find(x+1, y-2, t);
		}
		if(x+2<8 && y+1<8 && t[x+2][y+1].isFlag() == false){
			t[x+2][y+1].setDad(t[x][y]);
			find(x+2, y+1, t);
		}
		if(x+2<8 && y-1>=0 && t[x+2][y-1].isFlag() == false){
			t[x+2][y-1].setDad(t[x][y]);
			find(x+2, y-1, t);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChessHorse ch = new ChessHorse();
		Coordiante[][] table = new Coordiante[8][8];
		for (int i=0;i<8;i++){
			for(int j=0;j<8;j++){
				table[i][j] = new Coordiante(i,j, false, null);
			}
		}
		
		int x = 5;
		int y = 0;
		//table[2][3].setFlag(true);
		ch.find(x, y, table);
		System.out.println(table.toString());
		for (int i=0;i<8;i++){
			System.out.println();
			for(int j=0;j<8;j++){
				if(table[i][j].getDad() != null)
					System.out.print(" {"+table[i][j].getDad().getX()+","+table[i][j].getDad().getY()+"}");
				else
					System.out.print(" {NULL}");
			}
		}
		

	}

}
