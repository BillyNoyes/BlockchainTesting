import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;


public class Main {
	
	/*
	 * Hash = Digital Signature
	 * 
	 * Each block will have:
	 * 	List of transactions
	 * 	Previous Hash
	 * 
	 * 	Hash
	 */

	ArrayList<Block> blockchain = new ArrayList<>();
	
	public static void main(String[] args) {
		
		// Changing data within list results in a different digital signature
		// String[] list1 = {"a", "b", "c"};
		// String[] list2 = {"a", "b", "c"};
		
		// Prints out the hashcode (digital signature) of the list
		// System.out.println(Arrays.hashCode(list1));
		// System.out.println(Arrays.hashCode(list2));

		String[] genesisTransactions = {"satoshi sent billy 10 bitcoin", "shola sent 10 bitcoins to billy"};
		Block genesisBlock = new Block(0, genesisTransactions); 
		
		String[] block2Transactions = {"billy sent 10 bitcoin to satoshi", "staoshi sent 10 bitcoin to costa"};
		Block block2 = new Block(genesisBlock.getBlockHash(), block2Transactions);
		
		String[] block3Transactions = {"billy sent 1 bitcoin to my mum"};
		Block block3 = new Block(block2.getBlockHash(), block3Transactions);
		
		System.out.println("Hash of Genesis Block:");
		System.out.println(genesisBlock.getBlockHash());
		
		System.out.println("Hash of Block 2:");
		System.out.println(block2.getBlockHash());
		
		System.out.println("Hash of Block 3:");
		System.out.println(block3.getBlockHash());
	}
	
}
