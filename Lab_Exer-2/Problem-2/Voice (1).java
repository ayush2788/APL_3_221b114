/******************************************************************************

Welcome to GDB Online.
  GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
  C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
  Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Voice{
    void prepareVoice(){
        Animal[] animal = new Animal[5];
        animal[0] = new Lion();
        animal[1] = new Goat();
        animal[2] = new Cow();
        animal[3] = new Tiger();
        animal[4] = new Pig();
        hear(animal);
    }
    void hear(Animal[] animal){
        for(int i = 0 ;i<5;i++){
            animal[i].makeVoice();
        }
    }
}