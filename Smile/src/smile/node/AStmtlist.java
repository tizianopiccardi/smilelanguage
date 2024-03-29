/* This file was generated by SableCC (http://www.sablecc.org/). */

package smile.node;

import smile.analysis.*;

@SuppressWarnings("nls")
public final class AStmtlist extends PStmtlist
{
    private PStmt _stmt_;
    private PStmtlist _stmtlist_;

    public AStmtlist()
    {
        // Constructor
    }

    public AStmtlist(
        @SuppressWarnings("hiding") PStmt _stmt_,
        @SuppressWarnings("hiding") PStmtlist _stmtlist_)
    {
        // Constructor
        setStmt(_stmt_);

        setStmtlist(_stmtlist_);

    }

    @Override
    public Object clone()
    {
        return new AStmtlist(
            cloneNode(this._stmt_),
            cloneNode(this._stmtlist_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAStmtlist(this);
    }

    public PStmt getStmt()
    {
        return this._stmt_;
    }

    public void setStmt(PStmt node)
    {
        if(this._stmt_ != null)
        {
            this._stmt_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._stmt_ = node;
    }

    public PStmtlist getStmtlist()
    {
        return this._stmtlist_;
    }

    public void setStmtlist(PStmtlist node)
    {
        if(this._stmtlist_ != null)
        {
            this._stmtlist_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._stmtlist_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._stmt_)
            + toString(this._stmtlist_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._stmt_ == child)
        {
            this._stmt_ = null;
            return;
        }

        if(this._stmtlist_ == child)
        {
            this._stmtlist_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._stmt_ == oldChild)
        {
            setStmt((PStmt) newChild);
            return;
        }

        if(this._stmtlist_ == oldChild)
        {
            setStmtlist((PStmtlist) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
