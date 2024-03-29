/* This file was generated by SableCC (http://www.sablecc.org/). */

package smile.node;

import smile.analysis.*;

@SuppressWarnings("nls")
public final class AInputcharStmt extends PStmt
{
    private TInputchar _inputchar_;

    public AInputcharStmt()
    {
        // Constructor
    }

    public AInputcharStmt(
        @SuppressWarnings("hiding") TInputchar _inputchar_)
    {
        // Constructor
        setInputchar(_inputchar_);

    }

    @Override
    public Object clone()
    {
        return new AInputcharStmt(
            cloneNode(this._inputchar_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAInputcharStmt(this);
    }

    public TInputchar getInputchar()
    {
        return this._inputchar_;
    }

    public void setInputchar(TInputchar node)
    {
        if(this._inputchar_ != null)
        {
            this._inputchar_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._inputchar_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._inputchar_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._inputchar_ == child)
        {
            this._inputchar_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._inputchar_ == oldChild)
        {
            setInputchar((TInputchar) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
