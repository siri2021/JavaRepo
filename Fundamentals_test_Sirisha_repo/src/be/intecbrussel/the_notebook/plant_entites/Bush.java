package be.intecbrussel.the_notebook.plant_entites;

public class Bush  extends Plant {

	

		private String fruit;
		private LeafType leafType;

		public Bush(String name) {
			super(name);

		}

		public Bush(String name, double height,LeafType leafType) {
			super(name, height);
			this.leafType=leafType;

		}
		public Bush(String name, double height,LeafType leafType,String fruit) {
			super(name, height);
			this.leafType=leafType;
			this.fruit=fruit;

		}

		public String getFruit() {
			return fruit;
		}

		public LeafType getLeafType() {
			return leafType;
		}

		public void setFruit(String fruit) {
			this.fruit = fruit;
		}

		public void setLeafType(LeafType leafType) {
			this.leafType = leafType;
		}

		@Override
		public String toString() {
			return "Bush[.]";
		}

	}


