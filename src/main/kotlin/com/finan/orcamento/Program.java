package com.finan.orcamento;

import com.finan.orcamento.model.OrcamentoModel;
import com.finan.orcamento.model.UsuarioModel;
import com.finan.orcamento.model.enums.IcmsEstados;
import jakarta.persistence.*;
import org.jetbrains.annotations.NotNull;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args){

        List<OrcamentoModel> listOrcamentoModel = new ArrayList<>();

        //configurando valores do orcamentoModel
        OrcamentoModel orcamentoModel = new OrcamentoModel();
        orcamentoModel.setId(1L);
        orcamentoModel.setIcmsEstados(IcmsEstados.ICMS_MG);
        orcamentoModel.setValorOrcamento(new BigDecimal("1000.00"));
        orcamentoModel.calcularIcms();

        //configurando Usuario
        UsuarioModel usuarioModel = new UsuarioModel(1L,"Matheus Carrasco");
        usuarioModel.setOrcamentos(orcamentoModel);

        orcamentoModel.setUsuario(usuarioModel);



        listOrcamentoModel.add(orcamentoModel);

        for(OrcamentoModel orcamento : listOrcamentoModel){
            System.out.println(orcamento);
        }


    }

}
