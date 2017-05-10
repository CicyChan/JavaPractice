package tutorial.object.oriented;

public class DataStructure {
	private final static int SIZE = 15;
	private int[] arrayOfInt = new int[SIZE];

	public DataStructure() {
		for (int i = 0; i < SIZE; i++) {
			arrayOfInt[i] = i;
		}
	}

	public void printEvent() {
		DataStructureIterator iterator = this.new EventIterator();

		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");

		}
		System.out.println();
	}

	interface DataStructureIterator extends java.util.Iterator<Integer> {
	};

	private class EventIterator implements DataStructureIterator {
		private int nextIndex = 0;

		public boolean hasNext() {
			return (nextIndex <= SIZE - 1);
		}

		public Integer next() {
			Integer retValue = Integer.valueOf(arrayOfInt[nextIndex]);

			// get the next even element
			nextIndex += 2;
			return retValue;
		}
	}

	public static void main(String[] args) {
		DataStructure ds = new DataStructure();
		ds.printEvent();
	}
}
