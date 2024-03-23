package com.finan.orcamento.model;

import com.finan.orcamento.model.enums.IcmsEstados;
import org.jetbrains.annotations.NotNull;

import java.math.BigDecimal;

public class OrcamentoModelProxy extends OrcamentoModel{

    private Long id;

    private IcmsEstados icmsEstados;

    private BigDecimal valorOrcamento;

    private BigDecimal valorICMS;

    private UsuarioModel usuario;

    private OrcamentoModel orcamento;

    public OrcamentoModelProxy (OrcamentoModel orcamento){
        this.orcamento = orcamento;
    }

    //A fim de proteger os dados e evitar possiveis consultas erradas com o banco de dados, na classe Proxy nao será
    //possivel setar nenhum valor, apenas consultá-los, logo as funções sets foram removidas

    @Override
    public Long getId() {
        if(id == null){
            this.id = orcamento.getId();
        }
        return id;
    }

    @Override
    public IcmsEstados getIcmsEstados() {
        if(icmsEstados == null){
            this.icmsEstados = orcamento.getIcmsEstados();
        }
        return icmsEstados;
    }

    @NotNull
    @Override
    public BigDecimal getValorOrcamento() {
        return valorOrcamento;
    }

    @Override
    public BigDecimal getValorICMS() {
        if(valorICMS == null){
            this.valorICMS = orcamento.getValorICMS();
        }
        return valorICMS;
    }

    @Override
    public UsuarioModel getUsuario() {
        if(usuario == null){
            this.usuario = orcamento.getUsuario();
        }
        return usuario;
    }
}
