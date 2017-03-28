package l2_006;

//Very import one problem.
// TOOD New Simpler Version
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	static class Node {
		public int num;

		Node leftChild;
		Node rightChild;
	}

	static int[] postOrder;
	static int[] inOrder;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		postOrder = new int[n];
		inOrder = new int[n];

		for (int i = 0; i < n; i++) {
			postOrder[i] = s.nextInt();
		}

		for (int i = 0; i < n; i++) {
			inOrder[i] = s.nextInt();
		}

		s.close();

		Node root = getRoot(0, postOrder.length - 1, 0, inOrder.length - 1);
		// System.out.println(root.leftChild.rightChild.num + " " +
		// root.rightChild.num);

		levelTraverse(root);
	}

	public static Node getRoot(int postOrderStart, int postOrderEnd, int inOrderStart, int inOrderEnd) {
		// System.out.println("" + postOrderStart + "," + postOrderEnd + " " +
		// inOrderStart + "," + inOrderEnd);

		Node root = new Node();

		int rootNum = postOrder[postOrderEnd];
		int i = inOrderStart;
		while (inOrder[i] != rootNum) {
			i++;
		}

		if (i != inOrderStart)
			root.leftChild = getRoot(postOrderStart, postOrderStart + (i - inOrderStart) - 1, inOrderStart, i - 1);
		if (i != inOrderEnd)
			root.rightChild = getRoot(postOrderStart + (i - inOrderStart), postOrderEnd - 1, i + 1, inOrderEnd);

		root.num = rootNum;

		return root;
	}

	public static void levelTraverse(Node root) {
		Queue<Node> queue = new LinkedList<>();

		queue.offer(root);
		int i = 0;
		while (!queue.isEmpty()) {
			Node node = queue.poll();
			i++;
			System.out.print(node.num + ((i == inOrder.length) ? "" : " "));

			if (node.leftChild != null)
				queue.offer(node.leftChild);
			if (node.rightChild != null)
				queue.offer(
						node.rightChild);
		}
	}
}
