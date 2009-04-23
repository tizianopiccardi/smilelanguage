/* This file was generated by SableCC (http://www.sablecc.org/). */

package smile.node;

import smile.analysis.*;

@SuppressWarnings("nls")
public final class TDec extends Token
{
    public TDec()
    {
        super.setText(":-(");
    }

    public TDec(int line, int pos)
    {
        super.setText(":-(");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TDec(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTDec(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TDec text.");
    }
}
