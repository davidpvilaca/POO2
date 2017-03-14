

package refeicao;

/**
 *
 * @author felipe
 */
public abstract class RefeicaoBuilder {    
    Refeicao refeicao;        
    
    public void adicionarSuco(String sabor){                                
        refeicao.setBebida(new Suco(sabor));        
    }   
       
    public void adicionarRefrigerante(String sabor){
        refeicao.setBebida(new Refrigerante(sabor));        
    }
    
    public void preparaBatata(){
        System.out.println("Com batata");
        refeicao.setBatata(new Batata());
    }
    
}
