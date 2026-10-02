
void main() {
    {

        Personagem heroi = new Personagem("Changbin");
        IO.println(heroi);


        heroi.atacar();
        heroi.descansar();

        heroi.receberDano(50);
        heroi.receberDano(60);


        heroi.atacar();

        IO.println(heroi);
    }
}