/* This file was generated by SableCC (http://www.sablecc.org/). */

package smile.node;

import smile.analysis.*;

@SuppressWarnings("nls")
public final class TNewLine extends Token
{
    public TNewLine(String text)
    {
        setText(text);
    }

    public TNewLine(String text, int line, int pos)
    {
        setText(text);
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TNewLine(getText(), getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTNewLine(this);
    }
}
