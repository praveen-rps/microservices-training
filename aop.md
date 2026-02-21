Aspect - An aspect is a class that represents external service





Advice - A method defined inside the aspect class or also implementation of an aspect



class Shopping{



 	public void placeOrder(){



 	}

 	public void shipment(){



 	}

 	public void payment(){



 	}



 	public void process1(){



 	}

}



Aspect

class ExternalServices{

 	//advice

 	public String log(){

 		return "log string";

 	}

 	//advice

 	public void sendMail(){

 		// code to send a mail;

 	}

 

}





Object Booking{



 	log()

 	placeOrder();

 	log()

 	sendMail();

 	log()

 	shipment();

 	**log()**

 	sendMail();

}

 



Pointcut - It is an expression language which refers which all business methods needs

advices, but it will not specify which advices are needed





Joinpoint - It is a combination of Bussiness methods and advices, it tells which

business methods needs which advices





Target -- It is an object of business class which needs advices





Weaving -- It is the process of mixing or combining the Target object with advices based on Joinpoints





Proxy -- It is the class generated as a result of weaving process. It contains the business logic

and advices



Weaver -- the component is responsible for weaving



https://admin.labplatform.vmware.com/login

Pointcut Expressions

---



using pointcut expressions, we qualify a business methods to apply cross cutting methods (advices)



Syntax:

---



Access Specifier Return\_type package.class.method(parameters)



public Order com.cts.Shopping.placeOrder(List<Product> products);



We can use wild cards in our expressions - \* and ..



\* (Astrik) can be applied on Access Specifier, Return\_Type, package, class name, MethodName



\* always represents any



.. - can be applied at package level and parameters



when applied package level means current package and sub packages also

when applied at parameters means any number of arguments (variable arguments)



private static final Logger logger = LoggerFactory.getLogger(LoggingController.class);



Examples

---



public void \*Id() -- Any package, any class, any method ending with Id  with public access

specifier and void return type.





public int \*e\*(..) -any package, any class, any method staring with any characters and ending with

any characters but e inside it with any type and any no parameters with public and int





public int get(..) - only get methods of any class



public \* \*() -- any return type any class, any method with no parameters





public \* com.cts..\*.get\*() -- All classes in cts pacakge and it sub pacakges with methods starting

with getXXXX() return type can be any thing with no parameters

















@Before

@After

@AfterReturning

@AfterThrowing

@Around

