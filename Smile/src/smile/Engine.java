package smile;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Vector;

import smile.analysis.DepthFirstAdapter;
import smile.node.ADecStmt;
import smile.node.AIfStmt;
import smile.node.AIncStmt;
import smile.node.AInputcharStmt;
import smile.node.ANextindexStmt;
import smile.node.APrevindexStmt;
import smile.node.APrintStmt;
import smile.node.APrintcharStmt;
import smile.node.AStmtlist;
import smile.node.AWhileStmt;



public class Engine extends DepthFirstAdapter {
	Vector<Integer> env = new Vector<Integer>();
	int index = 0;
	
	public Engine() {
		super();
		env.add(0, 0);
	}
	
	
	public void caseAStmtlist(AStmtlist node) {
		node.getStmt().apply(this);
		node.getStmtlist().apply(this);
	}
	
	public void caseAIncStmt(AIncStmt node) {
		env.set(index, env.get(index)+1);
	}
	
	public void caseADecStmt(ADecStmt node) {
		env.set(index, env.get(index)-1);
	}

	public void caseAPrevindexStmt(APrevindexStmt node) {
		if (index > 0)
			index--;
	}
	
	public void caseANextindexStmt(ANextindexStmt node) {
		index++;
		if (index >= env.size()) env.add(0);
	}
	
	public void caseAPrintStmt(APrintStmt node) {
		System.out.println(env);
	}
	
	public void caseAWhileStmt(AWhileStmt node) {
		//System.out.println(index);
		while (env.get(index) != 0) {	
			node.getStmtlist().apply(this);
		}
	}	
	
	public void caseAPrintcharStmt(APrintcharStmt node) {
		int c = env.get(index);
		System.out.print((char)c);
	}
	
	public void caseAIfStmt(AIfStmt node) {
		if (env.get(index) == 0) {
			index = 0;
			node.getStmtlist().apply(this);
		}
	}
	
	/** Input di un numero da tastiera
	 * 
	 */
	public void caseAInputcharStmt(AInputcharStmt node) {
		
		try {
		
			BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
			int input = Integer.parseInt(r.readLine());
		
			env.set(index, input);
		}
		catch (Exception e) {/*se salta qualcosa no problem... no input*/}
	}
	
}
