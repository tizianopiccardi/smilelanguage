/* This file was generated by SableCC (http://www.sablecc.org/). */

package smile.node;

import smile.analysis.*;

@SuppressWarnings("nls")
public final class TNextindex extends Token
{
    public TNextindex()
    {
        super.setText(":-/");
    }

    public TNextindex(int line, int pos)
    {
        super.setText(":-/");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TNextindex(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTNextindex(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TNextindex text.");
    }
}
