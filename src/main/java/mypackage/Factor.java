package mypackage;

public class Factor {
public static int factor( int valore )
{
	int risultato=1;
	  if (valore > 1) {
		  
	  for (int i = 1; i<valore; i++)	{
		risultato=risultato*(i+1);
	  }  
	  }
	  
	  return risultato;
}
}
