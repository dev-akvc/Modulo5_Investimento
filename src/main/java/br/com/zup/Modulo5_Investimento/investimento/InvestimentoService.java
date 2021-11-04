package br.com.zup.Modulo5_Investimento.investimento;

import br.com.zup.Modulo5_Investimento.CarteiraDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InvestimentoService {

    private List<InvestimentoDTO> investimentosDTOS = new ArrayList<>();
    private List<CarteiraDTO> respostaInvestimento = new ArrayList<>();

//    public CarteiraDTO salvarInvestimento(InvestimentoDTO novoInvestimento) {
//        CarteiraDTO carteiraDTO = investimentosDTOS.add(novoInvestimento.getValorInvestido());
//        return carteiraDTO;
//    }

//    public void salvarInvestimento(CarteiraDTO novoInvestimento) {
//        respostaInvestimento.add(novoInvestimento);
//    }

    public List<CarteiraDTO> exibirInvestimentos() {
        return respostaInvestimento;
    }

    public double calcularMontante(InvestimentoDTO novoInvestimento) {
        double valorTotal = novoInvestimento.getValorInvestido() * Math.pow(1 + novoInvestimento.getRisco().getTaxa(), novoInvestimento.getPeriodoDeAplicacaoMeses());
        return valorTotal;
    }

    public double exibirResposta(InvestimentoDTO investimentoDTO) {
        return calcularMontante(investimentoDTO);
    }


}
