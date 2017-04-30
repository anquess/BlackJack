package jp.ac.ascsys.blackJack;

public enum Num {
	A{
		@Override
		public String toString(){
			return this.name();
		}
		@Override
		public int getNum(){
			return 11;
		}
		@Override
		public int getNum(int i){
			if(i<11)return 11;
			return 1;
		}
	},N2,N3,N4,N5,N6,N7,N8,N9,N10,
	J{
		@Override
		public String toString(){
			return this.name();
		}
		@Override
		public int getNum(){
			return 10;
		}
		@Override
		public int getNum(int i){
			return 10;
		}
	},Q{
		@Override
		public String toString(){
			return this.name();
		}
		@Override
		public int getNum(){
			return 10;
		}
		@Override
		public int getNum(int i){
			return 10;
		}
	},K{
		@Override
		public String toString(){
			return this.name();
		}
		@Override
		public int getNum(){
			return 10;
		}
		@Override
		public int getNum(int i){
			return 10;
		}
	};
	@Override
	public String toString(){
		return String.valueOf(this.ordinal()+1);
	}
	public int getNum(){
		return this.ordinal()+1;
	}
	public int getNum(int i){
		return this.ordinal()+1;
	}
}
