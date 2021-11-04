package br.com.zup.Modulo5_Investimento.investimento;

import br.com.zup.Modulo5_Investimento.CarteiraDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InvestimentoService {

    private List<InvestimentoDTO> investimentosDTOS = new ArrayList<>();

    @Autowired
    private InvestimentoDTO investimentoDTO;
    private CarteiraDTO carteiraDTO;

    public void cadastrarInvestimento(String email){
        carteiraDTO.setValorInvestido(investimentoDTO.getValorInvestido());
        double lucro = investimentoDTO.getRisco().ordinal() * investimentoDTO.getValorInvestido();
        carteiraDTO.setValorTotalDolucro(lucro);
        carteiraDTO.setValorTotal(carteiraDTO.getValorTotalDolucro() + carteiraDTO.getValorInvestido());

    }

}
