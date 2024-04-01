import java.util.*;

class HuffmanNode {
    int data;
    char c;
    HuffmanNode left, right;// ............. \//-\|

    public HuffmanNode(char c, int data) {
        this.c = c;
        this.data = data;
        left = right = null;
    }
}

class MyComparator implements Comparator<HuffmanNode> {
    public int compare(HuffmanNode x, HuffmanNode y) {
        return x.data - y.data;
    }
}

public class HuffmanCoding {

    public static void printCode(HuffmanNode root, String s) {
        if (root.left == null && root.right == null && Character.isLetter(root.c)) {
            System.out.println(root.c + ":" + s);
            return;
        }
        printCode(root.left, s + "0");
        printCode(root.right, s + "1");
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter the String: ");
        String input = s.nextLine();
        int[] charFreq = new int[256];
        
        for (int i = 0; i < input.length(); i++) {
            charFreq[input.charAt(i)]++;
        }
        
        PriorityQueue<HuffmanNode> pq = new PriorityQueue<HuffmanNode>(input.length(), new MyComparator());

        for (int i = 0; i < 256; i++) {
            if (charFreq[i] > 0) {
                pq.add(new HuffmanNode((char) i, charFreq[i]));
            }
        }
        
        HuffmanNode root = null;
        while (pq.size() > 1) {
            HuffmanNode x = pq.peek();
            pq.poll();
            HuffmanNode y = pq.peek();
            pq.poll();
            HuffmanNode newNode = new HuffmanNode('$', x.data + y.data);
            newNode.left = x;
            newNode.right = y;
            root = newNode;
            pq.add(newNode);
        }
        System.out.println("Huffman Codes are : ");
        printCode(root, "");
    }
}
