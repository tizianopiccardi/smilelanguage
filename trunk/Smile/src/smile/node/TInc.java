/* This file was generated by SableCC (http://www.sablecc.org/). */

package smile.node;

import smile.analysis.*;

@SuppressWarnings("nls")
public final class TInc extends Token
{
    public TInc()
    {
        super.setText(":-)");
    }

    public TInc(int line, int pos)
    {
        super.setText(":-)");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TInc(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTInc(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TInc text.");
    }
}
