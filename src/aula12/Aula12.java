package aula12;

public class Aula12 {
    public static void main(String[] args) {
        // Programa Principal
        // Animal n = new Animal();
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        Cobra j = new Cobra();
        Tartaruga t = new Tartaruga();
        GoldFish g = new GoldFish();
        Arara e = new Arara();




//        System.out.println("--- Mamífero ---------");
//        m.setPeso(35.3f);
//        m.setCorPelo("Marrom");
//        m.alimentar();
//        m.locomover();
//        m.emitirSom();
//        System.out.println("--- ---------- ---------");

        System.out.println("--- Canguru ---------");
        c.usarBolsa();
        c.locomover();
        System.out.println("--- Cachorro ---------");
        k.enterrarOsso();
        k.abanarRabo();
        System.out.println("--- Tartaruga ---------");
        t.locomover();
        System.out.println("--- ---------- ---------");



    }
}
