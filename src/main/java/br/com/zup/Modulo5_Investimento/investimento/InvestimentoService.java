package br.com.zup.Modulo5_Investimento.investimento;

import br.com.zup.Modulo5_Investimento.CarteiraDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InvestimentoService {

    private List<InvestimentoDTO> investimentosDTOS = new ArrayList<>();

    public void cadastrarInvestimento(InvestimentoDTO novoInvestimento) {
        investimentoDTO.setValorInvestido(investimentoDTO.getValorInvestido());
        investimentoDTO.setPeriodoDeAplicacaoMeses(investimentoDTO.getPeriodoDeAplicacaoMeses());
        investimentoDTO.setRisco(investimentoDTO.getRisco().getTaxa());
        investimentosDTOS.add(novoInvestimento);

    }

    public void salvarInvestimento(InvestimentoDTO novoInvestimento){
        investimentosDTOS.add(novoInvestimento);
    }

    public List<InvestimentoDTO> exibirInvestimentos() {
        return investimentosDTOS;
    }

}
