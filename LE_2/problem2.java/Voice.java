/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Voice {
    Animal[] animals;
    
    void prepareVoice() {
        animals = new Animal[]{
            new Cow(),
            new Dog(),
            new Pig(),
            new Goat(),
            new Lion()
        };
    }
    
    void hear() {
        for (Animal animal : animals) {
            animal.makeVoice();
        }
    }
}