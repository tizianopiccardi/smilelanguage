/* This file was generated by SableCC (http://www.sablecc.org/). */

package smile.node;

import smile.analysis.*;

@SuppressWarnings("nls")
public final class TPrevindex extends Token
{
    public TPrevindex()
    {
        super.setText(":-\\");
    }

    public TPrevindex(int line, int pos)
    {
        super.setText(":-\\");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TPrevindex(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTPrevindex(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TPrevindex text.");
    }
}