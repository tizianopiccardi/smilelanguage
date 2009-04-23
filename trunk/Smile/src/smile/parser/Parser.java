/* This file was generated by SableCC (http://www.sablecc.org/). */

package smile.parser;

import smile.lexer.*;
import smile.node.*;
import smile.analysis.*;
import java.util.*;

import java.io.DataInputStream;
import java.io.BufferedInputStream;
import java.io.IOException;

@SuppressWarnings("nls")
public class Parser
{
    public final Analysis ignoredTokens = new AnalysisAdapter();

    protected ArrayList nodeList;

    private final Lexer lexer;
    private final ListIterator stack = new LinkedList().listIterator();
    private int last_pos;
    private int last_line;
    private Token last_token;
    private final TokenIndex converter = new TokenIndex();
    private final int[] action = new int[2];

    private final static int SHIFT = 0;
    private final static int REDUCE = 1;
    private final static int ACCEPT = 2;
    private final static int ERROR = 3;

    public Parser(@SuppressWarnings("hiding") Lexer lexer)
    {
        this.lexer = lexer;
    }

    protected void filter() throws ParserException, LexerException, IOException
    {
        // Empty body
    }

    private void push(int numstate, ArrayList listNode, boolean hidden) throws ParserException, LexerException, IOException
    {
        this.nodeList = listNode;

        if(!hidden)
        {
            filter();
        }

        if(!this.stack.hasNext())
        {
            this.stack.add(new State(numstate, this.nodeList));
            return;
        }

        State s = (State) this.stack.next();
        s.state = numstate;
        s.nodes = this.nodeList;
    }

    private int goTo(int index)
    {
        int state = state();
        int low = 1;
        int high = gotoTable[index].length - 1;
        int value = gotoTable[index][0][1];

        while(low <= high)
        {
            int middle = (low + high) / 2;

            if(state < gotoTable[index][middle][0])
            {
                high = middle - 1;
            }
            else if(state > gotoTable[index][middle][0])
            {
                low = middle + 1;
            }
            else
            {
                value = gotoTable[index][middle][1];
                break;
            }
        }

        return value;
    }

    private int state()
    {
        State s = (State) this.stack.previous();
        this.stack.next();
        return s.state;
    }

    private ArrayList pop()
    {
        return ((State) this.stack.previous()).nodes;
    }

    private int index(Switchable token)
    {
        this.converter.index = -1;
        token.apply(this.converter);
        return this.converter.index;
    }

    @SuppressWarnings("unchecked")
    public Start parse() throws ParserException, LexerException, IOException
    {
        push(0, null, true);
        List<Node> ign = null;
        while(true)
        {
            while(index(this.lexer.peek()) == -1)
            {
                if(ign == null)
                {
                    ign = new LinkedList<Node>();
                }

                ign.add(this.lexer.next());
            }

            if(ign != null)
            {
                this.ignoredTokens.setIn(this.lexer.peek(), ign);
                ign = null;
            }

            this.last_pos = this.lexer.peek().getPos();
            this.last_line = this.lexer.peek().getLine();
            this.last_token = this.lexer.peek();

            int index = index(this.lexer.peek());
            this.action[0] = Parser.actionTable[state()][0][1];
            this.action[1] = Parser.actionTable[state()][0][2];

            int low = 1;
            int high = Parser.actionTable[state()].length - 1;

            while(low <= high)
            {
                int middle = (low + high) / 2;

                if(index < Parser.actionTable[state()][middle][0])
                {
                    high = middle - 1;
                }
                else if(index > Parser.actionTable[state()][middle][0])
                {
                    low = middle + 1;
                }
                else
                {
                    this.action[0] = Parser.actionTable[state()][middle][1];
                    this.action[1] = Parser.actionTable[state()][middle][2];
                    break;
                }
            }

            switch(this.action[0])
            {
                case SHIFT:
		    {
		        ArrayList list = new ArrayList();
		        list.add(this.lexer.next());
                        push(this.action[1], list, false);
                    }
		    break;
                case REDUCE:
                    switch(this.action[1])
                    {
                    case 0: /* reduce AStmtlist */
		    {
			ArrayList list = new0();
			push(goTo(0), list, false);
		    }
		    break;
                    case 1: /* reduce AEmptyStmtlist */
		    {
			ArrayList list = new1();
			push(goTo(0), list, false);
		    }
		    break;
                    case 2: /* reduce ANextindexStmt */
		    {
			ArrayList list = new2();
			push(goTo(1), list, false);
		    }
		    break;
                    case 3: /* reduce APrevindexStmt */
		    {
			ArrayList list = new3();
			push(goTo(1), list, false);
		    }
		    break;
                    case 4: /* reduce AIncStmt */
		    {
			ArrayList list = new4();
			push(goTo(1), list, false);
		    }
		    break;
                    case 5: /* reduce ADecStmt */
		    {
			ArrayList list = new5();
			push(goTo(1), list, false);
		    }
		    break;
                    case 6: /* reduce APrintStmt */
		    {
			ArrayList list = new6();
			push(goTo(1), list, false);
		    }
		    break;
                    case 7: /* reduce APrintcharStmt */
		    {
			ArrayList list = new7();
			push(goTo(1), list, false);
		    }
		    break;
                    case 8: /* reduce AWhileStmt */
		    {
			ArrayList list = new8();
			push(goTo(1), list, false);
		    }
		    break;
                    case 9: /* reduce AIfStmt */
		    {
			ArrayList list = new9();
			push(goTo(1), list, false);
		    }
		    break;
                    }
                    break;
                case ACCEPT:
                    {
                        EOF node2 = (EOF) this.lexer.next();
                        PStmtlist node1 = (PStmtlist) pop().get(0);
                        Start node = new Start(node1, node2);
                        return node;
                    }
                case ERROR:
                    throw new ParserException(this.last_token,
                        "[" + this.last_line + "," + this.last_pos + "] " +
                        Parser.errorMessages[Parser.errors[this.action[1]]]);
            }
        }
    }



    @SuppressWarnings("unchecked")
    ArrayList new0() /* reduce AStmtlist */
    {
        @SuppressWarnings("hiding") ArrayList nodeList = new ArrayList();

        @SuppressWarnings("unused") ArrayList nodeArrayList2 = pop();
        @SuppressWarnings("unused") ArrayList nodeArrayList1 = pop();
        PStmtlist pstmtlistNode1;
        {
            // Block
        PStmt pstmtNode2;
        PStmtlist pstmtlistNode3;
        pstmtNode2 = (PStmt)nodeArrayList1.get(0);
        pstmtlistNode3 = (PStmtlist)nodeArrayList2.get(0);

        pstmtlistNode1 = new AStmtlist(pstmtNode2, pstmtlistNode3);
        }
	nodeList.add(pstmtlistNode1);
        return nodeList;
    }



    @SuppressWarnings("unchecked")
    ArrayList new1() /* reduce AEmptyStmtlist */
    {
        @SuppressWarnings("hiding") ArrayList nodeList = new ArrayList();

        PStmtlist pstmtlistNode1;
        {
            // Block

        pstmtlistNode1 = new AEmptyStmtlist();
        }
	nodeList.add(pstmtlistNode1);
        return nodeList;
    }



    @SuppressWarnings("unchecked")
    ArrayList new2() /* reduce ANextindexStmt */
    {
        @SuppressWarnings("hiding") ArrayList nodeList = new ArrayList();

        @SuppressWarnings("unused") ArrayList nodeArrayList1 = pop();
        PStmt pstmtNode1;
        {
            // Block
        TNextindex tnextindexNode2;
        tnextindexNode2 = (TNextindex)nodeArrayList1.get(0);

        pstmtNode1 = new ANextindexStmt(tnextindexNode2);
        }
	nodeList.add(pstmtNode1);
        return nodeList;
    }



    @SuppressWarnings("unchecked")
    ArrayList new3() /* reduce APrevindexStmt */
    {
        @SuppressWarnings("hiding") ArrayList nodeList = new ArrayList();

        @SuppressWarnings("unused") ArrayList nodeArrayList1 = pop();
        PStmt pstmtNode1;
        {
            // Block
        TPrevindex tprevindexNode2;
        tprevindexNode2 = (TPrevindex)nodeArrayList1.get(0);

        pstmtNode1 = new APrevindexStmt(tprevindexNode2);
        }
	nodeList.add(pstmtNode1);
        return nodeList;
    }



    @SuppressWarnings("unchecked")
    ArrayList new4() /* reduce AIncStmt */
    {
        @SuppressWarnings("hiding") ArrayList nodeList = new ArrayList();

        @SuppressWarnings("unused") ArrayList nodeArrayList1 = pop();
        PStmt pstmtNode1;
        {
            // Block
        TInc tincNode2;
        tincNode2 = (TInc)nodeArrayList1.get(0);

        pstmtNode1 = new AIncStmt(tincNode2);
        }
	nodeList.add(pstmtNode1);
        return nodeList;
    }



    @SuppressWarnings("unchecked")
    ArrayList new5() /* reduce ADecStmt */
    {
        @SuppressWarnings("hiding") ArrayList nodeList = new ArrayList();

        @SuppressWarnings("unused") ArrayList nodeArrayList1 = pop();
        PStmt pstmtNode1;
        {
            // Block
        TDec tdecNode2;
        tdecNode2 = (TDec)nodeArrayList1.get(0);

        pstmtNode1 = new ADecStmt(tdecNode2);
        }
	nodeList.add(pstmtNode1);
        return nodeList;
    }



    @SuppressWarnings("unchecked")
    ArrayList new6() /* reduce APrintStmt */
    {
        @SuppressWarnings("hiding") ArrayList nodeList = new ArrayList();

        @SuppressWarnings("unused") ArrayList nodeArrayList1 = pop();
        PStmt pstmtNode1;
        {
            // Block
        TPrint tprintNode2;
        tprintNode2 = (TPrint)nodeArrayList1.get(0);

        pstmtNode1 = new APrintStmt(tprintNode2);
        }
	nodeList.add(pstmtNode1);
        return nodeList;
    }



    @SuppressWarnings("unchecked")
    ArrayList new7() /* reduce APrintcharStmt */
    {
        @SuppressWarnings("hiding") ArrayList nodeList = new ArrayList();

        @SuppressWarnings("unused") ArrayList nodeArrayList1 = pop();
        PStmt pstmtNode1;
        {
            // Block
        TPrintchar tprintcharNode2;
        tprintcharNode2 = (TPrintchar)nodeArrayList1.get(0);

        pstmtNode1 = new APrintcharStmt(tprintcharNode2);
        }
	nodeList.add(pstmtNode1);
        return nodeList;
    }



    @SuppressWarnings("unchecked")
    ArrayList new8() /* reduce AWhileStmt */
    {
        @SuppressWarnings("hiding") ArrayList nodeList = new ArrayList();

        @SuppressWarnings("unused") ArrayList nodeArrayList3 = pop();
        @SuppressWarnings("unused") ArrayList nodeArrayList2 = pop();
        @SuppressWarnings("unused") ArrayList nodeArrayList1 = pop();
        PStmt pstmtNode1;
        {
            // Block
        TWhileint twhileintNode2;
        PStmtlist pstmtlistNode3;
        TWhileend twhileendNode4;
        twhileintNode2 = (TWhileint)nodeArrayList1.get(0);
        pstmtlistNode3 = (PStmtlist)nodeArrayList2.get(0);
        twhileendNode4 = (TWhileend)nodeArrayList3.get(0);

        pstmtNode1 = new AWhileStmt(twhileintNode2, pstmtlistNode3, twhileendNode4);
        }
	nodeList.add(pstmtNode1);
        return nodeList;
    }



    @SuppressWarnings("unchecked")
    ArrayList new9() /* reduce AIfStmt */
    {
        @SuppressWarnings("hiding") ArrayList nodeList = new ArrayList();

        @SuppressWarnings("unused") ArrayList nodeArrayList3 = pop();
        @SuppressWarnings("unused") ArrayList nodeArrayList2 = pop();
        @SuppressWarnings("unused") ArrayList nodeArrayList1 = pop();
        PStmt pstmtNode1;
        {
            // Block
        TIf tifNode2;
        PStmtlist pstmtlistNode3;
        TEndif tendifNode4;
        tifNode2 = (TIf)nodeArrayList1.get(0);
        pstmtlistNode3 = (PStmtlist)nodeArrayList2.get(0);
        tendifNode4 = (TEndif)nodeArrayList3.get(0);

        pstmtNode1 = new AIfStmt(tifNode2, pstmtlistNode3, tendifNode4);
        }
	nodeList.add(pstmtNode1);
        return nodeList;
    }



    private static int[][][] actionTable;
/*      {
			{{-1, REDUCE, 1}, {0, SHIFT, 1}, {1, SHIFT, 2}, {2, SHIFT, 3}, {3, SHIFT, 4}, {4, SHIFT, 5}, {6, SHIFT, 6}, {7, SHIFT, 7}, {8, SHIFT, 8}, },
			{{-1, REDUCE, 2}, },
			{{-1, REDUCE, 3}, },
			{{-1, REDUCE, 4}, },
			{{-1, REDUCE, 5}, },
			{{-1, REDUCE, 1}, {0, SHIFT, 1}, {1, SHIFT, 2}, {2, SHIFT, 3}, {3, SHIFT, 4}, {4, SHIFT, 5}, {6, SHIFT, 6}, {7, SHIFT, 7}, {8, SHIFT, 8}, },
			{{-1, REDUCE, 6}, },
			{{-1, REDUCE, 7}, },
			{{-1, REDUCE, 1}, {0, SHIFT, 1}, {1, SHIFT, 2}, {2, SHIFT, 3}, {3, SHIFT, 4}, {4, SHIFT, 5}, {6, SHIFT, 6}, {7, SHIFT, 7}, {8, SHIFT, 8}, },
			{{-1, ERROR, 9}, {10, ACCEPT, -1}, },
			{{-1, REDUCE, 1}, {0, SHIFT, 1}, {1, SHIFT, 2}, {2, SHIFT, 3}, {3, SHIFT, 4}, {4, SHIFT, 5}, {6, SHIFT, 6}, {7, SHIFT, 7}, {8, SHIFT, 8}, },
			{{-1, ERROR, 11}, {5, SHIFT, 14}, },
			{{-1, ERROR, 12}, {9, SHIFT, 15}, },
			{{-1, REDUCE, 0}, },
			{{-1, REDUCE, 8}, },
			{{-1, REDUCE, 9}, },
        };*/
    private static int[][][] gotoTable;
/*      {
			{{-1, 9}, {5, 11}, {8, 12}, {10, 13}, },
			{{-1, 10}, },
        };*/
    private static String[] errorMessages;
/*      {
			"expecting: ':-/', ':-\', ':-)', ':-(', 'o_O', ';-)', ':-@', 'P-|', EOF",
			"expecting: ':-/', ':-\', ':-)', ':-(', 'o_O', 'O_o', ';-)', ':-@', 'P-|', 'P-\', EOF",
			"expecting: ':-/', ':-\', ':-)', ':-(', 'o_O', 'O_o', ';-)', ':-@', 'P-|'",
			"expecting: ':-/', ':-\', ':-)', ':-(', 'o_O', ';-)', ':-@', 'P-|', 'P-\'",
			"expecting: EOF",
			"expecting: 'O_o'",
			"expecting: 'P-\'",
			"expecting: 'O_o', 'P-\', EOF",
        };*/
    private static int[] errors;
/*      {
			0, 1, 1, 1, 1, 2, 1, 1, 3, 4, 1, 5, 6, 7, 1, 1, 
        };*/

    static 
    {
        try
        {
            DataInputStream s = new DataInputStream(
                new BufferedInputStream(
                Parser.class.getResourceAsStream("parser.dat")));

            // read actionTable
            int length = s.readInt();
            Parser.actionTable = new int[length][][];
            for(int i = 0; i < Parser.actionTable.length; i++)
            {
                length = s.readInt();
                Parser.actionTable[i] = new int[length][3];
                for(int j = 0; j < Parser.actionTable[i].length; j++)
                {
                for(int k = 0; k < 3; k++)
                {
                    Parser.actionTable[i][j][k] = s.readInt();
                }
                }
            }

            // read gotoTable
            length = s.readInt();
            gotoTable = new int[length][][];
            for(int i = 0; i < gotoTable.length; i++)
            {
                length = s.readInt();
                gotoTable[i] = new int[length][2];
                for(int j = 0; j < gotoTable[i].length; j++)
                {
                for(int k = 0; k < 2; k++)
                {
                    gotoTable[i][j][k] = s.readInt();
                }
                }
            }

            // read errorMessages
            length = s.readInt();
            errorMessages = new String[length];
            for(int i = 0; i < errorMessages.length; i++)
            {
                length = s.readInt();
                StringBuffer buffer = new StringBuffer();

                for(int j = 0; j < length; j++)
                {
                buffer.append(s.readChar());
                }
                errorMessages[i] = buffer.toString();
            }

            // read errors
            length = s.readInt();
            errors = new int[length];
            for(int i = 0; i < errors.length; i++)
            {
                errors[i] = s.readInt();
            }

            s.close();
        }
        catch(Exception e)
        {
            throw new RuntimeException("The file \"parser.dat\" is either missing or corrupted.");
        }
    }
}
