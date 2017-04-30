package jp.ac.ascsys.blackJack;

public enum Num {
	A{
		@Override
		public String toString(){
			return this.name();
		}

	},N2,N3,N4,N5,N6,N7,N8,N9,N10,J{
		@Override
		public String toString(){
			return this.name();
		}

	},Q{
		@Override
		public String toString(){
			return this.name();
		}

	},K{
		@Override
		public String toString(){
			return this.name();
		}

	};
	@Override
	public String toString(){
		return this.name().substring(1, this.name().length());
	}
}
