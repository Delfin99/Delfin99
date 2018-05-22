Java Access modifiers

	java provides a number of access modifiers to set access levels for classes,

	variables, methods, and constructors.


	- visible to the package, the defaulst. no modifiers are needed

	- visible to the class only(private)

	- visible to the world(public)

	- visible to the package and all subclasses(protected)



							same package				different package

			inside 		in class  out of class		in class 	out of class
public		  o 			o 			o 				o 			o

private		  o 			x			x				x			x

protected	  o 			o 			o 				o 			x


