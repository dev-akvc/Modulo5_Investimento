package br.com.zup.Modulo5_Investimento.investimento;

import br.com.zup.Modulo5_Investimento.CarteiraDTO;
import br.com.zup.Modulo5_Investimento.Risco;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InvestimentoService {

    private List<InvestimentoDTO> investimentosDTOS = new ArrayList<>();

    public void salvarInvestimento(InvestimentoDTO novoInvestimento){
        investimentosDTOS.add(novoInvestimento);
    }

    public List<InvestimentoDTO> exibirInvestimentos() {
        return investimentosDTOS;
    }


    public double calcularMontante (double valorInvestido, Risco risco, int periodoDeAplicacaoMeses){
        double valorTotal = valorInvestido * Math.pow(1+ risco.getTaxa(), periodoDeAplicacaoMeses);
        return valorTotal;
    }



}
