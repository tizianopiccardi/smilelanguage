/* This file was generated by SableCC (http://www.sablecc.org/). */

package smile.node;

import smile.analysis.*;

@SuppressWarnings("nls")
public final class AIncStmt extends PStmt
{
    private TInc _inc_;

    public AIncStmt()
    {
        // Constructor
    }

    public AIncStmt(
        @SuppressWarnings("hiding") TInc _inc_)
    {
        // Constructor
        setInc(_inc_);

    }

    @Override
    public Object clone()
    {
        return new AIncStmt(
            cloneNode(this._inc_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAIncStmt(this);
    }

    public TInc getInc()
    {
        return this._inc_;
    }

    public void setInc(TInc node)
    {
        if(this._inc_ != null)
        {
            this._inc_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._inc_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._inc_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._inc_ == child)
        {
            this._inc_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._inc_ == oldChild)
        {
            setInc((TInc) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}