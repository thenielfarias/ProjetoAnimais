package projetoanimais;
public class Main {
    public static void main(String args[]) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguru c = new Canguru();
        Cachorro d = new Cachorro();
        Cobra s = new Cobra();
        Tartaruga t = new Tartaruga();
        Goldfish g = new Goldfish();
        Arara b = new Arara();
        
        m.setPeso(40.85f);
        m.setCorPelo("Branco");
        m.alimentar();
        m.locomover();
        m.emitirSom();       
        a.locomover();
        p.locomover();
        r.locomover();
        c.locomover();
        c.usarBolsa();
        c.emitirSom();
        d.emitirSom();
        t.locomover();
    
    
    }

}
