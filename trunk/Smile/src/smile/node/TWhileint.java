/* This file was generated by SableCC (http://www.sablecc.org/). */

package smile.node;

import smile.analysis.*;

@SuppressWarnings("nls")
public final class TWhileint extends Token
{
    public TWhileint()
    {
        super.setText("o_O");
    }

    public TWhileint(int line, int pos)
    {
        super.setText("o_O");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TWhileint(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTWhileint(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TWhileint text.");
    }
}
