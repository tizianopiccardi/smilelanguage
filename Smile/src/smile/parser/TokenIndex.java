/* This file was generated by SableCC (http://www.sablecc.org/). */

package smile.parser;

import smile.node.*;
import smile.analysis.*;

class TokenIndex extends AnalysisAdapter
{
    int index;

    @Override
    public void caseTNextindex(@SuppressWarnings("unused") TNextindex node)
    {
        this.index = 0;
    }

    @Override
    public void caseTPrevindex(@SuppressWarnings("unused") TPrevindex node)
    {
        this.index = 1;
    }

    @Override
    public void caseTInc(@SuppressWarnings("unused") TInc node)
    {
        this.index = 2;
    }

    @Override
    public void caseTDec(@SuppressWarnings("unused") TDec node)
    {
        this.index = 3;
    }

    @Override
    public void caseTWhileint(@SuppressWarnings("unused") TWhileint node)
    {
        this.index = 4;
    }

    @Override
    public void caseTWhileend(@SuppressWarnings("unused") TWhileend node)
    {
        this.index = 5;
    }

    @Override
    public void caseTPrint(@SuppressWarnings("unused") TPrint node)
    {
        this.index = 6;
    }

    @Override
    public void caseTPrintchar(@SuppressWarnings("unused") TPrintchar node)
    {
        this.index = 7;
    }

    @Override
    public void caseTInputchar(@SuppressWarnings("unused") TInputchar node)
    {
        this.index = 8;
    }

    @Override
    public void caseTIf(@SuppressWarnings("unused") TIf node)
    {
        this.index = 9;
    }

    @Override
    public void caseTEndif(@SuppressWarnings("unused") TEndif node)
    {
        this.index = 10;
    }

    @Override
    public void caseEOF(@SuppressWarnings("unused") EOF node)
    {
        this.index = 11;
    }
}
