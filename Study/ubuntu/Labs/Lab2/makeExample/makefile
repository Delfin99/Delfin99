myprog : program1.o newMessage.o
	gcc -o myprog program1.o newMessage.o

newMessage.o : newMessage.c
	gcc -c newMessage.c

program1.o : program1.c newMessage.h
	gcc -c program1.c

clean:
	rm myprog newMessage.o program1.o