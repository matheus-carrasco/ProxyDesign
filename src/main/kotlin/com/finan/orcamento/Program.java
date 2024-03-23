package com.finan.orcamento;

import com.finan.orcamento.model.OrcamentoModel;
import com.finan.orcamento.model.OrcamentoModelProxy;
import com.finan.orcamento.model.UsuarioModel;

import java.math.BigDecimal;
import java.util.Locale;

import static com.finan.orcamento.model.enums.IcmsEstados.ICMS_MG;

public class Program {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);

        /*Para evitar a repetição de código, a simulação de atraso de 5seg com o banco de dados foi acrescentado no
        método toString da classe OrcamentoModel e UsuarioModel e não nos métodos get das classes

        Não entendi o que foi pedido nas variaveis de teste = valorOrcamento, qtdItens e descontoOrcamento
        visto que não há essas variaveis no curso pré-realizado de Spring Boot com CRUD e Design Patterns
        */

        OrcamentoModel orcamentoModel = new OrcamentoModel();
        OrcamentoModelProxy proxy;

        orcamentoModel.setId(1L);
        orcamentoModel.setIcmsEstados(ICMS_MG);
        orcamentoModel.setValorOrcamento(new BigDecimal("1000.00"));
        orcamentoModel.setValorICMS(orcamentoModel.calcularIcms());
        orcamentoModel.setUsuario(new UsuarioModel(1L, "Matheus Carrasco"));

        proxy = new OrcamentoModelProxy(orcamentoModel);

        System.out.println("Com atraso:: " + orcamentoModel);
        //segunda chamada apenas para visualizar o atraso
        System.out.println("Com atraso:: " + orcamentoModel);

        //chamada sem atraso
        System.out.println("Sem atraso:: " + proxy);
    }
}
