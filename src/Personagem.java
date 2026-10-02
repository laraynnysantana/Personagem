public class Personagem {

    private String nome;
    private int vida;
    private int energia;
    private int nivel;


    public Personagem(String nome) {
        this.nome = nome;
        this.vida = 100;
        this.nivel = 1;
        this.energia = 100;
    }



    @Override
    public String toString() {
        return "Personagem{" +
                "nome='" + nome + '\'' +
                ", vida=" + vida +
                ", energia=" + energia +
                ", nivel=" + nivel +
                ", status=" + getStatus()+
                '}';
    }

    public String getNome() {
        return nome;
    }


    public int getVida() {
        return vida;
    }

    public int getEnergia() {
        return energia;
    }


    public int getNivel() {
        return nivel;
    }

    public String getStatus() {
        return (this.vida > 0) ? "Vivo" : "Derrotado";
    }

    public void receberDano(int dano){
        if (this.vida==0){
            IO.println(this.nome +"Foi derrotado, não pode receber mais dano");
            return;
        }

        this.vida -=dano;


        if (this.vida < 0) {
            this.vida = 0;
        }

        IO.println(this.nome + " recebeu " + dano + " de dano. Vida atual: " + this.vida);

        if (this.vida == 0) {
            IO.println(this.nome + " foi derrotado!");
        }

    }
    public void atacar() {
        if (this.vida == 0) {
            IO.println(this.nome + " está derrotado e não pode atacar!");
            return;

        }

        int custoenergia = 20;

        if (this.energia >= custoenergia) {
            this.energia -= custoenergia;
            IO.println(this.nome + " atacou! Energia restante: " + this.energia);
        } else {
            IO.println(this.nome + "Não possui energia suficiente para atacar (Energia atual: " + this.energia + ")");
        }
    }
    public void descansar(){
        if (this.vida == 0) {
            IO.println(this.nome + " está derrotado e não pode descansar!");
            return;
        }

        int recuperacao = 25;
        this.energia += recuperacao;

        if (this.energia > 100) {
            this.energia = 100;
        }



        IO.println(this.nome + " descansou. Energia atual: " + this.energia);
    }
}






































