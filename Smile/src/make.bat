cd smile
cd analysis\
rm *.*
cd ..\lexer
rm *.*
cd ..\node
rm *.*
cd ..\parser
rm *.*

cd ..\..

java -jar sablecc.jar grammar.sablecc
pause