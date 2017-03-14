
package refeicao;

/**
 *
 * @author felipe
 */
public class Main {
    
    public static void main(String[] args) {
        
        DiretorRefeicao criaRefeicao = new DiretorRefeicao();      
        //controi uma refeicao.
        System.out.println("Refeição 1:");
        Refeicao refeicao1 = criaRefeicao.preparaNaoVegetariana("laranja", "suco", true);                
        System.out.println("Refeição 2:");
        Refeicao refeicao2 = criaRefeicao.preparaVegetariana("guarana", "refrigerante", true);       
        System.out.println("Refeição 3:");
        Refeicao refeicao3 = criaRefeicao.preparaVegetariana("morango", "suco", false);
    }    
}
