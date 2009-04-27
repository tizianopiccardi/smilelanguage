/* This file was generated by SableCC (http://www.sablecc.org/). */

package smile.node;

import smile.analysis.*;

@SuppressWarnings("nls")
public final class AIfStmt extends PStmt
{
    private TIf _if_;
    private PStmtlist _stmtlist_;
    private TEndif _endif_;

    public AIfStmt()
    {
        // Constructor
    }

    public AIfStmt(
        @SuppressWarnings("hiding") TIf _if_,
        @SuppressWarnings("hiding") PStmtlist _stmtlist_,
        @SuppressWarnings("hiding") TEndif _endif_)
    {
        // Constructor
        setIf(_if_);

        setStmtlist(_stmtlist_);

        setEndif(_endif_);

    }

    @Override
    public Object clone()
    {
        return new AIfStmt(
            cloneNode(this._if_),
            cloneNode(this._stmtlist_),
            cloneNode(this._endif_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAIfStmt(this);
    }

    public TIf getIf()
    {
        return this._if_;
    }

    public void setIf(TIf node)
    {
        if(this._if_ != null)
        {
            this._if_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._if_ = node;
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

    public TEndif getEndif()
    {
        return this._endif_;
    }

    public void setEndif(TEndif node)
    {
        if(this._endif_ != null)
        {
            this._endif_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._endif_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._if_)
            + toString(this._stmtlist_)
            + toString(this._endif_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._if_ == child)
        {
            this._if_ = null;
            return;
        }

        if(this._stmtlist_ == child)
        {
            this._stmtlist_ = null;
            return;
        }

        if(this._endif_ == child)
        {
            this._endif_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._if_ == oldChild)
        {
            setIf((TIf) newChild);
            return;
        }

        if(this._stmtlist_ == oldChild)
        {
            setStmtlist((PStmtlist) newChild);
            return;
        }

        if(this._endif_ == oldChild)
        {
            setEndif((TEndif) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
