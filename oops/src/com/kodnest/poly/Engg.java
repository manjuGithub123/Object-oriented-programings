package com.kodnest.poly;

public class Engg {
public void doactivity(Softwareengg  se)
{
se.attendmetting();
se.testcode();
if(se instanceof Backend)
{
System.out.println((Backend)(se))(dobackendproject());	
}
else if(se instanceof Frontend)
{
System.out.println((Frontend)(se))(dofrontendproject());	
}


}
}
