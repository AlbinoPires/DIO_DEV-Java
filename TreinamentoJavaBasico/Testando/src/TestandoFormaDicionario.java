/**
* <h1>TestandoFormaDicionario</h1>
* A Calculadora realiza operações matemáticas entre números.
* <p>
* <b>Note:</b> Leia atentamente a documentação desta classe 
* para desfrutar dos recursos oferecidos pelo autor!
* 
* @author  Albino Pires
* @version  1.0
* @since    17/11/2024
*/

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Aluno{
    String nome;
    double notaTrimestre;
    public Aluno(String nome, double notaTrimestre){
        this.nome = nome;
        this.notaTrimestre = notaTrimestre;
    }
@Override
public String toString(){
    return nome + "- Nota: " + notaTrimestre;
    }
}

public class TestandoFormaDicionario{
    public static void main(String[] args) {
        //autenticado data/hora teste
        Date dataAtual = new Date();
         System.out.println(dataAtual);
         System.out.println("::::::::::DEU CERTO!:::::::::::");
        
        //criando a lista de alunos
        List<Aluno>alunos = new ArrayList<>();
        alunos.add(new Aluno("Albino", 9.0));
        alunos.add(new Aluno("Michele", 9.0));
        alunos.add(new Aluno("Mary", 9.5));
        alunos.add(new Aluno("Bubu", 9.5));
        alunos.add(new Aluno("Isabella", 5.5));

        System.out.println("Notas do 1º Trimestre");
        for(Aluno aluno: alunos){
            System.out.println(aluno);
            
    
            
        }
    }
}